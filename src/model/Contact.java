package model;

import java.io.Serializable;

public class Contact implements Serializable {
    private String contactName;
    private String contactNumber;
    private String group;
    private String gender;
    private String dob;
    private String address;
    private String email;

    public Contact(){

    }

    public Contact(String contactName,String contactNumber,String group, String gender, String dob, String address, String email){
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.group = group;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
