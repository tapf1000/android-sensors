package com.astro.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(PostFilter.class);
    @Override
    public String filterType() {
        return "post";
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
        logger.info("Inside Response Filter");

        return null;
    }
}