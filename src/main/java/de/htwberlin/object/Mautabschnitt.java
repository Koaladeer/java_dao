package de.htwberlin.object;

public class Mautabschnitt {
    private int abschnittsId;
    private float laenge;
    private String startKoordinate;
    private String zielKoordinate;
    private String name;
    private String abschnittstyp;

    public Mautabschnitt(int abschnittsId, float laenge, String startKoordinate, String zielKoordinate, String name, String abschnittstyp) {
        this.abschnittsId = abschnittsId;
        this.laenge = laenge;
        this.startKoordinate = startKoordinate;
        this.zielKoordinate = zielKoordinate;
        this.name = name;
        this.abschnittstyp = abschnittstyp;
    }

    public int getAbschnittsId() {
        return abschnittsId;
    }

    public void setAbschnittsId(int abschnittsId) {
        this.abschnittsId = abschnittsId;
    }

    public float getLaenge() {
        return laenge;
    }

    public void setLaenge(float laenge) {
        this.laenge = laenge;
    }

    public String getStartKoordinate() {
        return startKoordinate;
    }

    public void setStartKoordinate(String startKoordinate) {
        this.startKoordinate = startKoordinate;
    }

    public String getZielKoordinate() {
        return zielKoordinate;
    }

    public void setZielKoordinate(String zielKoordinate) {
        this.zielKoordinate = zielKoordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbschnittstyp() {
        return abschnittstyp;
    }

    public void setAbschnittstyp(String abschnittstyp) {
        this.abschnittstyp = abschnittstyp;
    }
}

