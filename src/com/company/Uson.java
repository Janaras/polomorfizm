package com.company;

public class Uson extends Person{
    public Uson(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println("Uson works in Facebook");
    }
    @Override
    public void toRelax(){
        System.out.println("He likes to travel abroad");
    }
    @Override
    public void communications(){
        System.out.println("Communicates well with people");
    }
    @Override
    public void timetable(){
        System.out.println("4 times a week for 8 hours");
    }
}
