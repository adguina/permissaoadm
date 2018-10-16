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
@Table(name = "tb007modelos", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb007modelos.findAll", query = "SELECT t FROM Tb007modelos t")
    , @NamedQuery(name = "Tb007modelos.findByIdmodelo", query = "SELECT t FROM Tb007modelos t WHERE t.idmodelo = :idmodelo")
    , @NamedQuery(name = "Tb007modelos.findByNomemodelo", query = "SELECT t FROM Tb007modelos t WHERE t.nomemodelo = :nomemodelo")
    , @NamedQuery(name = "Tb007modelos.findByDatacadmodelo", query = "SELECT t FROM Tb007modelos t WHERE t.datacadmodelo = :datacadmodelo")
    , @NamedQuery(name = "Tb007modelos.findByMarcamodelotb006", query = "SELECT t FROM Tb007modelos t WHERE t.marcamodelotb006 = :marcamodelotb006")})
public class Tb007modelos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmodelo")
    private Integer idmodelo;
    @Column(name = "nomemodelo")
    private String nomemodelo;
    @Column(name = "datacadmodelo")
    @Temporal(TemporalType.DATE)
    private Date datacadmodelo;
    
    @OneToOne
    @JoinColumn(name = "marcamodelotb006")
    private Tb006marcas marcamodelotb006;

    public Tb007modelos() {
    }

    public Tb007modelos(Integer idmodelo) {
        this.idmodelo = idmodelo;
    }

    public Integer getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(Integer idmodelo) {
        Integer oldIdmodelo = this.idmodelo;
        this.idmodelo = idmodelo;
        changeSupport.firePropertyChange("idmodelo", oldIdmodelo, idmodelo);
    }

    public String getNomemodelo() {
        return nomemodelo;
    }

    public void setNomemodelo(String nomemodelo) {
        String oldNomemodelo = this.nomemodelo;
        this.nomemodelo = nomemodelo;
        changeSupport.firePropertyChange("nomemodelo", oldNomemodelo, nomemodelo);
    }

    public Date getDatacadmodelo() {
        return datacadmodelo;
    }

    public void setDatacadmodelo(Date datacadmodelo) {
        Date oldDatacadmodelo = this.datacadmodelo;
        this.datacadmodelo = datacadmodelo;
        changeSupport.firePropertyChange("datacadmodelo", oldDatacadmodelo, datacadmodelo);
    }

    public Tb006marcas getMarcamodelotb006() {
        return marcamodelotb006;
    }

    public void setMarcamodelotb006(Tb006marcas marcamodelotb006) {
        Tb006marcas oldMarcamodelotb006 = this.marcamodelotb006;
        this.marcamodelotb006 = marcamodelotb006;
        changeSupport.firePropertyChange("marcamodelotb006", oldMarcamodelotb006, marcamodelotb006);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmodelo != null ? idmodelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb007modelos)) {
            return false;
        }
        Tb007modelos other = (Tb007modelos) object;
        if ((this.idmodelo == null && other.idmodelo != null) || (this.idmodelo != null && !this.idmodelo.equals(other.idmodelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getNomemodelo();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
