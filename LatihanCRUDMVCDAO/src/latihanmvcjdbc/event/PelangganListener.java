/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcjdbc.event;

import latihanmvcjdbc.entity.Pelanggan;
import latihanmvcjdbc.model.PelangganModel;

/**
 NAMA : ALBERT AFRIADI SIGIRO
 NIM : 10116514
 PBO-12
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onUpdate(Pelanggan pelanggan);

    public void onDelete();

}
