/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilactakip;

/**
 *
 * @author minter
 */

public class Main {

    public static void main(String[] args) {

        Tezgah tezgah = new Tezgah();
        
        tezgah.ilacEkle("koroko");
        tezgah.ilacEkle("prestij","burun boğaz");
        //tezgah.ilacHakkindaBilgiEkle("prestij", "f");
        tezgah.ilacEkle("koroko",7);
        
        //------------------------------------
        
        tezgah.şurupEkle("toro",7);
      
        tezgah.ilacSil("toro", -4);
        tezgah.ilacSil("toro", 7);
                
        tezgah.şurupEkle("as",4);
        tezgah.kremEkle("dd",3);
        tezgah.tabletEkle("afasfasf",55);
        tezgah.depodakiŞuruplarıGöster();
        tezgah.kremEkle("asd");
        tezgah.depo.kremleriGöster();
        tezgah.depo.TabletleriGöster();
        tezgah.depo.ilaclariGoster();
        tezgah.ilacEkle("asd",-10);
        tezgah.depo.ilacSayilari();

    }
}
