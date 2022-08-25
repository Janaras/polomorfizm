package com.company;

public class Main {
    public static void main(String [] args){
    Person[] person =  {
            new Asan(1234123,"Asan","Usonov",18,"asanusonov@gmail.com","Berlin"),
            new Adyl(9876543,"Adyl","Nurlanov",19,"adylnurlanov@gmail.com","Kalifornia"),
            new Uson(3456786,"Uson","Asanov",20,"usonasanov@gmail.com","Chikago"),
            new Akyl(2345437,"Akyl","Turatov",21,"akylturatov@gmail.com","Munhen"),
            new Ainur(6539875,"Ainur","Esenova",22,"ainurusonova@gmail.com","Bishkek"),
        };
    for (Person p : person){
        System.out.println(p);
        p.work();
        p.toRelax();
        p.communications();
        p.timetable();
    }

    person[0].setFirstName("Aslan");
    }
}
