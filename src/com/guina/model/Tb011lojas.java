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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Agnaldo
 */
@Entity
@Table(name = "tb011lojas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tb011lojas.findAll", query = "SELECT t FROM Tb011lojas t")
    , @NamedQuery(name = "Tb011lojas.findByIdlojas", query = "SELECT t FROM Tb011lojas t WHERE t.idlojas = :idlojas")
    , @NamedQuery(name = "Tb011lojas.findByDescLoja", query = "SELECT t FROM Tb011lojas t WHERE t.descLoja = :descLoja")
    , @NamedQuery(name = "Tb011lojas.findByCodGestorLoja", query = "SELECT t FROM Tb011lojas t WHERE t.codGestorLoja = :codGestorLoja")
    , @NamedQuery(name = "Tb011lojas.findByIdentificadorGestorLoja", query = "SELECT t FROM Tb011lojas t WHERE t.identificadorGestorLoja = :identificadorGestorLoja")
    , @NamedQuery(name = "Tb011lojas.findByCnpjLoja", query = "SELECT t FROM Tb011lojas t WHERE t.cnpjLoja = :cnpjLoja")
    , @NamedQuery(name = "Tb011lojas.findByCidadeLoja", query = "SELECT t FROM Tb011lojas t WHERE t.cidadeLoja = :cidadeLoja")
    , @NamedQuery(name = "Tb011lojas.findByShoppingLoja", query = "SELECT t FROM Tb011lojas t WHERE t.shoppingLoja = :shoppingLoja")
    , @NamedQuery(name = "Tb011lojas.findByRede", query = "SELECT t FROM Tb011lojas t WHERE t.rede = :rede")
    , @NamedQuery(name = "Tb011lojas.findByCodSamLoja", query = "SELECT t FROM Tb011lojas t WHERE t.codSamLoja = :codSamLoja")
    , @NamedQuery(name = "Tb011lojas.findByUfloja", query = "SELECT t FROM Tb011lojas t WHERE t.ufloja = :ufloja")})
public class Tb011lojas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idlojas")
    private Long idlojas;
    @Column(name = "desc_loja")
    private String descLoja;
    @Column(name = "cod_gestor_loja")
    private String codGestorLoja;
    @Column(name = "identificador_gestor_loja")
    private String identificadorGestorLoja;
    @Column(name = "cnpj_loja")
    private String cnpjLoja;
    @Column(name = "cidade_loja")
    private String cidadeLoja;
    @Column(name = "shopping_loja")
    private String shoppingLoja;
    @Column(name = "rede")
    private String rede;
    @Column(name = "cod_sam_loja")
    private String codSamLoja;
    @Column(name = "ufloja")
    private String ufloja;

    public Tb011lojas() {
    }

    public Tb011lojas(Long idlojas) {
        this.idlojas = idlojas;
    }

    public Long getIdlojas() {
        return idlojas;
    }

    public void setIdlojas(Long idlojas) {
        Long oldIdlojas = this.idlojas;
        this.idlojas = idlojas;
        changeSupport.firePropertyChange("idlojas", oldIdlojas, idlojas);
    }

    public String getDescLoja() {
        return descLoja;
    }

    public void setDescLoja(String descLoja) {
        String oldDescLoja = this.descLoja;
        this.descLoja = descLoja;
        changeSupport.firePropertyChange("descLoja", oldDescLoja, descLoja);
    }

    public String getCodGestorLoja() {
        return codGestorLoja;
    }

    public void setCodGestorLoja(String codGestorLoja) {
        String oldCodGestorLoja = this.codGestorLoja;
        this.codGestorLoja = codGestorLoja;
        changeSupport.firePropertyChange("codGestorLoja", oldCodGestorLoja, codGestorLoja);
    }

    public String getIdentificadorGestorLoja() {
        return identificadorGestorLoja;
    }

    public void setIdentificadorGestorLoja(String identificadorGestorLoja) {
        String oldIdentificadorGestorLoja = this.identificadorGestorLoja;
        this.identificadorGestorLoja = identificadorGestorLoja;
        changeSupport.firePropertyChange("identificadorGestorLoja", oldIdentificadorGestorLoja, identificadorGestorLoja);
    }

    public String getCnpjLoja() {
        return cnpjLoja;
    }

    public void setCnpjLoja(String cnpjLoja) {
        String oldCnpjLoja = this.cnpjLoja;
        this.cnpjLoja = cnpjLoja;
        changeSupport.firePropertyChange("cnpjLoja", oldCnpjLoja, cnpjLoja);
    }

    public String getCidadeLoja() {
        return cidadeLoja;
    }

    public void setCidadeLoja(String cidadeLoja) {
        String oldCidadeLoja = this.cidadeLoja;
        this.cidadeLoja = cidadeLoja;
        changeSupport.firePropertyChange("cidadeLoja", oldCidadeLoja, cidadeLoja);
    }

    public String getShoppingLoja() {
        return shoppingLoja;
    }

    public void setShoppingLoja(String shoppingLoja) {
        String oldShoppingLoja = this.shoppingLoja;
        this.shoppingLoja = shoppingLoja;
        changeSupport.firePropertyChange("shoppingLoja", oldShoppingLoja, shoppingLoja);
    }

    public String getRede() {
        return rede;
    }

    public void setRede(String rede) {
        String oldRede = this.rede;
        this.rede = rede;
        changeSupport.firePropertyChange("rede", oldRede, rede);
    }

    public String getCodSamLoja() {
        return codSamLoja;
    }

    public void setCodSamLoja(String codSamLoja) {
        String oldCodSamLoja = this.codSamLoja;
        this.codSamLoja = codSamLoja;
        changeSupport.firePropertyChange("codSamLoja", oldCodSamLoja, codSamLoja);
    }

    public String getUfloja() {
        return ufloja;
    }

    public void setUfloja(String ufloja) {
        String oldUfloja = this.ufloja;
        this.ufloja = ufloja;
        changeSupport.firePropertyChange("ufloja", oldUfloja, ufloja);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlojas != null ? idlojas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb011lojas)) {
            return false;
        }
        Tb011lojas other = (Tb011lojas) object;
        if ((this.idlojas == null && other.idlojas != null) || (this.idlojas != null && !this.idlojas.equals(other.idlojas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.descLoja;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
