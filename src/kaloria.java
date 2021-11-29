/*
 * File: Kalori.java
 * Authors: Jakab Attila
 * Copyright: 2021, Jakab Attila
 * Group: Szoft II/N
 * Date: 2021-11-29
 * Github: https://github.com/Attila2001
 * Licenc: GNU GPL
*/

public class kaloria {
    public double calcKaloriMale(double weight, double height, int age){
        return 13.397*weight+4.799*height-5.667*age+88.362;
    }
    public double calcKaloriFemale(double weight, double height, int age){
        return 9.247*weight+3.098*height-4.330*age+447.593;
    }
}