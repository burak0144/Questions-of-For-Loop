package day16_OdevForLoop;

import java.util.Scanner;

public class C06_ {
    public static void main(String[] args) {
        //interview sorusu:kullanicidan 100den kücük bir tam sayi isteyin.1'den baslayarak girilen sayiya kadar
        //tüm sayilari yazdirin.Ancak
        //-sayi 3 ün kati ise sayi yerine "Java"yazdirin
        //-sayi 5 in kati ise sayi yerine "Guzeldir"yazdirin
        //-sayi hem 3 ün kati hem de  5 in kati ise sayi yerine "Java Guzeldir"yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 100 den kücük tam sayi giriniz");
        int tamsayi = scanner.nextInt();
        for (int i = 1; i <= tamsayi; i++) {
            if(i%3==0 && i%5==0){
                System.out.print("Java Guzeldir "+"\n");
            }else if(i%3==0){
                System.out.print("Java(3) ");
            }else if(i%5==0){
                System.out.print("Guzeldir(5) ");
            }else {
                System.out.print(i+ " ");
            }
        }
    }
}
