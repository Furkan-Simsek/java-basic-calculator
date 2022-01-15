package com.company;
import java.util.Scanner;

public class Main {

    public static void topla() {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı girin");
        System.out.print(">  ");
        int x = input.nextInt();
        System.out.println("İkinci Sayıyı girin");
        System.out.print(">  ");
        int y = input.nextInt();
        System.out.println(x + y);
        System.out.println("-------------------------");
    }

    public static void cikar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı girin");
        System.out.print(">  ");
        int x = input.nextInt();
        System.out.println("İkinci Sayıyı girin");
        System.out.print(">  ");
        int y = input.nextInt();
        System.out.println(x - y);
        System.out.println("-------------------------");
    }

    public static void carp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı girin");
        System.out.print(">  ");
        int x = input.nextInt();
        System.out.println("İkinci Sayıyı girin");
        System.out.print(">  ");
        int y = input.nextInt();
        System.out.println(x * y);
        System.out.println("-------------------------");
    }

    public static void bol() {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı girin");
        System.out.print(">  ");
        double x = input.nextInt();
        System.out.println("İkinci Sayıyı girin");
        System.out.print(">  ");
        int y = input.nextInt();
        System.out.println(x / y);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        while (a == 0) {

            System.out.println("---Konsol Tabanlı Hesap Makinesi---");
            System.out.println("1.Topla\n2.Çıkar\n3.Çarp\n4.Böl\n5.Çık");
            System.out.print(">  ");
            int soru = input.nextInt();
            if (soru == 1) {
                topla();
            } else if (soru == 2) {
                cikar();
            } else if (soru == 3) {
                carp();
            } else if (soru == 4) {
                bol();
            }else{
                break;
            }
        }
    }
}

