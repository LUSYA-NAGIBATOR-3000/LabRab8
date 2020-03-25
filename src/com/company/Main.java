package com.company;

class People {
    protected String name, lastName;
    protected int age;

    People(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


    public static void main(String[] args) {
        walk();
        voice();
        run();
        Teacher.teach();
        Student.learn();
    }
    static void walk(){
        People Human = new People("Lusya", "Ivanova", 22);
        System.out.println(Human.name + " is walking");
    }
    static void voice(){
        People Human = new People("Lusya", "Ivanova", 22);
        System.out.println(Human.name + " is shouting: AAAAAAAAA");
    }
    static void run(){
        People Human = new People("Lusya", "Ivanova", 22);
        System.out.println(Human.name + " is running");
    }
}

class Student extends People{
    static People Human = new People("Lusya", "Ivanova", 22);
    public Student(String name, String lastName, int age) {
        super(name, lastName, age);
    }
    static void learn(){
        System.out.println(Human.name + " is learning");
    }
}

class Teacher extends People{
    static People Human = new People("Lusya", "Ivanova", 22);
    public Teacher(String name, String lastName, int age){
        super(name, lastName, age);
    }
    static void teach(){
        System.out.println(Human.name + " is teaching");
    }
}
