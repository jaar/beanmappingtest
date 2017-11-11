package com.keja.test.beanmappingtest.mapstruct;

import com.keja.test.beanmappingtest.model.Tag;

public class TagToStringMapper {

    public String asString(Tag tag) {
        return tag != null ? tag.getLibelle() : null;
    }

    public Tag asTag(String libelle) {
        Tag tag = new Tag();
        tag.setLibelle(libelle);
        return tag;
    }

}
