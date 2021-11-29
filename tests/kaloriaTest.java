/*
 * File: Kalori.java
 * Authors: Jakab Attila
 * Copyright: 2021, Jakab Attila
 * Group: Szoft II/N
 * Date: 2021-11-29
 * Github: https://github.com/Attila2001
 * Licenc: GNU GPL
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class kaloriaTest {
     kaloria kaloria;

    @BeforeEach
    void setup(){
        kaloria = new kaloria();
    }
    @Test
    void calcKaloriaMaletest(){
        double weight = 30;
        double height = 30;
        double age = 30;
        double expectedKalori = 464.23199999999997;

        double actualKalori = this.kaloria.calcKaloriMale(weight,height,age);
        assertEquals(expectedKalori,actualKalori);
    }
    @Test
    void calcKaloriaFemaletest(){
        double weight = 30;
        double height = 30;
        double age = 30;
        double expectedKalori = 688.043;

        double actualKalori = this.kaloria.calcKaloriFemale(weight,height,age);
        assertEquals(expectedKalori,actualKalori);
    }
    @Test
    void calcKaloriaFemaleMax(){
        double weight = 500;
        double height = 500;
        double age = 500;
        double expectedKalori = 4455.093;

        double actualKalori = this.kaloria.calcKaloriFemale(weight,height,age);
        assertEquals(expectedKalori,actualKalori);
    }
    @Test
    void calcKaloriaFemaleMin(){
        double weight = 1;
        double height = 1;
        double age = 1;
        double expectedKalori = 455.608;

        double actualKalori = this.kaloria.calcKaloriFemale(weight,height,age);
        assertEquals(expectedKalori,actualKalori);
    }
    @Test
    void calcKaloriaMaleMax(){
        double weight = 500;
        double height = 500;
        double age = 500;
        double expectedKalori = 8887;

        double actualKalori = this.kaloria.calcKaloriFemale(weight,height,age);
        assertEquals(expectedKalori,actualKalori);
    }
    @Test
    void calcKaloriaMaleMin(){
        double weight = 1;
        double height = 1;
        double age = 1;
        double expectedKalori = 141;

        double actualKalori = this.kaloria .calcKaloriFemale(weight,height,age);
        assertEquals(expectedKalori, actualKalori, 0.01);
    }
}

