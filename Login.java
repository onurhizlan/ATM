


package ATM_ornek;

import java.util.Scanner;


public class Login {

        public boolean login(Hesap hesap){
            
            Scanner input = new Scanner(System.in);
            String kullanici_adi, sifre;
            System.out.println("Lutfen kullanici adinizi giriniz : ");
            kullanici_adi = input.nextLine();
            System.out.println("Lutfen sifrenizi giriniz : ");
            sifre = input.nextLine();
            
            if (kullanici_adi.equals(hesap.getKullanici_adi()) && sifre.equals(hesap.getSifre())) {
                 return true;
            }else{
                 return false;
            }
            
         
            }
                
            }
        
