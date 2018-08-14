# feign-runtime-exception

1. start registration-center
2. start server-provider
3. start server-consumer

```
2018-08-14 17:56:06.740  INFO 13512 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@31f9b85e: startup date [Tue Aug 14 17:56:06 CST 2018]; root of context hierarchy
2018-08-14 17:56:06.919  INFO 13512 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
2018-08-14 17:56:06.945  INFO 13512 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'configurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$304f9d47] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2018-08-14 17:56:07.602  INFO 13512 --- [           main] o.s.jetty.boot.ConsumerApplication       : No active profile set, falling back to default profiles: default
2018-08-14 17:56:07.618  INFO 13512 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@632ceb35: startup date [Tue Aug 14 17:56:07 CST 2018]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@31f9b85e
2018-08-14 17:56:08.423  INFO 13512 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=bdbe607b-a3a9-32d0-98b6-9ff50531dcb9
2018-08-14 17:56:08.443  INFO 13512 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
2018-08-14 17:56:08.531  INFO 13512 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$304f9d47] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2018-08-14 17:56:08.671  INFO 13512 --- [           main] org.eclipse.jetty.util.log               : Logging initialized @3569ms to org.eclipse.jetty.util.log.Slf4jLog
2018-08-14 17:56:09.098  INFO 13512 --- [           main] o.s.b.w.e.j.JettyServletWebServerFactory : Server initialized with port: 8091
2018-08-14 17:56:09.101  INFO 13512 --- [           main] org.eclipse.jetty.server.Server          : jetty-9.4.9.v20180320; built: 2018-03-20T20:21:10+08:00; git: 1f8159b1e4a42d3f79997021ea1609f2fbac6de5; jvm 1.8.0_171-b11
2018-08-14 17:56:09.216  INFO 13512 --- [           main] org.eclipse.jetty.server.session         : DefaultSessionIdManager workerName=node0
2018-08-14 17:56:09.216  INFO 13512 --- [           main] org.eclipse.jetty.server.session         : No SessionScavenger set, using defaults
2018-08-14 17:56:09.218  INFO 13512 --- [           main] org.eclipse.jetty.server.session         : Scavenging every 600000ms
2018-08-14 17:56:09.222  INFO 13512 --- [           main] o.e.j.s.h.ContextHandler.application     : Initializing Spring embedded WebApplicationContext
2018-08-14 17:56:09.223  INFO 13512 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1606 ms
2018-08-14 17:56:09.461  WARN 13512 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2018-08-14 17:56:09.461  INFO 13512 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2018-08-14 17:56:09.477  INFO 13512 --- [           main] c.netflix.config.DynamicPropertyFactory  : DynamicPropertyFactory is initialized with configuration sources: com.netflix.config.ConcurrentCompositeConfiguration@65d57e4e
2018-08-14 17:56:11.105  INFO 13512 --- [           main] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2018-08-14 17:56:11.107  INFO 13512 --- [           main] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-08-14 17:56:11.107  INFO 13512 --- [           main] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-08-14 17:56:11.107  INFO 13512 --- [           main] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-08-14 17:56:11.108  INFO 13512 --- [           main] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-08-14 17:56:11.108  INFO 13512 --- [           main] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpTraceFilter' to: [/*]
2018-08-14 17:56:11.108  INFO 13512 --- [           main] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'webMvcMetricsFilter' to: [/*]
2018-08-14 17:56:11.111  INFO 13512 --- [           main] o.e.jetty.server.handler.ContextHandler  : Started o.s.b.w.e.j.JettyEmbeddedWebAppContext@268cbb86{/,[file:///C:/Users/shers/AppData/Local/Temp/jetty-docbase.3446857134467549428.8091/],AVAILABLE}
2018-08-14 17:56:11.112  INFO 13512 --- [           main] org.eclipse.jetty.server.Server          : Started @6011ms
2018-08-14 17:56:11.131  INFO 13512 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing FeignContext-server-provider: startup date [Tue Aug 14 17:56:11 CST 2018]; parent: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@632ceb35
2018-08-14 17:56:11.147  INFO 13512 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
2018-08-14 17:56:11.279 ERROR 13512 --- [           main] o.s.j.h.FeignClientFallbackFactory       : 

java.lang.RuntimeException: null
	at org.springframework.cloud.openfeign.HystrixTargeter.targetWithFallbackFactory(HystrixTargeter.java:67) [spring-cloud-openfeign-core-2.0.0.RELEASE.jar:2.0.0.RELEASE]
	at org.springframework.cloud.openfeign.HystrixTargeter.target(HystrixTargeter.java:53) [spring-cloud-openfeign-core-2.0.0.RELEASE.jar:2.0.0.RELEASE]
	at org.springframework.cloud.openfeign.FeignClientFactoryBean.loadBalance(FeignClientFactoryBean.java:223) [spring-cloud-openfeign-core-2.0.0.RELEASE.jar:2.0.0.RELEASE]
	at org.springframework.cloud.openfeign.FeignClientFactoryBean.getObject(FeignClientFactoryBean.java:244) [spring-cloud-openfeign-core-2.0.0.RELEASE.jar:2.0.0.RELEASE]
	at org.springframework.beans.factory.support.FactoryBeanRegistrySupport.doGetObjectFromFactoryBean(FactoryBeanRegistrySupport.java:163) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.FactoryBeanRegistrySupport.getObjectFromFactoryBean(FactoryBeanRegistrySupport.java:101) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getObjectForBeanInstance(AbstractBeanFactory.java:1645) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.getObjectForBeanInstance(AbstractAutowireCapableBeanFactory.java:1178) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:257) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:251) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.addCandidateEntry(DefaultListableBeanFactory.java:1325) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1291) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1101) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1065) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:584) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:91) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:373) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1344) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:578) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:501) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:317) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:228) ~[spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:315) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:760) [spring-beans-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:869) ~[spring-context-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:550) ~[spring-context-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:140) ~[spring-boot-2.0.1.RELEASE.jar:2.0.1.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:759) ~[spring-boot-2.0.1.RELEASE.jar:2.0.1.RELEASE]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:395) ~[spring-boot-2.0.1.RELEASE.jar:2.0.1.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:327) ~[spring-boot-2.0.1.RELEASE.jar:2.0.1.RELEASE]
	at org.shersfy.jetty.boot.ConsumerApplication.main(ConsumerApplication.java:23) ~[classes/:na]

2018-08-14 17:56:11.320  WARN 13512 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
2018-08-14 17:56:11.321  INFO 13512 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2018-08-14 17:56:11.396  INFO 13512 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-08-14 17:56:11.531  INFO 13512 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@632ceb35: startup date [Tue Aug 14 17:56:07 CST 2018]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@31f9b85e
2018-08-14 17:56:11.589  INFO 13512 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/]}" onto public java.lang.Object org.shersfy.jetty.rest.JettyController.index()
2018-08-14 17:56:11.590  INFO 13512 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/provider]}" onto public java.lang.Object org.shersfy.jetty.rest.JettyController.provider()
2018-08-14 17:56:11.592  INFO 13512 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-08-14 17:56:11.593  INFO 13512 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-08-14 17:56:11.621  INFO 13512 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-08-14 17:56:11.622  INFO 13512 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-08-14 17:56:12.084  INFO 13512 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2018-08-14 17:56:12.094  INFO 13512 --- [           main] s.b.a.e.w.s.WebMvcEndpointHandlerMapping : Mapped "{[/actuator/health],methods=[GET],produces=[application/vnd.spring-boot.actuator.v2+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping$OperationHandler.handle(javax.servlet.http.HttpServletRequest,java.util.Map<java.lang.String, java.lang.String>)
2018-08-14 17:56:12.095  INFO 13512 --- [           main] s.b.a.e.w.s.WebMvcEndpointHandlerMapping : Mapped "{[/actuator/info],methods=[GET],produces=[application/vnd.spring-boot.actuator.v2+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping$OperationHandler.handle(javax.servlet.http.HttpServletRequest,java.util.Map<java.lang.String, java.lang.String>)
2018-08-14 17:56:12.095  INFO 13512 --- [           main] s.b.a.e.w.s.WebMvcEndpointHandlerMapping : Mapped "{[/actuator],methods=[GET],produces=[application/vnd.spring-boot.actuator.v2+json || application/json]}" onto protected java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.springframework.boot.actuate.endpoint.web.Link>> org.springframework.boot.actuate.endpoint.web.servlet.WebMvcEndpointHandlerMapping.links(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-08-14 17:56:12.142  INFO 13512 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-08-14 17:56:12.151  INFO 13512 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'environmentManager' has been autodetected for JMX exposure
2018-08-14 17:56:12.152  INFO 13512 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'configurationPropertiesRebinder' has been autodetected for JMX exposure
2018-08-14 17:56:12.153  INFO 13512 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshScope' has been autodetected for JMX exposure
2018-08-14 17:56:12.155  INFO 13512 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'environmentManager': registering with JMX server as MBean [org.springframework.cloud.context.environment:name=environmentManager,type=EnvironmentManager]
2018-08-14 17:56:12.163  INFO 13512 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshScope': registering with JMX server as MBean [org.springframework.cloud.context.scope.refresh:name=refreshScope,type=RefreshScope]
2018-08-14 17:56:12.171  INFO 13512 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'configurationPropertiesRebinder': registering with JMX server as MBean [org.springframework.cloud.context.properties:name=configurationPropertiesRebinder,context=632ceb35,type=ConfigurationPropertiesRebinder]
2018-08-14 17:56:12.180  INFO 13512 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
2018-08-14 17:56:12.187  INFO 13512 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
2018-08-14 17:56:12.232  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : Initializing Eureka in region us-east-1
2018-08-14 17:56:12.761  INFO 13512 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
2018-08-14 17:56:12.761  INFO 13512 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
2018-08-14 17:56:12.892  INFO 13512 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
2018-08-14 17:56:12.892  INFO 13512 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
2018-08-14 17:56:13.057  INFO 13512 --- [           main] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
2018-08-14 17:56:13.380  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
2018-08-14 17:56:13.380  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
2018-08-14 17:56:13.380  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
2018-08-14 17:56:13.380  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : Application is null : false
2018-08-14 17:56:13.380  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
2018-08-14 17:56:13.380  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : Application version is -1: true
2018-08-14 17:56:13.380  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
2018-08-14 17:56:13.558  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : The response status is 200
2018-08-14 17:56:13.560  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : Starting heartbeat executor: renew interval is: 30
2018-08-14 17:56:13.562  INFO 13512 --- [           main] c.n.discovery.InstanceInfoReplicator     : InstanceInfoReplicator onDemand update allowed rate per min is 4
2018-08-14 17:56:13.564  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : Discovery Client initialized at timestamp 1534240573564 with initial instances count: 2
2018-08-14 17:56:13.567  INFO 13512 --- [           main] o.s.c.n.e.s.EurekaServiceRegistry        : Registering application server-consumer with eureka with status UP
2018-08-14 17:56:13.568  INFO 13512 --- [           main] com.netflix.discovery.DiscoveryClient    : Saw local status change event StatusChangeEvent [timestamp=1534240573568, current=UP, previous=STARTING]
2018-08-14 17:56:13.570  INFO 13512 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_SERVER-CONSUMER/DESKTOP-PJC8JO1:server-consumer:8091: registering service...
2018-08-14 17:56:13.595  INFO 13512 --- [           main] o.e.j.s.h.ContextHandler.application     : Initializing Spring FrameworkServlet 'dispatcherServlet'
2018-08-14 17:56:13.596  INFO 13512 --- [           main] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
2018-08-14 17:56:13.609  INFO 13512 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_SERVER-CONSUMER/DESKTOP-PJC8JO1:server-consumer:8091 - registration status: 204
2018-08-14 17:56:13.617  INFO 13512 --- [           main] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 21 ms
2018-08-14 17:56:13.654  INFO 13512 --- [           main] o.e.jetty.server.AbstractConnector       : Started ServerConnector@25567581{HTTP/1.1,[http/1.1]}{0.0.0.0:8091}
2018-08-14 17:56:13.657  INFO 13512 --- [           main] o.s.b.web.embedded.jetty.JettyWebServer  : Jetty started on port(s) 8091 (http/1.1) with context path '/'
2018-08-14 17:56:13.657  INFO 13512 --- [           main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8091
2018-08-14 17:56:13.659  INFO 13512 --- [           main] o.s.jetty.boot.ConsumerApplication       : Started ConsumerApplication in 7.996 seconds (JVM running for 8.557)

```

