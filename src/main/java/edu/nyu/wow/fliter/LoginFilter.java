package edu.nyu.wow.fliter;

import com.alibaba.fastjson.JSONObject;
import edu.nyu.wow.entity.User;
import edu.nyu.wow.enums.ResponseStatus;
import edu.nyu.wow.meta.SimpleResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: sw3455
 * @Date: 2021/12/10
 * @Email: sw3455@nyu.edu
 */
@Component
public class LoginFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // Login do not need to intercept
        if ("/login".equals(request.getRequestURI())) {
            filterChain.doFilter(request, response);
            return;
        }

        // Already Login
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            filterChain.doFilter(request, response);
            return;
        }

        // Not Login
        SimpleResponse<String> simpleResponse = new SimpleResponse<>("Please Login First", ResponseStatus.NOT_LOGIN);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        // 设置响应内容，结束请求
        out.print(JSONObject.toJSON(simpleResponse));
        out.flush();
        out.close();
    }
}

