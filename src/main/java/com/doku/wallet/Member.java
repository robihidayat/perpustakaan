package com.doku.wallet;

import com.doku.wallet.medias.Medias;

import java.util.Collection;

/**
 * @author robihidayat
 */
public class Member {

    private int number;
    private Collection<Medias> medias;
    private int limit = 5;
    private String name;
    boolean pinjam = false;


    public boolean isPinjam() {
        return pinjam;
    }

    public void setPinjam(boolean pinjam) {
        this.pinjam = pinjam;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Collection<Medias> getMedias() {
        return medias;
    }

    public void setMedias(Collection<Medias> medias) {
        this.medias = medias;
    }

    public int getLimit() {
        return limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
