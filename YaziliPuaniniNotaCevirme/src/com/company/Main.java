package com.company;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        double not = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Lütfen notunuzu giriniz: ");
        try{
            not = Double.parseDouble(br.readLine());
        }catch (NumberFormatException e){
            System.out.println("Sayı giriş hatası");
        }catch (IOException e){
            System.out.println("Klavye okuma hatası");
        }
        if(not<0){
            System.out.println("Hatalı not");
        }else if(not<50){
            System.out.println("Kaldı(1)");
        }else if(not<60){
            System.out.println("Geçer(2)");
        }else if(not<70){
            System.out.println("Orta(3)");
        }else if(not<85){
            System.out.println("İyi(4)");
        }else if(not <= 100){
            System.out.println("Pekiyi(5)");
        }
    }
}
