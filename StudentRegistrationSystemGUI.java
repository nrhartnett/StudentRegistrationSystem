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
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class StudentRegistrationSystemGUI extends Application{
    private Stage window;
    private Scene sceneHomePage,sceneCourses,sceneFaculty,sceneStudents, sceneViewAll;
    
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Person> faculty = new ArrayList<Person>();
    private ArrayList<Person> students = new ArrayList<Person>();
    
    
    private TextField txtCourseCodeCM = new TextField();
    private TextField txtCourseNameCM = new TextField();
    private TextField txtCourseRemovalCodeCM = new TextField();
    private Button btnAddCM = new Button("Add Course");
    private Button btnRemoveCM = new Button("Remove Course");
    
    private TextField txtSchoolIDFM = new TextField();
    private TextField txtLastNameFM = new TextField();
    private TextField txtFirstNameFM = new TextField();
    private TextField txtAddressFM = new TextField();
    private TextField txtEmailFM = new TextField();
    private TextField txtPhoneFM = new TextField();
    private TextField txtFacultyRemovalCodeFM = new TextField();
    private Button btnCreateFacultyFM = new Button("Create Faculty");
    private Button btnRemoveFM = new Button("Remove Faculty");
    
    private TextField txtSchoolIDSM = new TextField();
    private TextField txtLastNameSM = new TextField();
    private TextField txtFirstNameSM = new TextField();
    private TextField txtAddressSM = new TextField();
    private TextField txtEmailSM = new TextField();
    private TextField txtPhoneSM = new TextField();
    private TextField txtStudentRemovalCodeSM = new TextField();
    private Button btnCreateStudentSM = new Button("Create Student");
    private Button btnRemoveSM = new Button("Remove Student");
    
    private HBox hBoxCourses = new HBox();
    private HBox hBoxStudents = new HBox();
    private HBox hBoxFaculty = new HBox();
    
    public static void main(String [] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        
        //HomePage 
        BorderPane borderPaneHP = new BorderPane();
        VBox vboxHP = new VBox();
        HBox hboxHP = new HBox();
        Text txtHomePageTitle = new Text(0,0,"Student Registration System");
        txtHomePageTitle.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, FontPosture.REGULAR, 24));
        
        //Home Buttons
        Button btnHPCourses = new Button( "Manage Courses ");
        Button btnHPFaculty = new Button( "Manage Faculty ");
        Button btnHPStudents = new Button("Manage Students");
        Button btnHPviewAll = new Button("View All Lists");
        
        //Home Actions
        btnHPCourses.setOnAction(e -> window.setScene(sceneCourses));
        btnHPFaculty.setOnAction(e -> window.setScene(sceneFaculty));
        btnHPStudents.setOnAction(e -> window.setScene(sceneStudents));
        btnHPviewAll.setOnAction(e -> window.setScene(sceneViewAll));
        
        //Home Management HBox
        hboxHP.getChildren().addAll(txtHomePageTitle);
        hboxHP.setAlignment(Pos.CENTER);
        
        // Home VBox
        vboxHP.getChildren().addAll(btnHPCourses,btnHPFaculty,btnHPStudents,btnHPviewAll);
        vboxHP.setSpacing(20);
        vboxHP.setAlignment(Pos.CENTER);
       
        //Home layout
        borderPaneHP.setTop(hboxHP);
        borderPaneHP.setCenter(vboxHP);
        
        //Home Scene
        
        sceneHomePage = new Scene(borderPaneHP,400,400);
        
        //----------------------
        //VIEW ALL PAGE
        //----------------------
        
        BorderPane borderPaneVA = new BorderPane();
        GridPane gridPaneVA = new GridPane();
        Text txtViewAllTitle = new Text(0,0,"All Lists:");
        txtViewAllTitle.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, FontPosture.REGULAR, 24));
        
        //View All return to Homepage
        Button btnReturnFromViewAll = new Button("<- Back");
        btnReturnFromViewAll.setOnAction(e -> window.setScene(sceneHomePage));
        
        
        //View All HBox
        HBox hboxVA1 = new HBox();
        HBox hboxVA2 = new HBox();
        hboxVA1.getChildren().addAll(txtViewAllTitle);
        hboxVA1.setAlignment(Pos.CENTER);
        hboxVA2.getChildren().addAll(btnReturnFromViewAll);
        borderPaneVA.setTop(hboxVA1);
        
       
        
        for(int i = 0; i < students.size(); i++){
             hBoxStudents.getChildren().add(new Label(students.get(i).getFirstName() + " " + students.get(i).getLastName()+ ", "));
        }
        
        
        //View All GridPane
       
        gridPaneVA.add(new Label("List of Courses: "), 0 , 0);
        gridPaneVA.add(hBoxCourses, 1 , 0);
        gridPaneVA.add(new Label("List of Students: "), 0 , 1);
        gridPaneVA.add(hBoxStudents, 1 , 1);
        gridPaneVA.add(new Label("List of Faculty: "), 0 , 3);
        gridPaneVA.add(hBoxFaculty, 1 , 3);

        
        gridPaneVA.setAlignment(Pos.CENTER_LEFT);
        hBoxCourses.setAlignment(Pos.BOTTOM_RIGHT);
        hBoxStudents.setAlignment(Pos.BOTTOM_RIGHT);
        hBoxFaculty.setAlignment(Pos.BOTTOM_RIGHT);
        
        borderPaneVA.setCenter(gridPaneVA);
        borderPaneVA.setBottom(hboxVA2);
        
        sceneViewAll = new Scene(borderPaneVA,400,400);

        //----------------------
        //COURSE MANAGEMENT PAGE
        //----------------------
        
        BorderPane borderPaneCM = new BorderPane();
        VBox vboxCM = new VBox();
        HBox hboxCM1 = new HBox();
        HBox hboxCM2 = new HBox();
        Text txtCourseManagementTitle = new Text(0,0,"Course Management");
        txtCourseManagementTitle.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, FontPosture.REGULAR, 24));
        
        //Courses return to Homepage
        Button btnReturnFromCourses = new Button("<- Back");
        btnReturnFromCourses.setOnAction(e -> window.setScene(sceneHomePage));
        
        //Course Management HBox
        hboxCM1.getChildren().addAll(txtCourseManagementTitle);
        hboxCM1.setAlignment(Pos.CENTER);
        hboxCM2.getChildren().addAll(btnReturnFromCourses);
        borderPaneCM.setTop(hboxCM1);
        borderPaneCM.setBottom(hboxCM2);
        
         
        //Course Management GridPane
        GridPane gridPaneCM = new GridPane();
        gridPaneCM.setVgap(5);
        gridPaneCM.setHgap(5);
        
        gridPaneCM.add(new Label("Course Code: "), 0 , 0);
        gridPaneCM.add(txtCourseCodeCM, 1 , 0);
        gridPaneCM.add(new Label("Course Name: "), 0 , 1);
        gridPaneCM.add(txtCourseNameCM, 1 , 1);
        gridPaneCM.add(btnAddCM,1,2);
        gridPaneCM.add(new Label("Remove Course (ID#): "), 0 , 3);
        gridPaneCM.add(txtCourseRemovalCodeCM, 1 , 3);
        gridPaneCM.add(btnRemoveCM,1,4);
        
        gridPaneCM.setAlignment(Pos.CENTER);
        txtCourseCodeCM.setAlignment(Pos.BOTTOM_RIGHT);
        txtCourseNameCM.setAlignment(Pos.BOTTOM_RIGHT);
        txtCourseRemovalCodeCM.setAlignment(Pos.BOTTOM_RIGHT);
        
        borderPaneCM.setLeft(gridPaneCM);
        
        sceneCourses = new Scene(borderPaneCM,400,400);

       //------------
       //FACULTY PAGE
       //------------
       
        BorderPane borderPaneFM = new BorderPane();
        VBox vboxFM = new VBox();
        HBox hboxFM1 = new HBox();
        HBox hboxFM2 = new HBox();
        Text txtFacultyManagementTitle = new Text(0,0,"Faculty Management");
        txtFacultyManagementTitle.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, FontPosture.REGULAR, 24));
        
        //Faculty return to Homepage
        Button btnReturnFromFaculty = new Button("<- Back");
        btnReturnFromFaculty.setOnAction(e -> window.setScene(sceneHomePage));
        
        //Faculty Management HBox
        hboxFM1.getChildren().addAll(txtFacultyManagementTitle);
        hboxFM1.setAlignment(Pos.CENTER);
        hboxFM2.getChildren().addAll(btnReturnFromFaculty);
        borderPaneFM.setTop(hboxFM1);
        borderPaneFM.setBottom(hboxFM2);
        
         
        //Faculty Management GridPane
        GridPane gridPaneFM = new GridPane();
        gridPaneFM.setVgap(5);
        gridPaneFM.setHgap(5);
        
        gridPaneFM.add(new Label("Faculty ID #:"), 0 , 0);
        gridPaneFM.add(txtSchoolIDFM, 1 , 0);
        gridPaneFM.add(new Label("Last Name:"), 0 , 1);
        gridPaneFM.add(txtLastNameFM, 1 , 1);
        gridPaneFM.add(new Label("First Name:"), 0 , 2);
        gridPaneFM.add(txtFirstNameFM, 1 , 2);
        gridPaneFM.add(new Label("Address: "), 0 , 3);
        gridPaneFM.add(txtAddressFM, 1 , 3);
        gridPaneFM.add(new Label("E-Mail:"), 0 , 4);
        gridPaneFM.add(txtEmailFM, 1 , 4);
        gridPaneFM.add(new Label("Phone:"), 0 , 5);
        gridPaneFM.add(txtPhoneFM, 1 , 5);
        gridPaneFM.add(btnCreateFacultyFM,1,6);
        gridPaneFM.add(new Label("Remove Faculty (ID #): "), 0 , 7);
        gridPaneFM.add(txtFacultyRemovalCodeFM, 1 , 7);
        gridPaneFM.add(btnRemoveFM,1,8);
        
        gridPaneFM.setAlignment(Pos.CENTER);
        txtSchoolIDFM.setAlignment(Pos.BOTTOM_RIGHT);
        txtLastNameFM.setAlignment(Pos.BOTTOM_RIGHT);
        txtFirstNameFM.setAlignment(Pos.BOTTOM_RIGHT);
        txtAddressFM.setAlignment(Pos.BOTTOM_RIGHT);
        txtEmailFM.setAlignment(Pos.BOTTOM_RIGHT);
        txtPhoneFM.setAlignment(Pos.BOTTOM_RIGHT);
        
        borderPaneFM.setLeft(gridPaneFM);
        
        sceneFaculty = new Scene(borderPaneFM,400,400);

        //-------------------
        //STUDENT MANAGEMENT
        //------------------
        
        BorderPane borderPaneSM = new BorderPane();
        VBox vboxSM = new VBox();
        HBox hboxSM1 = new HBox();
        HBox hboxSM2 = new HBox();
        Text txtStudentManagementTitle = new Text(0,0,"Student Management");
        txtStudentManagementTitle.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, FontPosture.REGULAR, 24));
        
        //Student return to Homepage
        Button btnReturnFromStudent = new Button("<- Back");
        btnReturnFromStudent.setOnAction(e -> window.setScene(sceneHomePage));
        
        //Student Management HBox
        hboxSM1.getChildren().addAll(txtStudentManagementTitle);
        hboxSM1.setAlignment(Pos.CENTER);
        hboxSM2.getChildren().addAll(btnReturnFromStudent);
        borderPaneSM.setTop(hboxSM1);
        borderPaneSM.setBottom(hboxSM2);
        
         
        //Student Management GridPane
        GridPane gridPaneSM = new GridPane();
        gridPaneSM.setVgap(5);
        gridPaneSM.setHgap(5);
        
        gridPaneSM.add(new Label("Student ID #:"), 0 , 0);
        gridPaneSM.add(txtSchoolIDSM, 1 , 0);
        gridPaneSM.add(new Label("Last Name:"), 0 , 1);
        gridPaneSM.add(txtLastNameSM, 1 , 1);
        gridPaneSM.add(new Label("First Name:"), 0 , 2);
        gridPaneSM.add(txtFirstNameSM, 1 , 2);
        gridPaneSM.add(new Label("Address: "), 0 , 3);
        gridPaneSM.add(txtAddressSM, 1 , 3);
        gridPaneSM.add(new Label("E-Mail:"), 0 , 4);
        gridPaneSM.add(txtEmailSM, 1 , 4);
        gridPaneSM.add(new Label("Phone:"), 0 , 5);
        gridPaneSM.add(txtPhoneSM, 1 , 5);
        gridPaneSM.add(btnCreateStudentSM,1,6);
        gridPaneSM.add(new Label("Remove Student(ID #): "), 0 , 7);
        gridPaneSM.add(txtStudentRemovalCodeSM, 1 , 7);
        gridPaneSM.add(btnRemoveSM,1,8);
        
        gridPaneSM.setAlignment(Pos.CENTER);
        txtSchoolIDSM.setAlignment(Pos.BOTTOM_RIGHT);
        txtLastNameSM.setAlignment(Pos.BOTTOM_RIGHT);
        txtFirstNameSM.setAlignment(Pos.BOTTOM_RIGHT);
        txtAddressSM.setAlignment(Pos.BOTTOM_RIGHT);
        txtEmailSM.setAlignment(Pos.BOTTOM_RIGHT);
        txtPhoneSM.setAlignment(Pos.BOTTOM_RIGHT);
        
        borderPaneSM.setLeft(gridPaneSM);
        
        sceneStudents = new Scene(borderPaneSM,400,400);
        
        //--------------------
        // Button FUNCTIONS
        //--------------------
        
     
        btnAddCM.setOnAction(e -> {
            
            hBoxCourses.getChildren().clear();
            addCourse(txtCourseCodeCM,txtCourseNameCM);
            for(int i = 0; i < courses.size(); i++){
            hBoxCourses.getChildren().add(new Label(courses.get(i).getCourseName() + ", "));
        }
        });
        
        btnRemoveCM.setOnAction(e -> {
            
            hBoxCourses.getChildren().clear();
            removeCourse(txtCourseCodeCM);
            for(int i = 0; i < courses.size(); i++){
            hBoxCourses.getChildren().add(new Label(courses.get(i).getCourseName() + ", "));
        }
        });
    
    
        btnCreateFacultyFM.setOnAction(e -> {
        
            hBoxFaculty.getChildren().clear();
            addFaculty(txtSchoolIDFM,txtLastNameFM,txtFirstNameFM, txtAddressFM, txtEmailFM, txtPhoneFM);
            for(int i = 0; i < faculty.size(); i++){
             hBoxFaculty.getChildren().add(new Label(faculty.get(i).getFirstName() + " " + faculty.get(i).getLastName()+ ", "));
        }
            
        });
        btnRemoveFM.setOnAction(e -> {
            
            hBoxFaculty.getChildren().clear();
            removeFaculty(txtSchoolIDFM);
            for(int i = 0; i < faculty.size(); i++){
             hBoxFaculty.getChildren().add(new Label(faculty.get(i).getFirstName() + " " + faculty.get(i).getLastName()+ ", "));}
            
        });
    

        btnCreateStudentSM.setOnAction(e -> {
            
            hBoxStudents.getChildren().clear();
            addStudent(txtSchoolIDSM,txtLastNameSM,txtFirstNameSM, txtAddressSM, txtEmailSM, txtPhoneSM);
            for(int i = 0; i < students.size(); i++){
            hBoxStudents.getChildren().add(new Label(students.get(i).getFirstName() + " " + students.get(i).getLastName()+ ", "));}
        });
        
        btnRemoveSM.setOnAction(e -> {
            
            hBoxStudents.getChildren().clear();
            removeStudent(txtSchoolIDSM);
            for(int i = 0; i < students.size(); i++){
            hBoxStudents.getChildren().add(new Label(students.get(i).getFirstName() + " " + students.get(i).getLastName()+ ", "));}
        });
        
        
        //--------------------
        window.setScene(sceneHomePage);
        window.setTitle("CIS-211 Project One");
        window.show();
        
    }
    public void addCourse(TextField txtCourseCodeCM,TextField txtCourseNameCM){
        
        String courseCode = txtCourseCodeCM.getText();
        String courseName = txtCourseNameCM.getText();
        
        Course course = new Course(courseCode,courseName);
        
        
        this.courses.add(course);
    }
    public void removeCourse(TextField txtCourseCodeCM){
        
        String courseCode = txtCourseCodeCM.getText();
        
        for(int i = 0; i < courses.size(); i++)
            if(courses.get((i)).getCourseCode().equals(courseCode)){
                courses.remove(i);}
        
    }
    public void addFaculty(TextField txtID, TextField txtLastName, TextField txtFirstName, TextField txtAddress, TextField txtEmail, TextField txtPhone){
        
        String facultyID = txtID.getText();
        String facultyLastName = txtLastName.getText();
        String facultyFirstName = txtFirstName.getText();
        String facultyAddress = txtAddress.getText();
        String facultyEmail = txtEmail.getText();
        String facultyPhone = txtPhone.getText();
        
        Person person = new Person(facultyID,facultyLastName, facultyFirstName, facultyAddress, facultyEmail, facultyPhone);
        
        
        this.faculty.add(person);
    }
    public void removeFaculty(TextField txtFaculty){
        
        String IDNumber = txtFaculty.getText();
        
        for(int i = 0; i < faculty.size(); i++)
            if(faculty.get((i)).getID().equals(IDNumber))
                faculty.remove(i);
        
    }
    public void addStudent(TextField txtID, TextField txtLastName, TextField txtFirstName, TextField txtAddress, TextField txtEmail, TextField txtPhone){
        
        String studentID = txtID.getText();
        String studentLastName = txtLastName.getText();
        String studentFirstName = txtFirstName.getText();
        String studentAddress = txtAddress.getText();
        String studentEmail = txtEmail.getText();
        String studentPhone = txtPhone.getText();
        
        Person person = new Person(studentID,studentLastName, studentFirstName, studentAddress, studentEmail, studentPhone);
        
        
        this.students.add(person);
    }
    public void removeStudent(TextField txtStudent){
        
        String IDNumber = txtStudent.getText();
        
        for(int i = 0; i < students.size(); i++)
            if(students.get((i)).getID().equals(IDNumber))
                students.remove(i);
        
    }
}
//HR: Prior Codes, textbook, Notes, Lecture
//Signed: Nicholas R. Hartnett