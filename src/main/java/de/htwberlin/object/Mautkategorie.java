package de.htwberlin.object;
public class Mautkategorie {
    private int kategorieId;
    private int ssklId;
    private String katBezeichnung;
    private int achszahl;
    private float mautsatzJeKm;

    public Mautkategorie(int kategorieId, int ssklId, String katBezeichnung, String achszahl, float mautsatzJeKm) {
        this.kategorieId = kategorieId;
        this.ssklId = ssklId;
        this.katBezeichnung = katBezeichnung;
        System.err.println(""+achszahl);
        if(achszahl.contains("= 2")) {
        	this.achszahl = 2;
        }else if(achszahl.contains("= 3")) {
        	this.achszahl = 3;
        } if(achszahl.contains("= 4")) {
        	this.achszahl = 4;
        }else {
        	this.achszahl = 5;
        }
        this.mautsatzJeKm = mautsatzJeKm;
    }

    public int getKategorieId() {
        return kategorieId;
    }

    public void setKategorieId(int kategorieId) {
        this.kategorieId = kategorieId;
    }

    public int getSsklId() {
        return ssklId;
    }

    public void setSsklId(int ssklId) {
        this.ssklId = ssklId;
    }

    public String getKatBezeichnung() {
        return katBezeichnung;
    }

    public void setKatBezeichnung(String katBezeichnung) {
        this.katBezeichnung = katBezeichnung;
    }

    public int getAchszahl() {
        return achszahl;
    }

    public void setAchszahl(int achszahl) {
        this.achszahl = achszahl;
    }

    public float getMautsatzJeKm() {
        return mautsatzJeKm;
    }

    public void setMautsatzJeKm(float mautsatzJeKm) {
        this.mautsatzJeKm = mautsatzJeKm;
    }
}

