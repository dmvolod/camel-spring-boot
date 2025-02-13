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
package org.apache.camel.component.sjms2.springboot;

import javax.annotation.Generated;
import javax.jms.ConnectionFactory;
import org.apache.camel.component.sjms.TransactionCommitStrategy;
import org.apache.camel.component.sjms.jms.ConnectionResource;
import org.apache.camel.component.sjms.jms.DestinationCreationStrategy;
import org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy;
import org.apache.camel.component.sjms.jms.MessageCreatedStrategy;
import org.apache.camel.component.sjms.taskmanager.TimedTaskManager;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Send and receive messages to/from a JMS Queue or Topic using plain JMS 2.x
 * API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.sjms2")
public class Sjms2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the sjms2 component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The maximum number of connections available to endpoints started under
     * this component
     */
    private Integer connectionCount = 1;
    /**
     * A ConnectionFactory is required to enable the SjmsComponent. It can be
     * set directly or set set as part of a ConnectionResource. The option is a
     * javax.jms.ConnectionFactory type.
     */
    private ConnectionFactory connectionFactory;
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
     * Backoff in millis on consumer pool reconnection attempts
     */
    private Long reconnectBackOff = 5000L;
    /**
     * Try to apply reconnection logic on consumer pool
     */
    private Boolean reconnectOnError = true;
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
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * The client ID to use when creating javax.jms.Connection when using the
     * default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private String connectionClientId;
    /**
     * The max wait time in millis to block and wait on free connection when the
     * pool is exhausted when using the default
     * org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private Long connectionMaxWait = 5000L;
    /**
     * A ConnectionResource is an interface that allows for customization and
     * container control of the ConnectionFactory. See Plugable Connection
     * Resource Management for further details. The option is a
     * org.apache.camel.component.sjms.jms.ConnectionResource type.
     */
    private ConnectionResource connectionResource;
    /**
     * When using the default
     * org.apache.camel.component.sjms.jms.ConnectionFactoryResource then should
     * each javax.jms.Connection be tested before being used.
     */
    private Boolean connectionTestOnBorrow = true;
    /**
     * To use a custom DestinationCreationStrategy. The option is a
     * org.apache.camel.component.sjms.jms.DestinationCreationStrategy type.
     */
    private DestinationCreationStrategy destinationCreationStrategy;
    /**
     * Pluggable strategy for encoding and decoding JMS keys so they can be
     * compliant with the JMS specification. Camel provides one implementation
     * out of the box: default. The default strategy will safely marshal dots
     * and hyphens (. and -). Can be used for JMS brokers which do not care
     * whether JMS header keys contain illegal characters. You can provide your
     * own implementation of the
     * org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it using
     * the # notation. The option is a
     * org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy type.
     */
    private JmsKeyFormatStrategy jmsKeyFormatStrategy;
    /**
     * To use the given MessageCreatedStrategy which are invoked when Camel
     * creates new instances of javax.jms.Message objects when Camel is sending
     * a JMS message. The option is a
     * org.apache.camel.component.sjms.jms.MessageCreatedStrategy type.
     */
    private MessageCreatedStrategy messageCreatedStrategy;
    /**
     * To use a custom TimedTaskManager. The option is a
     * org.apache.camel.component.sjms.taskmanager.TimedTaskManager type.
     */
    private TimedTaskManager timedTaskManager;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message. The option is a
     * org.apache.camel.spi.HeaderFilterStrategy type.
     */
    private HeaderFilterStrategy headerFilterStrategy;
    /**
     * The password to use when creating javax.jms.Connection when using the
     * default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private String connectionPassword;
    /**
     * The username to use when creating javax.jms.Connection when using the
     * default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private String connectionUsername;
    /**
     * To configure which kind of commit strategy to use. Camel provides two
     * implementations out of the box, default and batch. The option is a
     * org.apache.camel.component.sjms.TransactionCommitStrategy type.
     */
    private TransactionCommitStrategy transactionCommitStrategy;

    public Integer getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    public ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Long getReconnectBackOff() {
        return reconnectBackOff;
    }

    public void setReconnectBackOff(Long reconnectBackOff) {
        this.reconnectBackOff = reconnectBackOff;
    }

    public Boolean getReconnectOnError() {
        return reconnectOnError;
    }

    public void setReconnectOnError(Boolean reconnectOnError) {
        this.reconnectOnError = reconnectOnError;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public String getConnectionClientId() {
        return connectionClientId;
    }

    public void setConnectionClientId(String connectionClientId) {
        this.connectionClientId = connectionClientId;
    }

    public Long getConnectionMaxWait() {
        return connectionMaxWait;
    }

    public void setConnectionMaxWait(Long connectionMaxWait) {
        this.connectionMaxWait = connectionMaxWait;
    }

    public ConnectionResource getConnectionResource() {
        return connectionResource;
    }

    public void setConnectionResource(ConnectionResource connectionResource) {
        this.connectionResource = connectionResource;
    }

    public Boolean getConnectionTestOnBorrow() {
        return connectionTestOnBorrow;
    }

    public void setConnectionTestOnBorrow(Boolean connectionTestOnBorrow) {
        this.connectionTestOnBorrow = connectionTestOnBorrow;
    }

    public DestinationCreationStrategy getDestinationCreationStrategy() {
        return destinationCreationStrategy;
    }

    public void setDestinationCreationStrategy(
            DestinationCreationStrategy destinationCreationStrategy) {
        this.destinationCreationStrategy = destinationCreationStrategy;
    }

    public JmsKeyFormatStrategy getJmsKeyFormatStrategy() {
        return jmsKeyFormatStrategy;
    }

    public void setJmsKeyFormatStrategy(
            JmsKeyFormatStrategy jmsKeyFormatStrategy) {
        this.jmsKeyFormatStrategy = jmsKeyFormatStrategy;
    }

    public MessageCreatedStrategy getMessageCreatedStrategy() {
        return messageCreatedStrategy;
    }

    public void setMessageCreatedStrategy(
            MessageCreatedStrategy messageCreatedStrategy) {
        this.messageCreatedStrategy = messageCreatedStrategy;
    }

    public TimedTaskManager getTimedTaskManager() {
        return timedTaskManager;
    }

    public void setTimedTaskManager(TimedTaskManager timedTaskManager) {
        this.timedTaskManager = timedTaskManager;
    }

    public HeaderFilterStrategy getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(
            HeaderFilterStrategy headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }

    public String getConnectionPassword() {
        return connectionPassword;
    }

    public void setConnectionPassword(String connectionPassword) {
        this.connectionPassword = connectionPassword;
    }

    public String getConnectionUsername() {
        return connectionUsername;
    }

    public void setConnectionUsername(String connectionUsername) {
        this.connectionUsername = connectionUsername;
    }

    public TransactionCommitStrategy getTransactionCommitStrategy() {
        return transactionCommitStrategy;
    }

    public void setTransactionCommitStrategy(
            TransactionCommitStrategy transactionCommitStrategy) {
        this.transactionCommitStrategy = transactionCommitStrategy;
    }
}