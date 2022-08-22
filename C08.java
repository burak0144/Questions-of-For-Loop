package day16_OdevForLoop;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        //interview kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen String birsey girin");
        String str=scanner.nextLine();
        tersstr(str);
    } public static void tersstr(String str) {
        String tersstr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersstr+=str.substring(i,i+1);

        }System.out.println(tersstr);

    }
}
