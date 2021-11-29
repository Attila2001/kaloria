/*
 * File: Kalori.java
 * Authors: Jakab Attila
 * Copyright: 2021, Jakab Attila
 * Group: Szoft II/N
 * Date: 2021-11-29
 * Github: https://github.com/Attila2001
 * Licenc: GNU GPL
*/

public class app {
    public static void main(String[] args) throws Exception {
        kaloria kalori = new kaloria();
        double result = kalori.calcKaloriFemale(30, 30,30);
        double result2 = kalori.calcKaloriMale(30, 30,30);
        System.out.println("Kaloria1 " + result);
        System.out.println("Kaloria2 " + result2);
        System.out.println("Jakab Attila 2021.11.29 kalória számoló");
    }
}
