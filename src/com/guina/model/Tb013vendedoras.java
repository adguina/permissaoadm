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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Agnaldo
 */
@Entity
@Table(name = "tb013vendedoras", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb013vendedoras.findAll", query = "SELECT t FROM Tb013vendedoras t")
    , @NamedQuery(name = "Tb013vendedoras.findByIdvendedor", query = "SELECT t FROM Tb013vendedoras t WHERE t.idvendedor = :idvendedor")
    , @NamedQuery(name = "Tb013vendedoras.findByNomevendedor", query = "SELECT t FROM Tb013vendedoras t WHERE t.nomevendedor = :nomevendedor")
    , @NamedQuery(name = "Tb013vendedoras.findByIdlojavendedor", query = "SELECT t FROM Tb013vendedoras t WHERE t.idlojavendedor = :idlojavendedor")})
public class Tb013vendedoras implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idvendedor")
    private Long idvendedor;
    @Column(name = "nomevendedor")
    private String nomevendedor;
    
    @OneToOne
    @JoinColumn(name = "idlojavendedor")
    private Tb011lojas idlojavendedor;

    public Tb013vendedoras() {
    }

    public Tb013vendedoras(Long idvendedor) {
        this.idvendedor = idvendedor;
    }

    public Long getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(Long idvendedor) {
        Long oldIdvendedor = this.idvendedor;
        this.idvendedor = idvendedor;
        changeSupport.firePropertyChange("idvendedor", oldIdvendedor, idvendedor);
    }

    public String getNomevendedor() {
        return nomevendedor;
    }

    public void setNomevendedor(String nomevendedor) {
        String oldNomevendedor = this.nomevendedor;
        this.nomevendedor = nomevendedor;
        changeSupport.firePropertyChange("nomevendedor", oldNomevendedor, nomevendedor);
    }

    public Tb011lojas getIdlojavendedor() {
        return idlojavendedor;
    }

    public void setIdlojavendedor(Tb011lojas idlojavendedor) {
        Tb011lojas oldIdlojavendedor = this.idlojavendedor;
        this.idlojavendedor = idlojavendedor;
        changeSupport.firePropertyChange("idlojavendedor", oldIdlojavendedor, idlojavendedor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvendedor != null ? idvendedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb013vendedoras)) {
            return false;
        }
        Tb013vendedoras other = (Tb013vendedoras) object;
        if ((this.idvendedor == null && other.idvendedor != null) || (this.idvendedor != null && !this.idvendedor.equals(other.idvendedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nomevendedor;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
