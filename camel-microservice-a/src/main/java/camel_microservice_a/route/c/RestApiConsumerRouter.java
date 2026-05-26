package camel_microservice_a.route.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class RestApiConsumerRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        restConfiguration().host("localhost").port(8000);

        /*from("timer:rest-api-consumer?period=1000")
                .log("${body}")
                .to("rest:get:/currency-exchange/from/EUR/to/INR")
                .log("${body}");*/


        from("timer:rest-api-consumer?period=1000")
                .setHeader("from",()->"EUROPE")
                .setHeader("to",()->"INDIA")
                .log("${body}")
                .to("rest:get:/currency-exchange/from/{from}/to/{to}")
                .log("${body}");
    }

}