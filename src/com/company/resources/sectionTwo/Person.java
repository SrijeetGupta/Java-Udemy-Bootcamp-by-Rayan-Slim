package com.company.resources.sectionTwo;

import java.util.Arrays;

public class Person {

    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
    }

    /**
     *  Function name: applyPassport
     *  @return (boolean)
     *
     *  Inside the function:
     *     1. Returns a random boolean of true or false.
     **/
    public boolean applyPassport(){
        int number = (int) (Math.random() * 2);
        if(number == 1){
            return true;
        } else {
            return false;
        }
    }
    public int chooseSeat(){
        int number = (int) ((Math.random() * 11) + 1);
        seatNumber = number;

        return seatNumber;
    }
    public String getName(){
        return name;
    }
    public String getNationality(){
        return nationality;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public int getSeatNumber(){
        return seatNumber;
    }
    public String[] getPassport(){
        return Arrays.copyOf(this.passport,this.passport.length);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setPassport(String[] passport){
        this.passport = Arrays.copyOf(passport,passport.length);
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
    public void setPassport(){
        passport = new String[] {name, nationality,dateOfBirth};
    }
}
