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
@Table(name = "tb016duplicatas", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb016duplicatas.findAll", query = "SELECT t FROM Tb016duplicatas t")
    , @NamedQuery(name = "Tb016duplicatas.findByIdduplicata", query = "SELECT t FROM Tb016duplicatas t WHERE t.idduplicata = :idduplicata")
    , @NamedQuery(name = "Tb016duplicatas.findByNfeduplicata", query = "SELECT t FROM Tb016duplicatas t WHERE t.nfeduplicata = :nfeduplicata")
    , @NamedQuery(name = "Tb016duplicatas.findByEmitduplicata", query = "SELECT t FROM Tb016duplicatas t WHERE t.emitduplicata = :emitduplicata")
    , @NamedQuery(name = "Tb016duplicatas.findByDestduplicata", query = "SELECT t FROM Tb016duplicatas t WHERE t.destduplicata = :destduplicata")
    , @NamedQuery(name = "Tb016duplicatas.findByVlrduplicata", query = "SELECT t FROM Tb016duplicatas t WHERE t.vlrduplicata = :vlrduplicata")
    , @NamedQuery(name = "Tb016duplicatas.findByProtduplicata", query = "SELECT t FROM Tb016duplicatas t WHERE t.protduplicata = :protduplicata")
    , @NamedQuery(name = "Tb016duplicatas.findByNduplicata", query = "SELECT t FROM Tb016duplicatas t WHERE t.nduplicata = :nduplicata")
    , @NamedQuery(name = "Tb016duplicatas.findByNfenduplicata", query = "SELECT t FROM Tb016duplicatas t WHERE t.nfenduplicata = :nfenduplicata")
    , @NamedQuery(name = "Tb016duplicatas.findByVencduplicata", query = "SELECT t FROM Tb016duplicatas t WHERE t.vencduplicata = :vencduplicata")
    , @NamedQuery(name = "Tb016duplicatas.findByValorduplicata", query = "SELECT t FROM Tb016duplicatas t WHERE t.valorduplicata = :valorduplicata")})
public class Tb016duplicatas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idduplicata")
    private Integer idduplicata;
    @Column(name = "nfeduplicata")
    private Integer nfeduplicata;
    @Column(name = "emitduplicata")
    private String emitduplicata;
    @Column(name = "destduplicata")
    private String destduplicata;
    @Column(name = "vlrduplicata")
    private String vlrduplicata;
    @Column(name = "protduplicata")
    private String protduplicata;
    @Column(name = "nduplicata")
    private Integer nduplicata;
    @Column(name = "nfenduplicata")
    private String nfenduplicata;
    @Column(name = "vencduplicata")
    @Temporal(TemporalType.DATE)
    private Date vencduplicata;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorduplicata")
    private Float valorduplicata;

    public Tb016duplicatas() {
    }

    public Tb016duplicatas(Integer idduplicata) {
        this.idduplicata = idduplicata;
    }

    public Integer getIdduplicata() {
        return idduplicata;
    }

    public void setIdduplicata(Integer idduplicata) {
        Integer oldIdduplicata = this.idduplicata;
        this.idduplicata = idduplicata;
        changeSupport.firePropertyChange("idduplicata", oldIdduplicata, idduplicata);
    }

    public Integer getNfeduplicata() {
        return nfeduplicata;
    }

    public void setNfeduplicata(Integer nfeduplicata) {
        Integer oldNfeduplicata = this.nfeduplicata;
        this.nfeduplicata = nfeduplicata;
        changeSupport.firePropertyChange("nfeduplicata", oldNfeduplicata, nfeduplicata);
    }

    public String getEmitduplicata() {
        return emitduplicata;
    }

    public void setEmitduplicata(String emitduplicata) {
        String oldEmitduplicata = this.emitduplicata;
        this.emitduplicata = emitduplicata;
        changeSupport.firePropertyChange("emitduplicata", oldEmitduplicata, emitduplicata);
    }

    public String getDestduplicata() {
        return destduplicata;
    }

    public void setDestduplicata(String destduplicata) {
        String oldDestduplicata = this.destduplicata;
        this.destduplicata = destduplicata;
        changeSupport.firePropertyChange("destduplicata", oldDestduplicata, destduplicata);
    }

    public String getVlrduplicata() {
        return vlrduplicata;
    }

    public void setVlrduplicata(String vlrduplicata) {
        String oldVlrduplicata = this.vlrduplicata;
        this.vlrduplicata = vlrduplicata;
        changeSupport.firePropertyChange("vlrduplicata", oldVlrduplicata, vlrduplicata);
    }

    public String getProtduplicata() {
        return protduplicata;
    }

    public void setProtduplicata(String protduplicata) {
        String oldProtduplicata = this.protduplicata;
        this.protduplicata = protduplicata;
        changeSupport.firePropertyChange("protduplicata", oldProtduplicata, protduplicata);
    }

    public Integer getNduplicata() {
        return nduplicata;
    }

    public void setNduplicata(Integer nduplicata) {
        Integer oldNduplicata = this.nduplicata;
        this.nduplicata = nduplicata;
        changeSupport.firePropertyChange("nduplicata", oldNduplicata, nduplicata);
    }

    public String getNfenduplicata() {
        return nfenduplicata;
    }

    public void setNfenduplicata(String nfenduplicata) {
        String oldNfenduplicata = this.nfenduplicata;
        this.nfenduplicata = nfenduplicata;
        changeSupport.firePropertyChange("nfenduplicata", oldNfenduplicata, nfenduplicata);
    }

    public Date getVencduplicata() {
        return vencduplicata;
    }

    public void setVencduplicata(Date vencduplicata) {
        Date oldVencduplicata = this.vencduplicata;
        this.vencduplicata = vencduplicata;
        changeSupport.firePropertyChange("vencduplicata", oldVencduplicata, vencduplicata);
    }

    public Float getValorduplicata() {
        return valorduplicata;
    }

    public void setValorduplicata(Float valorduplicata) {
        Float oldValorduplicata = this.valorduplicata;
        this.valorduplicata = valorduplicata;
        changeSupport.firePropertyChange("valorduplicata", oldValorduplicata, valorduplicata);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idduplicata != null ? idduplicata.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb016duplicatas)) {
            return false;
        }
        Tb016duplicatas other = (Tb016duplicatas) object;
        if ((this.idduplicata == null && other.idduplicata != null) || (this.idduplicata != null && !this.idduplicata.equals(other.idduplicata))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getNfeduplicata().toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
