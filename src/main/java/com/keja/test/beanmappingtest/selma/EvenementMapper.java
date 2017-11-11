package com.keja.test.beanmappingtest.selma;

import com.keja.test.beanmappingtest.dto.EvenementDTO;
import com.keja.test.beanmappingtest.model.Evenement;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface EvenementMapper {

    EvenementDTO asEvenementDTO(Evenement evenement);

}
