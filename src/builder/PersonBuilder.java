package builder;

public class PersonBuilder {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public PersonBuilder buildFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder buildLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder buildMiddleName(String middleName){
        this.middleName = middleName;
        return this;
    }

    public PersonBuilder buildCountry(String country){
        this.country = country;
        return this;
    }

    public PersonBuilder buildAddress(String address){
        this.address = address;
        return this;
    }

    public PersonBuilder buildPhone(String phone){
        this.phone = phone;
        return this;
    }

    public PersonBuilder buildAge(int age){
        this.age = age;
        return this;
    }

    public PersonBuilder buildGender(String gender){
        this.gender = gender;
        return this;
    }

    public Person build(){

        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setMiddleName(middleName);
        person.setCountry(country);
        person.setAddress(address);
        person.setPhone(phone);
        person.setAge(age);
        person.setGender(gender);
        return person;
    }

}
