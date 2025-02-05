package hello.advanced.pureproxy.concreteproxy.code;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

@RequiredArgsConstructor
public class ConcreteClient {

    private final ConcreteLogic concreteLogic;

    public void execute() {
        concreteLogic.operation();
    }
}
