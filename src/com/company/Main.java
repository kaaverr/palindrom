package com.company;

public class Main {

    public static void main(String[] args) {
	String str = "аргентина манит негра";
	Boolean isPalendrom = true;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);
            if (  str.charAt(i) != str.charAt(str.length() -i -1 ) ){
                isPalendrom = false;

            }
        }
        System.out.println(isPalendrom);
        //second way
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse += str.charAt(str.length() -1 -i );
        }
        System.out.println(reverse);
        if (str.equals(reverse)){
            isPalendrom = true;
        }
        System.out.println(isPalendrom);
    }
}
