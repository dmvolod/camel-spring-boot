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
package org.apache.camel.component.wordpress.springboot;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.component.wordpress.api.model.SearchCriteria;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Integrates Camel with Wordpress.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.wordpress")
public class WordpressComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the wordpress component. This is
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
     * Wordpress component configuration
     */
    private WordpressComponentConfigurationNestedConfiguration configuration;

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

    public WordpressComponentConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            WordpressComponentConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public static class WordpressComponentConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.wordpress.WordpressComponentConfiguration.class;
        /**
         * The Wordpress REST API version
         */
        private String apiVersion = "2";
        /**
         * The criteria to use with complex searches.
         */
        private Map criteria;
        /**
         * Whether to bypass trash and force deletion.
         */
        private Boolean force = false;
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post
         */
        private Integer id;
        /**
         * Password from authorized user
         */
        private String password;
        /**
         * Search criteria
         */
        private SearchCriteria searchCriteria;
        /**
         * The Wordpress API URL from your site, e.g. http://myblog.com/wp-json/
         */
        private String url;
        /**
         * Authorized user to perform writing operations
         */
        private String user;

        public String getApiVersion() {
            return apiVersion;
        }

        public void setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
        }

        public Map getCriteria() {
            return criteria;
        }

        public void setCriteria(Map criteria) {
            this.criteria = criteria;
        }

        public Boolean getForce() {
            return force;
        }

        public void setForce(Boolean force) {
            this.force = force;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public SearchCriteria getSearchCriteria() {
            return searchCriteria;
        }

        public void setSearchCriteria(SearchCriteria searchCriteria) {
            this.searchCriteria = searchCriteria;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }
    }
}