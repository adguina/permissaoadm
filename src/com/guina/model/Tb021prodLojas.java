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
@Table(name = "tb021prod_lojas", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb021prodLojas.findAll", query = "SELECT t FROM Tb021prodLojas t")
    , @NamedQuery(name = "Tb021prodLojas.findByIdprodLoja", query = "SELECT t FROM Tb021prodLojas t WHERE t.idprodLoja = :idprodLoja")
    , @NamedQuery(name = "Tb021prodLojas.findByCodsamProd", query = "SELECT t FROM Tb021prodLojas t WHERE t.codsamProd = :codsamProd")
    , @NamedQuery(name = "Tb021prodLojas.findByCorProd", query = "SELECT t FROM Tb021prodLojas t WHERE t.corProd = :corProd")
    , @NamedQuery(name = "Tb021prodLojas.findByCodGestorProd", query = "SELECT t FROM Tb021prodLojas t WHERE t.codGestorProd = :codGestorProd")
    , @NamedQuery(name = "Tb021prodLojas.findByEstoqueProd", query = "SELECT t FROM Tb021prodLojas t WHERE t.estoqueProd = :estoqueProd")
    , @NamedQuery(name = "Tb021prodLojas.findByPrecoProd", query = "SELECT t FROM Tb021prodLojas t WHERE t.precoProd = :precoProd")})
public class Tb021prodLojas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idprod_loja")
    private Long idprodLoja;
    @Column(name = "codsam_prod")
    private String codsamProd;
    @Column(name = "cor_prod")
    private String corProd;
    @Column(name = "cod_gestor_prod")
    private String codGestorProd;
    @Column(name = "estoque_prod")
    private Integer estoqueProd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco_prod")
    private Float precoProd;

    public Tb021prodLojas() {
    }

    public Tb021prodLojas(Long idprodLoja) {
        this.idprodLoja = idprodLoja;
    }

    public Long getIdprodLoja() {
        return idprodLoja;
    }

    public void setIdprodLoja(Long idprodLoja) {
        Long oldIdprodLoja = this.idprodLoja;
        this.idprodLoja = idprodLoja;
        changeSupport.firePropertyChange("idprodLoja", oldIdprodLoja, idprodLoja);
    }

    public String getCodsamProd() {
        return codsamProd;
    }

    public void setCodsamProd(String codsamProd) {
        String oldCodsamProd = this.codsamProd;
        this.codsamProd = codsamProd;
        changeSupport.firePropertyChange("codsamProd", oldCodsamProd, codsamProd);
    }

    public String getCorProd() {
        return corProd;
    }

    public void setCorProd(String corProd) {
        String oldCorProd = this.corProd;
        this.corProd = corProd;
        changeSupport.firePropertyChange("corProd", oldCorProd, corProd);
    }

    public String getCodGestorProd() {
        return codGestorProd;
    }

    public void setCodGestorProd(String codGestorProd) {
        String oldCodGestorProd = this.codGestorProd;
        this.codGestorProd = codGestorProd;
        changeSupport.firePropertyChange("codGestorProd", oldCodGestorProd, codGestorProd);
    }

    public Integer getEstoqueProd() {
        return estoqueProd;
    }

    public void setEstoqueProd(Integer estoqueProd) {
        Integer oldEstoqueProd = this.estoqueProd;
        this.estoqueProd = estoqueProd;
        changeSupport.firePropertyChange("estoqueProd", oldEstoqueProd, estoqueProd);
    }

    public Float getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(Float precoProd) {
        Float oldPrecoProd = this.precoProd;
        this.precoProd = precoProd;
        changeSupport.firePropertyChange("precoProd", oldPrecoProd, precoProd);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprodLoja != null ? idprodLoja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb021prodLojas)) {
            return false;
        }
        Tb021prodLojas other = (Tb021prodLojas) object;
        if ((this.idprodLoja == null && other.idprodLoja != null) || (this.idprodLoja != null && !this.idprodLoja.equals(other.idprodLoja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.corProd;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
