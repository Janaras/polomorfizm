package com.company;

public class Adyl extends Person{
    public Adyl(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println("Adyl works in Meta");
    }
    @Override
    public void toRelax(){
        System.out.println("He likes to relax in mountain");
    }
    @Override
    public void communications(){
        System.out.println("Communicates well with people");
    }
    @Override
    public void timetable(){
        System.out.println("5 times a week for 7 hours");
    }
}
