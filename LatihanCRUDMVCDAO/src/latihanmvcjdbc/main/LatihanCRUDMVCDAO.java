/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcjdbc.main;

import java.sql.SQLException;
import java.util.List;
import latihanmvcjdbc.database.KingsBarbershopDatabase;
import latihanmvcjdbc.entity.Pelanggan;
import latihanmvcjdbc.error.PelangganException;
import latihanmvcjdbc.service.PelangganDao;

/**
 NAMA : ALBERT AFRIADI SIGIRO
 NIM : 10116514
 PBO-12
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, PelangganException {

        PelangganDao dao = new KingsBarbershopDatabase().getPelangganDao();
        dao.deletePelanggan(1);
    }

}
