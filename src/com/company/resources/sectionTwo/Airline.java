package com.company.resources.sectionTwo;

public class Airline {
    private Person[] people;
    public Airline(){
        this.people = new Person[11];
    }
    public Person getPerson(int index){
        Person person = people[index];
        return new Person(person);
    }

    /**
     * Setter name: setPerson
     *
     * @param person
     * @return
     */
    public void setPerson(Person person){
        int index = person.getSeatNumber() - 1;
        this.people[index] = new Person(person);
    }

    /**
     *
     * @param person
     * Take in a parameter 'person' and index and element based
     * off the seat number to set it equal to an object.
     */
    public void createReservation(Person person){
        while(people[person.getSeatNumber() - 1] != null){
            System.out.println("\n" + person.getName() + ", seat: " +
                    person.getSeatNumber() + " is already taken. Please choose another seat.");
            person.chooseSeat();
        }
        int index = person.getSeatNumber() -1;
        this.people[index] = new Person(person);
        System.out.println("Thank you, " + person.getName() +
                " for flying with Java airlines. Your seat " +
                " number is " + person.getSeatNumber() + "\n");

    }
}
