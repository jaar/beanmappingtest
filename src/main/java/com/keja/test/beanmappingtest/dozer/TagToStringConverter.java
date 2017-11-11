package com.keja.test.beanmappingtest.dozer;

import org.dozer.DozerConverter;
import org.dozer.Mapper;
import org.dozer.MapperAware;

import com.keja.test.beanmappingtest.model.Tag;

public class TagToStringConverter extends DozerConverter<Tag, String> implements MapperAware {

    public TagToStringConverter(Class<Tag> prototypeA, Class<String> prototypeB) {
        super(prototypeA, prototypeB);
    }

    @Override
    public Tag convertFrom(String arg0, Tag arg1) {
        Tag tag = new Tag();
        tag.setLibelle(arg0);
        return tag;
    }

    @Override
    public String convertTo(Tag arg0, String arg1) {
        return arg0.getLibelle();
    }

    @Override
    public void setMapper(Mapper mapper) {
    }

}
