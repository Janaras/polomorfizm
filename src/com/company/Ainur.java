package com.company;

public class Ainur extends Person{
    public Ainur(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println("Ainur works in Microsoft");
    }
    @Override
    public void toRelax(){
        System.out.println("She likes to relax with family in moutain");
    }
    @Override
    public void communications(){
        System.out.println("Communicates well with people");
    }
    @Override
    public void timetable(){
        System.out.println(" 5 times a week for 8 hours");
    }

}
