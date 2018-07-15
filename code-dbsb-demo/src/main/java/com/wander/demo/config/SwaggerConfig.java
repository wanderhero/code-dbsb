package com.wander.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Wander.Zeng
 * @create 2018-07-15 20:28
 * @desc SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                //.apiInfo(apiInfo())
                //.globalOperationParameters(parameterList())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wander.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /*private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //.title("Spring Boot中使用Swagger2构建RESTful APIs")
                //.description("")
                //.termsOfServiceUrl("")
                //.contact(new Contact("联系方式", "http://www.baidu.com", "123456@qq.com"))
                //.version("1.0")
                .build();
    }*/

    /*private List<Parameter> parameterList() {
        List<Parameter> list = new ArrayList<Parameter>();
        list.add(new ParameterBuilder()
                .name("token")
                .description("某些方法需要token验证，可以为空")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build());
        return list;
    }*/

}
