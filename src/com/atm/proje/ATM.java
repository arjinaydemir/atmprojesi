package com.atm.proje;

import com.atm.proje.musteriler.Musteri;
import com.atm.proje.veri.Islemler;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Islemler islemler = new Islemler();

        System.out.println("ATM'ye Hoş Geldiniz.");
        System.out.print("Lütfen Müşteri Numaranızı Giriniz: ");
        String musteriNo = scanner.nextLine();

        Musteri musteri = islemler.kontrolEt(musteriNo);
        if (musteri == null) {
            System.out.println("Bu müşteri numarasına ait kimse bulunamadı.");
            System.exit(0);
        } else {
            System.out.println(musteri);
        }

        System.out.println("\nAşağıdaki seçeneklerden biriniz seçiniz: ");
        System.out.println("1. Para Yatırma");
        System.out.println("2. Para Çekme");
        System.out.println("3. Çıkış\n");
        System.out.print("Seçim (1-2-3): ");

        int secim = scanner.nextInt();
        if (secim > 3) {
            System.out.println("Yanlış bir seçimde bulundunuz.");
            System.exit(0);
        }

        switch (secim) {
            case 1:
                System.out.print("Son Tutar: "+ islemler.paraYatirma(scanner, musteri));
                break;

            case 2:
                System.out.print("Son Tutar: "+ islemler.paraCekme(scanner, musteri));
                break;

            case 3:
                System.out.println("Çıkış işlemi gerçekleşti.");
                System.exit(0);
        }
    }

}