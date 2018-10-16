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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tb010logsistema", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb010logsistema.findAll", query = "SELECT t FROM Tb010logsistema t")
    , @NamedQuery(name = "Tb010logsistema.findByIdlog", query = "SELECT t FROM Tb010logsistema t WHERE t.idlog = :idlog")
    , @NamedQuery(name = "Tb010logsistema.findByDatalogo", query = "SELECT t FROM Tb010logsistema t WHERE t.datalogo = :datalogo")
    , @NamedQuery(name = "Tb010logsistema.findByHoralog", query = "SELECT t FROM Tb010logsistema t WHERE t.horalog = :horalog")
    , @NamedQuery(name = "Tb010logsistema.findByUsuerlog", query = "SELECT t FROM Tb010logsistema t WHERE t.usuerlog = :usuerlog")
    , @NamedQuery(name = "Tb010logsistema.findByTablog", query = "SELECT t FROM Tb010logsistema t WHERE t.tablog = :tablog")
    , @NamedQuery(name = "Tb010logsistema.findByAcaolog", query = "SELECT t FROM Tb010logsistema t WHERE t.acaolog = :acaolog")
    , @NamedQuery(name = "Tb010logsistema.findByIditemlog", query = "SELECT t FROM Tb010logsistema t WHERE t.iditemlog = :iditemlog")
    , @NamedQuery(name = "Tb010logsistema.findByItemnomelog", query = "SELECT t FROM Tb010logsistema t WHERE t.itemnomelog = :itemnomelog")})
public class Tb010logsistema implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlog")
    private Integer idlog;
    @Column(name = "datalogo")
    private String datalogo;
    @Column(name = "horalog")
    private String horalog;
    @Column(name = "usuerlog")
    private String usuerlog;
    @Column(name = "tablog")
    private String tablog;
    @Column(name = "acaolog")
    private String acaolog;
    @Column(name = "iditemlog")
    private String iditemlog;
    @Column(name = "itemnomelog")
    private String itemnomelog;

    public Tb010logsistema() {
    }

    public Tb010logsistema(Integer idlog) {
        this.idlog = idlog;
    }

    public Integer getIdlog() {
        return idlog;
    }

    public void setIdlog(Integer idlog) {
        Integer oldIdlog = this.idlog;
        this.idlog = idlog;
        changeSupport.firePropertyChange("idlog", oldIdlog, idlog);
    }

    public String getDatalogo() {
        return datalogo;
    }

    public void setDatalogo(String datalogo) {
        String oldDatalogo = this.datalogo;
        this.datalogo = datalogo;
        changeSupport.firePropertyChange("datalogo", oldDatalogo, datalogo);
    }

    public String getHoralog() {
        return horalog;
    }

    public void setHoralog(String horalog) {
        String oldHoralog = this.horalog;
        this.horalog = horalog;
        changeSupport.firePropertyChange("horalog", oldHoralog, horalog);
    }

    public String getUsuerlog() {
        return usuerlog;
    }

    public void setUsuerlog(String usuerlog) {
        String oldUsuerlog = this.usuerlog;
        this.usuerlog = usuerlog;
        changeSupport.firePropertyChange("usuerlog", oldUsuerlog, usuerlog);
    }

    public String getTablog() {
        return tablog;
    }

    public void setTablog(String tablog) {
        String oldTablog = this.tablog;
        this.tablog = tablog;
        changeSupport.firePropertyChange("tablog", oldTablog, tablog);
    }

    public String getAcaolog() {
        return acaolog;
    }

    public void setAcaolog(String acaolog) {
        String oldAcaolog = this.acaolog;
        this.acaolog = acaolog;
        changeSupport.firePropertyChange("acaolog", oldAcaolog, acaolog);
    }

    public String getIditemlog() {
        return iditemlog;
    }

    public void setIditemlog(String iditemlog) {
        String oldIditemlog = this.iditemlog;
        this.iditemlog = iditemlog;
        changeSupport.firePropertyChange("iditemlog", oldIditemlog, iditemlog);
    }

    public String getItemnomelog() {
        return itemnomelog;
    }

    public void setItemnomelog(String itemnomelog) {
        String oldItemnomelog = this.itemnomelog;
        this.itemnomelog = itemnomelog;
        changeSupport.firePropertyChange("itemnomelog", oldItemnomelog, itemnomelog);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlog != null ? idlog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb010logsistema)) {
            return false;
        }
        Tb010logsistema other = (Tb010logsistema) object;
        if ((this.idlog == null && other.idlog != null) || (this.idlog != null && !this.idlog.equals(other.idlog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guina.view.Tb010logsistema[ idlog=" + idlog + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
