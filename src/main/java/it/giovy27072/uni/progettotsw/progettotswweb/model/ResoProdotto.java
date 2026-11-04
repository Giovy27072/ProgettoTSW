package it.giovy27072.uni.progettotsw.progettotswweb.model;

/** JavaBean per la tabella di associazione reso_prodotto. */
public class ResoProdotto {
    private Integer idReso;
    private Integer idProdotto;
    private int quantita;

    public ResoProdotto() {}

    public ResoProdotto(Integer idReso, Integer idProdotto, int quantita) {
        this.idReso = idReso;
        this.idProdotto = idProdotto;
        this.quantita = quantita;
    }

    public Integer getIdReso() { return idReso; }
    public void setIdReso(Integer idReso) { this.idReso = idReso; }
    public Integer getIdProdotto() { return idProdotto; }
    public void setIdProdotto(Integer idProdotto) { this.idProdotto = idProdotto; }
    public int getQuantita() { return quantita; }
    public void setQuantita(int quantita) { this.quantita = quantita; }
}
