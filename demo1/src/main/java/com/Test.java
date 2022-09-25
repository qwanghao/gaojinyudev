package com;

public class Test {
    public static void main(String[] args) {
        String s = "0";
        int i = 0;
        for (i = 0; i < 5; i++) {

                if (s.substring(i, i + 1).equals(" ") && s.substring(i, i + 1) == "9") {
                    System.out.println("1");
                }

        }

    }
}
