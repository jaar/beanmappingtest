package com.keja.test.beanmappingtest.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.keja.test.beanmappingtest.dto.EvenementDTO;
import com.keja.test.beanmappingtest.model.Evenement;

@Mapper(uses = { TagToStringMapper.class })
// @Mapper
public interface EvenementMapper {

    EvenementMapper INSTANCE = Mappers.getMapper(EvenementMapper.class);

    @Mapping(source = "auteurCreation", target = "technique.auteurCreation")
    EvenementDTO evenementDTO(Evenement evenement);

    // java8
    // default String tagToString(Tag tag) {
    // return tag.getLibelle();
    // }

}
