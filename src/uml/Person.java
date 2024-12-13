package uml;

public class Person {
    private String name;
    private int age;
    private Address address;
    private Phone phone;

    public Person(String name, int age, Address address, Phone phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void adoptPet(Pet pet) {
        System.out.println(name + " has adopted a pet.");
        pet.play();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
