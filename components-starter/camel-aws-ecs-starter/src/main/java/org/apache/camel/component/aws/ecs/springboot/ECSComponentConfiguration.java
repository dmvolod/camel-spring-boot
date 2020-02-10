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
package org.apache.camel.component.aws.ecs.springboot;

import javax.annotation.Generated;
import com.amazonaws.Protocol;
import com.amazonaws.services.ecs.AmazonECS;
import org.apache.camel.component.aws.ecs.ECSOperations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The aws-ecs is used for managing Amazon ECS
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws-ecs")
public class ECSComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws-ecs component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
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
     * The region in which ECS client needs to work
     */
    private String region;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * The AWS ECS default configuration
     */
    private ECSConfigurationNestedConfiguration configuration;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public ECSConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            ECSConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public static class ECSConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws.ecs.ECSConfiguration.class;
        /**
         * Amazon AWS Access Key
         */
        private String accessKey;
        /**
         * To use a existing configured AWS ECS as client
         */
        private AmazonECS ecsClient;
        /**
         * The operation to perform
         */
        private ECSOperations operation;
        /**
         * To define a proxy host when instantiating the ECS client
         */
        private String proxyHost;
        /**
         * To define a proxy port when instantiating the ECS client
         */
        private Integer proxyPort;
        /**
         * To define a proxy protocol when instantiating the ECS client
         */
        private Protocol proxyProtocol = Protocol.HTTPS;
        /**
         * The region in which ECS client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name()
         */
        private String region;
        /**
         * Amazon AWS Secret Key
         */
        private String secretKey;

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public AmazonECS getEcsClient() {
            return ecsClient;
        }

        public void setEcsClient(AmazonECS ecsClient) {
            this.ecsClient = ecsClient;
        }

        public ECSOperations getOperation() {
            return operation;
        }

        public void setOperation(ECSOperations operation) {
            this.operation = operation;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public Protocol getProxyProtocol() {
            return proxyProtocol;
        }

        public void setProxyProtocol(Protocol proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }
    }
}