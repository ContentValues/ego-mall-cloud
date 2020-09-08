package com.macro.mall.filter;

import org.springframework.stereotype.Component;
import javax.servlet.*;
import java.io.IOException;

/**
 * @program: mall
 * @author: ShyBlue
 * @create: 2020-08-10 21:36
 **/
@Component
public class MallFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MallFilter init()");
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MallFilter doFilter before()");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("MallFilter doFilter after()");
    }
    @Override
    public void destroy() {
        System.out.println("MallFilter destroy()");
    }
}