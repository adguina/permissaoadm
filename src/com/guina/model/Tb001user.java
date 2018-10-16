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
@Table(name = "tb001user", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb001user.findAll", query = "SELECT t FROM Tb001user t")
    , @NamedQuery(name = "Tb001user.findByIduser", query = "SELECT t FROM Tb001user t WHERE t.iduser = :iduser")
    , @NamedQuery(name = "Tb001user.findByNomeuser", query = "SELECT t FROM Tb001user t WHERE t.nomeuser = :nomeuser")
    , @NamedQuery(name = "Tb001user.findBySenhauser", query = "SELECT t FROM Tb001user t WHERE t.senhauser = :senhauser")
    , @NamedQuery(name = "Tb001user.findByLoginuser", query = "SELECT t FROM Tb001user t WHERE t.loginuser = :loginuser")
    , @NamedQuery(name = "Tb001user.findByEmail", query = "SELECT t FROM Tb001user t WHERE t.email = :email")
    , @NamedQuery(name = "Tb001user.findByDatacaduser", query = "SELECT t FROM Tb001user t WHERE t.datacaduser = :datacaduser")})
public class Tb001user implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iduser")
    private Integer iduser;
    @Column(name = "nomeuser")
    private String nomeuser;
    @Column(name = "senhauser")
    private String senhauser;
    @Column(name = "loginuser")
    private String loginuser;
    @Column(name = "email")
    private String email;
    @Column(name = "datacaduser")
    @Temporal(TemporalType.DATE)
    private Date datacaduser;

    public Tb001user() {
    }

    public Tb001user(Integer iduser) {
        this.iduser = iduser;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        Integer oldIduser = this.iduser;
        this.iduser = iduser;
        changeSupport.firePropertyChange("iduser", oldIduser, iduser);
    }

    public String getNomeuser() {
        return nomeuser;
    }

    public void setNomeuser(String nomeuser) {
        String oldNomeuser = this.nomeuser;
        this.nomeuser = nomeuser;
        changeSupport.firePropertyChange("nomeuser", oldNomeuser, nomeuser);
    }

    public String getSenhauser() {
        return senhauser;
    }

    public void setSenhauser(String senhauser) {
        String oldSenhauser = this.senhauser;
        this.senhauser = senhauser;
        changeSupport.firePropertyChange("senhauser", oldSenhauser, senhauser);
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        String oldLoginuser = this.loginuser;
        this.loginuser = loginuser;
        changeSupport.firePropertyChange("loginuser", oldLoginuser, loginuser);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Date getDatacaduser() {
        return datacaduser;
    }

    public void setDatacaduser(Date datacaduser) {
        Date oldDatacaduser = this.datacaduser;
        this.datacaduser = datacaduser;
        changeSupport.firePropertyChange("datacaduser", oldDatacaduser, datacaduser);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduser != null ? iduser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb001user)) {
            return false;
        }
        Tb001user other = (Tb001user) object;
        if ((this.iduser == null && other.iduser != null) || (this.iduser != null && !this.iduser.equals(other.iduser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getNomeuser();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
