package day08.okulYonetim;

public class Ogrenci extends Kisi{

        private int ogrenciNo;
        private int sinif;

    public Ogrenci(String ad, String soyad, String tcNumber, int yas, int ogrenciNo, int sinif) {
        super(ad, soyad, tcNumber, yas);
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }

    public Ogrenci(){

    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return   super.toString() +
                "\nÖğrenci No:" + ogrenciNo +
                "\nSınıfı:" + sinif;
    }
}
