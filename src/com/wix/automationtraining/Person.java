package com.wix.automationtraining;

/**
 * Created by mikhails on 25.07.2016
 */
public class Person {
    private String name;
    private Address address;
    private int id, age;

    public void setId(int id) {
        if (id < 0) { this.id = 0;
        } else this.id = id;
    }

    private void setName(String name) {
        if (name==null) { this.name = "anonymous";
        } else this.name = name;
    }

    public void setAddress(Address address) {
        if (address == null) { this.address = new Address(null, null,null, 0, 0);
        } else this.address = address;
    }

    private void setAge(int age) {
        if (age < 0) { this.age = 0;
        } else this.age = age;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, Address address, int id, int age) {
        setAddress(address);
        setName(name);
        setId(id);
        setAge(age);
    }

    @Override
    public String toString(){
        return this.name + " id:" + this.id + " address:" + this.address +" age:" + this.age;
    }

    @Override
    public boolean equals(Object person){
        Person castPerson = (Person) person;
        return castPerson.name.equals(this.name) &&
                castPerson.address.equals(this.address) &&
                castPerson.id==this.id &&
                castPerson.age==this.age;
    }

}
