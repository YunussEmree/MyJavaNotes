import matematik.*; //matematik paketindeki her şeyi importla

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int a = scanner.nextInt();
        System.out.println("Girilen sayı: " + a);

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(1,2));
    }
}