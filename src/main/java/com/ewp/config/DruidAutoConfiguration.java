package com.ewp.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class DruidAutoConfiguration {
    @Value("${spring.datasource.druid.url:#{null}}")
    private String dbUrl;
    @Value("${spring.datasource.druid.username:#{null}}")
    private String username;
    @Value("${spring.datasource.druid.password:#{null}}")
    private String password;
    @Value("${spring.datasource.druid.maxActive:#{null}}")
    private Integer maxActive;
    @Value("${spring.datasource.druid.initialSize:#{null}}")
    private Integer initialSize;
    @Value("${spring.datasource.druid.maxWait:#{null}}")
    private Integer maxWait;
    @Value("${spring.datasource.druid.minIdle:#{null}}")
    private Integer minIdle;

    @Bean
    @Primary
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setUrl(dbUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxActive(maxActive);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxWait(maxWait);
        dataSource.setMinIdle(minIdle);

        return dataSource;
    }
}
