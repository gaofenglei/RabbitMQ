package com.gfl.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbctemplateConfig {

    @Bean
    public JdbcTemplate db1JdbcTemplate(@Qualifier("db1DataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
    @Primary
    @Bean
    public JdbcTemplate db2JdbcTemplate(@Qualifier("db2DataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
