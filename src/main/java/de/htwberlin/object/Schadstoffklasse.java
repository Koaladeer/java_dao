package de.htwberlin.object;

public class Schadstoffklasse {
	private int ssklId;
	private Mautschadstoffklasse mautschadstoffklasse;
	private String beschreibung;

	public Schadstoffklasse(int ssklId, Mautschadstoffklasse mautschadstoffklasse, String beschreibung) {
		this.ssklId = ssklId;
		this.mautschadstoffklasse = mautschadstoffklasse;
		this.beschreibung = beschreibung;
	}

	public int getSsklId() {
		return ssklId;
	}

	public void setSsklId(int ssklId) {
		this.ssklId = ssklId;
	}

	public Mautschadstoffklasse getMautschadstoffklasse() {
		return mautschadstoffklasse;
	}

	public void setMautschadstoffklasse(Mautschadstoffklasse mautschadstoffklasse) {
		this.mautschadstoffklasse = mautschadstoffklasse;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public enum Mautschadstoffklasse {
		S1, S2, S3, S4, S5, S6, S7
	}

}
