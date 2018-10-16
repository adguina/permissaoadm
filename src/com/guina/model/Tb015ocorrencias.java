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
import java.math.BigInteger;
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
@Table(name = "tb015ocorrencias", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb015ocorrencias.findAll", query = "SELECT t FROM Tb015ocorrencias t")
    , @NamedQuery(name = "Tb015ocorrencias.findByIdocorrencia", query = "SELECT t FROM Tb015ocorrencias t WHERE t.idocorrencia = :idocorrencia")
    , @NamedQuery(name = "Tb015ocorrencias.findByDataoc", query = "SELECT t FROM Tb015ocorrencias t WHERE t.dataoc = :dataoc")
    , @NamedQuery(name = "Tb015ocorrencias.findByValortabmanualoc", query = "SELECT t FROM Tb015ocorrencias t WHERE t.valortabmanualoc = :valortabmanualoc")
    , @NamedQuery(name = "Tb015ocorrencias.findByValorsistemaoc", query = "SELECT t FROM Tb015ocorrencias t WHERE t.valorsistemaoc = :valorsistemaoc")
    , @NamedQuery(name = "Tb015ocorrencias.findByDiferencavlroc", query = "SELECT t FROM Tb015ocorrencias t WHERE t.diferencavlroc = :diferencavlroc")
    , @NamedQuery(name = "Tb015ocorrencias.findByObsoc", query = "SELECT t FROM Tb015ocorrencias t WHERE t.obsoc = :obsoc")
    , @NamedQuery(name = "Tb015ocorrencias.findByLojaac", query = "SELECT t FROM Tb015ocorrencias t WHERE t.lojaac = :lojaac")})
public class Tb015ocorrencias implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idocorrencia")
    private Long idocorrencia;
    @Column(name = "dataoc")
    @Temporal(TemporalType.DATE)
    private Date dataoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valortabmanualoc")
    private Float valortabmanualoc;
    @Column(name = "valorsistemaoc")
    private Float valorsistemaoc;
    @Column(name = "diferencavlroc")
    private Float diferencavlroc;
    @Column(name = "obsoc")
    private String obsoc;
    
    @OneToOne
    @JoinColumn(name = "lojaac")
    private Tb011lojas lojaac;

    public Tb015ocorrencias() {
    }

    public Tb015ocorrencias(Long idocorrencia) {
        this.idocorrencia = idocorrencia;
    }

    public Long getIdocorrencia() {
        return idocorrencia;
    }

    public void setIdocorrencia(Long idocorrencia) {
        Long oldIdocorrencia = this.idocorrencia;
        this.idocorrencia = idocorrencia;
        changeSupport.firePropertyChange("idocorrencia", oldIdocorrencia, idocorrencia);
    }

    public Date getDataoc() {
        return dataoc;
    }

    public void setDataoc(Date dataoc) {
        Date oldDataoc = this.dataoc;
        this.dataoc = dataoc;
        changeSupport.firePropertyChange("dataoc", oldDataoc, dataoc);
    }

    public Float getValortabmanualoc() {
        return valortabmanualoc;
    }

    public void setValortabmanualoc(Float valortabmanualoc) {
        Float oldValortabmanualoc = this.valortabmanualoc;
        this.valortabmanualoc = valortabmanualoc;
        changeSupport.firePropertyChange("valortabmanualoc", oldValortabmanualoc, valortabmanualoc);
    }

    public Float getValorsistemaoc() {
        return valorsistemaoc;
    }

    public void setValorsistemaoc(Float valorsistemaoc) {
        Float oldValorsistemaoc = this.valorsistemaoc;
        this.valorsistemaoc = valorsistemaoc;
        changeSupport.firePropertyChange("valorsistemaoc", oldValorsistemaoc, valorsistemaoc);
    }

    public Float getDiferencavlroc() {
        return diferencavlroc;
    }

    public void setDiferencavlroc(Float diferencavlroc) {
        Float oldDiferencavlroc = this.diferencavlroc;
        this.diferencavlroc = diferencavlroc;
        changeSupport.firePropertyChange("diferencavlroc", oldDiferencavlroc, diferencavlroc);
    }

    public String getObsoc() {
        return obsoc;
    }

    public void setObsoc(String obsoc) {
        String oldObsoc = this.obsoc;
        this.obsoc = obsoc;
        changeSupport.firePropertyChange("obsoc", oldObsoc, obsoc);
    }

    public Tb011lojas getLojaac() {
        return lojaac;
    }

    public void setLojaac(Tb011lojas lojaac) {
        Tb011lojas oldLojaac = this.lojaac;
        this.lojaac = lojaac;
        changeSupport.firePropertyChange("lojaac", oldLojaac, lojaac);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idocorrencia != null ? idocorrencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb015ocorrencias)) {
            return false;
        }
        Tb015ocorrencias other = (Tb015ocorrencias) object;
        if ((this.idocorrencia == null && other.idocorrencia != null) || (this.idocorrencia != null && !this.idocorrencia.equals(other.idocorrencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guina.view.Tb015ocorrencias[ idocorrencia=" + idocorrencia + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
