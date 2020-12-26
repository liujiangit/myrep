package com.brandom.user.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserDBProperties.class)
@ConditionalOnClass(DruidDataSource.class)
@ConditionalOnProperty(prefix = "user.druid", name = "url")
@AutoConfigureBefore(DataSourceAutoConfiguration.class)
public class DruidAutoConfiguration {

    @Autowired
    private UserDBProperties properties;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(properties.getUrl());
        dataSource.setUsername(properties.getUsername());
        dataSource.setPassword(properties.getPassword());
        dataSource.setDriverClassName(properties.getDriverClassName());
        dataSource.setInitialSize(properties.getInitialSize());
        dataSource.setMinIdle(properties.getMinIdle());
        dataSource.setMaxActive(properties.getMaxActive());
        dataSource.setMaxWait(properties.getMaxWait());
        dataSource.setTimeBetweenEvictionRunsMillis(properties.getTimeBetweenEvictionRunsMillis());
        dataSource.setMinEvictableIdleTimeMillis(properties.getMinEvictableIdleTimeMillis());
        dataSource.setValidationQuery(properties.getValidationQuery());
        dataSource.setTestWhileIdle(properties.isTestWhileIdle());
        dataSource.setTestOnBorrow(properties.isTestOnBorrow());
        dataSource.setTestOnReturn(properties.isTestOnReturn());
        dataSource.setRemoveAbandoned(properties.isRemoveAbandoned());
        dataSource.setRemoveAbandonedTimeout(properties.getRemoveAbandonedTimeout());
        dataSource.setLogAbandoned(properties.isLogAbandoned());
        try {
            dataSource.init();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dataSource;
    }
    
}
