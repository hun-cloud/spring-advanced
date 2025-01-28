package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloTraceV11Test {

    @DisplayName("begin_end")
    @Test
    void begin_end() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status =  trace.begin("hello");
        trace.end(status);
    }

    @DisplayName("begin_exception")
    @Test
    void begin_exception() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status =  trace.begin("hello");
        trace.exception(status, new IllegalStateException());
    }
}