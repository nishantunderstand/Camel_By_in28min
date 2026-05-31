package camel_microservice_a.route.a;

import lombok.RequiredArgsConstructor;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
// import java.util.logging.Logger; //<-- RCA

//@Component
@RequiredArgsConstructor
public class MyFirstRouter2026 extends RouteBuilder {

    private final GetCurrentTimeBean getCurrentTimeBean;
    private final SimpleLoggingProcessorComponent loggingComponent;

    @Override
    public void configure() {
        from("timer:first-timer")
                .log("${body}")
                /*.transform().constant("My Constant Message")
                .log("${body}")
                .bean(getCurrentTimeBean,"getCurrentTime2")
                .log("${body}")
                .bean(loggingComponent)
                .log("${body}")
                */
                .process(new SimpleLoggingProcessor())
                .log("${body}")
                .to("log:first-timer");
    }
}

/**
 * Suppose you have multiple Method In the bean, In this case you need to use this approach
 * className,"methodName"
 */

//@Component
class GetCurrentTimeBean {

    public String getCurrentTime2() {
        return STR."Time Now is => \{LocalDateTime.now()}";
    }
}

//@Component
class SimpleLoggingProcessorComponent {
    private static final Logger logger = LoggerFactory.getLogger(SimpleLoggingProcessorComponent.class);
    public void process(String message) {
        logger.info("SimpleLoggingProcessorComponent {}",message);
    }
}


class SimpleLoggingProcessor implements Processor {
    private static final Logger logger = LoggerFactory.getLogger(SimpleLoggingProcessor.class);
    // Should I need to use SimpleLoggingProcessor in the argument
    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Directly Using the component || No need to use Component");
        logger.info("SimpleLoggingProcessor {}",exchange.getMessage().getBody());
    }
}
