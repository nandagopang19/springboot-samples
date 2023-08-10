package com.nanda.springbootembeddeddebeziummssql.kafka;

import com.nanda.springbootembeddeddebeziummssql.entity.Student;
import io.debezium.engine.RecordChangeEvent;
import io.debezium.engine.format.Avro;
import org.apache.avro.generic.GenericData;
import org.apache.kafka.connect.source.SourceRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "localhost.ddemosql.dbo.student", containerFactory = "kafkaListenerStringFactory", groupId = "SpringBootApp-Consumer-Avro")
    public void consume(List<GenericData.Record> messages){
        LOGGER.info("**** Consumed Student");
        messages.forEach(System.out::println);

    }
}
