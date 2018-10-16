/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guina.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Agnaldo
 */
@Entity
@Table(name = "tb017factorings", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb017factorings.findAll", query = "SELECT t FROM Tb017factorings t")
    , @NamedQuery(name = "Tb017factorings.findByIdfactoring", query = "SELECT t FROM Tb017factorings t WHERE t.idfactoring = :idfactoring")
    , @NamedQuery(name = "Tb017factorings.findByRsfactoring", query = "SELECT t FROM Tb017factorings t WHERE t.rsfactoring = :rsfactoring")
    , @NamedQuery(name = "Tb017factorings.findByCnpjfactoring", query = "SELECT t FROM Tb017factorings t WHERE t.cnpjfactoring = :cnpjfactoring")
    , @NamedQuery(name = "Tb017factorings.findByTelfactoring", query = "SELECT t FROM Tb017factorings t WHERE t.telfactoring = :telfactoring")
    , @NamedQuery(name = "Tb017factorings.findByEmailfactoring", query = "SELECT t FROM Tb017factorings t WHERE t.emailfactoring = :emailfactoring")
    , @NamedQuery(name = "Tb017factorings.findByLimitefactoring", query = "SELECT t FROM Tb017factorings t WHERE t.limitefactoring = :limitefactoring")
    , @NamedQuery(name = "Tb017factorings.findByObsfactoring", query = "SELECT t FROM Tb017factorings t WHERE t.obsfactoring = :obsfactoring")})
public class Tb017factorings implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idfactoring")
    private Long idfactoring;
    @Column(name = "rsfactoring")
    private String rsfactoring;
    @Column(name = "cnpjfactoring")
    private String cnpjfactoring;
    @Column(name = "telfactoring")
    private String telfactoring;
    @Column(name = "emailfactoring")
    private String emailfactoring;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "limitefactoring")
    private Float limitefactoring;
    @Column(name = "obsfactoring")
    private String obsfactoring;

    public Tb017factorings() {
    }

    public Tb017factorings(Long idfactoring) {
        this.idfactoring = idfactoring;
    }

    public Long getIdfactoring() {
        return idfactoring;
    }

    public void setIdfactoring(Long idfactoring) {
        Long oldIdfactoring = this.idfactoring;
        this.idfactoring = idfactoring;
        changeSupport.firePropertyChange("idfactoring", oldIdfactoring, idfactoring);
    }

    public String getRsfactoring() {
        return rsfactoring;
    }

    public void setRsfactoring(String rsfactoring) {
        String oldRsfactoring = this.rsfactoring;
        this.rsfactoring = rsfactoring;
        changeSupport.firePropertyChange("rsfactoring", oldRsfactoring, rsfactoring);
    }

    public String getCnpjfactoring() {
        return cnpjfactoring;
    }

    public void setCnpjfactoring(String cnpjfactoring) {
        String oldCnpjfactoring = this.cnpjfactoring;
        this.cnpjfactoring = cnpjfactoring;
        changeSupport.firePropertyChange("cnpjfactoring", oldCnpjfactoring, cnpjfactoring);
    }

    public String getTelfactoring() {
        return telfactoring;
    }

    public void setTelfactoring(String telfactoring) {
        String oldTelfactoring = this.telfactoring;
        this.telfactoring = telfactoring;
        changeSupport.firePropertyChange("telfactoring", oldTelfactoring, telfactoring);
    }

    public String getEmailfactoring() {
        return emailfactoring;
    }

    public void setEmailfactoring(String emailfactoring) {
        String oldEmailfactoring = this.emailfactoring;
        this.emailfactoring = emailfactoring;
        changeSupport.firePropertyChange("emailfactoring", oldEmailfactoring, emailfactoring);
    }

    public Float getLimitefactoring() {
        return limitefactoring;
    }

    public void setLimitefactoring(Float limitefactoring) {
        Float oldLimitefactoring = this.limitefactoring;
        this.limitefactoring = limitefactoring;
        changeSupport.firePropertyChange("limitefactoring", oldLimitefactoring, limitefactoring);
    }

    public String getObsfactoring() {
        return obsfactoring;
    }

    public void setObsfactoring(String obsfactoring) {
        String oldObsfactoring = this.obsfactoring;
        this.obsfactoring = obsfactoring;
        changeSupport.firePropertyChange("obsfactoring", oldObsfactoring, obsfactoring);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfactoring != null ? idfactoring.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb017factorings)) {
            return false;
        }
        Tb017factorings other = (Tb017factorings) object;
        if ((this.idfactoring == null && other.idfactoring != null) || (this.idfactoring != null && !this.idfactoring.equals(other.idfactoring))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getRsfactoring();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
