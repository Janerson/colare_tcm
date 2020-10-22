package com.dom.colare.api.swagger;

/*@Configuration
@EnableSwagger2*/
public class SwaggerConfig /*extends WebMvcConfigurationSupport*/ {
/*    //@Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dom.colare.api.endpoints"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData());
    }

    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new PageableHandlerMethodArgumentResolver());
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }


    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("Documentação Colare Api")
                .description("Spring Boot REST API")
                .version("1.0.0")
                .contact(new Contact("Janerson Douglas", "https://github.com/Janerson", "douglas.janerson@gmail.com"))
                .build();

    }*/
}
