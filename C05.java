package day16_OdevForLoop;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        // kullanicidan 100 den kücük bir tam sayi isteyin.1'den baslayarak girilen sayiya kadar 3'ün veya 5'in
        //kati olan sayilari yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 100 den kücük tam sayi giriniz");
        int tamsayi = scanner.nextInt();
        for (int i = 1; i <= tamsayi; i++) {
        if (i % 3 == 0) {
            System.out.print( i +" ");
            }  else if (i % 5 == 0) {


                System.out.print(i +" ");
            }

        }
    } }