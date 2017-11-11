package com.keja.test.beanmappingtest.model;

public abstract class AbstractEvenementEntity extends AbstractEntity {

    private String codeGroupe;

    private String codeDivision;

    private String codeSociete;

    /**
     * @return the codeGroupe
     */
    public String getCodeGroupe() {
        return codeGroupe;
    }

    /**
     * @param codeGroupe
     *            the codeGroupe to set
     */
    public void setCodeGroupe(String codeGroupe) {
        this.codeGroupe = codeGroupe;
    }

    /**
     * @return the codeDivision
     */
    public String getCodeDivision() {
        return codeDivision;
    }

    /**
     * @param codeDivision
     *            the codeDivision to set
     */
    public void setCodeDivision(String codeDivision) {
        this.codeDivision = codeDivision;
    }

    /**
     * @return the codeSociete
     */
    public String getCodeSociete() {
        return codeSociete;
    }

    /**
     * @param codeSociete
     *            the codeSociete to set
     */
    public void setCodeSociete(String codeSociete) {
        this.codeSociete = codeSociete;
    }

}
