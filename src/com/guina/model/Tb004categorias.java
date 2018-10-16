/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guina.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Agnaldo
 */
@Entity
@Table(name = "tb004categorias", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb004categorias.findAll", query = "SELECT t FROM Tb004categorias t")
    , @NamedQuery(name = "Tb004categorias.findByIdcategoria", query = "SELECT t FROM Tb004categorias t WHERE t.idcategoria = :idcategoria")
    , @NamedQuery(name = "Tb004categorias.findByNomecategoria", query = "SELECT t FROM Tb004categorias t WHERE t.nomecategoria = :nomecategoria")
    , @NamedQuery(name = "Tb004categorias.findByData", query = "SELECT t FROM Tb004categorias t WHERE t.data = :data")})
public class Tb004categorias implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcategoria")
    private Integer idcategoria;
    @Column(name = "nomecategoria")
    private String nomecategoria;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;

    public Tb004categorias() {
    }

    public Tb004categorias(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idcategoria) {
        Integer oldIdcategoria = this.idcategoria;
        this.idcategoria = idcategoria;
        changeSupport.firePropertyChange("idcategoria", oldIdcategoria, idcategoria);
    }

    public String getNomecategoria() {
        return nomecategoria;
    }

    public void setNomecategoria(String nomecategoria) {
        String oldNomecategoria = this.nomecategoria;
        this.nomecategoria = nomecategoria;
        changeSupport.firePropertyChange("nomecategoria", oldNomecategoria, nomecategoria);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        Date oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcategoria != null ? idcategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb004categorias)) {
            return false;
        }
        Tb004categorias other = (Tb004categorias) object;
        if ((this.idcategoria == null && other.idcategoria != null) || (this.idcategoria != null && !this.idcategoria.equals(other.idcategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getNomecategoria();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
