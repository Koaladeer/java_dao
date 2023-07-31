package de.htwberlin.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import de.htwberlin.object.Mautabschnitt;

public class MautabschnittsDaoImpl implements MautabschnittDao {
	private Connection connection;

	public MautabschnittsDaoImpl(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Mautabschnitt> getAllMautabschnitte() throws SQLException {
		List<Mautabschnitt> mautabschnittList = new ArrayList<>();

		String query = "SELECT * FROM MAUTABSCHNITT";
		try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				Mautabschnitt mautabschnitt = extractMautabschnittFromResultSet(rs);
				mautabschnittList.add(mautabschnitt);
			}
		}

		return mautabschnittList;
	}

	@Override
	public Mautabschnitt getMautabschnittById(int abschnittsId) throws SQLException {
		Mautabschnitt re = null;
		String query = "SELECT * FROM MAUTABSCHNITT WHERE ABSCHNITTS_ID = ?";
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setInt(1, abschnittsId);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					re = extractMautabschnittFromResultSet(rs);
				}
			}
		}

		return re;
	}

	private Mautabschnitt extractMautabschnittFromResultSet(ResultSet rs) throws SQLException {
		int abschnittsId = rs.getInt("ABSCHNITTS_ID");
		float laenge = rs.getFloat("LAENGE");
		String startKoordinate = rs.getString("START_KOORDINATE");
		String zielKoordinate = rs.getString("ZIEL_KOORDINATE");
		String name = rs.getString("NAME");
		String abschnittstyp = rs.getString("ABSCHNITTSTYP");

		return new Mautabschnitt(abschnittsId, laenge, startKoordinate, zielKoordinate, name, abschnittstyp);
	}
}
