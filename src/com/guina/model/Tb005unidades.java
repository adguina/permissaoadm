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
@Table(name = "tb005unidades", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb005unidades.findAll", query = "SELECT t FROM Tb005unidades t")
    , @NamedQuery(name = "Tb005unidades.findByIdunidade", query = "SELECT t FROM Tb005unidades t WHERE t.idunidade = :idunidade")
    , @NamedQuery(name = "Tb005unidades.findByNomeunidade", query = "SELECT t FROM Tb005unidades t WHERE t.nomeunidade = :nomeunidade")
    , @NamedQuery(name = "Tb005unidades.findByDescricaounidade", query = "SELECT t FROM Tb005unidades t WHERE t.descricaounidade = :descricaounidade")
    , @NamedQuery(name = "Tb005unidades.findByDatacatunidade", query = "SELECT t FROM Tb005unidades t WHERE t.datacatunidade = :datacatunidade")})
public class Tb005unidades implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idunidade")
    private Integer idunidade;
    @Column(name = "nomeunidade")
    private String nomeunidade;
    @Column(name = "descricaounidade")
    private String descricaounidade;
    @Column(name = "datacatunidade")
    @Temporal(TemporalType.DATE)
    private Date datacatunidade;

    public Tb005unidades() {
    }

    public Tb005unidades(Integer idunidade) {
        this.idunidade = idunidade;
    }

    public Integer getIdunidade() {
        return idunidade;
    }

    public void setIdunidade(Integer idunidade) {
        Integer oldIdunidade = this.idunidade;
        this.idunidade = idunidade;
        changeSupport.firePropertyChange("idunidade", oldIdunidade, idunidade);
    }

    public String getNomeunidade() {
        return nomeunidade;
    }

    public void setNomeunidade(String nomeunidade) {
        String oldNomeunidade = this.nomeunidade;
        this.nomeunidade = nomeunidade;
        changeSupport.firePropertyChange("nomeunidade", oldNomeunidade, nomeunidade);
    }

    public String getDescricaounidade() {
        return descricaounidade;
    }

    public void setDescricaounidade(String descricaounidade) {
        String oldDescricaounidade = this.descricaounidade;
        this.descricaounidade = descricaounidade;
        changeSupport.firePropertyChange("descricaounidade", oldDescricaounidade, descricaounidade);
    }

    public Date getDatacatunidade() {
        return datacatunidade;
    }

    public void setDatacatunidade(Date datacatunidade) {
        Date oldDatacatunidade = this.datacatunidade;
        this.datacatunidade = datacatunidade;
        changeSupport.firePropertyChange("datacatunidade", oldDatacatunidade, datacatunidade);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunidade != null ? idunidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb005unidades)) {
            return false;
        }
        Tb005unidades other = (Tb005unidades) object;
        if ((this.idunidade == null && other.idunidade != null) || (this.idunidade != null && !this.idunidade.equals(other.idunidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getNomeunidade();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
