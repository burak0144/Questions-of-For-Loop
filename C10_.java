package day16_OdevForLoop;

import java.util.Scanner;

public class C10_ {
    public static void main(String[] args) {
        //kullanicidan iki sayi isteyin.Girilen sayilar ve aralarindaki tüm sayilari toplayip
        //sonucu yazdiran bir program yaziniz
        Scanner scanner=new Scanner(System.in);
        System.out.println("iki sayi girin");
        int sayi1=scanner.nextInt(),
                sayi2=scanner.nextInt();
        int toplam=0;
         if (sayi1>=sayi2) {
             for (double i = sayi2; i <= sayi1; i++) {
                 toplam += i;
             }
         }
         else {       //sayi2>sayi1
             for (int i = sayi2; i >=sayi1 ; i--) {
                 toplam+=i;
         }
    }System.out.println(toplam);
}}
