package de.htwberlin.dao;

import java.sql.Connection;

/**
 * Die Klasse realisiert die Implementierung des Buchungsservice
 * 
 * @author Patrick Dohmeier
 * **/
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.htwberlin.exceptions.DataException;
import de.htwberlin.object.Buchung;

/**
 * Die Klasse zeigt die Implementierung des BuchungDao an einem Beispiel
 * 
 * @author Patrick Dohmeier
 **/
public class BuchungDaoImpl implements BuchungDao {

	private Connection connection;

	public BuchungDaoImpl(Connection connection) {
		this.connection = connection;

	}

	private Connection getConnection() {
		if (connection == null) {
			throw new DataException("Connection not set");
		}
		return connection;
	}

	@Override
	public void updateBuchung(Buchung buchung) {
		PreparedStatement ps = null;
		int i = 0;
		String query = "Update Buchung set b_id= ?,abschnitts_id =?, kennzeichen = ? where buchung_id = ?  ";

		try {
			System.out.println("buchung_id = " + buchung.getB_id());
			System.out.println("kennzeichen = " + buchung.getKennzeichen());
			ps = getConnection().prepareStatement(query);
			ps.setInt(1, buchung.getB_id());
			ps.setInt(2, buchung.getAbschnitts_id());
			ps.setString(3, buchung.getKennzeichen());
			ps.setInt(4, buchung.getBuchung_id());
			i = ps.executeUpdate();
			System.out.println("ES wurde(n) " + i + " Datens�tze aktualisiert");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Buchung findBuchung(int Buchungid) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "select * from Buchung where buchung_id = ?";
		Buchung b = null;
		try {
			ps = getConnection().prepareStatement(query);
			ps.setInt(1, Buchungid);

			rs = ps.executeQuery();

			if (rs.next()) {
				b = new Buchung();
				b.setBuchung_id(rs.getInt("BUCHUNG_ID"));
				b.setB_id(rs.getInt("B_ID"));
				b.setAbschnitts_id(rs.getInt("ABSCHNITTS_ID"));
				b.setKategorie_id(rs.getInt("KATEGORIE_ID"));
				b.setKennzeichen(rs.getString("KENNZEICHEN"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	@Override
	public Buchung findBuchungByKennzeichenAndAbschnitt(String kennzeichen,int abschnittsID) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM Buchung WHERE kennzeichen = ? AND ABSCHNITTS_ID = ?";
		Buchung b = null;
		System.err.println("Buchung find");
		try {
			ps = getConnection().prepareStatement(query);
			ps.setString(1, kennzeichen);
			ps.setInt(2, abschnittsID);
			
			rs = ps.executeQuery();

			if (rs.next()) {
				b = new Buchung();
				b.setBuchung_id(rs.getInt("BUCHUNG_ID"));
				b.setB_id(rs.getInt("B_ID"));
				b.setAbschnitts_id(rs.getInt("ABSCHNITTS_ID"));
				b.setKategorie_id(rs.getInt("KATEGORIE_ID"));
				b.setKennzeichen(rs.getString("KENNZEICHEN"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	@Override
	public Buchung createBuchung(int Buchungsnummer) {
		Buchung b = new Buchung();
		b.setBuchung_id(1111);
		b.setB_id(1);
		b.setKennzeichen("B CV 8890");
		b.setAbschnitts_id(1200);
		return b;
	}

}
