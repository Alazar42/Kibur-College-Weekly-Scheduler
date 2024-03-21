/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package com.myn.weaklyscheduler;

import static com.myn.weaklyscheduler.App.scene;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author myn
 */
public class AppController implements Initializable {
//    inputs

    @FXML
    private ComboBox<String> cn1;

    @FXML
    private ComboBox<String> cn2;

    @FXML
    private ComboBox<String> cn3;

    @FXML
    private ComboBox<String> cn4;

    @FXML
    private ComboBox<String> cn5;

    @FXML
    private ComboBox<String> cn6;

    @FXML
    private ComboBox<String> cn7;

    @FXML
    private ComboBox<String> cn8;

    @FXML
    private ComboBox<String> cr1;

    @FXML
    private ComboBox<String> cr2;

    @FXML
    private ComboBox<String> cr3;

    @FXML
    private ComboBox<String> cr4;

    @FXML
    private ComboBox<String> cr5;

    @FXML
    private ComboBox<String> cr6;

    @FXML
    private ComboBox<String> cr7;

    @FXML
    private ComboBox<String> cr8;

    @FXML
    private ComboBox<String> dept_name;

    @FXML
    private Label err_msg;

    @FXML
    private TextField in1;

    @FXML
    private TextField in2;

    @FXML
    private TextField in3;

    @FXML
    private TextField in4;

    @FXML
    private TextField in5;

    @FXML
    private TextField in6;

    @FXML
    private TextField in7;

    @FXML
    private TextField in8;

    @FXML
    private ImageView logo_mimg;
    
