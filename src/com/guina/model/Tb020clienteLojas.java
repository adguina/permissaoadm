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
@Table(name = "tb020cliente_lojas", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb020clienteLojas.findAll", query = "SELECT t FROM Tb020clienteLojas t")
    , @NamedQuery(name = "Tb020clienteLojas.findByIdCliLojas", query = "SELECT t FROM Tb020clienteLojas t WHERE t.idCliLojas = :idCliLojas")
    , @NamedQuery(name = "Tb020clienteLojas.findByNomeCli", query = "SELECT t FROM Tb020clienteLojas t WHERE t.nomeCli = :nomeCli")
    , @NamedQuery(name = "Tb020clienteLojas.findByCepCli", query = "SELECT t FROM Tb020clienteLojas t WHERE t.cepCli = :cepCli")
    , @NamedQuery(name = "Tb020clienteLojas.findByRuaCli", query = "SELECT t FROM Tb020clienteLojas t WHERE t.ruaCli = :ruaCli")
    , @NamedQuery(name = "Tb020clienteLojas.findByBairroCli", query = "SELECT t FROM Tb020clienteLojas t WHERE t.bairroCli = :bairroCli")
    , @NamedQuery(name = "Tb020clienteLojas.findByCidadeCli", query = "SELECT t FROM Tb020clienteLojas t WHERE t.cidadeCli = :cidadeCli")
    , @NamedQuery(name = "Tb020clienteLojas.findByTelCli", query = "SELECT t FROM Tb020clienteLojas t WHERE t.telCli = :telCli")
    , @NamedQuery(name = "Tb020clienteLojas.findByCelCli", query = "SELECT t FROM Tb020clienteLojas t WHERE t.celCli = :celCli")
    , @NamedQuery(name = "Tb020clienteLojas.findByEmailCli", query = "SELECT t FROM Tb020clienteLojas t WHERE t.emailCli = :emailCli")
    , @NamedQuery(name = "Tb020clienteLojas.findByCpfCli", query = "SELECT t FROM Tb020clienteLojas t WHERE t.cpfCli = :cpfCli")
    , @NamedQuery(name = "Tb020clienteLojas.findByDatacadCli", query = "SELECT t FROM Tb020clienteLojas t WHERE t.datacadCli = :datacadCli")
    , @NamedQuery(name = "Tb020clienteLojas.findByIdUf", query = "SELECT t FROM Tb020clienteLojas t WHERE t.idUf = :idUf")
    , @NamedQuery(name = "Tb020clienteLojas.findByNumeroCli", query = "SELECT t FROM Tb020clienteLojas t WHERE t.numeroCli = :numeroCli")})
public class Tb020clienteLojas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_cli_lojas")
    private Long idCliLojas;
    @Column(name = "nome_cli")
    private String nomeCli;
    @Column(name = "cep_cli")
    private String cepCli;
    @Column(name = "rua_cli")
    private String ruaCli;
    @Column(name = "bairro_cli")
    private String bairroCli;
    @Column(name = "cidade_cli")
    private String cidadeCli;
    @Column(name = "tel_cli")
    private String telCli;
    @Column(name = "cel_cli")
    private String celCli;
    @Column(name = "email_cli")
    private String emailCli;
    @Column(name = "cpf_cli")
    private String cpfCli;
    @Column(name = "datacad_cli")
    @Temporal(TemporalType.DATE)
    private Date datacadCli;
    @Column(name = "id_uf")
    private String idUf;
    @Column(name = "numero_cli")
    private String numeroCli;

    public Tb020clienteLojas() {
    }

    public Tb020clienteLojas(Long idCliLojas) {
        this.idCliLojas = idCliLojas;
    }

    public Long getIdCliLojas() {
        return idCliLojas;
    }

    public void setIdCliLojas(Long idCliLojas) {
        Long oldIdCliLojas = this.idCliLojas;
        this.idCliLojas = idCliLojas;
        changeSupport.firePropertyChange("idCliLojas", oldIdCliLojas, idCliLojas);
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        String oldNomeCli = this.nomeCli;
        this.nomeCli = nomeCli;
        changeSupport.firePropertyChange("nomeCli", oldNomeCli, nomeCli);
    }

    public String getCepCli() {
        return cepCli;
    }

    public void setCepCli(String cepCli) {
        String oldCepCli = this.cepCli;
        this.cepCli = cepCli;
        changeSupport.firePropertyChange("cepCli", oldCepCli, cepCli);
    }

    public String getRuaCli() {
        return ruaCli;
    }

    public void setRuaCli(String ruaCli) {
        String oldRuaCli = this.ruaCli;
        this.ruaCli = ruaCli;
        changeSupport.firePropertyChange("ruaCli", oldRuaCli, ruaCli);
    }

    public String getBairroCli() {
        return bairroCli;
    }

    public void setBairroCli(String bairroCli) {
        String oldBairroCli = this.bairroCli;
        this.bairroCli = bairroCli;
        changeSupport.firePropertyChange("bairroCli", oldBairroCli, bairroCli);
    }

    public String getCidadeCli() {
        return cidadeCli;
    }

    public void setCidadeCli(String cidadeCli) {
        String oldCidadeCli = this.cidadeCli;
        this.cidadeCli = cidadeCli;
        changeSupport.firePropertyChange("cidadeCli", oldCidadeCli, cidadeCli);
    }

    public String getTelCli() {
        return telCli;
    }

    public void setTelCli(String telCli) {
        String oldTelCli = this.telCli;
        this.telCli = telCli;
        changeSupport.firePropertyChange("telCli", oldTelCli, telCli);
    }

    public String getCelCli() {
        return celCli;
    }

    public void setCelCli(String celCli) {
        String oldCelCli = this.celCli;
        this.celCli = celCli;
        changeSupport.firePropertyChange("celCli", oldCelCli, celCli);
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        String oldEmailCli = this.emailCli;
        this.emailCli = emailCli;
        changeSupport.firePropertyChange("emailCli", oldEmailCli, emailCli);
    }

    public String getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(String cpfCli) {
        String oldCpfCli = this.cpfCli;
        this.cpfCli = cpfCli;
        changeSupport.firePropertyChange("cpfCli", oldCpfCli, cpfCli);
    }

    public Date getDatacadCli() {
        return datacadCli;
    }

    public void setDatacadCli(Date datacadCli) {
        Date oldDatacadCli = this.datacadCli;
        this.datacadCli = datacadCli;
        changeSupport.firePropertyChange("datacadCli", oldDatacadCli, datacadCli);
    }

    public String getIdUf() {
        return idUf;
    }

    public void setIdUf(String idUf) {
        String oldIdUf = this.idUf;
        this.idUf = idUf;
        changeSupport.firePropertyChange("idUf", oldIdUf, idUf);
    }

    public String getNumeroCli() {
        return numeroCli;
    }

    public void setNumeroCli(String numeroCli) {
        String oldNumeroCli = this.numeroCli;
        this.numeroCli = numeroCli;
        changeSupport.firePropertyChange("numeroCli", oldNumeroCli, numeroCli);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliLojas != null ? idCliLojas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb020clienteLojas)) {
            return false;
        }
        Tb020clienteLojas other = (Tb020clienteLojas) object;
        if ((this.idCliLojas == null && other.idCliLojas != null) || (this.idCliLojas != null && !this.idCliLojas.equals(other.idCliLojas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nomeCli;
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
