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
@Table(name = "tb002acesso", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb002acesso.findAll", query = "SELECT t FROM Tb002acesso t")
    , @NamedQuery(name = "Tb002acesso.findByIdacesso", query = "SELECT t FROM Tb002acesso t WHERE t.idacesso = :idacesso")
    , @NamedQuery(name = "Tb002acesso.findByIduser", query = "SELECT t FROM Tb002acesso t WHERE t.iduser = :iduser")
    , @NamedQuery(name = "Tb002acesso.findByInseriracesso", query = "SELECT t FROM Tb002acesso t WHERE t.inseriracesso = :inseriracesso")
    , @NamedQuery(name = "Tb002acesso.findByExcluiracesso", query = "SELECT t FROM Tb002acesso t WHERE t.excluiracesso = :excluiracesso")
    , @NamedQuery(name = "Tb002acesso.findByEditaracesso", query = "SELECT t FROM Tb002acesso t WHERE t.editaracesso = :editaracesso")
    , @NamedQuery(name = "Tb002acesso.findByConsultaracesso", query = "SELECT t FROM Tb002acesso t WHERE t.consultaracesso = :consultaracesso")
    , @NamedQuery(name = "Tb002acesso.findByDatacadacesso", query = "SELECT t FROM Tb002acesso t WHERE t.datacadacesso = :datacadacesso")
    , @NamedQuery(name = "Tb002acesso.findByTbacessotb000", query = "SELECT t FROM Tb002acesso t WHERE t.tbacessotb000 = :tbacessotb000")})
public class Tb002acesso implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idacesso")
    private Integer idacesso;
    
    @OneToOne
    @JoinColumn(name = "iduser")
    private Tb001user iduser;
    
    
    @Column(name = "inseriracesso")
    private Boolean inseriracesso;
    @Column(name = "excluiracesso")
    private Boolean excluiracesso;
    @Column(name = "editaracesso")
    private Boolean editaracesso;
    @Column(name = "consultaracesso")
    private Boolean consultaracesso;
    @Column(name = "datacadacesso")
    @Temporal(TemporalType.DATE)
    private Date datacadacesso;
    
    @OneToOne
    @JoinColumn(name = "tbacessotb000")
    private Tb00tabelas tbacessotb000;

    public Tb002acesso() {
    }

    public Tb002acesso(Integer idacesso) {
        this.idacesso = idacesso;
    }

    public Integer getIdacesso() {
        return idacesso;
    }

    public void setIdacesso(Integer idacesso) {
        Integer oldIdacesso = this.idacesso;
        this.idacesso = idacesso;
        changeSupport.firePropertyChange("idacesso", oldIdacesso, idacesso);
    }

    public Tb001user getIduser() {
        return iduser;
    }

    public void setIduser(Tb001user iduser) {
        Tb001user oldIduser = this.iduser;
        this.iduser = iduser;
        changeSupport.firePropertyChange("iduser", oldIduser, iduser);
    }

    public Boolean getInseriracesso() {
        return inseriracesso;
    }

    public void setInseriracesso(Boolean inseriracesso) {
        Boolean oldInseriracesso = this.inseriracesso;
        this.inseriracesso = inseriracesso;
        changeSupport.firePropertyChange("inseriracesso", oldInseriracesso, inseriracesso);
    }

    public Boolean getExcluiracesso() {
        return excluiracesso;
    }

    public void setExcluiracesso(Boolean excluiracesso) {
        Boolean oldExcluiracesso = this.excluiracesso;
        this.excluiracesso = excluiracesso;
        changeSupport.firePropertyChange("excluiracesso", oldExcluiracesso, excluiracesso);
    }

    public Boolean getEditaracesso() {
        return editaracesso;
    }

    public void setEditaracesso(Boolean editaracesso) {
        Boolean oldEditaracesso = this.editaracesso;
        this.editaracesso = editaracesso;
        changeSupport.firePropertyChange("editaracesso", oldEditaracesso, editaracesso);
    }

    public Boolean getConsultaracesso() {
        return consultaracesso;
    }

    public void setConsultaracesso(Boolean consultaracesso) {
        Boolean oldConsultaracesso = this.consultaracesso;
        this.consultaracesso = consultaracesso;
        changeSupport.firePropertyChange("consultaracesso", oldConsultaracesso, consultaracesso);
    }

    public Date getDatacadacesso() {
        return datacadacesso;
    }

    public void setDatacadacesso(Date datacadacesso) {
        Date oldDatacadacesso = this.datacadacesso;
        this.datacadacesso = datacadacesso;
        changeSupport.firePropertyChange("datacadacesso", oldDatacadacesso, datacadacesso);
    }

    public Tb00tabelas getTbacessotb000() {
        return tbacessotb000;
    }

    public void setTbacessotb000(Tb00tabelas tbacessotb000) {
        Tb00tabelas oldTbacessotb000 = this.tbacessotb000;
        this.tbacessotb000 = tbacessotb000;
        changeSupport.firePropertyChange("tbacessotb000", oldTbacessotb000, tbacessotb000);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idacesso != null ? idacesso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb002acesso)) {
            return false;
        }
        Tb002acesso other = (Tb002acesso) object;
        if ((this.idacesso == null && other.idacesso != null) || (this.idacesso != null && !this.idacesso.equals(other.idacesso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guina.view.Tb002acesso[ idacesso=" + idacesso + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
