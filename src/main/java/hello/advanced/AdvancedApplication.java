package hello.advanced;

import hello.advanced.app.proxy.config.AppV1Config;
import hello.advanced.app.proxy.config.AppV2Config;
import hello.advanced.app.proxy.config.v1_proxy.InterfaceProxyConfig;
import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import(AppV1Config.class)
// @Import(InterfaceProxyConfig.class)
@SpringBootApplication(scanBasePackages = "hello.advanced.app.proxy")
public class AdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedApplication.class, args);
	}

	@Bean
	public LogTrace logTrace() {
		return new ThreadLocalLogTrace();
	}
}
