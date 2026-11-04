package it.giovy27072.uni.progettotsw.progettotswweb.model;

import java.time.LocalDateTime;

/** JavaBean corrispondente alla tabella ordinazione. */
public class Ordinazione {
    private Integer idOrdine;
    private Integer utenteId;
    private LocalDateTime dataOrdine;
    private String stato;

    public Ordinazione() {}

    public Ordinazione(Integer idOrdine, Integer utenteId,
                       LocalDateTime dataOrdine, String stato) {
        this.idOrdine = idOrdine;
        this.utenteId = utenteId;
        this.dataOrdine = dataOrdine;
        this.stato = stato;
    }

    public Integer getIdOrdine() { return idOrdine; }
    public void setIdOrdine(Integer idOrdine) { this.idOrdine = idOrdine; }
    public Integer getUtenteId() { return utenteId; }
    public void setUtenteId(Integer utenteId) { this.utenteId = utenteId; }
    public LocalDateTime getDataOrdine() { return dataOrdine; }
    public void setDataOrdine(LocalDateTime dataOrdine) { this.dataOrdine = dataOrdine; }
    public String getStato() { return stato; }
    public void setStato(String stato) { this.stato = stato; }
}
