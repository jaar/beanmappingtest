package com.keja.test.beanmappingtest.model;

import java.util.Date;
import java.util.List;

public class Evenement extends AbstractEvenementEntity {

    private String nom;

    private String type;

    private Date date;

    private Observable observable;

    private List<Tag> tags;

    /**
     * @return the tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
     *            the tags to set
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     *            the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the observable
     */
    public Observable getObservable() {
        return observable;
    }

    /**
     * @param observable
     *            the observable to set
     */
    public void setObservable(Observable observable) {
        this.observable = observable;
    }

}
