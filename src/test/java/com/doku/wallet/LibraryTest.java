package com.doku.wallet;


import com.doku.wallet.enums.Kategori;
import com.doku.wallet.medias.*;
import org.junit.Test;

import java.util.*;


/**
 * @author robihidayat
 */
public class LibraryTest {


    @Test
    void test(){

        Shelf<Medias> rak = new Shelf<>();
        rak.setMedias(setMedia());

        Library library = new Library(shelfCollection(), memberCollectionLibrary() );
        library.cariMedia(new Musik(),"Test",  Kategori.NEW, new Date());


    }


    Collection<Shelf> shelfCollection(){

        Shelf<Medias> rak = new Shelf<>();
        rak.setMedias(setMedia());

        return Collections.singleton(rak);
    }


    Collection<Member> memberCollectionLibrary(){

        Member member = new Member();
        member.setName("Robi");
        member.setMedias(memberCollection());
        member.setNumber(1);

        return Collections.singleton(member);

    }


    Set<Medias> setMedia(){
        Set<Medias>medias = new HashSet<>();
        medias.add(new Buku());
        medias.add(new SuratKabar());
        medias.add(new Video());
        medias.add(new Musik());
        medias.add(new Buku());
        medias.add(new SuratKabar());
        medias.add(new Video());
        medias.add(new SuratKabar());
        medias.add(new Video());
        medias.add(new SuratKabar());
        medias.add(new Video());
        medias.add(new SuratKabar());
        medias.add(new Video());
        medias.add(new SuratKabar());
        medias.add(new Video());
        medias.add(new Musik());
        return medias;
    }


    Collection<Medias> memberCollection(){
        Collection<Medias> medias = new ArrayList<Medias>();
        medias.add(new Video());
        medias.add(new SuratKabar());
        medias.add(new Video());
        medias.add(new SuratKabar());
        medias.add(new Video());
        medias.add(new Musik());
        return medias;

    }

}
