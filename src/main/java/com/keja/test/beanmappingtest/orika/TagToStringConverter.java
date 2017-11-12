package com.keja.test.beanmappingtest.orika;

import com.keja.test.beanmappingtest.model.Tag;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;

public class TagToStringConverter extends CustomConverter<Tag, String> {

    @Override
    public String convert(Tag arg0, Type<? extends String> arg1, MappingContext arg2) {
        return arg0.getLibelle();
    }

}
