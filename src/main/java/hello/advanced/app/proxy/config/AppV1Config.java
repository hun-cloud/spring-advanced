package hello.advanced.app.proxy.config;

import hello.advanced.app.proxy.v1.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppV1Config {

    @Bean
    public OrderControllerV1 proxyOrderControllerV1() {
        return new OrderControllerV1Impl(proxyOrderServiceV1());
    }

    @Bean
    public OrderServiceV1 proxyOrderServiceV1() {
        return new OrderServiceV1Impl(proxyOrderRepositoryV1());
    }

    @Bean
    public OrderRepositoryV1 proxyOrderRepositoryV1() {
        return new OrderRepositoryV1Impl();
    }
}
