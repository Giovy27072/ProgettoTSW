package it.giovy27072.uni.progettotsw.progettotswweb.model;

import java.math.BigDecimal;

/** JavaBean corrispondente alla tabella prodotto. */
public class Prodotto {
    private Integer idProdotto;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private int quantita;
    private String categoria;

    public Prodotto() {}

    public Prodotto(Integer idProdotto, String nome, String descrizione,
                    BigDecimal prezzo, int quantita, String categoria) {
        this.idProdotto = idProdotto;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantita = quantita;
        this.categoria = categoria;
    }

    public Integer getIdProdotto() { return idProdotto; }
    public void setIdProdotto(Integer idProdotto) { this.idProdotto = idProdotto; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }
    public BigDecimal getPrezzo() { return prezzo; }
    public void setPrezzo(BigDecimal prezzo) { this.prezzo = prezzo; }
    public int getQuantita() { return quantita; }
    public void setQuantita(int quantita) { this.quantita = quantita; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}
