package camel_microservice_a.route.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import static org.apache.camel.LoggingLevel.ERROR;
import static org.apache.camel.LoggingLevel.INFO;

@Component
public class HelloRoute extends RouteBuilder {

  @Override
  public void configure() {
      from("direct:greeting")
              .id("greeting")
              .log(ERROR, "Hello ${body}")

                .choice()

                  .when()
                  .simple("${body} contains 'Team' ")
                  .log(INFO, "IF PERSON CODE :::: ")
                .otherwise()
                  .log(ERROR, "ELSE PORTION CODE :::: ")
                  .end()
              .to("direct:finishing");

      from("direct:finishing")
              .id("greeting-finish")
              .log(ERROR,"Bye ${body}");
  }
}
