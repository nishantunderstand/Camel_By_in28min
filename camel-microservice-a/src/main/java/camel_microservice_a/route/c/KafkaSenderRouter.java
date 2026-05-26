package camel_microservice_a.route.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class KafkaSenderRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("file:camel-microservice-a/files/json")
                .log("${body}")
                .to("kafka:myKafkaTopic");
    }

}