package camel_microservice_a.route.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class ActiveMqSenderRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        /*from("file:files/test")
        .log("Body : ${body}")
        .to("activemq:my-activemq-queue-2026");*/

        /*from("file:files/test?move=.camel/${file:name}&moveFailed=error/${file:name}")
                .log("Processing file: ${header.CamelFileName}")
                .to("activemq:my-activemq-queue-2026")
                .log("File processed successfully");*/


        //

        /*//from("file:files/test?readLock=none")
        from("file:camel-microservice-a/files/json") // WORKING
        //from("file:./files/test") // FAILING - RELATIVE ADDRESS ISSUE
        .log("Body : ${body}")
        .to("activemq:my-activemq-queue-2026");*/


        /*from("file:camel-microservice-a/files/json") // WORKING
                 .log("Body : ${body}")
                .to("activemq:my-activemq-queue-2026");
        */
        from("file:camel-microservice-a/files/xml") // WORKING
                .log("Body : ${body}")
                .to("activemq:my-activemq-xml-queue-2026");
    }

}