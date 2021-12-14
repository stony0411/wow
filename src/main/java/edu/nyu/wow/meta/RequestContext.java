package edu.nyu.wow.meta;

import edu.nyu.wow.entity.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: sw3455
 * @Date: 2021/12/13
 * @Email: sw3455@nyu.edu
 */
public class RequestContext {
    public static HttpServletRequest getCurrentRequest() {
        return ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
    }

    public static User getCurrentUser() {
        return (User)getCurrentRequest().getSession().getAttribute("user");
    }
}
