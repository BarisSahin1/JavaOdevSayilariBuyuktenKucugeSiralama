package JavaOdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2,sayi3,min=0;
        System.out.println("Siralamak istediginiz 3 degeri giriniz.");


        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();
        sayi3 = scanner.nextInt();

        if(sayi1<sayi2){
            min=sayi1;

            if (sayi1<sayi3){
                min = sayi1;
            }
            else min = sayi3;
        }
        else if (sayi2<sayi1){
            if (sayi2<sayi3){
                min = sayi2;
            }
            else min = sayi3;
        }

        System.out.println("Min deger : " + min);
    }
}
