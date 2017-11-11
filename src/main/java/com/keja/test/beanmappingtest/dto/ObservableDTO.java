package com.keja.test.beanmappingtest.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ObservableDTO {

    private String nom;

    private String id;

    public String toString() {
        ToStringBuilder tsb = new ToStringBuilder(this).append("nom", nom).append("id", id);
        return tsb.toString();
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom
     *            the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

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

}
