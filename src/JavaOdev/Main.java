package JavaOdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2,sayi3,maks=0;
        System.out.println("Siralamak istediginiz 3 degeri giriniz.");


        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();
        sayi3 = scanner.nextInt();

        if(sayi1>sayi2){
            maks=sayi1;

            if (sayi1>sayi3){
                maks = sayi1;
            }
            else maks = sayi3;
        }
        else if (sayi2>sayi1){
            if (sayi2>sayi3){
                maks = sayi2;
            }
            else maks = sayi3;
        }

        System.out.println("Maks deger : " + maks);
    }
}
