package de.htwberlin.dao;

import java.sql.SQLException;
import java.util.List;

import de.htwberlin.object.BuchungsStatus;

public interface BuchungsStatusDao {

    /**
     * JavaDoc generated by ChatGPT
     * Retrieves all BuchungsStatus objects from the database.
     *
     * @return A list of all BuchungsStatus objects.
     * @throws SQLException If an SQL exception occurs.
     */
    List<BuchungsStatus> getAllBuchungsStatus() throws SQLException;

    /**
     * Retrieves a BuchungsStatus object by its ID.
     *
     * @param bId The ID of the BuchungsStatus.
     * @return The BuchungsStatus object.
     * @throws SQLException If an SQL exception occurs.
     */
    BuchungsStatus getBuchungsStatusById(int bId) throws SQLException;

    /**
     * Inserts a new BuchungsStatus object into the database.
     *
     * @param buchungsStatus The BuchungsStatus object to be inserted.
     * @throws SQLException If an SQL exception occurs.
     */
    void insertBuchungsStatus(BuchungsStatus buchungsStatus) throws SQLException;

    /**
     * Updates an existing BuchungsStatus object in the database.
     *
     * @param buchungsStatus The BuchungsStatus object to be updated.
     * @throws SQLException If an SQL exception occurs.
     */
    void updateBuchungsStatus(BuchungsStatus buchungsStatus) throws SQLException;

    /**
     * Deletes a BuchungsStatus object from the database by its ID.
     *
     * @param bId The ID of the BuchungsStatus to be deleted.
     * @throws SQLException If an SQL exception occurs.
     */
    void deleteBuchungsStatus(int bId) throws SQLException;

}