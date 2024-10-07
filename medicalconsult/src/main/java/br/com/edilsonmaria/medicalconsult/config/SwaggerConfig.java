package br.com.edilsonmaria.medicalconsult.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.SwaggerParseResult;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI(){
        SwaggerParseResult swaggerParseResult = new OpenAPIV3Parser().readLocation("src/main/resources/swagger.yml", null, null);
        return swaggerParseResult.getOpenAPI();
    }

//    @Bean
//    public OpenAPI customOpenAPI() {
//        return new OpenAPIV3Parser().readLocation("classpath:swagger.yml", null, null).getOpenAPI();
//    }

}
