package day16_OdevForLoop;

import java.util.Scanner;

public class C09_ {
    public static void main(String[] args) {
        //interview kullanicidan bir String isteyin,Stringin palindrome olup olmadigini kontrol eden bir program yazin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen String birsey girin");
        String str = scanner.nextLine();

        String tersstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersstr += str.substring(i, i + 1);
        }
        if (tersstr.equals(str)){
            System.out.println("girilen String palindrome dur");
        }else {
            System.out.println("girilen String palindrome degildir");
        }
    }
}