package org.example;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Dmytro", "Bilyi", 63);
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        boolean s = man.isRetired();
        boolean s1 = woman.isRetired();
        System.out.println("Вік у чоловіка більший пенсійного порогу? - " +s);
        System.out.println("Вік у жінки більший пенсійного порогу? - " + s1);
        String s3 = man.registerPartnership(woman);
        String s4 = woman.registerPartnership(man);
        System.out.println("Прізвище після реєстрації браку у чоловіка - " + s3);
        System.out.println("Прізвище жінки після реєстрації браку у жінки - " + s4);
        System.out.println("Данні жінки після розлучення - " + woman.toString());
        woman.deregisterPartnership(true);
        System.out.println("Данні жінки після розлучення - " + woman.toString());
    }

}