package camel_microservice_b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

//@RestController
public class CurrencyExchangeController {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrenyExchange findConversionValue(
            @PathVariable String from,
            @PathVariable String to
    ){
        System.out.println("FROM = " + from);
        System.out.println("TO   = " + to);
        return new CurrenyExchange(10001L,from,to,BigDecimal.ONE);
    }
}
