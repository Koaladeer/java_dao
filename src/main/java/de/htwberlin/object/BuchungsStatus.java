package de.htwberlin.object;

public class BuchungsStatus {
	private int bId;
	private Status status;

	public BuchungsStatus(int bId, String status) {
	        this.bId = bId;
	        if(status.equals("offen")) {
	        	this.status = Status.OFFEN;
	        }
	        else if(status.equals("abgeschlossen")) {
	        	this.status = Status.ABGESCHLOSSEN;

	        }else {
	        	this.status = Status.STORNIERT;

	        }
	    }

	public int getBId() {
		return bId;
	}

	public void setBId(int bId) {
		this.bId = bId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public enum Status {
		ABGESCHLOSSEN, OFFEN, STORNIERT
	}
}
