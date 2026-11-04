package it.giovy27072.uni.progettotsw.progettotswweb.model;

import java.time.LocalDate;

/** JavaBean corrispondente alla tabella carta. */
public class Carta {
    private Integer idCarta;
    private Integer idUtente;
    private String intestatario;
    private String ultimeCifre;
    private String circuito;
    private LocalDate dataScadenza;
    private boolean predefinita;

    public Carta() {}

    public Carta(Integer idCarta, Integer idUtente, String intestatario,
                 String ultimeCifre, String circuito, LocalDate dataScadenza,
                 boolean predefinita) {
        this.idCarta = idCarta;
        this.idUtente = idUtente;
        this.intestatario = intestatario;
        this.ultimeCifre = ultimeCifre;
        this.circuito = circuito;
        this.dataScadenza = dataScadenza;
        this.predefinita = predefinita;
    }

    public Integer getIdCarta() { return idCarta; }
    public void setIdCarta(Integer idCarta) { this.idCarta = idCarta; }
    public Integer getIdUtente() { return idUtente; }
    public void setIdUtente(Integer idUtente) { this.idUtente = idUtente; }
    public String getIntestatario() { return intestatario; }
    public void setIntestatario(String intestatario) { this.intestatario = intestatario; }
    public String getUltimeCifre() { return ultimeCifre; }
    public void setUltimeCifre(String ultimeCifre) { this.ultimeCifre = ultimeCifre; }
    public String getCircuito() { return circuito; }
    public void setCircuito(String circuito) { this.circuito = circuito; }
    public LocalDate getDataScadenza() { return dataScadenza; }
    public void setDataScadenza(LocalDate dataScadenza) { this.dataScadenza = dataScadenza; }
    public boolean isPredefinita() { return predefinita; }
    public void setPredefinita(boolean predefinita) { this.predefinita = predefinita; }
}
