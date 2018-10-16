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
@Table(name = "tb00tabelas", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb00tabelas.findAll", query = "SELECT t FROM Tb00tabelas t")
    , @NamedQuery(name = "Tb00tabelas.findByIdtabela", query = "SELECT t FROM Tb00tabelas t WHERE t.idtabela = :idtabela")
    , @NamedQuery(name = "Tb00tabelas.findByNometabela", query = "SELECT t FROM Tb00tabelas t WHERE t.nometabela = :nometabela")
    , @NamedQuery(name = "Tb00tabelas.findByData", query = "SELECT t FROM Tb00tabelas t WHERE t.data = :data")})
public class Tb00tabelas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtabela")
    private Integer idtabela;
    @Column(name = "nometabela")
    private String nometabela;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;

    public Tb00tabelas() {
    }

    public Tb00tabelas(Integer idtabela) {
        this.idtabela = idtabela;
    }

    public Integer getIdtabela() {
        return idtabela;
    }

    public void setIdtabela(Integer idtabela) {
        Integer oldIdtabela = this.idtabela;
        this.idtabela = idtabela;
        changeSupport.firePropertyChange("idtabela", oldIdtabela, idtabela);
    }

    public String getNometabela() {
        return nometabela;
    }

    public void setNometabela(String nometabela) {
        String oldNometabela = this.nometabela;
        this.nometabela = nometabela;
        changeSupport.firePropertyChange("nometabela", oldNometabela, nometabela);
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
        hash += (idtabela != null ? idtabela.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb00tabelas)) {
            return false;
        }
        Tb00tabelas other = (Tb00tabelas) object;
        if ((this.idtabela == null && other.idtabela != null) || (this.idtabela != null && !this.idtabela.equals(other.idtabela))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getNometabela();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
