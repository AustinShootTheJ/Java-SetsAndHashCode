package com.timbuchalka;


import java.util.HashSet;
import java.util.Set;

public class SetChallenge {
    public static void main(String[] args) {
        Set<HeavenlyBody> solarSystem = new HashSet<>();
        Set<HeavenlyBody> planets = new HashSet<>();
        Set<HeavenlyBody> moons = new HashSet<>();

        HeavenlyBody test = new HeavenlyBody("Test",100);
        HeavenlyBody.Planet earth = test.new Planet("Earth",365);
        HeavenlyBody.Planet mars = test.new Planet("Mars",3000);
        HeavenlyBody.Moon moon = test.new Moon("The Moon", 26);
        HeavenlyBody.Planet testEarth = test.new Planet("Earth",366);
        HeavenlyBody.Moon testEarth2 = test.new Moon("Earth",365);

        // add hb to an array after creation to have it put in a set.
        HeavenlyBody[] hbArray = {earth,mars,moon};
        HeavenlyBody[] planetArray = {earth,mars};
        HeavenlyBody[] moonArray = {moon};

        //Set of all
        for(HeavenlyBody heavenlyBody : hbArray){
            solarSystem.add(heavenlyBody);
        }

        // set of planets
        for(HeavenlyBody heavenlyBody : planetArray){
            planets.add(heavenlyBody);
        }

        // set of moons
        for(HeavenlyBody heavenlyBody : moonArray){
            moons.add(heavenlyBody);
        }


//
//        for(HeavenlyBody heavenlyBody: solarSystem){
//            System.out.println("Solar System: " + heavenlyBody.getName());
//        }
//
//        for (HeavenlyBody heavenlyBody : planets){
//            System.out.println("Planets: " + heavenlyBody.getName());
//        }
//
//        for (HeavenlyBody heavenlyBody : moons){
//            System.out.println("Moons: " + heavenlyBody.getName());
//        }


        if(earth.equals(testEarth2)){
            System.out.println("Yup");
        }
        if(testEarth2.equals(earth)){
            System.out.println("OK too");
        }







    }

}
