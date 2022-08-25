package com.company;

public abstract class Person {
    private final int id;
    private final String firstName;
    private String lastName;
    private int age;
    private String email;
    private String city;

    public Person(int id,String firstName,String lastName,int age,String email,String city){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.city = city;
    }


    public int getId() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setFirstName(String firstName) {
        if (this.firstName.equals(firstName)) {
            System.out.println("This name is already set.");
        } else {
            System.out.println("You can't change the default name.");
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative.");
        } else if (age > 110) {
            System.out.println("Age cannot be greater than 110.");
        } else {
            this.age = age;
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("The email must contain @ symbol.");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public void work(){}
    public void toRelax(){}
    public void communications(){}
    public void timetable(){}






}
