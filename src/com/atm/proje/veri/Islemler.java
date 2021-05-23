package com.atm.proje.veri;

import com.atm.proje.musteriler.BireyselMusteri;
import com.atm.proje.musteriler.KurumsalMusteri;
import com.atm.proje.musteriler.Musteri;

import java.util.*;

public class Islemler {

    private List<Musteri> tumMusteriler() {
        List<Musteri> musteriList = new ArrayList<>();

        musteriList.add(new BireyselMusteri("23112348743", "Arjin AYDEMİR", 1000, "Vişnezade, Dolmabahçe Cd. 34357 Beşiktaş/İstanbul"));
        musteriList.add(new BireyselMusteri("32864325472", "Ali DEMİRBİLEK", 2000, "Avcılar/İstanbul"));
        musteriList.add(new BireyselMusteri("42875466790", "Ayşe ÇALIŞKAN", 3000, "Kayseri"));
        musteriList.add(new KurumsalMusteri("31242389032", "Mehmet TEMİZ", 320000, "Testinium"));
        musteriList.add(new KurumsalMusteri("10983456678", "Ahmet DEMİR", 45000, "A-101"));

        return musteriList;
    }

    private Map<String, Musteri> hesapNoVeMusteriler() {
        Map<String, Musteri> hesapNoVeMusterilerMap = new HashMap<>();
        List<Musteri> musteriList = tumMusteriler();
        hesapNoVeMusterilerMap.put("203465432", musteriList.get(0));
        hesapNoVeMusterilerMap.put("349564321", musteriList.get(1));
        hesapNoVeMusterilerMap.put("875632093", musteriList.get(2));
        hesapNoVeMusterilerMap.put("231234569", musteriList.get(3));
        hesapNoVeMusterilerMap.put("432421245", musteriList.get(4));
        return hesapNoVeMusterilerMap;
    }

    public Musteri kontrolEt(String hesapNo) {
        Map<String, Musteri> hesapNoVeMusterilerMap = hesapNoVeMusteriler();

        for (Map.Entry<String, Musteri> kayit : hesapNoVeMusterilerMap.entrySet()) {
            String musteriHesapNo = kayit.getKey();
            Musteri musteri = kayit.getValue();
            if (musteriHesapNo.equals(hesapNo))
                return musteri;
        }

        return null;
    }

    public double paraYatirma(Scanner scanner, Musteri musteri) {
        System.out.println("Lütfen Yatırılacak Tutarı Giriniz: ");
        return musteri.getHesapBakiyesi() + scanner.nextDouble();
    }

    public double paraCekme(Scanner scanner, Musteri musteri) {
        System.out.println("Lütfen Çekilecek Tutarı Giriniz: ");
        if (musteri.getHesapBakiyesi() < scanner.nextDouble()) {
            System.out.println("Girdiğiniz tutar hesabın bakiyesinden fazladır.");
            System.exit(0);
        }
        return musteri.getHesapBakiyesi() - scanner.nextDouble();
    }

}
