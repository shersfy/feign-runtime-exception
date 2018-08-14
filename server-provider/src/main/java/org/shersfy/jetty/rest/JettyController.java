package org.shersfy.jetty.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JettyController {
    
    protected Logger LOGGER = LoggerFactory.getLogger(getClass());
    
    @Value("${version}")
    private String version;
    
    @GetMapping("/")
    public Object index() {
        return "Welcom Jetty Application";
    }
    
    @GetMapping("/version")
    public Object version(String name) {
        name = name==null?"":name;
        return name+version;
    }
}
