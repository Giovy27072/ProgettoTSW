package it.giovy27072.uni.progettotsw.progettotswweb.model;

import java.time.LocalDateTime;

/** JavaBean corrispondente alla tabella richiesta_reso. */
public class RichiestaReso {
    private Integer idRichiesta;
    private Integer idUtente;
    private Integer idOrdine;
    private LocalDateTime dataRichiesta;
    private String stato;

    public RichiestaReso() {}

    public RichiestaReso(Integer idRichiesta, Integer idUtente, Integer idOrdine,
                         LocalDateTime dataRichiesta, String stato) {
        this.idRichiesta = idRichiesta;
        this.idUtente = idUtente;
        this.idOrdine = idOrdine;
        this.dataRichiesta = dataRichiesta;
        this.stato = stato;
    }

    public Integer getIdRichiesta() { return idRichiesta; }
    public void setIdRichiesta(Integer idRichiesta) { this.idRichiesta = idRichiesta; }
    public Integer getIdUtente() { return idUtente; }
    public void setIdUtente(Integer idUtente) { this.idUtente = idUtente; }
    public Integer getIdOrdine() { return idOrdine; }
    public void setIdOrdine(Integer idOrdine) { this.idOrdine = idOrdine; }
    public LocalDateTime getDataRichiesta() { return dataRichiesta; }
    public void setDataRichiesta(LocalDateTime dataRichiesta) { this.dataRichiesta = dataRichiesta; }
    public String getStato() { return stato; }
    public void setStato(String stato) { this.stato = stato; }
}
