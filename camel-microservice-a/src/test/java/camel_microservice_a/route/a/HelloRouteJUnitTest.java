package camel_microservice_a.route.a;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

public class HelloRouteJUnitTest extends CamelTestSupport {

  @Override
  public RoutesBuilder createRouteBuilder() throws Exception {
    return new HelloRoute();
  }

  @Test
  void testMocksAreValid (){
    System.out.println("Sending - 1");
    template.sendBody("direct:greeting","Java");

    System.out.println("Sending - 2");
    template.sendBody("direct:greeting","Aaaaa");
  }
}