package com.astro.gateway.filters;

import javax.servlet.http.HttpServletRequest;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.stream.Collectors;

public class PreFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(PreFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        
        logger.info("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
        if ("POST".equalsIgnoreCase(request.getMethod()))
        {
            try {
                String collect = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
                logger.info(collect);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}