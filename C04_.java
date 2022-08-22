package day16_OdevForLoop;

import java.util.Scanner;

public class C04_ {
    public static void main(String[] args) {
        //kullanicidan 100'den kücük tam sayi isteyin.1'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 100 den kücük tam sayi giriniz");
        int tamsayi = scanner.nextInt();
        for (int i = 1; i <= tamsayi; i++) {
            if (tamsayi < 1 || tamsayi > 100) {
                System.out.println("gecerli bir tam sayi giriniz");
            } else if (i % 3 == 0) {
                System.out.print(i+" ");
            }


            }

        }
    }






