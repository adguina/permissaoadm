/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guina.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Agnaldo
 */
@Entity
@Table(name = "tb014nboletas", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb014nboletas.findAll", query = "SELECT t FROM Tb014nboletas t")
    , @NamedQuery(name = "Tb014nboletas.findByIdboleta", query = "SELECT t FROM Tb014nboletas t WHERE t.idboleta = :idboleta")
    , @NamedQuery(name = "Tb014nboletas.findByIdvendedora", query = "SELECT t FROM Tb014nboletas t WHERE t.idvendedora = :idvendedora")
    , @NamedQuery(name = "Tb014nboletas.findByIdloja", query = "SELECT t FROM Tb014nboletas t WHERE t.idloja = :idloja")
    , @NamedQuery(name = "Tb014nboletas.findByNboleta", query = "SELECT t FROM Tb014nboletas t WHERE t.nboleta = :nboleta")
    , @NamedQuery(name = "Tb014nboletas.findByNcupom", query = "SELECT t FROM Tb014nboletas t WHERE t.ncupom = :ncupom")
    , @NamedQuery(name = "Tb014nboletas.findByData", query = "SELECT t FROM Tb014nboletas t WHERE t.data = :data")
    , @NamedQuery(name = "Tb014nboletas.findByValorboleta", query = "SELECT t FROM Tb014nboletas t WHERE t.valorboleta = :valorboleta")
    , @NamedQuery(name = "Tb014nboletas.findByObsboleta", query = "SELECT t FROM Tb014nboletas t WHERE t.obsboleta = :obsboleta")})
public class Tb014nboletas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idboleta")
    private Long idboleta;
    
    @OneToOne
    @JoinColumn(name = "idvendedora")
    private Tb013vendedoras idvendedora;
    
    @OneToOne
    @JoinColumn(name = "idloja")
    private Tb011lojas idloja;
    
    
    
    @Column(name = "nboleta")
    private Integer nboleta;
    @Column(name = "ncupom")
    private Integer ncupom;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorboleta")
    private Float valorboleta;
    @Column(name = "obsboleta")
    private String obsboleta;

    public Tb014nboletas() {
    }

    public Tb014nboletas(Long idboleta) {
        this.idboleta = idboleta;
    }

    public Long getIdboleta() {
        return idboleta;
    }

    public void setIdboleta(Long idboleta) {
        Long oldIdboleta = this.idboleta;
        this.idboleta = idboleta;
        changeSupport.firePropertyChange("idboleta", oldIdboleta, idboleta);
    }

    public Tb013vendedoras getIdvendedora() {
        return idvendedora;
    }

    public void setIdvendedora(Tb013vendedoras idvendedora) {
        Tb013vendedoras oldIdvendedora = this.idvendedora;
        this.idvendedora = idvendedora;
        changeSupport.firePropertyChange("idvendedora", oldIdvendedora, idvendedora);
    }

    public Tb011lojas getIdloja() {
        return idloja;
    }

    public void setIdloja(Tb011lojas idloja) {
        Tb011lojas oldIdloja = this.idloja;
        this.idloja = idloja;
        changeSupport.firePropertyChange("idloja", oldIdloja, idloja);
    }

    public Integer getNboleta() {
        return nboleta;
    }

    public void setNboleta(Integer nboleta) {
        Integer oldNboleta = this.nboleta;
        this.nboleta = nboleta;
        changeSupport.firePropertyChange("nboleta", oldNboleta, nboleta);
    }

    public Integer getNcupom() {
        return ncupom;
    }

    public void setNcupom(Integer ncupom) {
        Integer oldNcupom = this.ncupom;
        this.ncupom = ncupom;
        changeSupport.firePropertyChange("ncupom", oldNcupom, ncupom);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        Date oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public Float getValorboleta() {
        return valorboleta;
    }

    public void setValorboleta(Float valorboleta) {
        Float oldValorboleta = this.valorboleta;
        this.valorboleta = valorboleta;
        changeSupport.firePropertyChange("valorboleta", oldValorboleta, valorboleta);
    }

    public String getObsboleta() {
        return obsboleta;
    }

    public void setObsboleta(String obsboleta) {
        String oldObsboleta = this.obsboleta;
        this.obsboleta = obsboleta;
        changeSupport.firePropertyChange("obsboleta", oldObsboleta, obsboleta);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idboleta != null ? idboleta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb014nboletas)) {
            return false;
        }
        Tb014nboletas other = (Tb014nboletas) object;
        if ((this.idboleta == null && other.idboleta != null) || (this.idboleta != null && !this.idboleta.equals(other.idboleta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guina.model.Tb014nboletas[ idboleta=" + idboleta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
