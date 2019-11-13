package com.doku.wallet;

import com.doku.wallet.medias.Medias;

import java.util.Set;

/**
 * @author robihidayat
 */
public class Shelf<T extends Medias> {

    private Set<T> medias;

    public Set<T> getMedias() {
        return medias;
    }

    public void setMedias(Set<T> medias) {
        this.medias = medias;
    }
}
