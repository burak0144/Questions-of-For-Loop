package day16_OdevForLoop;

public class C02_ {
    public static void main(String[] args) {
        //10 ile 30 arasindaki(dahil)sayilari aralarinda virgül olarak ayni satirda yazdirin
        for (int i = 10; i <=30 ; i++) {
           if(i<=29) {
               System.out.print(i + ",");
           }else {
               System.out.print(i);
           }

        }
    }
}