    @FXML
    private void ChangeData(){
        String[] ComputerScience = new String[]{"Introduction to Computer Science",
            "Fundamentals of Programming I",
            "Fundamentals of Programming II",
            "Fundamentals of Database",
            "Advanced Database System",
            "Computer Security",
            "Computer Networking & Data  Communication",
            "Wireless Communication and Mobile Computing",
            "Network and System Administration",
            "Internet Programming",
            "Object Oriented Programming",
            "Data structures and Algorithms",
            "Advanced Programming",
            "Computer organization and architecture",
            "Operating System",
            "Microprocessor and Assembly Language Programming",
            "Computer Graphics",
            "Human Computer Interaction",
            "Fundamentals of Software Engineering",
            "Object Oriented Software Engineering",
            "Analysis of Algorithms",
            "Complexity Theory",
            "Formal Language and Automata Theory",
            "Compiler Design",
            "Introduction to Artificial Intelligence",
            "Technical Report Writing in Computer Science",
            "Final Project I",
            "Final Project II",
            "Selected topics in Computer Science",
            "Int. to Distributed Systems	"};
        String[] Accounting = new String[]{
            "Financial Accounting II", "Cost and Management Accounting II",
            "Financial Management II", "Banking Principles and Practices",
            "Government and Non-profit Accounting", "Research Methods in Accounting & Finance",
            "Entrepreneurship", "Operations Management", "Business Law", "Auditing Principles and Practices II",
            "Project Analysis & Evaluation", "Accounting Software Application", "Investment Analysis and Portfolio Management",
            "Operation Research", "Financial Accounting I", "Cost and Management Accounting I", "Risk Management and Insurance",
            "Financial Management I", "Financial Institutions and Markets", "Civics and Ethical Education", "Advanced Financial Accounting",
            "Auditing Principles and Practices I", "Ethiopian Government Accounting", "Accounting Information Systems", "Strategic Management",
            "Public Finance & Taxation", "Principles of Accounting I", "Mathematics for finance", "Fundamentals of Information Systems", "Principles of Accounting II", "Statistics for finance"

        };
        String[] BusinessManagement = new String[]{"Communicative English Skills",
  "Basic Writing Skills",
  "Civics & Ethics",
  "Introduction to Logic",
  "General Psychology",
  "Introduction to Management",
  "Administrative & Business Communication",
  "Statistics for Management I",
  "Statistics for Management II",
  "Human Resource Management",
  "Organizational Behavior",
  "Leadership & Change Management",
  "Management Information System",
  "System Analysis and Design",
  "Computer Applications in Management",
  "Business Law",
  "Principles of Accounting I",
  "Principles of Accounting II",
  "Principles of Marketing",
  "International Marketing",
  "Mathematics for Management",
  "Operations Research",
  "Cost and Management Accounting I",
  "Cost and Management Accounting II",
  "Materials Management",
  "Operations Management",
  "Microeconomics I",
  "Macroeconomics",
  "Managerial Economics",
  "Financial Management",
  "Management of Financial Institutions",
  "Entrepreneurship and Enterprise Development",
  "Project Management",
  "Risk Management and Insurance",
  "Strategic Management",
  "Business Research Methods",
  "Research in Management I",
  "Research in management II"};
        String[] TVET = new String[]{};
        String dept_val = dept_name.getValue();

        
        switch(dept_val){
            case "Computer Science":{
                cn1.getItems().clear();
                cn2.getItems().clear();
                cn3.getItems().clear();
                cn4.getItems().clear();
                cn5.getItems().clear();
                cn6.getItems().clear();
                cn7.getItems().clear();
                cn8.getItems().clear();
                
                cn1.getItems().addAll(ComputerScience);
                cn2.getItems().addAll(ComputerScience);
                cn3.getItems().addAll(ComputerScience);
                cn4.getItems().addAll(ComputerScience);
                cn5.getItems().addAll(ComputerScience);
                cn6.getItems().addAll(ComputerScience);
                cn7.getItems().addAll(ComputerScience);
                cn8.getItems().addAll(ComputerScience);
                break;
            }
            case "Accounting And Finance":{
                cn1.getItems().clear();
                cn2.getItems().clear();
                cn3.getItems().clear();
                cn4.getItems().clear();
                cn5.getItems().clear();
                cn6.getItems().clear();
                cn7.getItems().clear();
                cn8.getItems().clear();
                
                cn1.getItems().addAll(Accounting);
                cn2.getItems().addAll(Accounting);
                cn3.getItems().addAll(Accounting);
                cn4.getItems().addAll(Accounting);
                cn5.getItems().addAll(Accounting);
                cn6.getItems().addAll(Accounting);
                cn7.getItems().addAll(Accounting);
                cn8.getItems().addAll(Accounting);
                break;
            }
            case "Business Management":{
                cn1.getItems().clear();
                cn2.getItems().clear();
                cn3.getItems().clear();
                cn4.getItems().clear();
                cn5.getItems().clear();
                cn6.getItems().clear();
                cn7.getItems().clear();
                cn8.getItems().clear();
                
                cn1.getItems().addAll(BusinessManagement);
                cn2.getItems().addAll(BusinessManagement);
                cn3.getItems().addAll(BusinessManagement);
                cn4.getItems().addAll(BusinessManagement);
                cn5.getItems().addAll(BusinessManagement);
                cn6.getItems().addAll(BusinessManagement);
                cn7.getItems().addAll(BusinessManagement);
                cn8.getItems().addAll(BusinessManagement);
                break;
            }
            case "TVET":{
                cn1.getItems().clear();
                cn2.getItems().clear();
                cn3.getItems().clear();
                cn4.getItems().clear();
                cn5.getItems().clear();
                cn6.getItems().clear();
                cn7.getItems().clear();
                cn8.getItems().clear();
                
                cn1.getItems().addAll(TVET);
                cn2.getItems().addAll(TVET);
                cn3.getItems().addAll(TVET);
                cn4.getItems().addAll(TVET);
                cn5.getItems().addAll(TVET);
                cn6.getItems().addAll(TVET);
                cn7.getItems().addAll(TVET);
                cn8.getItems().addAll(TVET);
                break;
            }
        }
    }

