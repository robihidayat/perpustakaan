package com.doku.wallet;

import com.doku.wallet.enums.Kategori;
import com.doku.wallet.medias.Medias;

import java.util.Collection;
import java.util.Date;

/**
 * @author robihidayat
 */
public class Library {

    private Collection<Shelf> shelf;
    private Collection<Member> member;

    public Library(Collection<Shelf> shelf, Collection<Member> member) {
        this.shelf = shelf;
        this.member = member;
    }

    public void cariMedia(Medias medias, String judul, Kategori kategori, Date date){
        medias.cari(judul, kategori, date);
    }

    public void memberPinjam(){
        member.stream().map(Member::getName).forEach(System.out::println);
    }


    public Collection<Shelf> getShelf() {
        return shelf;
    }

    public void setShelf(Collection<Shelf> shelf) {
        this.shelf = shelf;
    }

    public Collection<Member> getMember() {
        return member;
    }

    public void setMember(Collection<Member> member) {
        this.member = member;
    }

}
