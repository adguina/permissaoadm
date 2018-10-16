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
@Table(name = "tb003produtos", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb003produtos.findAll", query = "SELECT t FROM Tb003produtos t")
    , @NamedQuery(name = "Tb003produtos.findByIdproduto", query = "SELECT t FROM Tb003produtos t WHERE t.idproduto = :idproduto")
    , @NamedQuery(name = "Tb003produtos.findByNomeproduto", query = "SELECT t FROM Tb003produtos t WHERE t.nomeproduto = :nomeproduto")
    , @NamedQuery(name = "Tb003produtos.findByIdcategoriatb004", query = "SELECT t FROM Tb003produtos t WHERE t.idcategoriatb004 = :idcategoriatb004")
    , @NamedQuery(name = "Tb003produtos.findByCorproduto", query = "SELECT t FROM Tb003produtos t WHERE t.corproduto = :corproduto")
    , @NamedQuery(name = "Tb003produtos.findByCodigoproduto", query = "SELECT t FROM Tb003produtos t WHERE t.codigoproduto = :codigoproduto")
    , @NamedQuery(name = "Tb003produtos.findByIdunidadetb005", query = "SELECT t FROM Tb003produtos t WHERE t.idunidadetb005 = :idunidadetb005")
    , @NamedQuery(name = "Tb003produtos.findByPesoproduto", query = "SELECT t FROM Tb003produtos t WHERE t.pesoproduto = :pesoproduto")
    , @NamedQuery(name = "Tb003produtos.findByIdmodelotb007", query = "SELECT t FROM Tb003produtos t WHERE t.idmodelotb007 = :idmodelotb007")
    , @NamedQuery(name = "Tb003produtos.findByIdmarcatb006", query = "SELECT t FROM Tb003produtos t WHERE t.idmarcatb006 = :idmarcatb006")
    , @NamedQuery(name = "Tb003produtos.findByDatacadproduto", query = "SELECT t FROM Tb003produtos t WHERE t.datacadproduto = :datacadproduto")})
public class Tb003produtos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproduto")
    private Integer idproduto;
    @Column(name = "nomeproduto")
    private String nomeproduto;
    
    @OneToOne
    @JoinColumn(name = "idcategoriatb004")
    private Tb004categorias idcategoriatb004;
    
    @Column(name = "corproduto")
    private String corproduto;
    @Column(name = "codigoproduto")
    private String codigoproduto;
    
    @OneToOne
    @JoinColumn(name = "idunidadetb005")
    private Tb005unidades idunidadetb005;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pesoproduto")
    private Float pesoproduto;
    
    @OneToOne
    @JoinColumn(name = "idmodelotb007")
    private Tb007modelos idmodelotb007;
    
    @OneToOne
    @JoinColumn(name = "idmarcatb006")
    private Tb006marcas idmarcatb006;
    
    @Column(name = "datacadproduto")
    @Temporal(TemporalType.DATE)
    private Date datacadproduto;

    public Tb003produtos() {
    }

    public Tb003produtos(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        Integer oldIdproduto = this.idproduto;
        this.idproduto = idproduto;
        changeSupport.firePropertyChange("idproduto", oldIdproduto, idproduto);
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        String oldNomeproduto = this.nomeproduto;
        this.nomeproduto = nomeproduto;
        changeSupport.firePropertyChange("nomeproduto", oldNomeproduto, nomeproduto);
    }

    public Tb004categorias getIdcategoriatb004() {
        return idcategoriatb004;
    }

    public void setIdcategoriatb004(Tb004categorias idcategoriatb004) {
        Tb004categorias oldIdcategoriatb004 = this.idcategoriatb004;
        this.idcategoriatb004 = idcategoriatb004;
        changeSupport.firePropertyChange("idcategoriatb004", oldIdcategoriatb004, idcategoriatb004);
    }

    public String getCorproduto() {
        return corproduto;
    }

    public void setCorproduto(String corproduto) {
        String oldCorproduto = this.corproduto;
        this.corproduto = corproduto;
        changeSupport.firePropertyChange("corproduto", oldCorproduto, corproduto);
    }

    public String getCodigoproduto() {
        return codigoproduto;
    }

    public void setCodigoproduto(String codigoproduto) {
        String oldCodigoproduto = this.codigoproduto;
        this.codigoproduto = codigoproduto;
        changeSupport.firePropertyChange("codigoproduto", oldCodigoproduto, codigoproduto);
    }

    public Tb005unidades getIdunidadetb005() {
        return idunidadetb005;
    }

    public void setIdunidadetb005(Tb005unidades idunidadetb005) {
        Tb005unidades oldIdunidadetb005 = this.idunidadetb005;
        this.idunidadetb005 = idunidadetb005;
        changeSupport.firePropertyChange("idunidadetb005", oldIdunidadetb005, idunidadetb005);
    }

    public Float getPesoproduto() {
        return pesoproduto;
    }

    public void setPesoproduto(Float pesoproduto) {
        Float oldPesoproduto = this.pesoproduto;
        this.pesoproduto = pesoproduto;
        changeSupport.firePropertyChange("pesoproduto", oldPesoproduto, pesoproduto);
    }

    public Tb007modelos getIdmodelotb007() {
        return idmodelotb007;
    }

    public void setIdmodelotb007(Tb007modelos idmodelotb007) {
        Tb007modelos oldIdmodelotb007 = this.idmodelotb007;
        this.idmodelotb007 = idmodelotb007;
        changeSupport.firePropertyChange("idmodelotb007", oldIdmodelotb007, idmodelotb007);
    }

    public Tb006marcas getIdmarcatb006() {
        return idmarcatb006;
    }

    public void setIdmarcatb006(Tb006marcas idmarcatb006) {
        Tb006marcas oldIdmarcatb006 = this.idmarcatb006;
        this.idmarcatb006 = idmarcatb006;
        changeSupport.firePropertyChange("idmarcatb006", oldIdmarcatb006, idmarcatb006);
    }

    public Date getDatacadproduto() {
        return datacadproduto;
    }

    public void setDatacadproduto(Date datacadproduto) {
        Date oldDatacadproduto = this.datacadproduto;
        this.datacadproduto = datacadproduto;
        changeSupport.firePropertyChange("datacadproduto", oldDatacadproduto, datacadproduto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduto != null ? idproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb003produtos)) {
            return false;
        }
        Tb003produtos other = (Tb003produtos) object;
        if ((this.idproduto == null && other.idproduto != null) || (this.idproduto != null && !this.idproduto.equals(other.idproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guina.view.Tb003produtos[ idproduto=" + idproduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
