package de.htwberlin.object;

import java.sql.Timestamp;

public class Mauterhebung {
    private long mautId;
    private int abschnittsId;
    private long fzgId;
    private int kategorieId;
    private Timestamp befahrungsdatum;
    private double kosten;

    public Mauterhebung(long mautId, int abschnittsId, long fzgId, int kategorieId, Timestamp befahrungsdatum, double kosten) {
        this.mautId = mautId;
        this.abschnittsId = abschnittsId;
        this.fzgId = fzgId;
        this.kategorieId = kategorieId;
        this.befahrungsdatum = befahrungsdatum;
        this.kosten = kosten;
    }

    public long getMautId() {
        return mautId;
    }

    public void setMautId(long mautId) {
        this.mautId = mautId;
    }

    public int getAbschnittsId() {
        return abschnittsId;
    }

    public void setAbschnittsId(int abschnittsId) {
        this.abschnittsId = abschnittsId;
    }

    public long getFzgId() {
        return fzgId;
    }

    public void setFzgId(long fzgId) {
        this.fzgId = fzgId;
    }

    public int getKategorieId() {
        return kategorieId;
    }

    public void setKategorieId(int kategorieId) {
        this.kategorieId = kategorieId;
    }

    public Timestamp getBefahrungsdatum() {
        return befahrungsdatum;
    }

    public void setBefahrungsdatum(Timestamp befahrungsdatum) {
        this.befahrungsdatum = befahrungsdatum;
    }

    public double getKosten() {
        return kosten;
    }

    public void setKosten(double kosten) {
        this.kosten = kosten;
    }
}
