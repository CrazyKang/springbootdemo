package com.boottest.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author: wangk
 * @discription:TODO
 * @Date: 2019/7/10 11:32
 */
@WebFilter(filterName = "myfilter",urlPatterns = "/test/*")
public class Myfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);//页面正常继续往下执行
//        System.out.println("进入错误页面");
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        response.sendRedirect("/error/error.html");

    }

    @Override
    public void destroy() {

    }
}
