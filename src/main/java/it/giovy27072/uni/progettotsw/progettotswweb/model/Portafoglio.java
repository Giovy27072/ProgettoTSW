package it.giovy27072.uni.progettotsw.progettotswweb.model;

/** JavaBean per la tabella di associazione portafoglio. */
public class Portafoglio {
    private Integer utenteId;
    private Integer cartaId;

    public Portafoglio() {}

    public Portafoglio(Integer utenteId, Integer cartaId) {
        this.utenteId = utenteId;
        this.cartaId = cartaId;
    }

    public Integer getUtenteId() { return utenteId; }
    public void setUtenteId(Integer utenteId) { this.utenteId = utenteId; }
    public Integer getCartaId() { return cartaId; }
    public void setCartaId(Integer cartaId) { this.cartaId = cartaId; }
}
