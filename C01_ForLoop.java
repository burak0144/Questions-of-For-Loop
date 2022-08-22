package day16_OdevForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        //kullanicidan pozitif bir sayi girmesini isteyin ve girilen rakama gore asg.sekli cizdirin
        /*
        *
        * *
        * * *
        * * * *
        ---------
        * * * *
        * * *
        * *
        *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunlugunu girin");
        int ucgenKenar=scanner.nextInt();
        for (int i = 1; i <=ucgenKenar ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
        System.out.println("");
        for (int i = 1; i <=ucgenKenar ; i++) {
            for (int j =( ucgenKenar-i+1) ; j >=1 ; j--) {
                System.out.print("* ");

            }System.out.println("");

        }
    }
}
