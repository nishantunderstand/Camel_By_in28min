package camel_microservice_a.route.b;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class MyFileRouterChoice extends RouteBuilder {
  @Override
  public void configure() throws Exception {

    //from("file:files/input?noop=true")

    from("file:camel-microservice-a/files/input")
            .routeId("Files-Input-Route")
            .transform().body(String.class)
            .choice()
              .when(simple("${file:ext} == 'xml'"))
              //.when(simple("${file:ext} ends with 'xml'")) // WRONG
                  .log("XML FILE")
              .when(simple("${body} contains 'USD'"))
                .log("Not an XML FILE BUT contains USD")
              .otherwise()
                .log("NOT AN XML FILE")
            .end()
            //.log("${body}")
            .log("${messageHistroy")
            .to("file:camel-microservice-a/files/output");
  }
}
