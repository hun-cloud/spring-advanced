package hello.advanced.app.proxy.config.v1_proxy;

import hello.advanced.app.proxy.config.v1_proxy.interface_proxy.OrderControllerInterfaceProxy;
import hello.advanced.app.proxy.config.v1_proxy.interface_proxy.OrderRepositoryInterfaceProxy;
import hello.advanced.app.proxy.config.v1_proxy.interface_proxy.OrderServiceInterfaceProxy;
import hello.advanced.app.proxy.v1.*;
import hello.advanced.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InterfaceProxyConfig {

    @Bean
    public OrderControllerV1 orderController(LogTrace logTrace) {
        OrderControllerV1Impl controllerImpl = new OrderControllerV1Impl(orderService(logTrace));
        return new OrderControllerInterfaceProxy(controllerImpl, logTrace);
    }

    @Bean
    public OrderServiceV1 orderService(LogTrace logTrace) {
        OrderServiceV1Impl orderServiceImpl = new OrderServiceV1Impl(orderRepository(logTrace));
        return new OrderServiceInterfaceProxy(orderServiceImpl, logTrace);
    }

    @Bean
    public OrderRepositoryV1 orderRepository(LogTrace logTrace) {
        OrderRepositoryV1Impl orderRepositoryImpl = new OrderRepositoryV1Impl();
        return new OrderRepositoryInterfaceProxy(orderRepositoryImpl, logTrace);
    }
}
