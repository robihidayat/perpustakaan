package com.doku.wallet.medias;

import com.doku.wallet.enums.Kategori;

import java.util.Date;

/**
 * @author robihidayat
 */
public interface Medias {

    void cari(String judul, Kategori kategori, Date date);

}
