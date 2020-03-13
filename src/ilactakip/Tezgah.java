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

public class Tezgah {

    public Depo depo = new Depo();  

    public void butunKremleriSil() {

        for (int i = depo.ilaclar.size() - 1; i >= 0; i--) {

            if (depo.ilaclar.get(i) instanceof Krem) {

                depo.ilaclar.remove(i);

            }

        }
        System.out.println("depodaki bütün Kremler başarılı bir şekilde silindi...");

    }

    public void butunTabletleriSil() {

        for (int i = depo.ilaclar.size() - 1; i >= 0; i--) {

            if (depo.ilaclar.get(i) instanceof Tablet) {

                depo.ilaclar.remove(i);

            }

        }
        System.out.println("depodaki bütün Tabletler başarılı bir şekilde silindi...");

    }

    public void butunŞuruplarıSil() {

        for (int i = depo.ilaclar.size() - 1; i >= 0; i--) {

            if (depo.ilaclar.get(i) instanceof Surup) {

                depo.ilaclar.remove(i);

            }

        }
        System.out.println("depodaki bütün Şuruplar başarılı bir şekilde silindi...");

    }

    public void ilacEkle(String ilacIsim) {

        depo.ilaclar.add(new Ilac(ilacIsim));
        System.out.println("depoya " + ilacIsim + " isimli ilaç eklendi...");

    }

    public void ilacEkle(String ilacIsim, int kacAdet) {
        if (kacAdet <= 0) {
            System.out.println("geçersiz adet girdiniz");
        } else {
            for (int i = 0; i < kacAdet; i++) {

                depo.ilaclar.add(new Ilac(ilacIsim));

            }
            System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli ilaç eklendi...");
        }
    }

    public void ilacEkle(String ilacIsim, String kategori) {

        depo.ilaclar.add(new Ilac(ilacIsim, kategori));

        System.out.println("depoya  " + ilacIsim + " isimli ilaç eklendi...");

    }

    public void ilacEkle(String ilacIsim, String kategori, int kacAdet) {
        if (kacAdet <= 0) {
            System.out.println("geçersiz adet girdiniz");
        } else {
            for (int i = 0; i < kacAdet; i++) {

                depo.ilaclar.add(new Ilac(ilacIsim, kategori));

            }
            System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli ilaç eklendi... kategorisi: " + kategori);

        }
    }

    public void ilacEkle(String ilacIsim, String kategori, String ilacHakkindaBilgi, int kacAdet) {
        if (kacAdet <= 0) {
            System.out.println("geçersiz adet girdiniz");
        } else {
            for (int i = 0; i < kacAdet; i++) {

                depo.ilaclar.add(new Ilac(ilacIsim, kategori, ilacHakkindaBilgi));

            }
            System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli ilaç eklendi... kategorisi: " + kategori);
        }
    }

    public void ilacSil(String ilacIsmi) {
        boolean kontrol = true;
        for (int i = 0; i < depo.ilaclar.size(); i++) {

            if (depo.ilaclar.get(i).ilacIsim.equals(ilacIsmi)) {
                kontrol = false;
                depo.ilaclar.remove(i);
                break;

            }

        }
        if (kontrol) {

            System.out.println("Böyle bir ilaç bulunmuyor!!!");
        } else {
            System.out.println(ilacIsmi + " isimli ilaç başarılı bir şekilde silindi...");
        }
    }

    public void ilacSil(String ilacIsmi, int kacAdet) {
        if (kacAdet <= 0) {
            System.out.println("geçersiz adet girdiniz!!!");
        } else {

            boolean kontrol = true;
            for (int i = depo.ilaclar.size() - 1; i >= 0; i--) {

                if (kacAdet > 0) {

                    if (depo.ilaclar.get(i).ilacIsim.equals(ilacIsmi)) {
                        kacAdet--;
                        depo.ilaclar.remove(i);
                        kontrol = false;

                    }

                }

            }
            if (kontrol) {
                System.out.println("Böyle bir ilaç bulunmuyor!!!");
            } else {
                System.out.println(ilacIsmi + " isimli ilaç başarılı bir şekilde silindi...");
            }
        }
    }

    public void KategoriSil(String kategori) {

        boolean kontrol = true;
        for (int i = depo.ilaclar.size() - 1; i >= 0; i--) {

            if (depo.ilaclar.get(i).ilacKatogori.equals(kategori)) {
                kontrol = false;
                depo.ilaclar.remove(i);

            }

        }

        if (kontrol) {

            System.out.println("Böyle bir kategori bulunmuyor!!!");
        } else {
            System.out.println(kategori + " isimli kategori başarılı bir şekilde silindi...");
        }

    }

    public void ilacHakkindaBilgiEkle(String ilacIsmi, String ilacHakkindaBilgi) {

        boolean kontrol = true;
        for (int i = depo.ilaclar.size() - 1; i >= 0; i--) {

            if (depo.ilaclar.get(i).ilacIsim.equals(ilacIsmi)) {
                kontrol = false;
                depo.ilaclar.get(i).ilacHakkindaBilgi = ilacHakkindaBilgi;

            }

        }

        if (kontrol) {

            System.out.println("Böyle bir ilac bulunmuyor!!!");
        } else {
            System.out.println(ilacIsmi + " isimli ilac hakkındaki bilgi yenilendi...");
        }

    }

    //--------------------------------------şurup-------------------------------------------------------------------
    public void şurupEkle(String ilacIsim) {

        depo.ilaclar.add(new Surup(ilacIsim));
        System.out.println("depoya " + ilacIsim + " isimli şurup eklendi...");

    }

