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
import com.keja.test.beanmappingtest.orika.TagToStringConverter;

import fr.xebia.extras.selma.Selma;
import junit.framework.TestCase;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName
     *            name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        Evenement sourceObject = createSourceObject();

        /**
         * DOZER
         */
        List<String> myMappingFiles = new ArrayList<>();
        myMappingFiles.add("dozer_mapping.xml");
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.setMappingFiles(myMappingFiles);
        System.out.println("------------ DOZER ------------");
        EvenementDTO destObject = mapper.map(sourceObject, EvenementDTO.class);
        System.out.println(destObject);

        /**
         * MAPSTRUCT
         */
        System.out.println("------------ MAPSTRUCT ------------");
        EvenementDTO evenementDTOMapStruct = EvenementMapper.INSTANCE.evenementDTO(sourceObject);
        System.out.println(evenementDTOMapStruct);

        /**
         * SELMA
         */
        System.out.println("------------ SELMA ------------");
        com.keja.test.beanmappingtest.selma.EvenementMapper selmaMapper = Selma
                .builder(com.keja.test.beanmappingtest.selma.EvenementMapper.class).build();
        EvenementDTO evenementDTOSelma = selmaMapper.asEvenementDTO(sourceObject);
        System.out.println(evenementDTOSelma);

        /**
         * ORIKA
         */
        System.out.println("------------ ORIKA ------------");
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(Evenement.class, EvenementDTO.class).field("auteurCreation", "technique.auteurCreation")
                .byDefault().register();
        ConverterFactory converterFactory = mapperFactory.getConverterFactory();
        converterFactory.registerConverter(new TagToStringConverter());
        MapperFacade mapperOrika = mapperFactory.getMapperFacade();
        EvenementDTO evenementDTOOrika = mapperOrika.map(sourceObject, EvenementDTO.class);
        System.out.println(evenementDTOOrika);

    }

    private static Evenement createSourceObject() {
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

        return sourceObject;
    }
}
