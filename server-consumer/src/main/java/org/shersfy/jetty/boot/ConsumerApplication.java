package org.shersfy.jetty.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;

@EnableDiscoveryClient
@EnableFeignClients(basePackages="org.shersfy.jetty.feign")
@ComponentScan(basePackages="org.shersfy.jetty",
excludeFilters= @Filter(type=FilterType.ANNOTATION, value=FeignClient.class))
@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ConsumerApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}

}
