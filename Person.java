/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_One;

/**
 *
 * @author nhart
 */
public class Person {
  
    private String ID;
    private String lastName;
    private String firstName;
    private String address;
    private String email;
    private String phone;
    
    
    public Person(){
        
        this.ID = "00000";
        this.lastName = "Last name";
        this.firstName = "First Name";
        this.address = "Address";
        this.email = "E-mail";
        this.phone = "0000000000";
    }
    public Person(String ID, String lastName , String firstName, String address, String email, String phone){
        
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
    public String getID(){
        return this.ID;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getFirstName(){
        return this.firstName;
        
    }
    public String getAddress(){
        return this.address;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }
       public void setID(String ID){
       this.ID = ID;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setAddress(String address){
         this.address = address;
    }
    public void setEmail(String email){
         this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    }
//HR: Notes, recordings, textbook and prior codes
//Signed: Nicholas Hartnett
