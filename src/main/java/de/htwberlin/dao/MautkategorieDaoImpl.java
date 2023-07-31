package de.htwberlin.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import de.htwberlin.object.Mautkategorie;

public class MautkategorieDaoImpl implements MautkategorieDao {
	private Connection connection;

	/**
	 * Javadoc generated by Chatpgpt Constructs a MautkategorieDaoImpl object with
	 * the specified database connection.
	 * 
	 * @param connection The database connection to be used.
	 */
	public MautkategorieDaoImpl(Connection connection) {
		this.connection = connection;
	}

	/**
	 * Retrieves all Mautkategorie objects from the database.
	 *
	 * @return A list of all Mautkategorie objects.
	 * @throws SQLException If an SQL error occurs.
	 */
	@Override
	public List<Mautkategorie> getAllMautkategorien() throws SQLException {
		List<Mautkategorie> mautkategorieList = new ArrayList<>();

		String query = "SELECT * FROM MAUTKATEGORIE";
		try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				Mautkategorie mautkategorie = extractMautkategorieFromResultSet(rs);
				mautkategorieList.add(mautkategorie);
			}
		}

		return mautkategorieList;
	}

	/**
	 * Retrieves a specific Mautkategorie object from the database based on its
	 * identifier.
	 *
	 * @param kategorieId The identifier of the Mautkategorie object.
	 * @return The Mautkategorie object with the specified identifier, or null if
	 *         not found.
	 * @throws SQLException If an SQL error occurs.
	 */
	@Override
	public Mautkategorie getMautkategorieById(int kategorieId) throws SQLException {
		String query = "SELECT * FROM MAUTKATEGORIE WHERE KATEGORIE_ID = ?";
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setInt(1, kategorieId);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return extractMautkategorieFromResultSet(rs);
				}
			}
		}

		return null;
	}

	/**
	 * Retrieves a specific Mautkategorie object from the database based on its
	 * SsKlId.
	 *
	 * @param ssKlid The SsKlId of the Mautkategorie object.
	 * @return The Mautkategorie object with the specified SsKlId, or null if not
	 *         found.
	 * @throws SQLException If an SQL error occurs.
	 */
	@Override
	public Mautkategorie getMautkategorieBySsKlId(int ssKlid, String achszahl) throws SQLException {
		String query = "SELECT * FROM MAUTKATEGORIE WHERE SSKL_ID = ? AND ACHSZAHL = ?";
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setInt(1, ssKlid);
			stmt.setString(2, achszahl);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return extractMautkategorieFromResultSet(rs);
				}
			}
		}

		return null;
	}

	/**
	 * Extracts a Mautkategorie object from the given ResultSet.
	 *
	 * @param rs The ResultSet containing the Mautkategorie data.
	 * @return The extracted Mautkategorie object.
	 * @throws SQLException If an SQL error occurs.
	 */
	private Mautkategorie extractMautkategorieFromResultSet(ResultSet rs) throws SQLException {
		int kategorieId = rs.getInt("KATEGORIE_ID");
		int ssklId = rs.getInt("SSKL_ID");
		String katBezeichnung = rs.getString("KAT_BEZEICHNUNG");
		String achszahl = rs.getString("ACHSZAHL");
		float mautsatzJeKm = rs.getFloat("MAUTSATZ_JE_KM");

		return new Mautkategorie(kategorieId, ssklId, katBezeichnung, achszahl, mautsatzJeKm);
	}
}
