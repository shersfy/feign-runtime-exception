package org.shersfy.jetty.hystrix;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class FeignClientFallbackFactory implements FallbackFactory<ProviderFallback> {

    protected Logger LOGGER = LoggerFactory.getLogger(getClass());
    
    @Resource
    private ProviderFallback providerFallback;

    @Override
    public ProviderFallback create(Throwable cause) {
        
        LOGGER.error("", cause);
        
        return providerFallback;
    }
    

}
