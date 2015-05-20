package com.company.speedment.orm.test.project_1;

import com.speedment.core.runtime.ApplicationMetadata;

/**
 * A Speedment Application Metadata representing an entity (for example, a row) in the Project 'project_1'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
public class Project1ApplicationMetadata implements ApplicationMetadata {
    
    public Project1ApplicationMetadata() {
        
    }
    
    @Override
    public String getMetadata() {
        return 
                "import com.speedment.core.config.model.parameters.*\n"+
                "\n"+
                "name = \"project_1\";\n"+
                "packetLocation = \"src/main/java\";\n"+
                "packetName = \"com.company.speedment.orm.test\";\n"+
                "enabled = true;\n"+
                "dbms {\n"+
                "    ipAddress = \"127.0.0.1\";\n"+
                "    name = \"db0\";\n"+
                "    password = \"\";\n"+
                "    port = 3306;\n"+
                "    type = StandardDbmsType.MYSQL;\n"+
                "    username = \"root\";\n"+
                "    enabled = true;\n"+
                "    schema {\n"+
                "        columnCompressionType = ColumnCompressionType.NONE;\n"+
                "        fieldStorageType = FieldStorageType.WRAPPER;\n"+
                "        name = \"hares\";\n"+
                "        schemaName = \"hares\";\n"+
                "        storageEngineType = StorageEngineType.ON_HEAP;\n"+
                "        defaultSchema = false;\n"+
                "        enabled = true;\n"+
                "        table {\n"+
                "            columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "            fieldStorageType = FieldStorageType.INHERIT;\n"+
                "            name = \"carrot\";\n"+
                "            storageEngineType = StorageEngineType.INHERIT;\n"+
                "            tableName = \"carrot\";\n"+
                "            enabled = true;\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"id\";\n"+
                "                autoincrement = true;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"name\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"owner\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"rival\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            primaryKeyColumn {\n"+
                "                name = \"id\";\n"+
                "                enabled = true;\n"+
                "            }\n"+
                "            index {\n"+
                "                name = \"PRIMARY\";\n"+
                "                enabled = true;\n"+
                "                unique = true;\n"+
                "                indexColumn {\n"+
                "                    name = \"id\";\n"+
                "                    orderType = OrderType.ASC;\n"+
                "                    enabled = true;\n"+
                "                }\n"+
                "            }\n"+
                "        }\n"+
                "        table {\n"+
                "            columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "            fieldStorageType = FieldStorageType.INHERIT;\n"+
                "            name = \"hare\";\n"+
                "            storageEngineType = StorageEngineType.INHERIT;\n"+
                "            tableName = \"hare\";\n"+
                "            enabled = true;\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"id\";\n"+
                "                autoincrement = true;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"name\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"color\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"age\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            primaryKeyColumn {\n"+
                "                name = \"id\";\n"+
                "                enabled = true;\n"+
                "            }\n"+
                "            index {\n"+
                "                name = \"PRIMARY\";\n"+
                "                enabled = true;\n"+
                "                unique = true;\n"+
                "                indexColumn {\n"+
                "                    name = \"id\";\n"+
                "                    orderType = OrderType.ASC;\n"+
                "                    enabled = true;\n"+
                "                }\n"+
                "            }\n"+
                "        }\n"+
                "        table {\n"+
                "            columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "            fieldStorageType = FieldStorageType.INHERIT;\n"+
                "            name = \"human\";\n"+
                "            storageEngineType = StorageEngineType.INHERIT;\n"+
                "            tableName = \"human\";\n"+
                "            enabled = true;\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"id\";\n"+
                "                autoincrement = true;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"name\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            primaryKeyColumn {\n"+
                "                name = \"id\";\n"+
                "                enabled = true;\n"+
                "            }\n"+
                "            index {\n"+
                "                name = \"PRIMARY\";\n"+
                "                enabled = true;\n"+
                "                unique = true;\n"+
                "                indexColumn {\n"+
                "                    name = \"id\";\n"+
                "                    orderType = OrderType.ASC;\n"+
                "                    enabled = true;\n"+
                "                }\n"+
                "            }\n"+
                "        }\n"+
                "    }\n"+
                "}\n"+
        "";
    }
}