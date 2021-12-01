package com.company.string;

import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";
        char ch;
        for (int i=0;i<str.length();i++) {
            ch = str.charAt(i);
            result = ch + result;
        }
        System.out.println(result);
    }
}