    public void şurupEkle(String ilacIsim, int kacAdet) {
        if(kacAdet<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Surup(ilacIsim));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli şurup eklendi...");
        }
    }

    public void şurupEkle(String ilacIsim, String kategori, int kacAdet) {
        if(kacAdet<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Surup(ilacIsim, kategori));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli şurup eklendi...");
        }
    }

    public void şurupEkle(String ilacIsim, String kategori, String ilacHakkindaBilgi, int kacAdet) {
        if(kacAdet<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Surup(ilacIsim, kategori, ilacHakkindaBilgi));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli şurup eklendi...");
        }
    }

    public void şurupEkle(String ilacIsim, String kategori, String ilacHakkindaBilgi, int kacAdet, int miligram) {
        if(kacAdet<=0&&miligram<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Surup(ilacIsim, kategori, ilacHakkindaBilgi, miligram));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli şurup eklendi...");
        }
    }

    private boolean yasakliKelimeVarMi(Surup şurup, String[] yasakliKelime) {

        for (int i = 0; i < yasakliKelime.length; i++) {

            if (şurup.ilacIsim.equals(yasakliKelime[i])) {

                return true;

            }

        }
        return false;

    }

    //----------------------------------------------Tablet-----------------------------------------------------------
    public void tabletEkle(String ilacIsim) {

        depo.ilaclar.add(new Tablet(ilacIsim));
        System.out.println("depoya " + ilacIsim + " isimli tablet eklendi...");

    }

    public void tabletEkle(String ilacIsim, int kacAdet) {
        if(kacAdet<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Tablet(ilacIsim));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli tablet eklendi...");
        }
    }

    public void tabletEkle(String ilacIsim, String kategori, int kacAdet) {
        if(kacAdet<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Tablet(ilacIsim, kategori));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli tablet eklendi...");
        }
    }

    public void tabletEkle(String ilacIsim, String kategori, String ilacHakkindaBilgi, int kacAdet) {
        if(kacAdet<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Tablet(ilacIsim, kategori, ilacHakkindaBilgi));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli şurup eklendi...");
        }
    }

    public void tabletEkle(String ilacIsim, String kategori, String ilacHakkindaBilgi, int kacAdet, int tabletinIcindekiHapSayisi) {
        if(kacAdet<=0&&tabletinIcindekiHapSayisi<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Tablet(ilacIsim, kategori, ilacHakkindaBilgi, tabletinIcindekiHapSayisi));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli tablet eklendi...");
        }
    }

    //--------------------------------------------KREM-------------------------------------------------------------------
    public void kremEkle(String ilacIsim) {

        depo.ilaclar.add(new Krem(ilacIsim));
        System.out.println("depoya " + ilacIsim + " isimli krem eklendi...");

    }

    public void kremEkle(String ilacIsim, int kacAdet) {
        if(kacAdet<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Krem(ilacIsim));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli krem eklendi...");
        }
    }

    public void kremEkle(String ilacIsim, String kategori, int kacAdet) {
        if(kacAdet<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Krem(ilacIsim, kategori));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli krem eklendi...");
        }
    }

    public void kremEkle(String ilacIsim, String kategori, String ilacHakkindaBilgi, int kacAdet) {
        if(kacAdet<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Krem(ilacIsim, kategori, ilacHakkindaBilgi));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli krem eklendi...");
        }
    }

    public void kremEkle(String ilacIsim, String kategori, String ilacHakkindaBilgi, int kacAdet, String tür) {
        if(kacAdet<=0){
            System.out.println("geçersiz adet girdiniz");
        }else{
        for (int i = 0; i < kacAdet; i++) {

            depo.ilaclar.add(new Krem(ilacIsim, kategori, ilacHakkindaBilgi, tür));

        }
        System.out.println("depoya " + kacAdet + " tane " + ilacIsim + " isimli krem eklendi...");
        }
    }

    private boolean yasakliKelimeVarMi(Krem krem, String[] yasakliKelime) {

        for (int i = 0; i < yasakliKelime.length; i++) {

            if (krem.ilacIsim.equals(yasakliKelime[i])) {

                return true;

            }

        }
        return false;

    }

    //---------------------------------------------------------------------------------------------------------------
    public void ilacHakkindaDetayliBilgi(String ilacIsmi) {
        boolean kontrol = true;
        for (Ilac ilac : depo.ilaclar) {

            if (ilac.ilacIsim.equals(ilacIsmi)) {
                kontrol = false;
                System.out.println("-------------------------------------------------");
                System.out.println("ilacın ismi: " + ilac.ilacIsim);
                System.out.println("ilacin kategorisi: " + ilac.ilacKatogori);
                System.out.println("ilac hakkında bilgi: " + ilac.ilacHakkindaBilgi);
                if (ilac instanceof Surup) {
                    System.out.println("tür: " + ((Surup) ilac).tür);
                    System.out.println("ilaca iat milimetre oranı: " + ((Surup) ilac).miliLitre);
                } else if (ilac instanceof Tablet) {
                    System.out.println("tür: " + ((Tablet) ilac).tür);
                    System.out.println("Tabletin içindeki hap sayısı: " + ((Tablet) ilac).tabletinIcindekiHapSayisi);
                } else if (ilac instanceof Krem) {
                    System.out.println("tür: " + ((Krem) ilac).tür);
                    System.out.println("bölge: " + ((Krem) ilac).bolge);
                }
                System.out.println("-------------------------------------------------");
                break;

            }

        }
        if (kontrol) {
            System.out.println("Böyle bir ilaç bulunmuyor!!!");
        }

    }

    public void depoHakkindaBilgi() {
        System.out.println("depoda toplam " + depo.getDepodakiIlacSayisi() + " tane ilaç var...");
    }

   void depodakiŞuruplarıGöster(){
        depo.şuruplarıGöster();
    }
}