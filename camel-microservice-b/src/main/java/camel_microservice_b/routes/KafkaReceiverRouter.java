package camel_microservice_b.routes;

import camel_microservice_b.CurrenyExchange;
import lombok.NoArgsConstructor;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//@Component
@NoArgsConstructor
public class KafkaReceiverRouter extends RouteBuilder{

    @Override
    public void configure() throws Exception {

        from("kafka:myKafkaTopic")
                .to("log:recieved-message-from-kafka");

    }
}

