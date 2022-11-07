package com.lovelazur.log;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import net.logstash.logback.decorate.JsonFactoryDecorator;

import java.io.Serializable;

public class ISO8601DateDecorator implements JsonFactoryDecorator{
    @Override
    public MappingJsonFactory decorate(MappingJsonFactory mappingJsonFactory) {
        ObjectMapper codec = mappingJsonFactory.getCodec();
        codec.setDateFormat(new ISO8601DateFormat());
        return mappingJsonFactory;
    }
}
