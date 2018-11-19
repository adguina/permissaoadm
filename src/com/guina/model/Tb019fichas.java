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
    , @NamedQuery(name = "Tb019fichas.findByCodProdFicha", query = "SELECT t FROM Tb019fichas t WHERE t.codProdFicha = :codProdFicha")
    , @NamedQuery(name = "Tb019fichas.findByNfFicha", query = "SELECT t FROM Tb019fichas t WHERE t.nfFicha = :nfFicha")
    , @NamedQuery(name = "Tb019fichas.findByCorpofrenteFicha", query = "SELECT t FROM Tb019fichas t WHERE t.corpofrenteFicha = :corpofrenteFicha")
    , @NamedQuery(name = "Tb019fichas.findByCorpocostaFicha", query = "SELECT t FROM Tb019fichas t WHERE t.corpocostaFicha = :corpocostaFicha")
    , @NamedQuery(name = "Tb019fichas.findByAcabamentoFicha", query = "SELECT t FROM Tb019fichas t WHERE t.acabamentoFicha = :acabamentoFicha")
    , @NamedQuery(name = "Tb019fichas.findByAlcaFicha", query = "SELECT t FROM Tb019fichas t WHERE t.alcaFicha = :alcaFicha")
    , @NamedQuery(name = "Tb019fichas.findByVivoFicha", query = "SELECT t FROM Tb019fichas t WHERE t.vivoFicha = :vivoFicha")
    , @NamedQuery(name = "Tb019fichas.findByZipperFicha", query = "SELECT t FROM Tb019fichas t WHERE t.zipperFicha = :zipperFicha")
    , @NamedQuery(name = "Tb019fichas.findByPlacaFicha", query = "SELECT t FROM Tb019fichas t WHERE t.placaFicha = :placaFicha")
    , @NamedQuery(name = "Tb019fichas.findByCorrenteFicha", query = "SELECT t FROM Tb019fichas t WHERE t.correnteFicha = :correnteFicha")
    , @NamedQuery(name = "Tb019fichas.findByTermzipperFicha", query = "SELECT t FROM Tb019fichas t WHERE t.termzipperFicha = :termzipperFicha")
    , @NamedQuery(name = "Tb019fichas.findByFerragemFicha", query = "SELECT t FROM Tb019fichas t WHERE t.ferragemFicha = :ferragemFicha")
    , @NamedQuery(name = "Tb019fichas.findByBasefundoFicha", query = "SELECT t FROM Tb019fichas t WHERE t.basefundoFicha = :basefundoFicha")
    , @NamedQuery(name = "Tb019fichas.findByObsFicha", query = "SELECT t FROM Tb019fichas t WHERE t.obsFicha = :obsFicha")})
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
    private Tb020clienteLojas idClienteFk;
    
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
    @Column(name = "nf_ficha")
    private String nfFicha;
    @Column(name = "corpofrente_ficha")
    private String corpofrenteFicha;
    @Column(name = "corpocosta_ficha")
    private String corpocostaFicha;
    @Column(name = "acabamento_ficha")
    private String acabamentoFicha;
    @Column(name = "alca_ficha")
    private String alcaFicha;
    @Column(name = "vivo_ficha")
    private String vivoFicha;
    @Column(name = "zipper_ficha")
    private String zipperFicha;
    @Column(name = "placa_ficha")
    private String placaFicha;
    @Column(name = "corrente_ficha")
    private String correnteFicha;
    @Column(name = "termzipper_ficha")
    private String termzipperFicha;
    @Column(name = "ferragem_ficha")
    private String ferragemFicha;
    @Column(name = "basefundo_ficha")
    private String basefundoFicha;
    @Column(name = "obs_ficha")
    private String obsFicha;

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

    public Tb020clienteLojas getIdClienteFk() {
        return idClienteFk;
    }

    public void setIdClienteFk(Tb020clienteLojas idClienteFk) {
        Tb020clienteLojas oldIdClienteFk = this.idClienteFk;
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

    public String getNfFicha() {
        return nfFicha;
    }

    public void setNfFicha(String nfFicha) {
        String oldNfFicha = this.nfFicha;
        this.nfFicha = nfFicha;
        changeSupport.firePropertyChange("nfFicha", oldNfFicha, nfFicha);
    }

    public String getCorpofrenteFicha() {
        return corpofrenteFicha;
    }

    public void setCorpofrenteFicha(String corpofrenteFicha) {
        String oldCorpofrenteFicha = this.corpofrenteFicha;
        this.corpofrenteFicha = corpofrenteFicha;
        changeSupport.firePropertyChange("corpofrenteFicha", oldCorpofrenteFicha, corpofrenteFicha);
    }

    public String getCorpocostaFicha() {
        return corpocostaFicha;
    }

    public void setCorpocostaFicha(String corpocostaFicha) {
        String oldCorpocostaFicha = this.corpocostaFicha;
        this.corpocostaFicha = corpocostaFicha;
        changeSupport.firePropertyChange("corpocostaFicha", oldCorpocostaFicha, corpocostaFicha);
    }

    public String getAcabamentoFicha() {
        return acabamentoFicha;
    }

    public void setAcabamentoFicha(String acabamentoFicha) {
        String oldAcabamentoFicha = this.acabamentoFicha;
        this.acabamentoFicha = acabamentoFicha;
        changeSupport.firePropertyChange("acabamentoFicha", oldAcabamentoFicha, acabamentoFicha);
    }

    public String getAlcaFicha() {
        return alcaFicha;
    }

    public void setAlcaFicha(String alcaFicha) {
        String oldAlcaFicha = this.alcaFicha;
        this.alcaFicha = alcaFicha;
        changeSupport.firePropertyChange("alcaFicha", oldAlcaFicha, alcaFicha);
    }

    public String getVivoFicha() {
        return vivoFicha;
    }

    public void setVivoFicha(String vivoFicha) {
        String oldVivoFicha = this.vivoFicha;
        this.vivoFicha = vivoFicha;
        changeSupport.firePropertyChange("vivoFicha", oldVivoFicha, vivoFicha);
    }

    public String getZipperFicha() {
        return zipperFicha;
    }

    public void setZipperFicha(String zipperFicha) {
        String oldZipperFicha = this.zipperFicha;
        this.zipperFicha = zipperFicha;
        changeSupport.firePropertyChange("zipperFicha", oldZipperFicha, zipperFicha);
    }

    public String getPlacaFicha() {
        return placaFicha;
    }

    public void setPlacaFicha(String placaFicha) {
        String oldPlacaFicha = this.placaFicha;
        this.placaFicha = placaFicha;
        changeSupport.firePropertyChange("placaFicha", oldPlacaFicha, placaFicha);
    }

    public String getCorrenteFicha() {
        return correnteFicha;
    }

    public void setCorrenteFicha(String correnteFicha) {
        String oldCorrenteFicha = this.correnteFicha;
        this.correnteFicha = correnteFicha;
        changeSupport.firePropertyChange("correnteFicha", oldCorrenteFicha, correnteFicha);
    }

    public String getTermzipperFicha() {
        return termzipperFicha;
    }

    public void setTermzipperFicha(String termzipperFicha) {
        String oldTermzipperFicha = this.termzipperFicha;
        this.termzipperFicha = termzipperFicha;
        changeSupport.firePropertyChange("termzipperFicha", oldTermzipperFicha, termzipperFicha);
    }

    public String getFerragemFicha() {
        return ferragemFicha;
    }

    public void setFerragemFicha(String ferragemFicha) {
        String oldFerragemFicha = this.ferragemFicha;
        this.ferragemFicha = ferragemFicha;
        changeSupport.firePropertyChange("ferragemFicha", oldFerragemFicha, ferragemFicha);
    }

    public String getBasefundoFicha() {
        return basefundoFicha;
    }

    public void setBasefundoFicha(String basefundoFicha) {
        String oldBasefundoFicha = this.basefundoFicha;
        this.basefundoFicha = basefundoFicha;
        changeSupport.firePropertyChange("basefundoFicha", oldBasefundoFicha, basefundoFicha);
    }

    public String getObsFicha() {
        return obsFicha;
    }

    public void setObsFicha(String obsFicha) {
        String oldObsFicha = this.obsFicha;
        this.obsFicha = obsFicha;
        changeSupport.firePropertyChange("obsFicha", oldObsFicha, obsFicha);
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
        return this.idProdutoFk.getCorProd()+"--"+this.codProdFicha;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
