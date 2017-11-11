package com.keja.test.beanmappingtest.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class DonneesTechniquesDTO {

    private String auteurCreation;

    private Date dateCreation;

    private String auteurMiseAJour;

    private Date dateMiseAJour;

    public String toString() {
        ToStringBuilder tsb = new ToStringBuilder(this).append("auteurCreation", auteurCreation).append("auteurMiseAJour",
                auteurMiseAJour);
        if (dateCreation != null) {
            tsb.append("dateCreation", new SimpleDateFormat("dd/MM/YYYY").format(dateCreation));
        }
        if (dateMiseAJour != null) {
            tsb.append("dateMiseAJour", new SimpleDateFormat("dd/MM/YYYY").format(dateMiseAJour));
        }
        return tsb.toString();
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

}
