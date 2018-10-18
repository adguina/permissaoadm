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
@Table(name = "tb023ufs", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb023ufs.findAll", query = "SELECT t FROM Tb023ufs t")
    , @NamedQuery(name = "Tb023ufs.findByIdUf", query = "SELECT t FROM Tb023ufs t WHERE t.idUf = :idUf")
    , @NamedQuery(name = "Tb023ufs.findByEstadoUf", query = "SELECT t FROM Tb023ufs t WHERE t.estadoUf = :estadoUf")
    , @NamedQuery(name = "Tb023ufs.findBySiglaUf", query = "SELECT t FROM Tb023ufs t WHERE t.siglaUf = :siglaUf")})
public class Tb023ufs implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_uf")
    private Long idUf;
    @Column(name = "estado_uf")
    private String estadoUf;
    @Column(name = "sigla_uf")
    private String siglaUf;

    public Tb023ufs() {
    }

    public Tb023ufs(Long idUf) {
        this.idUf = idUf;
    }

    public Long getIdUf() {
        return idUf;
    }

    public void setIdUf(Long idUf) {
        Long oldIdUf = this.idUf;
        this.idUf = idUf;
        changeSupport.firePropertyChange("idUf", oldIdUf, idUf);
    }

    public String getEstadoUf() {
        return estadoUf;
    }

    public void setEstadoUf(String estadoUf) {
        String oldEstadoUf = this.estadoUf;
        this.estadoUf = estadoUf;
        changeSupport.firePropertyChange("estadoUf", oldEstadoUf, estadoUf);
    }

    public String getSiglaUf() {
        return siglaUf;
    }

    public void setSiglaUf(String siglaUf) {
        String oldSiglaUf = this.siglaUf;
        this.siglaUf = siglaUf;
        changeSupport.firePropertyChange("siglaUf", oldSiglaUf, siglaUf);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUf != null ? idUf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb023ufs)) {
            return false;
        }
        Tb023ufs other = (Tb023ufs) object;
        if ((this.idUf == null && other.idUf != null) || (this.idUf != null && !this.idUf.equals(other.idUf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.siglaUf;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
