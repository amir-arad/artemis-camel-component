package org.amir.arad.artemis;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The artemis producer.
 */
public class artemisProducer extends DefaultProducer {
    private static final Logger LOG = LoggerFactory.getLogger(artemisProducer.class);
    private artemisEndpoint endpoint;

    public artemisProducer(artemisEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody());    
    }

}
