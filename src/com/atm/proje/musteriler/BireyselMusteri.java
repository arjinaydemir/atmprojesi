package com.atm.proje.musteriler;

public class BireyselMusteri extends Musteri {

    private String evAdresi;

    public BireyselMusteri() {

    }

    public BireyselMusteri(String tcKimlikNo, String adSoyad, double hesapBakiyesi, String evAdresi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nBankamıza Hoş Geldiniz");
        stringBuilder.append("\nSayın " + getAdSoyad());
        stringBuilder.append("\nBankamızdaki bilgileriniz aşağıdaki gibidir.");
        stringBuilder.append("\nTc Kimlik No: " + getTcKimlikNo());
        stringBuilder.append("\nHesap Bakiyesi: " + getHesapBakiyesi());
        stringBuilder.append("\nEv Adresi: " + evAdresi);
        return stringBuilder.toString();
    }

}
