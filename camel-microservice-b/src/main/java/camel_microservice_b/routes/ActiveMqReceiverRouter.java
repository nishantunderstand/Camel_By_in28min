package camel_microservice_b.routes;

import camel_microservice_b.CurrenyExchange;
import lombok.NoArgsConstructor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//@Component
@NoArgsConstructor
public class ActiveMqReceiverRouter extends RouteBuilder{

    private MyCurrencyExchangeProcessor myCurrencyExchangeProcessor;
    private MyCurrencyExchangeTransformer myCurrencyExchangeTransformer;

    @Override
    public void configure() throws Exception {
        /*from("activemq:my-activemq-queue-2026")
                .unmarshal()
                .json(JsonLibrary.Jackson, CurrenyExchange.class)
                //.bean("myCurrencyExchangeProcessor","processMessage")
                .bean("myCurrencyExchangeTransformer")
                .log("Recieved JSON from ActiveMQ :${body}")
                .to("log:recieved-message-from-active-mq");*/

        from("activemq:my-activemq-xml-queue-2026")
                .unmarshal()
                .jacksonXml(CurrenyExchange.class)
                //.bean("myCurrencyExchangeProcessor","processMessage")
                //.bean("myCurrencyExchangeTransformer")
                .log("Recieved JSON from ActiveMQ :${body}")
                .to("log:recieved-message-from-active-mq");

    }
}



@Component
class MyCurrencyExchangeProcessor{
    private static final Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeProcessor.class);

    public void processMessage(CurrenyExchange currencyExchange){
        logger.info("Do Something ::=>>>>>>>> ");
        logger.info("Do Something $$$$$$$$$ ");
        logger.info("Do Something ::=>>>>>>>> ");
        //currencyExchange.getConversionMultiple();
    }
}


@Component
class MyCurrencyExchangeTransformer{
    private static final Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeProcessor.class);

    public CurrenyExchange processMessage(CurrenyExchange currencyExchange){
        currencyExchange.setConversionMultiple(currencyExchange.getConversionMultiple().multiply(BigDecimal.TEN));
        logger.info("Do Something ::=>>>>>>>> ");
        logger.info("Do Something $$$$$$$$$ ");
        logger.info("Do Something ::=>>>>>>>> ");
        //currencyExchange.getConversionMultiple();
        return currencyExchange;
    }
}
