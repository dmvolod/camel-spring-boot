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
package org.apache.camel.component.undertow.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The undertow component provides HTTP and WebSocket based endpoints for
 * consuming and producing HTTP/WebSocket requests.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.undertow")
public class UndertowComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the undertow component. This is
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
     * If enabled and an Exchange failed processing on the consumer side the
     * response's body won't contain the exception's stack trace.
     */
    private Boolean muteException = false;
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
     * To configure common options, such as thread pools
     */
    private UndertowHostOptionsNestedConfiguration hostOptions;
    /**
     * To use a custom HttpBinding to control the mapping between Camel message
     * and HttpClient. The option is a
     * org.apache.camel.component.undertow.UndertowHttpBinding type.
     */
    private String undertowHttpBinding;
    /**
     * To configure security using SSLContextParameters. The option is a
     * org.apache.camel.support.jsse.SSLContextParameters type.
     */
    private String sslContextParameters;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getMuteException() {
        return muteException;
    }

    public void setMuteException(Boolean muteException) {
        this.muteException = muteException;
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

    public UndertowHostOptionsNestedConfiguration getHostOptions() {
        return hostOptions;
    }

    public void setHostOptions(
            UndertowHostOptionsNestedConfiguration hostOptions) {
        this.hostOptions = hostOptions;
    }

    public String getUndertowHttpBinding() {
        return undertowHttpBinding;
    }

    public void setUndertowHttpBinding(String undertowHttpBinding) {
        this.undertowHttpBinding = undertowHttpBinding;
    }

    public String getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(String sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public static class UndertowHostOptionsNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.undertow.UndertowHostOptions.class;
        private Integer bufferSize;
        private Boolean directBuffers;
        private Boolean http2Enabled;
        private Integer ioThreads;
        private Integer workerThreads;

        public Integer getBufferSize() {
            return bufferSize;
        }

        public void setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
        }

        public Boolean getDirectBuffers() {
            return directBuffers;
        }

        public void setDirectBuffers(Boolean directBuffers) {
            this.directBuffers = directBuffers;
        }

        public Boolean getHttp2Enabled() {
            return http2Enabled;
        }

        public void setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
        }

        public Integer getIoThreads() {
            return ioThreads;
        }

        public void setIoThreads(Integer ioThreads) {
            this.ioThreads = ioThreads;
        }

        public Integer getWorkerThreads() {
            return workerThreads;
        }

        public void setWorkerThreads(Integer workerThreads) {
            this.workerThreads = workerThreads;
        }
    }
}