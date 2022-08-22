package day16_OdevForLoop;

import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("10'dan kücük bir tamsayi girin");
        int sayi=scanner.nextInt();

        faktoryel(sayi);
    }

    public static void faktoryel(int sayi) {
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

