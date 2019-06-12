


package ATM_ornek;

import java.util.Scanner;


public class ATM {
 
    public void calis(Hesap hesap){
        
        Login login = new Login();
        Scanner input = new Scanner(System.in);
        System.out.println("Bankamıza hosgeldiniz");
        System.out.println("************************************");
        
        int giris_hakki = 3;
        while(true){
            if (login.login(hesap)) {
                System.out.println("Giriş Başarılı");
                break;
            }else{
                System.out.println("Hatalı giriş");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkı" + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Grişi hakkınız bitti");
                return;
            }
        }
           System.out.println("*******************************");
           String islemler = "1.    Bakiye Görüntüleme\n"
                           + "2.    Para Yatırma\n"
                           + "3.    Para Çekme\n"
                           + "4.    Çıkış";
           System.out.println(islemler);
           System.out.println("*******************************");
           
           while(true){
               System.out.println("İşlemi seçiniz");
               String islem = input.nextLine();
               
               if (islem.equals("4")) {
                   System.out.println("Programdan çıkılıyor");
                   break;
               }else if(islem.equals("1")){
                   System.out.println("Bakiyeniz: "+ hesap.getBakiye());
               
               }else if(islem.equals("2")){
                   
                   System.out.println("Mevcut Bakiyeniz: " + hesap.getBakiye());
                   System.out.println("Yatırmak istediginiz tutarı giriniz : ");
                   int tutar = input.nextInt();
                   input.nextLine();
                   
                   hesap.paraYatirma(tutar);
                   System.out.println("Güncel Bakiyeniz: "+ hesap.getBakiye());
               }else if(islem.equals("3")){
                   
                   System.out.println("Mevcut Bakiyeniz: " + hesap.getBakiye());
                   System.out.println("Çekmek istediğiniz tutari giriniz : ");
                   int tutar = input.nextInt();
                   input.nextLine();
                   hesap.paraCekme(tutar);
                   System.out.println("Güncel Bakiyeniz: " + hesap.getBakiye());
               }else {
                   System.out.println("Geçersiz işlem");
               }
           
           }
           
    }
        
}
