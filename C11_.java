package day16_OdevForLoop;

import java.util.Scanner;

public class C11_ {
    public static void main(String[] args) {
        //Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
        Scanner scanner=new Scanner(System.in);
        System.out.println("10'dan kücük bir tamsayi girin");
        int sayi=scanner.nextInt();
        int faktoryel=1;
        if(sayi<0||sayi>=10){
            System.out.println("lütfen gecerli sayi girin");
        }else if(sayi==0){
            System.out.println("0!=1");
        }else {
            for (int i = sayi; i >=1 ; i--) {
                faktoryel*=i;
            }
            System.out.println(faktoryel);
        }


    }
}
