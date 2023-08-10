package com.nanda.springbootembeddeddebeziummssql.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@Configuration
public class KafkaProducerConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerConfig.class);

}
