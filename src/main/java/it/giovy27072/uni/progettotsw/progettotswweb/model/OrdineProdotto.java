package it.giovy27072.uni.progettotsw.progettotswweb.model;

/** JavaBean per la tabella di associazione ordine_prodotto. */
public class OrdineProdotto {
    private Integer idOrdine;
    private Integer idProdotto;
    private int quantita;

    public OrdineProdotto() {}

    public OrdineProdotto(Integer idOrdine, Integer idProdotto, int quantita) {
        this.idOrdine = idOrdine;
        this.idProdotto = idProdotto;
        this.quantita = quantita;
    }

    public Integer getIdOrdine() { return idOrdine; }
    public void setIdOrdine(Integer idOrdine) { this.idOrdine = idOrdine; }
    public Integer getIdProdotto() { return idProdotto; }
    public void setIdProdotto(Integer idProdotto) { this.idProdotto = idProdotto; }
    public int getQuantita() { return quantita; }
    public void setQuantita(int quantita) { this.quantita = quantita; }
}
