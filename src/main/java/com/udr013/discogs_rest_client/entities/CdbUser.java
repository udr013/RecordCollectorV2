//package com.udr013.discogs_rest_client.entities;
//
//import javax.persistence.*;
//import java.util.Date;
//
//
//@Entity
//public class CdbUser {
//
//    public CdbUser() {
//    }
//
//    public CdbUser(String firstName, String lastName, String username) {
//
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.username = username;
//    }
////private static final long serialVersionUID = -2511387113006131105L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    @Column(nullable = false)
//    private String firstName;
//
//    @Column(nullable = false)
//    private String lastName;
//
//    @Column(nullable = false, unique = true)
//    private String username;
//
//    @Column(nullable = false)
//    private String password;
//
//    @Transient
//    private String checkpassword;
//
//    private String address;
//
//    private String postcode;
//
//    private Date joinDate;
//
//    private long phoneNumber;
//
//    @Column(nullable = false)
//    private String email;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getCheckpassword() {
//        return checkpassword;
//    }
//
//    public void setCheckpassword(String checkpassword) {
//        this.checkpassword = checkpassword;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPostcode() {
//        return postcode;
//    }
//
//    public void setPostcode(String postcode) {
//        this.postcode = postcode;
//    }
//
//    public long getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(long phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public Date getJoinDate() {
//        return joinDate;
//    }
//
//    public void setJoinDate(Date joinDate) {
//        this.joinDate = new Date();
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//}
