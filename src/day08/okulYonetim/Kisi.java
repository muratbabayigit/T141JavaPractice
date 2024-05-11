package day08.okulYonetim;

public class Kisi {

    //1-Önce private olarak variable oluşturulur
    //2-parametreli constructor oluşturulur[ölen parametresiz const. yeniden oluşturulur]
    //3-getter-setter ayarlanıyor
    //4-toString() bilgiler yazdırılır


    //Ad,Soyad, Tc kimlik No, yaş
    private String ad;
    private String soyad;
    private String tcNumber;
    private int yas;

    public Kisi(String ad, String soyad, String tcNumber, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNumber = tcNumber;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcNumber() {
        return tcNumber;
    }

    public void setTcNumber(String tcNumber) {
        this.tcNumber = tcNumber;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi Bilgisi: \n" +
                "Adı:" + ad +
                "\nSoyadı:" + soyad +
                "\nTCKN:" + tcNumber +
                "\nYaşı:" + yas;
    }
}
