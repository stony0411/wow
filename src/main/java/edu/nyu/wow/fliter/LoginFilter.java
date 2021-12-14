package edu.nyu.wow.fliter;

import com.alibaba.fastjson.JSONObject;
import edu.nyu.wow.entity.User;
import edu.nyu.wow.enums.ResponseStatus;
import edu.nyu.wow.meta.RequestContext;
import edu.nyu.wow.meta.SimpleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

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
        if ("/login".equals(request.getRequestURI()) ||
            "/register".equals(request.getRequestURI())) {
            filterChain.doFilter(request, response);
            return;
        }

        // Already Login
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            filterChain.doFilter(request, response);
            System.out.println(RequestContext.getCurrentUser() + " is visiting url: " + request.getRequestURI());
            return;
        }

        // Not Login
        SimpleResponse<String> simpleResponse = new SimpleResponse<>("Please Login First", ResponseStatus.NOT_LOGIN);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.print(JSONObject.toJSON(simpleResponse));
        out.flush();
        out.close();
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        AntPathMatcher pathMatcher = new AntPathMatcher();
        Collection<String> byPassUris = new ArrayList<>();
        byPassUris.add("/v2/api-docs");
        byPassUris.add("/configuration/ui");
        byPassUris.add("/swagger-resources/**");
        byPassUris.add("/configuration/security");
        byPassUris.add("/swagger-ui.html");
        byPassUris.add("/webjars/**");
        byPassUris.add("/csrf");
        return byPassUris.stream()
                .anyMatch(p -> pathMatcher.match(p, request.getServletPath()));
    }
}

