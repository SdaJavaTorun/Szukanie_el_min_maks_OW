package com.tab.szukanie_el_min_maks;

public class Main {

    public static void main(String[] args) {

        int a[] = {4,6,2,1,3};
        int wynik = a[1];//inicjujemy wynik
        int max=a[1];
        //przechodzimy po kolejnych elementach petli
        for (int i=0; i<a.length; i++) {

            if (a[i] < wynik) {

                wynik = a[i];

            }
        }
        System.out.println("Minimalna wart. to "+wynik);

        for (int i=0; i<a.length; i++){

          if(a[i] > max) {

              max = a[i];
          }
        }
        System.out.println("Maksymalna wart. to "+max);
    }
}
