package dto;

import entities.Person;
import entities.Phone;
import entities.Hobby;
import java.util.List;

public class PersonDTO {
    
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private List<Hobby> hobbies;
    private List<Phone> phoneNumbers;
    private String street;
    private int zipCode;
    private String city;

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.email = person.getEmail();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.hobbies = person.getHobbies();
        this.phoneNumbers = person.getPhoneNumbers();
        this.street = person.getAddress().getStreet();
        this.zipCode = person.getAddress().getCityInfo().getZipCode();
        this.city = person.getAddress().getCityInfo().getCity();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Phone> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Phone> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}