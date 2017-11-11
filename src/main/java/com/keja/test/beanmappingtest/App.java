package com.keja.test.beanmappingtest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;

import com.keja.test.beanmappingtest.dto.EvenementDTO;
import com.keja.test.beanmappingtest.mapstruct.EvenementMapper;
import com.keja.test.beanmappingtest.model.Evenement;
import com.keja.test.beanmappingtest.model.Observable;
import com.keja.test.beanmappingtest.model.Tag;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        List<String> myMappingFiles = new ArrayList<>();
        myMappingFiles.add("dozer_mapping.xml");
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.setMappingFiles(myMappingFiles);

        Evenement sourceObject = new Evenement();
        sourceObject.setId("1");
        sourceObject.setAuteurCreation("auteurCreation");
        sourceObject.setAuteurMiseAJour("auteurMiseAJour");
        sourceObject.setDateCreation(new Date());
        sourceObject.setDateMiseAJour(new Date());
        sourceObject.setCodeSuppression("0");
        sourceObject.setCodeGroupe("codeGroupe");
        sourceObject.setCodeSociete("codeSociete");
        sourceObject.setCodeDivision("codeDivision");
        sourceObject.setDate(new Date());
        sourceObject.setNom("nom");
        sourceObject.setType("type");

        Observable obs = new Observable();
        obs.setNom("obs1");

        sourceObject.setObservable(obs);

        sourceObject.setTags(new ArrayList<>());
        Tag tag = new Tag();
        tag.setLibelle("monTag1");
        sourceObject.getTags().add(tag);
        tag = new Tag();
        tag.setLibelle("monTag2");
        sourceObject.getTags().add(tag);

        /**
         * DOZER
         */
        EvenementDTO destObject = mapper.map(sourceObject, EvenementDTO.class);
        System.out.println(destObject);

        /**
         * MAPSTRUCT
         */
        EvenementDTO evenementDTOMapStruct = EvenementMapper.INSTANCE.evenementDTO(sourceObject);
        System.out.println(evenementDTOMapStruct);

        Evenement event2 = new Evenement();
        event2.setTags(sourceObject.getTags());

        event2.getTags().get(0).setLibelle("tttt");

        System.out.println(sourceObject.getTags().get(0).getLibelle());
    }
}
