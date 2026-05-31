package camel_microservice_a.route.a;

import camel_microservice_a.route.a.HelloRoute;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

public class HelloRouteJUnitTest extends CamelTestSupport {

  @Override
  protected RoutesBuilder createRouteBuilder() throws Exception {
    return new HelloRoute();
  }

  @Test
  void testHelloRoute(){
    template.sendBody("direct:greeting","Java");
  }
}