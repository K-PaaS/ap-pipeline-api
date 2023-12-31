package delivery.pipeline.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * apDeliveryPipelineApi
 * delivery.pipeline.api.config
 *
 * @author REX
 * @version 1.0
 * @since 6 /1/2017
 */
@Configuration
public class RestTemplateConfig {

    /**
     * Rest template rest template.
     *
     * @return the rest template
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
