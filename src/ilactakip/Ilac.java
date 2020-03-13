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

public class Ilac {

    public String ilacIsim;
    public String ilacHakkindaBilgi;
    public String ilacKatogori;
    public String tür="bilinmiyor";
    public Ilac(String ilacIsim) {

        this.ilacIsim = ilacIsim;
        ilacHakkindaBilgi = "ilaç Hakkında bir bilgi yok...";
        ilacKatogori = "bilinmiyor...";
    }

    public Ilac(String ilacIsim, String ilacKatogori) {

        this.ilacIsim = ilacIsim;
        this.ilacKatogori = ilacKatogori;
        ilacHakkindaBilgi = "ilaç Hakkında bir bilgi yok...";

    }

    public Ilac(String ilacIsim, String ilacKatogori, String ilacHakkindaBilgi) {
        this.ilacIsim = ilacIsim;
        this.ilacKatogori = ilacKatogori;
        this.ilacHakkindaBilgi = ilacHakkindaBilgi;
    }
    
    public void ilackısaBilgi(){
        System.out.println("isim: "+ilacIsim);
        System.out.println("kategori: "+ilacKatogori);
        System.out.println("tür: "+tür);
        
        
    }
    
    
    
    public void setIlacIsmi(String ilacIsmi){
        this.ilacIsim=ilacIsmi;
    }
    public String getIlacIsmi(){
    return ilacIsim;
    }
    public void setIlacHakkindaBilgi(String ilacHakkindaBilgi){
    this.ilacHakkindaBilgi=ilacHakkindaBilgi;
    }
    public String getIlacHakkindaBilgi(){
        return ilacHakkindaBilgi;
    }
    public void setIlacKatogori(String ilacKatogori){
        this.ilacKatogori=ilacKatogori;
    }
    public String getIlacKatogori(){
        return ilacKatogori;
    }

}