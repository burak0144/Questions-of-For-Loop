package day16_OdevForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        //kullanicidan pozitif bir rakam girmesini isteyinve girilen rakama gore carpim tablosu olusturun

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi=scanner.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println("");

        }
    }
}
