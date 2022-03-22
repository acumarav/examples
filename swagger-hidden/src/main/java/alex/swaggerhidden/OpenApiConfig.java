package alex.swaggerhidden;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {


    @Bean
    public OpenAPI config() {
        return new OpenAPI()
                .externalDocs(new ExternalDocumentation().url("https://google.com").description("cool desc"));
    }
}
