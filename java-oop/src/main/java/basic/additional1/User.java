package basic.additional1;

import basic.variant.Address;
import basic.variant.Card;
import basic.variant.Manager;
import basic.variant.Role;

import java.util.ArrayList;

public class User {
    private static int id = 0;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddress;
    private Address deliveryAddress;
    private ArrayList<Card> cards;
    private Role role;
    private Manager manager;

    public User(String fullName, String email, String roleType) {
        id++;
        this.fullName = fullName;
        this.email = email;
        switch (roleType) {
            case "Admin" -> role = new Role(true, true, true, true);
            case "Viewer" -> role = new Role(true, false, false, false);
            case "Main Customer" -> role = new Role(true, true, true, false);
            case "Customer" -> role = new Role(true, false, true, false);
        }
    }

    public User(String firstName, String lastName, String email, String roleType) {
        this(firstName + " " + lastName, email, roleType);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Phone number is invalid! It must starts from +");
        }
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCards(Card card) {
        this.cards.add(card);
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public static int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Role getRole() {
        return role;
    }

    public Manager getManager() {
        return manager;
    }

    public void printUserInfo() {
        System.out.println("UserInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress=" + billingAddress +
                ", deliveryAddress=" + deliveryAddress +
                ", role=" + role +
                '}');
    }

    @Override
    public String toString() {
        return "basic.variant.User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress=" + billingAddress +
                ", deliveryAddress=" + deliveryAddress +
                ", cards=" + cards +
                ", role=" + role +
                ", manager=" + manager +
                '}';
    }
}
