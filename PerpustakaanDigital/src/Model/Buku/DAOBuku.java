/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Buku;

import Model.Connector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iam
 */
public class DAOBuku implements InterfaceDAO {

    @Override
    public void insert(ModelBuku buku) {
        try {
            String query = "INSERT INTO buku (Judul, Penulis, Tahun, Alur, Bahasa, Orisinalitas, Rating) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, buku.getJudul());
            statement.setString(2, buku.getPenulis());
            statement.setInt(3, buku.getTahun());
            statement.setInt(4, buku.getAlur());
            statement.setInt(5, buku.getBahasa());
            statement.setInt(6, buku.getOrisinalitas());
            statement.setDouble(7, buku.getRating());

            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            System.out.println("Input Failed: " + e.getLocalizedMessage());
        }
    }

    @Override
    public void update(ModelBuku buku) {
        try {
            String query = "UPDATE buku SET Judul=?, Penulis=?, Tahun=?, Alur=?, Bahasa=?, Orisinalitas=?, Rating=? WHERE ID=?";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, buku.getJudul());
            statement.setString(2, buku.getPenulis());
            statement.setInt(3, buku.getTahun());
            statement.setInt(4, buku.getAlur());
            statement.setInt(5, buku.getBahasa());
            statement.setInt(6, buku.getOrisinalitas());
            statement.setDouble(7, buku.getRating());
            statement.setInt(8, buku.getId());

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Input Failed: " + e.getLocalizedMessage());
        }
    }

    @Override
    public void delete(int id) {
        try {
            String query = "DELETE FROM buku WHERE ID=?";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Input Failed: " + e.getLocalizedMessage());
        }
    }

    @Override
    public List<ModelBuku> getAll() {
        List<ModelBuku> listBuku = null;
        try {
            listBuku = new ArrayList<>();
            Statement statement = Connector.Connect().createStatement();

            String query = "SELECT * FROM BUKU";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                ModelBuku buku = new ModelBuku();
                buku.setId(resultSet.getInt("ID"));
                buku.setTahun(resultSet.getInt("Tahun"));
                buku.setJudul(resultSet.getString("Judul"));
                buku.setPenulis(resultSet.getString("Penulis"));
                buku.setAlur(resultSet.getInt("Alur"));
                buku.setBahasa(resultSet.getInt("Bahasa"));
                buku.setOrisinalitas(resultSet.getInt("Orisinalitas"));
                buku.setRating(resultSet.getInt("Rating"));
                
                listBuku.add(buku);
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println("Failed to fetch data: " + e.getLocalizedMessage());
        }
        return listBuku;
    }
}
