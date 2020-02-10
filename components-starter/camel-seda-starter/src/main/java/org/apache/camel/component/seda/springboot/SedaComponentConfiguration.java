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
package org.apache.camel.component.seda.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The seda component provides asynchronous call to another endpoint from any
 * CamelContext in the same JVM.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.seda")
public class SedaComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the seda component. This is
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
     * Sets the default number of concurrent threads processing exchanges.
     */
    private Integer concurrentConsumers = 1;
    /**
     * Whether a thread that sends messages to a full SEDA queue will block
     * until the queue's capacity is no longer exhausted. By default, an
     * exception will be thrown stating that the queue is full. By enabling this
     * option, the calling thread will instead block and wait until the message
     * can be accepted.
     */
    private Boolean defaultBlockWhenFull = false;
    /**
     * Whether a thread that sends messages to a full SEDA queue will be
     * discarded. By default, an exception will be thrown stating that the queue
     * is full. By enabling this option, the calling thread will give up sending
     * and continue, meaning that the message was not sent to the SEDA queue.
     */
    private Boolean defaultDiscardWhenFull = false;
    /**
     * Whether a thread that sends messages to a full SEDA queue will block
     * until the queue's capacity is no longer exhausted. By default, an
     * exception will be thrown stating that the queue is full. By enabling this
     * option, where a configured timeout can be added to the block case.
     * Utilizing the .offer(timeout) method of the underlining java queue
     */
    private Long defaultOfferTimeout;
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
     * Sets the default queue factory. The option is a
     * org.apache.camel.component.seda.BlockingQueueFactory<org.apache.camel.Exchange> type.
     */
    private String defaultQueueFactory;
    /**
     * Sets the default maximum capacity of the SEDA queue (i.e., the number of
     * messages it can hold).
     */
    private Integer queueSize = 1000;

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Integer getConcurrentConsumers() {
        return concurrentConsumers;
    }

    public void setConcurrentConsumers(Integer concurrentConsumers) {
        this.concurrentConsumers = concurrentConsumers;
    }

    public Boolean getDefaultBlockWhenFull() {
        return defaultBlockWhenFull;
    }

    public void setDefaultBlockWhenFull(Boolean defaultBlockWhenFull) {
        this.defaultBlockWhenFull = defaultBlockWhenFull;
    }

    public Boolean getDefaultDiscardWhenFull() {
        return defaultDiscardWhenFull;
    }

    public void setDefaultDiscardWhenFull(Boolean defaultDiscardWhenFull) {
        this.defaultDiscardWhenFull = defaultDiscardWhenFull;
    }

    public Long getDefaultOfferTimeout() {
        return defaultOfferTimeout;
    }

    public void setDefaultOfferTimeout(Long defaultOfferTimeout) {
        this.defaultOfferTimeout = defaultOfferTimeout;
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

    public String getDefaultQueueFactory() {
        return defaultQueueFactory;
    }

    public void setDefaultQueueFactory(String defaultQueueFactory) {
        this.defaultQueueFactory = defaultQueueFactory;
    }

    public Integer getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
    }
}