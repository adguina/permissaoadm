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
@Table(name = "tb006marcas", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb006marcas.findAll", query = "SELECT t FROM Tb006marcas t")
    , @NamedQuery(name = "Tb006marcas.findByIdmarca", query = "SELECT t FROM Tb006marcas t WHERE t.idmarca = :idmarca")
    , @NamedQuery(name = "Tb006marcas.findByNomemarca", query = "SELECT t FROM Tb006marcas t WHERE t.nomemarca = :nomemarca")
    , @NamedQuery(name = "Tb006marcas.findByDatacadmarca", query = "SELECT t FROM Tb006marcas t WHERE t.datacadmarca = :datacadmarca")
    , @NamedQuery(name = "Tb006marcas.findByFornecRepMarcatb008", query = "SELECT t FROM Tb006marcas t WHERE t.fornecRepMarcatb008 = :fornecRepMarcatb008")
    , @NamedQuery(name = "Tb006marcas.findByFornecRepMarca2tb008", query = "SELECT t FROM Tb006marcas t WHERE t.fornecRepMarca2tb008 = :fornecRepMarca2tb008")})
public class Tb006marcas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmarca")
    private Integer idmarca;
    @Column(name = "nomemarca")
    private String nomemarca;
    @Column(name = "datacadmarca")
    @Temporal(TemporalType.DATE)
    private Date datacadmarca;
    
    @OneToOne
    @JoinColumn(name = "fornec_rep_marcatb008")
    private Tb008fornecedores fornecRepMarcatb008;
    
    @OneToOne
    @JoinColumn(name = "fornec_rep_marca2tb008")
    private Tb008fornecedores fornecRepMarca2tb008;

    public Tb006marcas() {
    }

    public Tb006marcas(Integer idmarca) {
        this.idmarca = idmarca;
    }

    public Integer getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(Integer idmarca) {
        Integer oldIdmarca = this.idmarca;
        this.idmarca = idmarca;
        changeSupport.firePropertyChange("idmarca", oldIdmarca, idmarca);
    }

    public String getNomemarca() {
        return nomemarca;
    }

    public void setNomemarca(String nomemarca) {
        String oldNomemarca = this.nomemarca;
        this.nomemarca = nomemarca;
        changeSupport.firePropertyChange("nomemarca", oldNomemarca, nomemarca);
    }

    public Date getDatacadmarca() {
        return datacadmarca;
    }

    public void setDatacadmarca(Date datacadmarca) {
        Date oldDatacadmarca = this.datacadmarca;
        this.datacadmarca = datacadmarca;
        changeSupport.firePropertyChange("datacadmarca", oldDatacadmarca, datacadmarca);
    }

    public Tb008fornecedores getFornecRepMarcatb008() {
        return fornecRepMarcatb008;
    }

    public void setFornecRepMarcatb008(Tb008fornecedores fornecRepMarcatb008) {
        Tb008fornecedores oldFornecRepMarcatb008 = this.fornecRepMarcatb008;
        this.fornecRepMarcatb008 = fornecRepMarcatb008;
        changeSupport.firePropertyChange("fornecRepMarcatb008", oldFornecRepMarcatb008, fornecRepMarcatb008);
    }

    public Tb008fornecedores getFornecRepMarca2tb008() {
        return fornecRepMarca2tb008;
    }

    public void setFornecRepMarca2tb008(Tb008fornecedores fornecRepMarca2tb008) {
        Tb008fornecedores oldFornecRepMarca2tb008 = this.fornecRepMarca2tb008;
        this.fornecRepMarca2tb008 = fornecRepMarca2tb008;
        changeSupport.firePropertyChange("fornecRepMarca2tb008", oldFornecRepMarca2tb008, fornecRepMarca2tb008);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmarca != null ? idmarca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb006marcas)) {
            return false;
        }
        Tb006marcas other = (Tb006marcas) object;
        if ((this.idmarca == null && other.idmarca != null) || (this.idmarca != null && !this.idmarca.equals(other.idmarca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getNomemarca();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
