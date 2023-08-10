/*
package com.nanda.springbootembeddeddebeziummssql.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;

@Configuration
public class DebeziumConnectorConfig {

    */
/**
     * Database details.
     *//*

    @Value("${debeziumdemo.datasource.host}")
    private String customerDbHost;

    @Value("${debeziumdemo.datasource.database}")
    private String customerDbName;

    @Value("${debeziumdemo.datasource.port}")
    private String customerDbPort;

    @Value("${debeziumdemo.datasource.username}")
    private String customerDbUsername;

    @Value("${debeziumdemo.datasource.password}")
    private String customerDbPassword;

    */
/**
     * Customer Database Connector Configuration
     *//*

    @Bean
    public io.debezium.config.Configuration customerConnector() throws IOException {
        File offsetStorageTempFile = File.createTempFile("offsets_", ".dat");
        File dbHistoryTempFile = File.createTempFile("dbhistory_", ".dat");
        return io.debezium.config.Configuration.create()
            .with("name", "customers-sqlserver-connector")
            .with("connector.class", "io.debezium.connector.sqlserver.SqlServerConnector")
            .with("offset.storage", "org.apache.kafka.connect.storage.FileOffsetBackingStore")
            .with("offset.storage.file.filename", offsetStorageTempFile.getAbsolutePath())
            .with("offset.flush.interval.ms", "60000")
            .with("database.hostname", customerDbHost)
            .with("database.port", customerDbPort)
            .with("database.user", customerDbUsername)
            .with("database.password", customerDbPassword)
            .with("database.dbname", customerDbName)
            .with("database.names", customerDbName)
            .with("table.include.list", "dbo.customers")
            .with("include.schema.changes", "false")
            .with("database.allowPublicKeyRetrieval", "true")
            .with("database.server.id", "21e6bd120240")
            .with("database.server.name", "sql-server")
            .with("database.history", "io.debezium.relational.history.FileDatabaseHistory")
            .with("database.history.file.filename", dbHistoryTempFile.getAbsolutePath())
            .with("topic.prefix", "debeziumdemo")
            .with("schema.history.internal","io.debezium.storage.file.history.FileSchemaHistory")
             .with("schema.history.internal.file.filename",dbHistoryTempFile.getAbsolutePath())
            .build();
    }
}
*/
