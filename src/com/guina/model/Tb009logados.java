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
@Table(name = "tb009logados", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb009logados.findAll", query = "SELECT t FROM Tb009logados t")
    , @NamedQuery(name = "Tb009logados.findByIdlogado", query = "SELECT t FROM Tb009logados t WHERE t.idlogado = :idlogado")
    , @NamedQuery(name = "Tb009logados.findByNomelogado", query = "SELECT t FROM Tb009logados t WHERE t.nomelogado = :nomelogado")
    , @NamedQuery(name = "Tb009logados.findByNumerologado", query = "SELECT t FROM Tb009logados t WHERE t.numerologado = :numerologado")})
public class Tb009logados implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idlogado")
    private Integer idlogado;
    @Column(name = "nomelogado")
    private String nomelogado;
    @Column(name = "numerologado")
    private Integer numerologado;

    public Tb009logados() {
    }

    public Tb009logados(Integer idlogado) {
        this.idlogado = idlogado;
    }

    public Integer getIdlogado() {
        return idlogado;
    }

    public void setIdlogado(Integer idlogado) {
        Integer oldIdlogado = this.idlogado;
        this.idlogado = idlogado;
        changeSupport.firePropertyChange("idlogado", oldIdlogado, idlogado);
    }

    public String getNomelogado() {
        return nomelogado;
    }

    public void setNomelogado(String nomelogado) {
        String oldNomelogado = this.nomelogado;
        this.nomelogado = nomelogado;
        changeSupport.firePropertyChange("nomelogado", oldNomelogado, nomelogado);
    }

    public Integer getNumerologado() {
        return numerologado;
    }

    public void setNumerologado(Integer numerologado) {
        Integer oldNumerologado = this.numerologado;
        this.numerologado = numerologado;
        changeSupport.firePropertyChange("numerologado", oldNumerologado, numerologado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlogado != null ? idlogado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb009logados)) {
            return false;
        }
        Tb009logados other = (Tb009logados) object;
        if ((this.idlogado == null && other.idlogado != null) || (this.idlogado != null && !this.idlogado.equals(other.idlogado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guina.view.Tb009logados[ idlogado=" + idlogado + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
