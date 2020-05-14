
package ue_uygulama;

import java.util.Scanner;

public class Araç {
    
    private int en_fazla_hız;
    
    public void hız_en(int h)
    {en_fazla_hız=h*10;}
    
    void karada_git(){

        System.out.println("Karada Gider");
    } 
    void suda_git(){
        
        System.out.println("Suda Gider");
    }
    void havada_git(){
     
        System.out.println("Havada Gider");
    }
    void iki_teker(){
    
        System.out.println("2 Tekerlidir");
    }
    void dört_teker() {
    
        System.out.println("4 Tekerlidir");
    }
    void üç_teker() {
    
        System.out.println("3 Tekerlidir");
    }
    void altı_teker() {
    
        System.out.println("6 Tekerlidir");
    }
    void hızlı() {
    
        System.out.println("Hızlı Bir Araçtır");
    }
    void orta_hız() {
   
        System.out.println("Orta Hızlıdır");
    }
   
    void yavaş_hız() {
    
        System.out.println("Yavaştır");
    }
   class otomobil extends Araç {
       

   }
   class kamyon extends Araç {
   
   }
   class otobüs extends Araç {

   }
   class tekne extends Araç {

   }
   class bisiklet extends Araç {

   }
   class uçak extends Araç {

   }
   class motosiklet extends Araç {

   }

    public static void main(String[] args) {
        
        Araç kamyon = new Araç();
        kamyon.hız_en(10);
        int hız_kamyon = kamyon.en_fazla_hız;

        Araç otomobil = new Araç();
        otomobil.hız_en(19);
        int hız_otomobil = otomobil.en_fazla_hız;
        
        Araç otobüs = new Araç();
        otobüs.hız_en(12);
        int hız_otobüs = otobüs.en_fazla_hız;
        
        Araç tekne = new Araç();
        tekne.hız_en(5);
        int hız_tekne = tekne.en_fazla_hız;
        
        Araç bisiklet = new Araç();
        bisiklet.hız_en(2);
        int hız_bisiklet = bisiklet.en_fazla_hız;
  
        Araç uçak = new Araç();
        uçak.hız_en(120);
        int hız_uçak = uçak.en_fazla_hız;

        Araç motosiklet = new Araç();
        motosiklet.hız_en(18);
        int hız_motosiklet = motosiklet.en_fazla_hız;

        
        Scanner sc = new Scanner (System.in);
        System.out.println("kamyon(1)\t otomobil(2) \t otobüs(3)\t tekne(4)\t bisiklet(5)\t uçak(6)\t motosiklet(7)\t");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Lütfen Bilgi Almak İstediğiniz Araç Numarasını Giriniz");
        int bilgi=sc.nextInt();
        
        if(bilgi>=7){
         System.err.println("Yanlış Araç Numarası Girdiniz! Lütfen Tekrar Deneyiniz.");
         bilgi=sc.nextInt();
            
        }
        

        
        
        
        if(bilgi==1){
               
            System.out.println("Kamyonun Maksimum Hızı= "+hız_kamyon+" km/s");
                  
                   kamyon.karada_git();
                   kamyon.altı_teker();
                   kamyon.orta_hız();

        }
        else if(bilgi==2) {
            
            System.out.println("Otomobilin Maximum Hızı: "+hız_otomobil+" km/s");
                    
                    otomobil.dört_teker();
                    otomobil.hızlı();
                    otomobil.karada_git();
        }
        else if(bilgi==3) {

            System.out.println("Otobüsün Maximum Hızı: "+hız_otobüs+" km/s");
                    
                    otobüs.dört_teker();
                    otobüs.karada_git();
                    otobüs.orta_hız();
        }
        else if(bilgi==4){

            System.out.println("Teknenin Maximum Hızı: "+hız_tekne+" km/s");
                    
                    tekne.suda_git();
                    tekne.orta_hız();
        }
        else if(bilgi==5) {

            System.out.println("Bisikletin Maximum Hızı: "+hız_bisiklet+" km/s");
                    
                    bisiklet.iki_teker();
                    bisiklet.karada_git();
                    bisiklet.yavaş_hız();
        }
        else if(bilgi==6) {

            System.out.println("Uçağın Maximum Hızı: "+hız_uçak+" km/s");
                    
                    uçak.üç_teker();
                    uçak.havada_git();
                    uçak.hızlı();
        }
        else if(bilgi==7) {

            System.out.println("Motosikletin Maximum Hızı: "+hız_motosiklet+" km/s");
                    
                    motosiklet.karada_git();
                    motosiklet.iki_teker();
                    motosiklet.hızlı();
        }
        
        
        

    }
    
}
