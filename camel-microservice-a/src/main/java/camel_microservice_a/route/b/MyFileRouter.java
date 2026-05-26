package camel_microservice_a.route.b;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import static java.rmi.server.LogStream.log;

//@Component
public class MyFileRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:files/input")
                .log("${body}")
                .to("file:files/output")
                .log("${body}");
    }
}


/**
 *
 * | File Type | Typical Body Type | Example Content                     |
 * | --------- | ----------------- | ----------------------------------- |
 * | JSON      | `String`          | `{"name":"Nishant"}`                |
 * | XML       | `String`          | `<user><name>Nishant</name></user>` |
 * | CSV       | `String`          | `id,name\n1,Nishant`                |
 * | TXT       | `String`          | `Hello World`                       |
 * | PDF       | `byte[]`          | Binary bytes                        |
 * | Image     | `byte[]`          | Binary bytes                        |
 *
 */


/**
 * You can parse them
 * Explict Parsing
 *  from("file:input").unmarshal().json();
    from("file:input").unmarshal().jacksonXml();
 *  from("file:input").unmarshal().csv();
 */
