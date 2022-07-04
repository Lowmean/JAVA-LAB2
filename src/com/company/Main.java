package com.company;

import java.util.Scanner;

public class Main {
    static Main[] abc = new Main[4];
    String firma_name;
    String firma_address;
    String firma_telephone;
    String firma_email;

    public Main(String firma_name, String firma_address, String firma_telephone, String firma_email) {
        this.firma_name = firma_name;
        this.firma_address = firma_address;
        this.firma_telephone = firma_telephone;
        this.firma_email = firma_email;
    }


    public static void main(String[] args) {
        Scanner firma = new Scanner(System.in);
        System.out.println("Введите название фирмы:");
        String firma_name = firma.nextLine();
        abc[0] = new Main("Mcdonalds", "Moscow", "89111298466", "mcdonalds@gmail.com");
        abc[1] = new Main("Mcdonalds", "Moscow", "89111298466", "mcdonalds@gmail.com");
        abc[2] = new Main("Mcdonalds", "Moscow", "89111298466", "mcdonalds@gmail.com");
        abc[3] = new Main("Mcdonalds", "Moscow", "89111298466", "mcdonalds@gmail.com");
        for (int i = 0; i < 4; i++) {
            System.out.println("Название фирмы\n"+abc[i].firma_name);
            System.out.println("Адрес фирмы\n"+abc[i].firma_address);
            System.out.println("Номер телефона\n"+ abc[i].firma_telephone);
            System.out.println("Адрес электронной почты\n"+abc[i].firma_email);


        }
    }
}