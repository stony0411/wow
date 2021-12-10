package edu.nyu.wow.meta;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.nyu.wow.enums.ResponseStatus;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException exception) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        SimpleResponse<String> respBean = new SimpleResponse<String>("login failed", ResponseStatus.ERROR);
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(), respBean);
    }

/*
    private ResponseData setResponseData(AuthenticationException exception) {
        if (exception instanceof LockedException) {
            return ResponseData.build(CodeMessage.USER_IS_LOCK);
        } else if (exception instanceof CredentialsExpiredException) {
            return ResponseData.build(CodeMessage.CREDENTIAL_NOT_RIGHT);
        } else if (exception instanceof AccountExpiredException) {
            return ResponseData.build(CodeMessage.USER_NOT_RIGHT);
        } else if (exception instanceof DisabledException) {
            return ResponseData.build(CodeMessage.USER_DISABLE);
        } else if (exception instanceof BadCredentialsException) {
            return ResponseData.build(CodeMessage.AUTH_ERROR);
        }
        return ResponseData.build(CodeMessage.USER_NOT_LOGIN);
    }
*/

}
