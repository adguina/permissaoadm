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
@Table(name = "tb019fichas", catalog = "permissao", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tb019fichas.findAll", query = "SELECT t FROM Tb019fichas t")
    , @NamedQuery(name = "Tb019fichas.findByIdFicha", query = "SELECT t FROM Tb019fichas t WHERE t.idFicha = :idFicha")
    , @NamedQuery(name = "Tb019fichas.findByIdLojaFk", query = "SELECT t FROM Tb019fichas t WHERE t.idLojaFk = :idLojaFk")
    , @NamedQuery(name = "Tb019fichas.findByDatacadastroFicha", query = "SELECT t FROM Tb019fichas t WHERE t.datacadastroFicha = :datacadastroFicha")
    , @NamedQuery(name = "Tb019fichas.findByDataenviofabricaFicha", query = "SELECT t FROM Tb019fichas t WHERE t.dataenviofabricaFicha = :dataenviofabricaFicha")
    , @NamedQuery(name = "Tb019fichas.findByDatarecebidolojaFicha", query = "SELECT t FROM Tb019fichas t WHERE t.datarecebidolojaFicha = :datarecebidolojaFicha")
    , @NamedQuery(name = "Tb019fichas.findByStatusFicha", query = "SELECT t FROM Tb019fichas t WHERE t.statusFicha = :statusFicha")
    , @NamedQuery(name = "Tb019fichas.findByPrecoFicha", query = "SELECT t FROM Tb019fichas t WHERE t.precoFicha = :precoFicha")
    , @NamedQuery(name = "Tb019fichas.findByIdClienteFk", query = "SELECT t FROM Tb019fichas t WHERE t.idClienteFk = :idClienteFk")
    , @NamedQuery(name = "Tb019fichas.findByIdProdutoFk", query = "SELECT t FROM Tb019fichas t WHERE t.idProdutoFk = :idProdutoFk")
    , @NamedQuery(name = "Tb019fichas.findByDataretornofabricaFicha", query = "SELECT t FROM Tb019fichas t WHERE t.dataretornofabricaFicha = :dataretornofabricaFicha")
    , @NamedQuery(name = "Tb019fichas.findByStatusFichaSituacao", query = "SELECT t FROM Tb019fichas t WHERE t.statusFichaSituacao = :statusFichaSituacao")
    , @NamedQuery(name = "Tb019fichas.findByDefeitoFicha", query = "SELECT t FROM Tb019fichas t WHERE t.defeitoFicha = :defeitoFicha")
    , @NamedQuery(name = "Tb019fichas.findByDataretiradaclienteFicha", query = "SELECT t FROM Tb019fichas t WHERE t.dataretiradaclienteFicha = :dataretiradaclienteFicha")
    , @NamedQuery(name = "Tb019fichas.findByCodProdFicha", query = "SELECT t FROM Tb019fichas t WHERE t.codProdFicha = :codProdFicha")})
