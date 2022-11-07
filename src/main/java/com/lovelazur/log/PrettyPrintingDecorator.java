package com.lovelazur.log;

import com.fasterxml.jackson.core.JsonGenerator;
import net.logstash.logback.decorate.JsonGeneratorDecorator;

public class PrettyPrintingDecorator implements JsonGeneratorDecorator{
    @Override
    public JsonGenerator decorate(JsonGenerator jsonGenerator) {
        return jsonGenerator.useDefaultPrettyPrinter();
    }
}