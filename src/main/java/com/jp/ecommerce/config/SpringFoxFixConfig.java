//package com.jp.ecommerce.config;
//
//import java.lang.reflect.Field;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
//
//import jakarta.annotation.PostConstruct;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.spring.web.plugins.DocumentationPluginsBootstrapper;
//import springfox.documentation.spring.web.plugins.WebFluxRequestHandlerProvider;
//import springfox.documentation.spring.web.plugins.WebMvcRequestHandlerProvider;
//
//@Configuration
//public class SpringFoxFixConfig {
//
//	@Autowired(required = false)
//    private List<WebMvcRequestHandlerProvider> webMvcRequestHandlerProviders;
//
//    @Autowired(required = false)
//    private List<WebFluxRequestHandlerProvider> webFluxRequestHandlerProviders;
//
//    @PostConstruct
//    public void init() throws NoSuchFieldException, IllegalAccessException {
//        if (webMvcRequestHandlerProviders != null) {
//            fixSpringfoxHandlerProviders(webMvcRequestHandlerProviders);
//        }
//        if (webFluxRequestHandlerProviders != null) {
//            fixSpringfoxHandlerProviders(webFluxRequestHandlerProviders);
//        }
//    }
//
//    private void fixSpringfoxHandlerProviders(List<?> providers) throws NoSuchFieldException, IllegalAccessException {
//        for (Object provider : providers) {
//            Field field = provider.getClass().getDeclaredField("handlerMappings");
//            field.setAccessible(true);
//            List<?> handlerMappings = (List<?>) field.get(provider);
//            List<?> filteredMappings = handlerMappings.stream()
//                    .filter(mapping -> {
//                        try {
//                            Field patternParserField = mapping.getClass().getDeclaredField("patternParser");
//                            patternParserField.setAccessible(true);
//                            return patternParserField.get(mapping) == null;
//                        } catch (NoSuchFieldException | IllegalAccessException e) {
//                            return true;
//                        }
//                    })
//                    .collect(Collectors.toList());
//            field.set(provider, filteredMappings);
//        }
//    }
//	
//}
