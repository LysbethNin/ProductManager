package fr.campusacademy.productmanager.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.campusacademy.productmanager.servlet.LoginServlet;


@WebFilter(filterName="AuthenticateFilter", urlPatterns="/auth/*")
public class AuthenticateFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        if (((HttpServletRequest) req).getSession().getAttribute(LoginServlet.PARAM_USERNAME) == null) {
            ((HttpServletResponse) res).sendRedirect("/ProductManager/login");
        } else {
            chain.doFilter(req, res);
        }
    }

}
