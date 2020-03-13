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

import java.util.ArrayList;

public class Depo {

    public ArrayList<Ilac> ilaclar = new ArrayList();
    
    
    
    
    public void ilacSayilari(){
        int[] ilacSayilari= {0,0,0,0};// 0:türü bilinmeyen ilac 1:Şurup 2:Krem 3:Tablet
        
        
        for(Ilac ilac:ilaclar){
            
            
            if(ilac instanceof Surup){
                
                ilacSayilari[1]++;
               
                
            }
            else if(ilac instanceof Krem){
                ilacSayilari[2]++;
              
                
            }
            else if(ilac instanceof Tablet){
            
                ilacSayilari[3]++;
            }
            else{
                ilacSayilari[0]++;
            }
            
            
            
        }
        
         
        System.out.println("depoda ki ilac Sayilari: ");
        System.out.println(ilacSayilari[0]+" tane türü bilinmeyen ilac");
        System.out.println(ilacSayilari[1]+" tane şurup");
        System.out.println(ilacSayilari[2]+" tane Krem");
        System.out.println(ilacSayilari[3]+" tane Tablet");
        System.out.println("toplamda : "+(ilacSayilari[0]+ilacSayilari[1]+ilacSayilari[2]+ilacSayilari[3])+" tane ilac var");
        
        
        
        
    }
    
    
    
    

    private boolean yasakliKelimeVarMi(Ilac ilac, String[] yasakliKelime) {

        for (int i = 0; i < yasakliKelime.length; i++) {

            if (ilac.ilacIsim.equals(yasakliKelime[i])) {

                return true;

            }

        }
        return false;

    }

    public void ilaclariGoster() {

        int ilacSayisi;
        String[] ilacIsimleri = new String[ilaclar.size()];
        int depoKontrol=ilaclar.size();
        boolean kontrol = true;

        for (Ilac ilac : ilaclar) {
            kontrol = true;
            ilacSayisi = 0;
            if (!yasakliKelimeVarMi(ilac, ilacIsimleri)) {

                for (int i = 0; i < ilaclar.size(); i++) {

                    if (ilac.ilacIsim.equals(ilaclar.get(i).ilacIsim)) {
                        if (kontrol) {
                            ilacIsimleri[i] = ilac.ilacIsim;
                            kontrol = false;
                        }
                        ilacSayisi++;

                    }

                }

                if (ilac instanceof Surup) {

                    System.out.println("ilacın ismi: " + ilac.ilacIsim + "  kategori: " + ilac.ilacKatogori + "  (" + ilacSayisi + ") tür: "+((Surup) ilac).tür);
                } else if (ilac instanceof Tablet) {
                    System.out.println("ilacın ismi: " + ilac.ilacIsim + "  kategori: " + ilac.ilacKatogori + "  (" + ilacSayisi + ") tür: "+((Tablet) ilac).tür);
                } else if (ilac instanceof Krem) {
                    System.out.println("ilacın ismi: " + ilac.ilacIsim + "  kategori: " + ilac.ilacKatogori + "  (" + ilacSayisi + ") tür: "+((Krem) ilac).tür);
                } else {
                    System.out.println("ilacın ismi: " + ilac.ilacIsim + "  kategori: " + ilac.ilacKatogori + "  (" + ilacSayisi + ") tür: "+ilac.tür);
                }
            }
        }
                
        if(depoKontrol==0){
            System.out.println("depoda hiç ilaç bulunmuyor...");
            
        }

    }

    public void şuruplarıGöster() {
        int şurupSayisi;
        String[] ilacIsimleri = new String[ilaclar.size()];

        boolean kontrol = true;
        for (Ilac ilac : ilaclar) {
            kontrol = true;
            şurupSayisi = 0;
            if (ilac instanceof Surup) {
                if (!yasakliKelimeVarMi(ilac, ilacIsimleri)) {

                    for (int i = 0; i < ilaclar.size(); i++) {

                        if (ilac.ilacIsim.equals(ilaclar.get(i).ilacIsim)) {
                            if (kontrol) {
                                ilacIsimleri[i] = ilac.ilacIsim;
                                kontrol = false;
                            }
                            şurupSayisi++;

                        }

                    }
                    System.out.println("--------------------------------------");
                    System.out.println("ilacın ismi: " + ilac.ilacIsim + "  kategori: " + ilac.ilacKatogori + "  (" + şurupSayisi + ") tür: "+((Surup) ilac).tür);
                    System.out.println("ilacın mililitre: "+((Surup) ilac).miliLitre);
                }
            }
        }
                
        if(kontrol){
            System.out.println("depoda hiç şurup bulunmuyor...");
            
        }

    }

    public void TabletleriGöster() {
        int tabletSayisi;
        String[] ilacIsimleri = new String[ilaclar.size()];
        
        boolean kontrol = true;
        for (Ilac ilac : ilaclar) {
            kontrol=true;
            tabletSayisi = 0;
            if (ilac instanceof Tablet) {
                if (!yasakliKelimeVarMi(ilac, ilacIsimleri)) {

                    for (int i = 0; i < ilaclar.size(); i++) {

                        if (ilac.ilacIsim.equals(ilaclar.get(i).ilacIsim)) {
                            if (kontrol) {
                                ilacIsimleri[i] = ilac.ilacIsim;
                                kontrol = false;
                            }
                            tabletSayisi++;

                        }

                    }
                    System.out.println("----------------------------------------------------------");
                    System.out.println("ilacın ismi: " + ilac.ilacIsim + "  kategori: " + ilac.ilacKatogori + "  (" + tabletSayisi + ") tür: "+((Tablet) ilac).tür);
                    System.out.println("ilac hakkında bilgi: "+((Tablet) ilac).ilacHakkindaBilgi);
                    System.out.println("tabletin içindeki hap sayısı: "+((Tablet) ilac).tabletinIcindekiHapSayisi);
                    
                }
            }
        }
        
                
        if(kontrol){
            System.out.println("depoda hiç tablet bulunmuyor...");
            
        }

    }

    public void kremleriGöster() {
        int kremSayisi;
        String[] ilacIsimleri = new String[ilaclar.size()];
       
        boolean kontrol = true;
        for (Ilac ilac : ilaclar) {
            kontrol=true;
            kremSayisi = 0;
            if (ilac instanceof Krem) {
                if (!yasakliKelimeVarMi(ilac, ilacIsimleri)) {

                    for (int i = 0; i < ilaclar.size(); i++) {

                        if (ilac.ilacIsim.equals(ilaclar.get(i).ilacIsim)) {
                            if (kontrol) {
                                ilacIsimleri[i] = ilac.ilacIsim;
                                kontrol = false;
                            }
                            kremSayisi++;

                        }

                    }
                    System.out.println("----------------------------------------------------------");
                    System.out.println("ilacın ismi: " + ilac.ilacIsim + "  kategori: " + ilac.ilacKatogori + "  (" + kremSayisi + ") tür: "+((Krem) ilac).tür);
                    System.out.println("bölge: "+((Krem) ilac).bolge);
                    System.out.println("ilaç hakkında bilgi: "+((Krem) ilac).ilacHakkindaBilgi);
                    
                }
            }
        }
        
        
        if(kontrol){
            System.out.println("depoda hiç krem bulunmuyor...");
            
        }
        

    }

    public int getDepodakiIlacSayisi() {
        return ilaclar.size();
    }

    public ArrayList<Ilac> getIlaclar() {

        return ilaclar;
    }

}