package it.giovy27072.uni.progettotsw.progettotswweb.model;

import java.time.LocalDateTime;

/** JavaBean corrispondente alla tabella reso. */
public class Reso {
    private Integer idReso;
    private LocalDateTime dataReso;
    private String motivo;
    private String metodoRimborso;
    private String metodoSpedizione;

    public Reso() {}

    public Reso(Integer idReso, LocalDateTime dataReso, String motivo,
                String metodoRimborso, String metodoSpedizione) {
        this.idReso = idReso;
        this.dataReso = dataReso;
        this.motivo = motivo;
        this.metodoRimborso = metodoRimborso;
        this.metodoSpedizione = metodoSpedizione;
    }

    public Integer getIdReso() { return idReso; }
    public void setIdReso(Integer idReso) { this.idReso = idReso; }
    public LocalDateTime getDataReso() { return dataReso; }
    public void setDataReso(LocalDateTime dataReso) { this.dataReso = dataReso; }
    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public String getMetodoRimborso() { return metodoRimborso; }
    public void setMetodoRimborso(String metodoRimborso) { this.metodoRimborso = metodoRimborso; }
    public String getMetodoSpedizione() { return metodoSpedizione; }
    public void setMetodoSpedizione(String metodoSpedizione) { this.metodoSpedizione = metodoSpedizione; }
}
