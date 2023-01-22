package com.company.resources.sectionTwo;

import java.util.Arrays;

public class main {
    public static void main(String[] args){
        Person person = new Person("Person", "American","01/26/1990",5);

        System.out.println("Name:" + person.getName());
        System.out.println("Date of Birth: " + person.getDateOfBirth());
        System.out.println("Nationality: " + person.getNationality());
        System.out.println("Seat number: " + person.getSeatNumber());

        System.out.println("The person's seat is already taken. Changing seat number from " + person.getSeatNumber());
        person.setSeatNumber(2);
        System.out.println("New seat number is: " + person.getSeatNumber());
        System.out.println("\n");

        Person person2 = new Person(person);
        System.out.println("Changing name");
        person2.setName("James");
        person2.setSeatNumber(3);

        System.out.println("Getting person2's variables: ");
        System.out.println(person2.getName());
        System.out.println(person2.getNationality());
        System.out.println(person2.getDateOfBirth());
        System.out.println(person2.getSeatNumber());

        if(person.applyPassport()){
            System.out.println("We could process your passport successfully");
            System.out.println("Congratulations, " + person.getName() + " were randomly selected for a new seat!");
            System.out.println("Your seat was " + person.getSeatNumber() + " and is now " + person.chooseSeat());
            person.setPassport();
            System.out.println(Arrays.toString(person.getPassport()));
        } else {
            System.out.println("Error processing your passport");
            System.out.println(Arrays.toString(person.getPassport()));
        }

        System.out.println("Name: " + person.getName() + "\n" +
                "Nationality: " + person.getNationality() + "\n" +
                "Date of Birth" + person.getDateOfBirth() + "\n" +
                "Seat Number" + person.getSeatNumber() + "\n" + "Passport: " +
                Arrays.toString(person.getPassport()) + "\n");


    }
}
