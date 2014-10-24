package org.amir.arad.artemis;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.impl.DefaultComponent;

/**
 * Represents the component that manages {@link artemisEndpoint}.
 */
public class artemisComponent extends DefaultComponent {

    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new artemisEndpoint(uri, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
