


package ATM_ornek;


public class Hesap {
    
    private String kullanici_adi;
    private String sifre;
    private int bakiye;
    
    
    public Hesap(String kullanici_adi, String sifre, int bakiye){
        this.kullanici_adi = kullanici_adi;
        this.sifre = sifre;
        this.bakiye = bakiye;
    
    }

    
    public void paraCekme(int tutar){
        if (bakiye - tutar < 0) {
            System.out.println("Yeterli bakiyeniz yok");
        }else{
        bakiye -= tutar;
        System.out.println("Yeni bakiyeniz : " + bakiye);
        }
        
    }
    
    public void paraYatirma(int tutar){
        bakiye += tutar;
        System.out.println("Mevcut bakiyeniz : " + bakiye);
    }
    
    public String getKullanici_adi(){
        return kullanici_adi;
    }
    
    public void setKullanici_adi(String kullanici_adi){
        this.kullanici_adi = kullanici_adi;
    }
       
    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    
    
    
}
