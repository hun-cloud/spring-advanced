package hello.advanced.app.proxy.config;

import hello.advanced.app.proxy.v2.ProxyOrderControllerV2;
import hello.advanced.app.proxy.v2.OrderRepositoryV2;
import hello.advanced.app.proxy.v2.OrderServiceV2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppV2Config {

    @Bean
    public ProxyOrderControllerV2 proxyOrderControllerV2() {
        return new ProxyOrderControllerV2(proxyOrderServiceV2());
    }

    @Bean
    public OrderServiceV2 proxyOrderServiceV2() {
        return new OrderServiceV2(proxyOrderRepositoryV2());
    }

    @Bean
    public OrderRepositoryV2 proxyOrderRepositoryV2() {
        return new OrderRepositoryV2();
    }
}
