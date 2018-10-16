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
@Table(name = "tb008fornecedores", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb008fornecedores.findAll", query = "SELECT t FROM Tb008fornecedores t")
    , @NamedQuery(name = "Tb008fornecedores.findByIdfornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.idfornecedor = :idfornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByRazsocfornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.razsocfornecedor = :razsocfornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByCnpjfornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.cnpjfornecedor = :cnpjfornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByIeforncedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.ieforncedor = :ieforncedor")
    , @NamedQuery(name = "Tb008fornecedores.findByImunforncedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.imunforncedor = :imunforncedor")
    , @NamedQuery(name = "Tb008fornecedores.findByTelfornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.telfornecedor = :telfornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByCelfornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.celfornecedor = :celfornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByFaxfornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.faxfornecedor = :faxfornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByEmailfornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.emailfornecedor = :emailfornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByCepfornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.cepfornecedor = :cepfornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByBairrofornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.bairrofornecedor = :bairrofornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByRuafornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.ruafornecedor = :ruafornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByCidadefornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.cidadefornecedor = :cidadefornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByUffornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.uffornecedor = :uffornecedor")
    , @NamedQuery(name = "Tb008fornecedores.findByNumerofornecedot", query = "SELECT t FROM Tb008fornecedores t WHERE t.numerofornecedot = :numerofornecedot")
    , @NamedQuery(name = "Tb008fornecedores.findByDatecadfornecedor", query = "SELECT t FROM Tb008fornecedores t WHERE t.datecadfornecedor = :datecadfornecedor")})
