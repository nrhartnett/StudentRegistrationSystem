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
import java.util.ArrayList;

public class Faculty  extends Person {
  
    
    private ArrayList<Student> advisees;
    private ArrayList<Course> teaching;
    
    
    public Faculty(){
        this.advisees = new ArrayList<>();
        this.teaching = new ArrayList<>();
    }
    public Faculty(ArrayList<Course> teaching, ArrayList<Student> advisees){
        
        this.advisees = advisees;
        this.teaching = teaching;
        
    }
    public ArrayList<Student> getAdvisees(){
        return this.advisees;
                
    }
    public ArrayList<Course> getTeaching(){
        return this.teaching;
    }
     public void setAdvisees(ArrayList<Student> advisees){
        this.advisees = advisees;
                
    }
    public void setTeaching(ArrayList<Course> teaching){
        this.teaching= teaching;
    }
    public void printTeaching(){
        for(int i =0; i < this.teaching.size(); i++)
            System.out.print(teaching.get(i) + ", ");
    }
    public void printAdvisees(){
        for(int i =0; i < this.advisees.size(); i++)
            System.out.print(advisees.get(i) + ", ");
    }
  
}
//HR: Notes, recordings, textbook and prior codes
//Signed: Nicholas Hartnett
