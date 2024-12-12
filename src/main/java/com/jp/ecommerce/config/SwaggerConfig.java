package com.jp.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableSwagger2
public class SwaggerConfig {

//	@Bean
//    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//        		.apiInfo(getApiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.jp.ecommerce"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//	private ApiInfo getApiInfo() {
//        Contact contact = new Contact("webtutsplus", "http://webtutsplus.com", "contact.webtutsplus@gmail.com");
//        return new ApiInfoBuilder()
//                .title("Ecommerce API")
//                .description("Documentation Ecommerce api")
//                .version("1.0.0")
//                .license("Apache 2.0")
//                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
//                .contact(contact)
//                .build();
//    }
	
	@Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("Ecommerce API")
                    .version("1.0.0")
                    .description("Documentation for Ecommerce API")
                    .contact(new Contact()
                        .name("webtutsplus")
                        .url("http://webtutsplus.com")
                        .email("contact.webtutsplus@gmail.com"))
                    .license(new License().name("Apache 2.0").url("http://www.apache.org/licenses/LICENSE-2.0")));
    }
	
}
