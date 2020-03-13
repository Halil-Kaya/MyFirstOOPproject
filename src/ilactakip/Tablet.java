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

public class Tablet extends Ilac {

    public int tabletinIcindekiHapSayisi;

    public Tablet(String ilacIsim) {

        super(ilacIsim);
        this.tür="tablet";
    }

    public Tablet(String ilacIsim, String ilacKatogori) {

        super(ilacIsim, ilacKatogori);
        this.tür="tablet";

    }

    public Tablet(String ilacIsim, String ilacKatogori, String ilacHakkindaBilgi) {
        super(ilacIsim, ilacKatogori, ilacHakkindaBilgi);
        this.tür="tablet";
    }

    public Tablet(String ilacIsim, String ilacKatogori, String ilacHakkindaBilgi, int tabletinIcındekiHapSayisi) {
        super(ilacIsim, ilacKatogori, ilacHakkindaBilgi);
        this.tür="tablet";
        this.tabletinIcindekiHapSayisi =tabletinIcındekiHapSayisi;
    }
    
        
    public void ilackısaBilgi(){
        System.out.println("isim: "+ilacIsim);
        System.out.println("kategori: "+ilacKatogori);
        System.out.println("tür: "+tür);
        System.out.println("tabletin içindeki hap sayısı: "+tabletinIcindekiHapSayisi);
        
    }
    
    
    
    
    public void setTabletinIcındekiHapSayisi(int tabletIcindekiHapSayisi){
        
        this.tabletinIcindekiHapSayisi=tabletIcindekiHapSayisi;
    
    }
    
    public int getTabletIcindekiHapSayisi(){
        return tabletinIcindekiHapSayisi;
    }
    
}