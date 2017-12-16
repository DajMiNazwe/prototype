package com.company;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("Bażyńskiego", "56-123", "Gdańsk");
        Person person = new Person("Bartek", address);

        Person clonedPerson = (Person) CloneService.deepClone(person);
        Person shallowClone = (Person) person.clone();
        shallowClone.setName("Płytki Bartek");

        System.out.println(person.toString());
        System.out.println(clonedPerson.toString());
        person.getAddress().setCity("Kwidzyn");
        System.out.println(person.toString());
        System.out.println(shallowClone.toString());
    }
}
