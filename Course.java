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
public class Course{
        
    public static final int COURSE_CAPACITY = 15;
    private String courseCode;
    private String courseName;
    private Student [] students;
    private Faculty faculty;
    private int numberOfStudents;
    
    public Course(){
        this(null, null, null);
    }
    public Course(String courseCode,String courseName){
         this(courseCode, courseName, null);
    }
    public Course(String courseCode,String courseName,Faculty faculty){
        
        this.courseCode= courseCode;
        this.courseName = courseName;
        this.faculty = faculty;
        this.numberOfStudents = 0;
        
        students = new Student[COURSE_CAPACITY];
        for(int i = 0; i < students.length; i++)
            students[i] = new Student();
        
    }
    public void addAStudent(Student student){
        
        if(numberOfStudents  + 1 <= COURSE_CAPACITY){
        students[numberOfStudents++] = student;
        System.out.println("New student added");
    }
        else
            System.out.println("Class if Full!");
        
    }
    public void addStudents(Student [] student){
        
        
        for(int i = 0; i < students.length; i++){
            addAStudent(students[i]);
        }
        
        
    }
    public Faculty getFaculty(){
        return this.faculty;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseCode(){
        return this.courseCode;
    }
    public String getCourseName(){
        return this.courseName;
    }
    public Student [] getStudents(){
        return this.students;
    }
     public void setFaculty(Faculty faculty){
        this.faculty = faculty;
    }
      public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    public void dropAStudent(Student student){
        
        int i;
        for( i = 0; i < students.length; i++){
            if(students[i].equals(student)){
                
                students[i] = null;
                numberOfStudents --;
                
                break;
            }
        }
       // shift elements into the null position 
       for(int j = i; j <  students.length -1; j--){
           students[j] = students[j+1];
       }
    }
    public void dropStudents(Student [] students){
        for( int i = 0; i < students.length; i++){
            dropAStudent(students[i]);
        }
    }

}
//HR: Notes, recordings, textbook and prior codes
//Signed: Nicholas Hartnett

