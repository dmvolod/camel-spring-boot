/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.avro.springboot;

import javax.annotation.Generated;
import org.apache.avro.Protocol;
import org.apache.camel.component.avro.AvroTransport;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Working with Apache Avro for data serialization.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.avro")
public class AvroComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the avro component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * To use a shared AvroConfiguration to configure options once
     */
    private AvroConfigurationNestedConfiguration configuration;

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public AvroConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            AvroConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public static class AvroConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.avro.AvroConfiguration.class;
        /**
         * Hostname to use
         */
        private String host;
        /**
         * The name of the message to send.
         */
        private String messageName;
        /**
         * Port number to use
         */
        private Integer port;
        /**
         * Avro protocol to use
         */
        private Protocol protocol;
        /**
         * Avro protocol to use defined by the FQN class name
         */
        private String protocolClassName;
        /**
         * Avro protocol location
         */
        private String protocolLocation;
        /**
         * If protocol object provided is reflection protocol. Should be used
         * only with protocol parameter because for protocolClassName protocol
         * type will be auto detected
         */
        private Boolean reflectionProtocol = false;
        /**
         * If true, consumer parameter won't be wrapped into array. Will fail if
         * protocol specifies more then 1 parameter for the message
         */
        private Boolean singleParameter = false;
        /**
         * Transport to use, can be either http or netty
         */
        private AvroTransport transport;
        /**
         * Authority to use (username and password)
         */
        private String uriAuthority;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getMessageName() {
            return messageName;
        }

        public void setMessageName(String messageName) {
            this.messageName = messageName;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Protocol getProtocol() {
            return protocol;
        }

        public void setProtocol(Protocol protocol) {
            this.protocol = protocol;
        }

        public String getProtocolClassName() {
            return protocolClassName;
        }

        public void setProtocolClassName(String protocolClassName) {
            this.protocolClassName = protocolClassName;
        }

        public String getProtocolLocation() {
            return protocolLocation;
        }

        public void setProtocolLocation(String protocolLocation) {
            this.protocolLocation = protocolLocation;
        }

        public Boolean getReflectionProtocol() {
            return reflectionProtocol;
        }

        public void setReflectionProtocol(Boolean reflectionProtocol) {
            this.reflectionProtocol = reflectionProtocol;
        }

        public Boolean getSingleParameter() {
            return singleParameter;
        }

        public void setSingleParameter(Boolean singleParameter) {
            this.singleParameter = singleParameter;
        }

        public AvroTransport getTransport() {
            return transport;
        }

        public void setTransport(AvroTransport transport) {
            this.transport = transport;
        }

        public String getUriAuthority() {
            return uriAuthority;
        }

        public void setUriAuthority(String uriAuthority) {
            this.uriAuthority = uriAuthority;
        }
    }
}