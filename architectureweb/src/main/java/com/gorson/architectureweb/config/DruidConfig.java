package com.gorson.architectureweb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by gcliscut on 2017/8/23.
 */
@Component
@ConfigurationProperties(prefix="druid")
public class DruidConfig {

    //    @Value("${druid.type}")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public String getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(String maxActive) {
        this.maxActive = maxActive;
    }

    public String getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(String initialSize) {
        this.initialSize = initialSize;
    }

    public String getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(String maxWait) {
        this.maxWait = maxWait;
    }

    public String getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(String minIdle) {
        this.minIdle = minIdle;
    }

    public String getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(String timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public String getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(String minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    public String getTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(String testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public String getTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(String testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public String getTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(String testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public String getPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    public void setPoolPreparedStatements(String poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    public String getMaxOpenPreparedStatements() {
        return maxOpenPreparedStatements;
    }

    public void setMaxOpenPreparedStatements(String maxOpenPreparedStatements) {
        this.maxOpenPreparedStatements = maxOpenPreparedStatements;
    }

    public String getRemoveAbandoned() {
        return removeAbandoned;
    }

    public void setRemoveAbandoned(String removeAbandoned) {
        this.removeAbandoned = removeAbandoned;
    }

    public String getRemoveAbandonedTimeout() {
        return removeAbandonedTimeout;
    }

    public void setRemoveAbandonedTimeout(String removeAbandonedTimeout) {
        this.removeAbandonedTimeout = removeAbandonedTimeout;
    }

    public String getLogAbandoned() {
        return logAbandoned;
    }

    public void setLogAbandoned(String logAbandoned) {
        this.logAbandoned = logAbandoned;
    }

    private String type;
    //    @Value("${druid.filters}")
    private String filters;
    //    @Value("${druid.maxActive}")
    private String maxActive;
    //    @Value("${druid.initialSize}")
    private String initialSize;
    //    @Value("${druid.maxWait}")
    private String maxWait;
    //    @Value("${druid.minIdle}")
    private String minIdle;
    //    @Value("${druid.timeBetweenEvictionRunsMillis}")
    private String timeBetweenEvictionRunsMillis;
    //    @Value("${druid.minEvictableIdleTimeMillis}")
    private String minEvictableIdleTimeMillis;
    //    @Value("${druid.testWhileIdle}")
    private String testWhileIdle;
    //    @Value("${druid.testOnBorrow}")
    private String testOnBorrow;
    //    @Value("${druid.testOnReturn}")
    private String testOnReturn;
    //    @Value("${druid.poolPreparedStatements}")
    private String poolPreparedStatements;
    //    @Value("${druid.maxOpenPreparedStatements}")
    private String maxOpenPreparedStatements;
    //    @Value("${druid.removeAbandoned}")
    private String removeAbandoned;
    //    @Value("${druid.removeAbandonedTimeout}")
    private String removeAbandonedTimeout;
    //    @Value("${druid.logAbandoned}")
    private String logAbandoned;

    @Override
    public String toString() {
        return "DruidConfig{" +
                "type='" + type + '\'' +
                ", filters='" + filters + '\'' +
                ", maxActive='" + maxActive + '\'' +
                ", initialSize='" + initialSize + '\'' +
                ", maxWait='" + maxWait + '\'' +
                ", minIdle='" + minIdle + '\'' +
                ", timeBetweenEvictionRunsMillis='" + timeBetweenEvictionRunsMillis + '\'' +
                ", minEvictableIdleTimeMillis='" + minEvictableIdleTimeMillis + '\'' +
                ", testWhileIdle='" + testWhileIdle + '\'' +
                ", testOnBorrow='" + testOnBorrow + '\'' +
                ", testOnReturn='" + testOnReturn + '\'' +
                ", poolPreparedStatements='" + poolPreparedStatements + '\'' +
                ", maxOpenPreparedStatements='" + maxOpenPreparedStatements + '\'' +
                ", removeAbandoned='" + removeAbandoned + '\'' +
                ", removeAbandonedTimeout='" + removeAbandonedTimeout + '\'' +
                ", logAbandoned='" + logAbandoned + '\'' +
                '}';
    }
}
