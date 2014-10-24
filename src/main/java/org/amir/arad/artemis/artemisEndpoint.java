package org.amir.arad.artemis;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;

/**
 * Represents a artemis endpoint.
 */
public class artemisEndpoint extends DefaultEndpoint {

    public artemisEndpoint() {
    }

    public artemisEndpoint(String uri, artemisComponent component) {
        super(uri, component);
    }

    public artemisEndpoint(String endpointUri) {
        super(endpointUri);
    }

    public Producer createProducer() throws Exception {
        return new artemisProducer(this);
    }

    public Consumer createConsumer(Processor processor) throws Exception {
        return new artemisConsumer(this, processor);
    }

    public boolean isSingleton() {
        return true;
    }
}
