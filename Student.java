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

public class Student extends Person{

    private String facultyAdvisor;
    private ArrayList<Course> courses;
    
    public Student(){
        
        this.courses = new ArrayList<>();
        this.facultyAdvisor = "Unknown";
        
    }
     public Student(ArrayList<Course> courses){
         this(courses, null);
    }
    public Student(ArrayList<Course> courses,String facultyAdvisor){
        
        this.courses = courses;
        this.facultyAdvisor = facultyAdvisor;
        
    }
    public ArrayList<Course> getCourses(){
        return this.courses;
    }
    public String getFacultyAdvisor(){
        return this.facultyAdvisor;
    }
     public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }
    public void addCourse(Course course){
        this.courses.add(course);
    }
    public void setFacultyAdvisor(String facultyAdvisor){
        this.facultyAdvisor = facultyAdvisor;
    }
    public void printCourses(){
        for(int i =0; i < this.courses.size(); i++)
            System.out.print(courses.get(i) + ", ");
    }

}
//HR: Notes, recordings, textbook and prior codes
//Signed: Nicholas Hartnett
