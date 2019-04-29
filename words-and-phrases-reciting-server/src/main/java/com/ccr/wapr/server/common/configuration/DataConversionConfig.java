package com.ccr.wapr.server.common.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ccr12312@163.com at 2019-4-26
 */
@Configuration
public class DataConversionConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
