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
@Table(name = "tb018descontos", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb018descontos.findAll", query = "SELECT t FROM Tb018descontos t")
    , @NamedQuery(name = "Tb018descontos.findByIddescontos", query = "SELECT t FROM Tb018descontos t WHERE t.iddescontos = :iddescontos")
    , @NamedQuery(name = "Tb018descontos.findByNfedesconto", query = "SELECT t FROM Tb018descontos t WHERE t.nfedesconto = :nfedesconto")
    , @NamedQuery(name = "Tb018descontos.findByFactoringdesconto", query = "SELECT t FROM Tb018descontos t WHERE t.factoringdesconto = :factoringdesconto")
    , @NamedQuery(name = "Tb018descontos.findByDatadesconto", query = "SELECT t FROM Tb018descontos t WHERE t.datadesconto = :datadesconto")
    , @NamedQuery(name = "Tb018descontos.findByValordesconto", query = "SELECT t FROM Tb018descontos t WHERE t.valordesconto = :valordesconto")
    , @NamedQuery(name = "Tb018descontos.findByParceladesconto", query = "SELECT t FROM Tb018descontos t WHERE t.parceladesconto = :parceladesconto")
    , @NamedQuery(name = "Tb018descontos.findByVlrparceladesconto", query = "SELECT t FROM Tb018descontos t WHERE t.vlrparceladesconto = :vlrparceladesconto")
    , @NamedQuery(name = "Tb018descontos.findByLimitefactoring", query = "SELECT t FROM Tb018descontos t WHERE t.limitefactoring = :limitefactoring")
    , @NamedQuery(name = "Tb018descontos.findBySaldofactoring", query = "SELECT t FROM Tb018descontos t WHERE t.saldofactoring = :saldofactoring")
    , @NamedQuery(name = "Tb018descontos.findByLoja", query = "SELECT t FROM Tb018descontos t WHERE t.loja = :loja")
    , @NamedQuery(name = "Tb018descontos.findByObsdesconto", query = "SELECT t FROM Tb018descontos t WHERE t.obsdesconto = :obsdesconto")})
public class Tb018descontos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "iddescontos")
    private Long iddescontos;
    
    @OneToOne
    @JoinColumn(name = "nfedesconto")
    private Tb016duplicatas nfedesconto;
    
   
    @OneToOne
    @JoinColumn(name = "factoringdesconto")
    private Tb017factorings factoringdesconto;
    
    @Column(name = "datadesconto")   
    @Temporal(TemporalType.DATE)
    private Date datadesconto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valordesconto")
    private Float valordesconto;
    @Column(name = "parceladesconto")
    private Integer parceladesconto;
    @Column(name = "vlrparceladesconto")
    private Float vlrparceladesconto;
    @Column(name = "limitefactoring")
    private Float limitefactoring;
    @Column(name = "saldofactoring")
    private Float saldofactoring;
    @Column(name = "loja")
    private String loja;
    @Column(name = "obsdesconto")
    private String obsdesconto;

    public Tb018descontos() {
    }

    public Tb018descontos(Long iddescontos) {
        this.iddescontos = iddescontos;
    }

    public Long getIddescontos() {
        return iddescontos;
    }

    public void setIddescontos(Long iddescontos) {
        Long oldIddescontos = this.iddescontos;
        this.iddescontos = iddescontos;
        changeSupport.firePropertyChange("iddescontos", oldIddescontos, iddescontos);
    }

    public Tb016duplicatas getNfedesconto() {
        return nfedesconto;
    }

    public void setNfedesconto(Tb016duplicatas nfedesconto) {
        Tb016duplicatas oldNfedesconto = this.nfedesconto;
        this.nfedesconto = nfedesconto;
        changeSupport.firePropertyChange("nfedesconto", oldNfedesconto, nfedesconto);
    }

    public Tb017factorings getFactoringdesconto() {
        return factoringdesconto;
    }

    public void setFactoringdesconto(Tb017factorings factoringdesconto) {
        Tb017factorings oldFactoringdesconto = this.factoringdesconto;
        this.factoringdesconto = factoringdesconto;
        changeSupport.firePropertyChange("factoringdesconto", oldFactoringdesconto, factoringdesconto);
    }

    public Date getDatadesconto() {
        return datadesconto;
    }

    public void setDatadesconto(Date datadesconto) {
        Date oldDatadesconto = this.datadesconto;
        this.datadesconto = datadesconto;
        changeSupport.firePropertyChange("datadesconto", oldDatadesconto, datadesconto);
    }

    public Float getValordesconto() {
        return valordesconto;
    }

    public void setValordesconto(Float valordesconto) {
        Float oldValordesconto = this.valordesconto;
        this.valordesconto = valordesconto;
        changeSupport.firePropertyChange("valordesconto", oldValordesconto, valordesconto);
    }

    public Integer getParceladesconto() {
        return parceladesconto;
    }

    public void setParceladesconto(Integer parceladesconto) {
        Integer oldParceladesconto = this.parceladesconto;
        this.parceladesconto = parceladesconto;
        changeSupport.firePropertyChange("parceladesconto", oldParceladesconto, parceladesconto);
    }

    public Float getVlrparceladesconto() {
        return vlrparceladesconto;
    }

    public void setVlrparceladesconto(Float vlrparceladesconto) {
        Float oldVlrparceladesconto = this.vlrparceladesconto;
        this.vlrparceladesconto = vlrparceladesconto;
        changeSupport.firePropertyChange("vlrparceladesconto", oldVlrparceladesconto, vlrparceladesconto);
    }

    public Float getLimitefactoring() {
        return limitefactoring;
    }

    public void setLimitefactoring(Float limitefactoring) {
        Float oldLimitefactoring = this.limitefactoring;
        this.limitefactoring = limitefactoring;
        changeSupport.firePropertyChange("limitefactoring", oldLimitefactoring, limitefactoring);
    }

    public Float getSaldofactoring() {
        return saldofactoring;
    }

    public void setSaldofactoring(Float saldofactoring) {
        Float oldSaldofactoring = this.saldofactoring;
        this.saldofactoring = saldofactoring;
        changeSupport.firePropertyChange("saldofactoring", oldSaldofactoring, saldofactoring);
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        String oldLoja = this.loja;
        this.loja = loja;
        changeSupport.firePropertyChange("loja", oldLoja, loja);
    }

    public String getObsdesconto() {
        return obsdesconto;
    }

    public void setObsdesconto(String obsdesconto) {
        String oldObsdesconto = this.obsdesconto;
        this.obsdesconto = obsdesconto;
        changeSupport.firePropertyChange("obsdesconto", oldObsdesconto, obsdesconto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddescontos != null ? iddescontos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb018descontos)) {
            return false;
        }
        Tb018descontos other = (Tb018descontos) object;
        if ((this.iddescontos == null && other.iddescontos != null) || (this.iddescontos != null && !this.iddescontos.equals(other.iddescontos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guina.view.Tb018descontos[ iddescontos=" + iddescontos + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