    @FXML
    private void gnerateSchedule(ActionEvent event) throws IOException {

        if ((cn1.getValue() == null || "".equals(in1.getText()) || cr1.getValue() == null)
                || (cn2.getValue() == null || "".equals(in2.getText()) || cr2.getValue() == null)
                || (cn3.getValue() == null || "".equals(in3.getText()) || cr3.getValue() == null)
                || (cn4.getValue() == null || "".equals(in4.getText()) || cr4.getValue() == null)
                || (cn5.getValue() == null || "".equals(in5.getText()) || cr5.getValue() == null)
                || (cn6.getValue() == null || "".equals(in6.getText()) || cr6.getValue() == null)) {

            err_msg.setText("Error Input The Required Fields!!!");

        } else {

            if ((cn1.getValue() == "" || in1.getText() == "" || cr1.getValue() == "")
                    || (cn2.getValue() == "" || in2.getText() == "" || cr2.getValue() == "")
                    || (cn3.getValue() == "" || in3.getText() == "" || cr3.getValue() == "")
                    || (cn4.getValue() == "" || in4.getText() == "" || cr4.getValue() == "")
                    || (cn5.getValue() == "" || in5.getText() == "" || cr5.getValue() == "")
                    || (cn6.getValue() == "" || in6.getText() == "" || cr6.getValue() == "")
                    || ((cn7.getValue() == null || in7.getText() == "" || cr7.getValue() == null)
                    && (cn8.getValue() == null || in8.getText() == "" || cr8.getValue() == null))) {
                System.out.print("No Additional  Fields");
                generateForAll(6, "");

                FXMLLoader loader = new FXMLLoader(getClass().getResource("Table.fxml"));

                Parent root = loader.load();

                TableController controller = loader.getController();

                scene = new Scene(root);

                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                primaryStage.setScene(scene);
            } else {
                if ((cn7.getValue() != null|| in7.getText() != "" || cr7.getValue() != null)
                        && (cn8.getValue() != null || in8.getText() != "" || cr8.getValue() != null)) {
                    System.out.print("7th and 8th Additional  Fields");
                    generateForAll(8, "cn7&8");
                    Parent root = FXMLLoader.load(getClass().getResource("Table.fxml"));

                    scene = new Scene(root);

                    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    primaryStage.setScene(scene);
                } else if ((cn8.getValue() != null || in8.getText() != "" || cr8.getValue() != null)) {
                    System.out.print("8th  Additional  Fields");
                    generateForAll(7, "cn8");
                    Parent root = FXMLLoader.load(getClass().getResource("Table.fxml"));

                    scene = new Scene(root);

                    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    primaryStage.setScene(scene);

                } else if ((cn7.getValue() != null || in7.getText() != "" || cr7.getValue() != null)) {
                    System.out.print("7th  Additional  Fields");
                    generateForAll(7, "cn7");
                    Parent root = FXMLLoader.load(getClass().getResource("Table.fxml"));

                    scene = new Scene(root);

                    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    primaryStage.setScene(scene);
                }

            }

        }
    }

