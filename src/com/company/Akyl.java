package com.company;

public class Akyl extends Person{

    public Akyl(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println("Akyl works in Amazon");
    }
    @Override
    public void toRelax(){
        System.out.println("He likes to relax with friends in Isyk Kul");
    }
    @Override
    public void communications(){
        System.out.println("Communicates well with people");
    }
    @Override
    public void timetable(){
        System.out.println("3 times a week for 8 hours");
    }
}
