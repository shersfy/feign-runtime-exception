package org.shersfy.jetty.feign;

import org.shersfy.jetty.hystrix.FeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name=ProviderClient.serviceId, 
fallbackFactory=FeignClientFallbackFactory.class)
public interface ProviderClient {
    
    String serviceId = "server-provider";
    
    @RequestMapping(method = RequestMethod.GET, value = "/version")
    @ResponseBody
    String callVersion(@RequestParam("name")String name);
    
}
