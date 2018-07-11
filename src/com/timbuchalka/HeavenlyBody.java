package com.timbuchalka;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private String bodyType;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = "unknown";

    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        if(this.getBodyType() == "Planet" && moon.getBodyType() != "Moon"){
            System.out.println("not added ggeznore");
            return false;
        }else{
            System.out.println("added");
            return this.satellites.add(moon);
        }

    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public String getBodyType(){

        return this.bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        String objType = ((HeavenlyBody) obj).getBodyType();
        if(this.name.equals(objName)){
            return this.getBodyType().equals(objType);
        }
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }

    public final class Planet extends HeavenlyBody{
        public Planet(String name, double orbitalPeriod) {
            super(name, orbitalPeriod);
            setBodyType("Planet");
        }






    }

    public final class Moon extends HeavenlyBody{
        public Moon(String name, double orbitalPeriod) {
            super(name, orbitalPeriod);
            setBodyType("Moon");
        }


    }


}
