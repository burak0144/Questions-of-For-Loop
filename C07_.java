package day16_OdevForLoop;

import java.util.Scanner;

public class C07_ {
    public static void main(String[] args) {
        //interview
        //kullanicidan bir String isteyin ve Stringi tersten yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen String birsey girin");
        String str=scanner.nextLine();
        String tersstr=""; //berke

        for (int i =str.length()-1; i >=0 ; i--) {
            tersstr+=str.substring(i,i+1);
        }
        System.out.println(tersstr);

    }
}
