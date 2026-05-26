package camel_microservice_b;

import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CurrenyExchange{
    private long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
}