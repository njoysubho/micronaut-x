package micronaut.tracing.example;


import brave.Tracing;
import brave.context.slf4j.MDCCurrentTraceContext;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import lombok.val;
import zipkin2.reporter.Reporter;

@Factory
public class TraceConfig {
    @Bean
    public Tracing tracing() {
        val tracing = Tracing.newBuilder()
                .localServiceName("hello")
                .spanReporter(Reporter.NOOP)
                .currentTraceContext(MDCCurrentTraceContext.create());
        return tracing.build();
    }
}