public class Tb019fichas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_ficha")
    private Long idFicha;
    
    @OneToOne
    @JoinColumn(name = "id_loja_fk")
    private Tb011lojas idLojaFk;
    
    @Column(name = "datacadastro_ficha")
    @Temporal(TemporalType.DATE)
    private Date datacadastroFicha;
    @Column(name = "dataenviofabrica_ficha")
    @Temporal(TemporalType.DATE)
    private Date dataenviofabricaFicha;
    @Column(name = "datarecebidoloja_ficha")
    @Temporal(TemporalType.DATE)
    private Date datarecebidolojaFicha;
    @Column(name = "status_ficha")
    private String statusFicha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco_ficha")
    private Float precoFicha;
    
    @OneToOne
    @JoinColumn(name = "id_cliente_fk")
    private Tb020cliLojas idClienteFk;
    
    @OneToOne
    @JoinColumn(name = "id_produto_fk")
    private Tb021prodLojas idProdutoFk;
    
    
    @Column(name = "dataretornofabrica_ficha")
    @Temporal(TemporalType.DATE)
    private Date dataretornofabricaFicha;
    @Column(name = "status_ficha_situacao")
    private String statusFichaSituacao;
    @Column(name = "defeito_ficha")
    private String defeitoFicha;
    @Column(name = "dataretiradacliente_ficha")
    @Temporal(TemporalType.DATE)
    private Date dataretiradaclienteFicha;
    @Column(name = "cod_prod_ficha")
    private String codProdFicha;

    public Tb019fichas() {
    }

    public Tb019fichas(Long idFicha) {
        this.idFicha = idFicha;
    }

    public Long getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Long idFicha) {
        Long oldIdFicha = this.idFicha;
        this.idFicha = idFicha;
        changeSupport.firePropertyChange("idFicha", oldIdFicha, idFicha);
    }

    public Tb011lojas getIdLojaFk() {
        return idLojaFk;
    }

    public void setIdLojaFk(Tb011lojas idLojaFk) {
        Tb011lojas oldIdLojaFk = this.idLojaFk;
        this.idLojaFk = idLojaFk;
        changeSupport.firePropertyChange("idLojaFk", oldIdLojaFk, idLojaFk);
    }

    public Date getDatacadastroFicha() {
        return datacadastroFicha;
    }

    public void setDatacadastroFicha(Date datacadastroFicha) {
        Date oldDatacadastroFicha = this.datacadastroFicha;
        this.datacadastroFicha = datacadastroFicha;
        changeSupport.firePropertyChange("datacadastroFicha", oldDatacadastroFicha, datacadastroFicha);
    }

    public Date getDataenviofabricaFicha() {
        return dataenviofabricaFicha;
    }

    public void setDataenviofabricaFicha(Date dataenviofabricaFicha) {
        Date oldDataenviofabricaFicha = this.dataenviofabricaFicha;
        this.dataenviofabricaFicha = dataenviofabricaFicha;
        changeSupport.firePropertyChange("dataenviofabricaFicha", oldDataenviofabricaFicha, dataenviofabricaFicha);
    }

    public Date getDatarecebidolojaFicha() {
        return datarecebidolojaFicha;
    }

    public void setDatarecebidolojaFicha(Date datarecebidolojaFicha) {
        Date oldDatarecebidolojaFicha = this.datarecebidolojaFicha;
        this.datarecebidolojaFicha = datarecebidolojaFicha;
        changeSupport.firePropertyChange("datarecebidolojaFicha", oldDatarecebidolojaFicha, datarecebidolojaFicha);
    }

    public String getStatusFicha() {
        return statusFicha;
    }

    public void setStatusFicha(String statusFicha) {
        String oldStatusFicha = this.statusFicha;
        this.statusFicha = statusFicha;
        changeSupport.firePropertyChange("statusFicha", oldStatusFicha, statusFicha);
    }

    public Float getPrecoFicha() {
        return precoFicha;
    }

    public void setPrecoFicha(Float precoFicha) {
        Float oldPrecoFicha = this.precoFicha;
        this.precoFicha = precoFicha;
        changeSupport.firePropertyChange("precoFicha", oldPrecoFicha, precoFicha);
    }

    public Tb020cliLojas getIdClienteFk() {
        return idClienteFk;
    }

    public void setIdClienteFk(Tb020cliLojas idClienteFk) {
        Tb020cliLojas oldIdClienteFk = this.idClienteFk;
        this.idClienteFk = idClienteFk;
        changeSupport.firePropertyChange("idClienteFk", oldIdClienteFk, idClienteFk);
    }

    public Tb021prodLojas getIdProdutoFk() {
        return idProdutoFk;
    }

    public void setIdProdutoFk(Tb021prodLojas idProdutoFk) {
        Tb021prodLojas oldIdProdutoFk = this.idProdutoFk;
        this.idProdutoFk = idProdutoFk;
        changeSupport.firePropertyChange("idProdutoFk", oldIdProdutoFk, idProdutoFk);
    }

    public Date getDataretornofabricaFicha() {
        return dataretornofabricaFicha;
    }

    public void setDataretornofabricaFicha(Date dataretornofabricaFicha) {
        Date oldDataretornofabricaFicha = this.dataretornofabricaFicha;
        this.dataretornofabricaFicha = dataretornofabricaFicha;
        changeSupport.firePropertyChange("dataretornofabricaFicha", oldDataretornofabricaFicha, dataretornofabricaFicha);
    }

    public String getStatusFichaSituacao() {
        return statusFichaSituacao;
    }

    public void setStatusFichaSituacao(String statusFichaSituacao) {
        String oldStatusFichaSituacao = this.statusFichaSituacao;
        this.statusFichaSituacao = statusFichaSituacao;
        changeSupport.firePropertyChange("statusFichaSituacao", oldStatusFichaSituacao, statusFichaSituacao);
    }

    public String getDefeitoFicha() {
        return defeitoFicha;
    }

    public void setDefeitoFicha(String defeitoFicha) {
        String oldDefeitoFicha = this.defeitoFicha;
        this.defeitoFicha = defeitoFicha;
        changeSupport.firePropertyChange("defeitoFicha", oldDefeitoFicha, defeitoFicha);
    }

    public Date getDataretiradaclienteFicha() {
        return dataretiradaclienteFicha;
    }

    public void setDataretiradaclienteFicha(Date dataretiradaclienteFicha) {
        Date oldDataretiradaclienteFicha = this.dataretiradaclienteFicha;
        this.dataretiradaclienteFicha = dataretiradaclienteFicha;
        changeSupport.firePropertyChange("dataretiradaclienteFicha", oldDataretiradaclienteFicha, dataretiradaclienteFicha);
    }

    public String getCodProdFicha() {
        return codProdFicha;
    }

    public void setCodProdFicha(String codProdFicha) {
        String oldCodProdFicha = this.codProdFicha;
        this.codProdFicha = codProdFicha;
        changeSupport.firePropertyChange("codProdFicha", oldCodProdFicha, codProdFicha);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFicha != null ? idFicha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb019fichas)) {
            return false;
        }
        Tb019fichas other = (Tb019fichas) object;
        if ((this.idFicha == null && other.idFicha != null) || (this.idFicha != null && !this.idFicha.equals(other.idFicha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.guina.view.Tb019fichas[ idFicha=" + idFicha + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
