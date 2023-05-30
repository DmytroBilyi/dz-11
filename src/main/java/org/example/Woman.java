package org.example;

public class Woman extends Person {
    private Man partner;
    private String maidenName;


    public Woman(String firstName, String lastName, int age, String maidenName) {
        super(firstName, lastName, age);
        this.maidenName = maidenName;
    }

    public Man getPartner() {
        return partner;
    }

    public Object setPartner(Man partner) {
        this.partner = partner;
        return partner;
    }

    @Override
    public boolean isRetired() {
        return getAge() >= 60;
    }

    public String registerPartnership(Man man) {
        if (man.getPartner() != null) {
            man.getPartner().deregisterPartnership(false);
        }
        man.setPartner(this);
        this.setPartner(man);
        this.setLastName(man.getLastName());
        return this.lastName;
    }

    public boolean deregisterPartnership(boolean returnToPreviousLastName) {
        if (this.partner != null) {
            if (returnToPreviousLastName) {
                this.setLastName(this.getMaidenName());
            }
            this.partner.setPartner(null);
            this.setPartner(null);
        }
        return returnToPreviousLastName;
    }
    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", partner=" + getPartner() +
                ", maidenName='" + maidenName + '\'' +
                '}';
    }
}