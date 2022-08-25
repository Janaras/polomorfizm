package com.company;

public class Asan extends Person{
    public Asan(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }



    @Override
    public void work(){
        System.out.println("Asan works in Google");
    }
    @Override
    public void toRelax(){
        System.out.println("He likes to relax in the sea");
    }
    @Override
    public void communications(){
        System.out.println("4 times a week for 8 hours");
    }
    @Override
    public void timetable(){
        System.out.println("6 times a week for 9 hours");
    }


}
