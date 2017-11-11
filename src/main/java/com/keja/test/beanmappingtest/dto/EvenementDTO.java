package com.keja.test.beanmappingtest.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class EvenementDTO {

    private String id;

    private String nom;

    private Date date;

    private String type;

    private List<String> tags;

    private DonneesTechniquesDTO technique;

    private ObservableDTO observable;

    @Override
    public String toString() {
        ToStringBuilder tsb = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("id", id).append("nom", nom)
                .append("date", new SimpleDateFormat("dd/MM/YYYY").format(date)).append("type", type);
        if (CollectionUtils.isNotEmpty(tags)) {
            tags.stream().forEach(tag -> tsb.append("tag", tag));
        }
        tsb.append("technique", technique);

        tsb.append("observable", observable);

        return tsb.toString();
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
     * @return the tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * @param tags
     *            the tags to set
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * @return the technique
     */
    public DonneesTechniquesDTO getTechnique() {
        return technique;
    }

    /**
     * @param technique
     *            the technique to set
     */
    public void setTechnique(DonneesTechniquesDTO technique) {
        this.technique = technique;
    }

    /**
     * @return the observable
     */
    public ObservableDTO getObservable() {
        return observable;
    }

    /**
     * @param observable
     *            the observable to set
     */
    public void setObservable(ObservableDTO observable) {
        this.observable = observable;
    }

}
