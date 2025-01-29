package hello.advanced.app.proxy.v2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProxyOrderControllerV2 {

    private final OrderServiceV2 orderServiceV2;

    @GetMapping("/proxy/v2/request")
    public String request(@RequestParam("itemId") String itemId) {
        orderServiceV2.orderItem(itemId);
        return "ok";
    }
    @GetMapping("/proxy/v2/no-log")
    public String noLog() {
        return "";
    }
}
