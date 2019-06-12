


package ATM_ornek;


public class Main {
    
    public static void main(String[] args) {
            ATM atm = new ATM();
            Hesap hesap = new Hesap("Onur Hizlan", "123456", 3500);
            
            atm.calis(hesap);
            System.out.println("Programdan cıkılıyor");
        
    }
        
}
