package org.shersfy.jetty.hystrix;

import org.shersfy.jetty.feign.ProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProviderFallback implements ProviderClient {
    
    protected Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Override
    public String callVersion(String name) {
        return "error";
    }


}
