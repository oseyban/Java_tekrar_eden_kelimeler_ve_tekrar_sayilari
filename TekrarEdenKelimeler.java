package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TekrarEdenKelimeler {

    public static void main(String[] args) {
        String cumle = "merhaba dünya merhaba java dünya dünya java";

        Map<String, Integer> kelimeSayilari = new HashMap<>();

        Arrays.stream(cumle.split(" "))
                .forEach(kelime -> kelimeSayilari.merge(kelime, 1, Integer::sum));

        kelimeSayilari.forEach((kelime, sayi) -> {
            if (sayi > 1) {
                System.out.println("Kelime: " + kelime + ", Tekrar Sayısı: " + sayi);
            }
        });
    }
}