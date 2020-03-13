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

public class Krem extends Ilac {

    public String bolge; // bölge yüz,ayak,el

    
    
    
    
    
    public Krem(String ilacIsim) {

        super(ilacIsim);
    }

    public Krem(String ilacIsim, String ilacKatogori) {

        super(ilacIsim, ilacKatogori);
        this.tür="Krem";

    }

    public Krem(String ilacIsim, String ilacKatogori, String ilacHakkindaBilgi) {
        super(ilacIsim, ilacKatogori, ilacHakkindaBilgi);
        this.tür="Krem";
    }

    public Krem(String ilacIsim, String ilacKatogori, String ilacHakkindaBilgi, String bolge) {
        super(ilacIsim, ilacKatogori, ilacHakkindaBilgi);
        this.tür="Krem";
        this.bolge = bolge;
    }
    
    
        
    public void ilackısaBilgi(){
        System.out.println("isim: "+ilacIsim);
        System.out.println("kategori: "+ilacKatogori);
        System.out.println("tür: "+tür);
        System.out.println("bölge: "+bolge);
        
        
    }
    
    
    
    
    
    public void setBolge(String bolge){
    this.bolge=bolge;
    }
    public String getBolge(){
        return bolge;
    }

}