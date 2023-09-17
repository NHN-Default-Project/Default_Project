package com.nhnacademy.Chapter4.Jminsoo.Excercise4_2;

import java.util.Scanner;

public class Main {
    private static final int HEX = 16;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("16진수 값을 입력해주세요 : ");

        String hexNum = scanner.next();
        int value = 0;
        try {
            for (int i = 0 ; i < hexNum.length(); i++) {
                value = value * HEX + Number.hexValue(hexNum.charAt(i));
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("10진수 변환 값 : " + value);
    }



}
