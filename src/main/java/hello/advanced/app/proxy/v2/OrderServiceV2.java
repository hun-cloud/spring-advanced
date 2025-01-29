package hello.advanced.app.proxy.v2;

import hello.advanced.app.proxy.v1.OrderRepositoryV1;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderServiceV2 {

    private final OrderRepositoryV2 orderRepositoryV2;

    public void orderItem(String itemId) {
        orderRepositoryV2.save(itemId);
    }
}
