package com.atm.proje.musteriler;

public class KurumsalMusteri extends Musteri {

    private String sirketAdi;

    public KurumsalMusteri(String tcKimlikNo, String adSoyad, double hesapBakiyesi, String sirketAdi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nBankamıza Hoş Geldiniz");
        stringBuilder.append("\nSayın " + getAdSoyad());
        stringBuilder.append("\nBankamızdaki bilgileriniz aşağıdaki gibidir.");
        stringBuilder.append("\nŞirket Adı: " + sirketAdi);
        stringBuilder.append("\nTc Kimlik No: " + getTcKimlikNo());
        stringBuilder.append("\nHesap Bakiyesi: " + getHesapBakiyesi());
        return stringBuilder.toString();
    }

}
