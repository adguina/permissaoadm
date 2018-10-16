/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guina.model;

import com.guina.model.Tb011lojas;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "tb012vendas", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb012vendas.findAll", query = "SELECT t FROM Tb012vendas t")
    , @NamedQuery(name = "Tb012vendas.findByIdvendas", query = "SELECT t FROM Tb012vendas t WHERE t.idvendas = :idvendas")
    , @NamedQuery(name = "Tb012vendas.findByCodvendas", query = "SELECT t FROM Tb012vendas t WHERE t.codvendas = :codvendas")
    , @NamedQuery(name = "Tb012vendas.findByDatavenda", query = "SELECT t FROM Tb012vendas t WHERE t.datavenda = :datavenda")
    , @NamedQuery(name = "Tb012vendas.findByLojavenda", query = "SELECT t FROM Tb012vendas t WHERE t.lojavenda = :lojavenda")
    , @NamedQuery(name = "Tb012vendas.findByValorvenda", query = "SELECT t FROM Tb012vendas t WHERE t.valorvenda = :valorvenda")
    , @NamedQuery(name = "Tb012vendas.findByObsvenda", query = "SELECT t FROM Tb012vendas t WHERE t.obsvenda = :obsvenda")})
public class Tb012vendas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idvendas")
    private Long idvendas;
    @Basic(optional = false)
    @Column(name = "codvendas")
    private long codvendas;
    @Column(name = "datavenda")
    @Temporal(TemporalType.DATE)
    private Date datavenda;
    
    @OneToOne
    @JoinColumn(name = "lojavenda")
    private Tb011lojas lojavenda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorvenda")
    private Float valorvenda;
    @Column(name = "obsvenda")
    private String obsvenda;

    public Tb012vendas() {
    }

    public Tb012vendas(Long idvendas) {
        this.idvendas = idvendas;
    }

    public Tb012vendas(Long idvendas, long codvendas) {
        this.idvendas = idvendas;
        this.codvendas = codvendas;
    }

    public Long getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(Long idvendas) {
        Long oldIdvendas = this.idvendas;
        this.idvendas = idvendas;
        changeSupport.firePropertyChange("idvendas", oldIdvendas, idvendas);
    }

    public long getCodvendas() {
        return codvendas;
    }

    public void setCodvendas(long codvendas) {
        long oldCodvendas = this.codvendas;
        this.codvendas = codvendas;
        changeSupport.firePropertyChange("codvendas", oldCodvendas, codvendas);
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        Date oldDatavenda = this.datavenda;
        this.datavenda = datavenda;
        changeSupport.firePropertyChange("datavenda", oldDatavenda, datavenda);
    }

    public Tb011lojas getLojavenda() {
        return lojavenda;
    }

    public void setLojavenda(Tb011lojas lojavenda) {
        Tb011lojas oldLojavenda = this.lojavenda;
        this.lojavenda = lojavenda;
        changeSupport.firePropertyChange("lojavenda", oldLojavenda, lojavenda);
    }

    public Float getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(Float valorvenda) {
        Float oldValorvenda = this.valorvenda;
        this.valorvenda = valorvenda;
        changeSupport.firePropertyChange("valorvenda", oldValorvenda, valorvenda);
    }

    public String getObsvenda() {
        return obsvenda;
    }

    public void setObsvenda(String obsvenda) {
        String oldObsvenda = this.obsvenda;
        this.obsvenda = obsvenda;
        changeSupport.firePropertyChange("obsvenda", oldObsvenda, obsvenda);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvendas != null ? idvendas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb012vendas)) {
            return false;
        }
        Tb012vendas other = (Tb012vendas) object;
        if ((this.idvendas == null && other.idvendas != null) || (this.idvendas != null && !this.idvendas.equals(other.idvendas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guina.view.Tb012vendas[ idvendas=" + idvendas + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
