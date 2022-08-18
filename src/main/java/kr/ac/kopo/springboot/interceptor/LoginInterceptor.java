package kr.ac.kopo.springboot.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        String dest = request.getRequestURI();
        dest = dest.substring(request.getContextPath().length());
        if(request.getQueryString() != null) {
            dest += request.getQueryString();
        }

        session.setAttribute("dest", dest);

        if(session.getAttribute("loginVO") == null) {
            response.sendRedirect(request.getContextPath()+"/login");
            return false;
        }
        return true;
    }
}