    private void generateForAll(int howMany, String whichInput) {

        Courses course = new Courses();

        if (whichInput == "") {
            List<String[]> list = new ArrayList<>();
            String[] c1 = new String[]{cn1.getValue(), in1.getText(), cr1.getValue()};
            String[] c2 = new String[]{cn2.getValue(), in2.getText(), cr2.getValue()};
            String[] c3 = new String[]{cn3.getValue(), in3.getText(), cr3.getValue()};
            String[] c4 = new String[]{cn4.getValue(), in4.getText(), cr4.getValue()};
            String[] c5 = new String[]{cn5.getValue(), in5.getText(), cr5.getValue()};
            String[] c6 = new String[]{cn6.getValue(), in6.getText(), cr6.getValue()};

            List<String[]> each = Arrays.asList(c1, c2, c3, c4, c5, c6);
            list.addAll(each);

            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j <= 2; j++) {
                    course.addCourse(list.get(i)[0], list.get(i)[1], list.get(i)[2]);
                }
            }
        } else {
            if (howMany == 7) {
                if (whichInput == "cn7") {
                    List<String[]> list = new ArrayList<>();
                    String[] c1 = new String[]{cn1.getValue(), in1.getText(), cr1.getValue()};
                    String[] c2 = new String[]{cn2.getValue(), in2.getText(), cr2.getValue()};
                    String[] c3 = new String[]{cn3.getValue(), in3.getText(), cr3.getValue()};
                    String[] c4 = new String[]{cn4.getValue(), in4.getText(), cr4.getValue()};
                    String[] c5 = new String[]{cn5.getValue(), in5.getText(), cr5.getValue()};
                    String[] c6 = new String[]{cn6.getValue(), in6.getText(), cr6.getValue()};
                    String[] c7 = new String[]{cn7.getValue(), in7.getText(), cr7.getValue()};

                    List<String[]> each = Arrays.asList(c1, c2, c3, c4, c5, c6, c7);
                    list.addAll(each);

                    for (int i = 0; i < list.size(); i++) {
                        for (int j = 0; j <= 2; j++) {
                            course.addCourse(list.get(i)[0], list.get(i)[1], list.get(i)[2]);
                        }
                    }
                } else {
                    List<String[]> list = new ArrayList<>();
                    String[] c1 = new String[]{cn1.getValue(), in1.getText(), cr1.getValue()};
                    String[] c2 = new String[]{cn2.getValue(), in2.getText(), cr2.getValue()};
                    String[] c3 = new String[]{cn3.getValue(), in3.getText(), cr3.getValue()};
                    String[] c4 = new String[]{cn4.getValue(), in4.getText(), cr4.getValue()};
                    String[] c5 = new String[]{cn5.getValue(), in5.getText(), cr5.getValue()};
                    String[] c6 = new String[]{cn6.getValue(), in6.getText(), cr6.getValue()};
                    String[] c8 = new String[]{cn8.getValue(), in8.getText(), cr8.getValue()};

                    List<String[]> each = Arrays.asList(c1, c2, c3, c4, c5, c6, c8);
                    list.addAll(each);

                    for (int i = 0; i < list.size(); i++) {
                        for (int j = 0; j <= 2; j++) {
                            course.addCourse(list.get(i)[0], list.get(i)[1], list.get(i)[2]);
                        }
                    }
                }
            } else if (howMany == 8 && whichInput == "cn7&8") {
                List<String[]> list = new ArrayList<>();
                String[] c1 = new String[]{cn1.getValue(), in1.getText(), cr1.getValue()};
                String[] c2 = new String[]{cn2.getValue(), in2.getText(), cr2.getValue()};
                String[] c3 = new String[]{cn3.getValue(), in3.getText(), cr3.getValue()};
                String[] c4 = new String[]{cn4.getValue(), in4.getText(), cr4.getValue()};
                String[] c5 = new String[]{cn5.getValue(), in5.getText(), cr5.getValue()};
                String[] c6 = new String[]{cn6.getValue(), in6.getText(), cr6.getValue()};
                String[] c7 = new String[]{cn7.getValue(), in7.getText(), cr7.getValue()};
                String[] c8 = new String[]{cn8.getValue(), in8.getText(), cr8.getValue()};

                List<String[]> each = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8);
                list.addAll(each);

                for (int i = 0; i < list.size(); i++) {
                    for (int j = 0; j <= 2; j++) {
                        course.addCourse(list.get(i)[0], list.get(i)[1], list.get(i)[2]);
                    }
                }
            }
        }
        course.populateSchedule();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] DepartmentName = new String[]{"Computer Science",
            "Accounting And Finance",
            "Business Management"};
        
        String[] classRooms = new String[]{"801", "802", "803", "804",
                                            "805", "806", "901", "902", "903", "904", 
                                            "905", "906", "907", "908", "909"};

        dept_name.getItems().addAll(DepartmentName);
        dept_name.setValue("Computer Science");
        ChangeData();
        cr1.getItems().addAll(classRooms);
        cr2.getItems().addAll(classRooms);
        cr3.getItems().addAll(classRooms);
        cr4.getItems().addAll(classRooms);
        cr5.getItems().addAll(classRooms);
        cr6.getItems().addAll(classRooms);
        cr7.getItems().addAll(classRooms);
        cr8.getItems().addAll(classRooms);
        
       
    }

}
