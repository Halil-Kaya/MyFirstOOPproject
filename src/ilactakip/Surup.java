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

public class Surup extends Ilac {

    public int miliLitre;

    public Surup(String ilacIsim) {
        super(ilacIsim);
        this.tür="Şurup";
    }

    public Surup(String ilacIsim, String ilacKatogori) {
        super(ilacIsim, ilacKatogori);
        this.tür="Şurup";

    }

    public Surup(String ilacIsim, String ilacKatogori, String ilacHakkindaBilgi) {
        super(ilacIsim, ilacKatogori, ilacHakkindaBilgi);
        this.tür="Şurup";

    }

    public Surup(String ilacIsim, String ilacKatogori, String ilacHakkindaBilgi, int miliLitre) {
        super(ilacIsim, ilacKatogori, ilacHakkindaBilgi);
        this.tür="Şurup";
        this.miliLitre = miliLitre;
    }
    
        
    public void ilackısaBilgi(){
        System.out.println("isim: "+ilacIsim);
        System.out.println("kategori: "+ilacKatogori);
        System.out.println("tür: "+tür);
        System.out.println("mililitre: "+miliLitre);
        
    }
    
    public void setMiliLitre(int miliLitre){
    this.miliLitre=miliLitre;
    }
    public int getMiliLitre(){
        return miliLitre;
    }
    
    

}
