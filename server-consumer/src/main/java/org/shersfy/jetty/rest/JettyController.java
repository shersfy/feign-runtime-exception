package org.shersfy.jetty.rest;

import org.shersfy.jetty.feign.ProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JettyController {
    
    protected Logger LOGGER = LoggerFactory.getLogger(getClass());
    
    @Autowired
    private ProviderClient providerClient;
    
    @RequestMapping("/")
    public Object index() {
        return "Welcom Jetty Application";
    }
    
    
    @RequestMapping("/provider")
    public Object provider() {
        return providerClient.callVersion("provider-server");
    }
}
