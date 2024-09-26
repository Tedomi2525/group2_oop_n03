package com.finalproj.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.finalproj.model.MuonTra;

public class MuonTraDao {

    public List<MuonTra> getAllSV() {
        List<MuonTra> muonTras = new ArrayList<>();
        String sql = "SELECT * FROM MuonTra";

        try (Connection connection = JDBCConnection.getJDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
                MuonTra muonTra = new MuonTra();
                muonTra.setMaMuon(rs.getString("MaMuon"));
                muonTra.setMaSV(rs.getInt("MaSV"));
                muonTra.setNameSV(rs.getString("NameSV"));
                muonTra.setMaSach(rs.getString("MaSach"));

                LocalDate ngayMuon = rs.getDate("NgayMuon") != null ? rs.getDate("NgayMuon").toLocalDate() : null;
                muonTra.setNgayMuon(ngayMuon);

                LocalDate ngayTra = rs.getDate("NgayTra") != null ? rs.getDate("NgayTra").toLocalDate() : null;
                muonTra.setNgayTra(ngayTra);

                muonTras.add(muonTra);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return muonTras;
    }
}
