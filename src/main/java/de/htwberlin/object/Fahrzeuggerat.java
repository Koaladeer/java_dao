package de.htwberlin.object;

import java.sql.Date;

public class Fahrzeuggerat {
    private long fzgId;
    private long fzId;
    private String status;
    private String typ;
    private Date einbauDatum;
    private Date ausbauDatum;

    public Fahrzeuggerat(long fzgId, long fzId, String status, String typ, Date einbauDatum, Date ausbauDatum) {
        this.fzgId = fzgId;
        this.fzId = fzId;
        this.status = status;
        this.typ = typ;
        this.einbauDatum = einbauDatum;
        this.ausbauDatum = ausbauDatum;
    }

    public long getFzgId() {
        return fzgId;
    }

    public void setFzgId(long fzgId) {
        this.fzgId = fzgId;
    }

    public long getFzId() {
        return fzId;
    }

    public void setFzId(long fzId) {
        this.fzId = fzId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Date getEinbauDatum() {
        return einbauDatum;
    }

    public void setEinbauDatum(Date einbauDatum) {
        this.einbauDatum = einbauDatum;
    }

    public Date getAusbauDatum() {
        return ausbauDatum;
    }

    public void setAusbauDatum(Date ausbauDatum) {
        this.ausbauDatum = ausbauDatum;
    }
}