public class Tb008fornecedores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfornecedor")
    private Integer idfornecedor;
    @Column(name = "razsocfornecedor")
    private String razsocfornecedor;
    @Column(name = "cnpjfornecedor")
    private String cnpjfornecedor;
    @Column(name = "ieforncedor")
    private String ieforncedor;
    @Column(name = "imunforncedor")
    private String imunforncedor;
    @Column(name = "telfornecedor")
    private String telfornecedor;
    @Column(name = "celfornecedor")
    private String celfornecedor;
    @Column(name = "faxfornecedor")
    private String faxfornecedor;
    @Column(name = "emailfornecedor")
    private String emailfornecedor;
    @Column(name = "cepfornecedor")
    private String cepfornecedor;
    @Column(name = "bairrofornecedor")
    private String bairrofornecedor;
    @Column(name = "ruafornecedor")
    private String ruafornecedor;
    @Column(name = "cidadefornecedor")
    private String cidadefornecedor;
    @Column(name = "uffornecedor")
    private String uffornecedor;
    @Column(name = "numerofornecedot")
    private String numerofornecedot;
    @Column(name = "datecadfornecedor")
    @Temporal(TemporalType.DATE)
    private Date datecadfornecedor;

    public Tb008fornecedores() {
    }

    public Tb008fornecedores(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public Integer getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(Integer idfornecedor) {
        Integer oldIdfornecedor = this.idfornecedor;
        this.idfornecedor = idfornecedor;
        changeSupport.firePropertyChange("idfornecedor", oldIdfornecedor, idfornecedor);
    }

    public String getRazsocfornecedor() {
        return razsocfornecedor;
    }

    public void setRazsocfornecedor(String razsocfornecedor) {
        String oldRazsocfornecedor = this.razsocfornecedor;
        this.razsocfornecedor = razsocfornecedor;
        changeSupport.firePropertyChange("razsocfornecedor", oldRazsocfornecedor, razsocfornecedor);
    }

    public String getCnpjfornecedor() {
        return cnpjfornecedor;
    }

    public void setCnpjfornecedor(String cnpjfornecedor) {
        String oldCnpjfornecedor = this.cnpjfornecedor;
        this.cnpjfornecedor = cnpjfornecedor;
        changeSupport.firePropertyChange("cnpjfornecedor", oldCnpjfornecedor, cnpjfornecedor);
    }

    public String getIeforncedor() {
        return ieforncedor;
    }

    public void setIeforncedor(String ieforncedor) {
        String oldIeforncedor = this.ieforncedor;
        this.ieforncedor = ieforncedor;
        changeSupport.firePropertyChange("ieforncedor", oldIeforncedor, ieforncedor);
    }

    public String getImunforncedor() {
        return imunforncedor;
    }

    public void setImunforncedor(String imunforncedor) {
        String oldImunforncedor = this.imunforncedor;
        this.imunforncedor = imunforncedor;
        changeSupport.firePropertyChange("imunforncedor", oldImunforncedor, imunforncedor);
    }

    public String getTelfornecedor() {
        return telfornecedor;
    }

    public void setTelfornecedor(String telfornecedor) {
        String oldTelfornecedor = this.telfornecedor;
        this.telfornecedor = telfornecedor;
        changeSupport.firePropertyChange("telfornecedor", oldTelfornecedor, telfornecedor);
    }

    public String getCelfornecedor() {
        return celfornecedor;
    }

    public void setCelfornecedor(String celfornecedor) {
        String oldCelfornecedor = this.celfornecedor;
        this.celfornecedor = celfornecedor;
        changeSupport.firePropertyChange("celfornecedor", oldCelfornecedor, celfornecedor);
    }

    public String getFaxfornecedor() {
        return faxfornecedor;
    }

    public void setFaxfornecedor(String faxfornecedor) {
        String oldFaxfornecedor = this.faxfornecedor;
        this.faxfornecedor = faxfornecedor;
        changeSupport.firePropertyChange("faxfornecedor", oldFaxfornecedor, faxfornecedor);
    }

    public String getEmailfornecedor() {
        return emailfornecedor;
    }

    public void setEmailfornecedor(String emailfornecedor) {
        String oldEmailfornecedor = this.emailfornecedor;
        this.emailfornecedor = emailfornecedor;
        changeSupport.firePropertyChange("emailfornecedor", oldEmailfornecedor, emailfornecedor);
    }

    public String getCepfornecedor() {
        return cepfornecedor;
    }

    public void setCepfornecedor(String cepfornecedor) {
        String oldCepfornecedor = this.cepfornecedor;
        this.cepfornecedor = cepfornecedor;
        changeSupport.firePropertyChange("cepfornecedor", oldCepfornecedor, cepfornecedor);
    }

    public String getBairrofornecedor() {
        return bairrofornecedor;
    }

    public void setBairrofornecedor(String bairrofornecedor) {
        String oldBairrofornecedor = this.bairrofornecedor;
        this.bairrofornecedor = bairrofornecedor;
        changeSupport.firePropertyChange("bairrofornecedor", oldBairrofornecedor, bairrofornecedor);
    }

    public String getRuafornecedor() {
        return ruafornecedor;
    }

    public void setRuafornecedor(String ruafornecedor) {
        String oldRuafornecedor = this.ruafornecedor;
        this.ruafornecedor = ruafornecedor;
        changeSupport.firePropertyChange("ruafornecedor", oldRuafornecedor, ruafornecedor);
    }

    public String getCidadefornecedor() {
        return cidadefornecedor;
    }

    public void setCidadefornecedor(String cidadefornecedor) {
        String oldCidadefornecedor = this.cidadefornecedor;
        this.cidadefornecedor = cidadefornecedor;
        changeSupport.firePropertyChange("cidadefornecedor", oldCidadefornecedor, cidadefornecedor);
    }

    public String getUffornecedor() {
        return uffornecedor;
    }

    public void setUffornecedor(String uffornecedor) {
        String oldUffornecedor = this.uffornecedor;
        this.uffornecedor = uffornecedor;
        changeSupport.firePropertyChange("uffornecedor", oldUffornecedor, uffornecedor);
    }

    public String getNumerofornecedot() {
        return numerofornecedot;
    }

    public void setNumerofornecedot(String numerofornecedot) {
        String oldNumerofornecedot = this.numerofornecedot;
        this.numerofornecedot = numerofornecedot;
        changeSupport.firePropertyChange("numerofornecedot", oldNumerofornecedot, numerofornecedot);
    }

    public Date getDatecadfornecedor() {
        return datecadfornecedor;
    }

    public void setDatecadfornecedor(Date datecadfornecedor) {
        Date oldDatecadfornecedor = this.datecadfornecedor;
        this.datecadfornecedor = datecadfornecedor;
        changeSupport.firePropertyChange("datecadfornecedor", oldDatecadfornecedor, datecadfornecedor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfornecedor != null ? idfornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb008fornecedores)) {
            return false;
        }
        Tb008fornecedores other = (Tb008fornecedores) object;
        if ((this.idfornecedor == null && other.idfornecedor != null) || (this.idfornecedor != null && !this.idfornecedor.equals(other.idfornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getRazsocfornecedor();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
