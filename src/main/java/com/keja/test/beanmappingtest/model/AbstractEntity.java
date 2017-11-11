package com.keja.test.beanmappingtest.model;

import java.util.Date;

public abstract class AbstractEntity {

    private String id;

    private String auteurCreation;

    private Date dateCreation;

    private String auteurMiseAJour;

    private Date dateMiseAJour;

    private String codeSuppression;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the auteurCreation
     */
    public String getAuteurCreation() {
        return auteurCreation;
    }

    /**
     * @param auteurCreation
     *            the auteurCreation to set
     */
    public void setAuteurCreation(String auteurCreation) {
        this.auteurCreation = auteurCreation;
    }

    /**
     * @return the dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation
     *            the dateCreation to set
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the auteurMiseAJour
     */
    public String getAuteurMiseAJour() {
        return auteurMiseAJour;
    }

    /**
     * @param auteurMiseAJour
     *            the auteurMiseAJour to set
     */
    public void setAuteurMiseAJour(String auteurMiseAJour) {
        this.auteurMiseAJour = auteurMiseAJour;
    }

    /**
     * @return the dateMiseAJour
     */
    public Date getDateMiseAJour() {
        return dateMiseAJour;
    }

    /**
     * @param dateMiseAJour
     *            the dateMiseAJour to set
     */
    public void setDateMiseAJour(Date dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    /**
     * @return the codeSuppression
     */
    public String getCodeSuppression() {
        return codeSuppression;
    }

    /**
     * @param codeSuppression
     *            the codeSuppression to set
     */
    public void setCodeSuppression(String codeSuppression) {
        this.codeSuppression = codeSuppression;
    }
}
