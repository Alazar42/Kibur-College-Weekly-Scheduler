package com.myn.weaklyscheduler;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import static com.myn.weaklyscheduler.App.scene;
import com.itextpdf.text.Document;
import java.awt.image.BufferedImage;
import javafx.embed.swing.SwingFXUtils;
import javax.imageio.ImageIO;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author myn
 */
public class TableController implements Initializable {

    //    Table
    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private Label fr1;

    @FXML
    private Label fr2;

    @FXML
    private Label fr3;

    @FXML
    private ImageView logo_img;

    @FXML
    private Label m1;

    @FXML
    private Label m2;

    @FXML
    private Label m3;

    @FXML
    private Label th1;

    @FXML
    private Label th2;

    @FXML
    private Label th3;

    @FXML
    private Label tu1;

    @FXML
    private Label tu2;

    @FXML
    private Label tu3;

    @FXML
    private Label w1;

    @FXML
    private Label w2;

    @FXML
    private Label w3;

    @FXML
    private Button convert_btn;
    
    @FXML
    public void ConvertToImage(ActionEvent event) {
        // Create a file chooser
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Image");

        // Set initial directory and suggested file name
        fileChooser.setInitialFileName("result.png");

        // Show save dialog
        File file = fileChooser.showSaveDialog(new Stage());

        if (file != null) {
            try {
                // Save the scene as an image
                saveSceneAsImage(file, 20, 140, 1000, 564); // Example cropping coordinates (x, y, width, height)

                System.out.println("Image saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveSceneAsImage(File file, double x, double y, double width, double height) throws IOException {
        // Create a snapshot parameters instance
        SnapshotParameters params = new SnapshotParameters();
        params.setFill(javafx.scene.paint.Color.TRANSPARENT); // Ensure transparency

        // Set the viewport for cropping
        params.setViewport(new javafx.geometry.Rectangle2D(x, y, width, height));

        // Capture the anchorPane
        WritableImage image = mainAnchorPane.snapshot(params, null);

        // Convert the image to BufferedImage
        java.awt.image.BufferedImage bufferedImage = SwingFXUtils.fromFXImage(image, null);

        // Write the image to file
        ImageIO.write(bufferedImage, "png", file);
    }



    @FXML
    private void backBtn(ActionEvent event) throws IOException {

        Courses.monday.clear();
        Courses.tuesday.clear();
        Courses.wednesday.clear();
        Courses.thursday.clear();
        Courses.friday.clear();

        Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));

        scene = new Scene(root);

        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        primaryStage.setScene(scene);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Courses course = new Courses();

        // Monday
        setTextSafely(m1, course.getMonday(), 0);
        setTextSafely(m2, course.getMonday(), 1);
        setTextSafely(m3, course.getMonday(), 2);

        // Tuesday
        setTextSafely(tu1, course.getTuesday(), 0);
        setTextSafely(tu2, course.getTuesday(), 1);
        setTextSafely(tu3, course.getTuesday(), 2);

        // Wednesday
        setTextSafely(w1, course.getWednesday(), 0);
        setTextSafely(w2, course.getWednesday(), 1);
        setTextSafely(w3, course.getWednesday(), 2);

        // Thursday
        setTextSafely(th1, course.getThursday(), 0);
        setTextSafely(th2, course.getThursday(), 1);
        setTextSafely(th3, course.getThursday(), 2);

        // Friday
        setTextSafely(fr1, course.getFriday(), 0);
        setTextSafely(fr2, course.getFriday(), 1);
        setTextSafely(fr3, course.getFriday(), 2);
    }

    private void setTextSafely(Label label, ArrayList<Courses> courseList, int index) {
        
        if (mainAnchorPane!= null) {
            // AnchorPane is not null, you can access it safely
            System.out.println("AnchorPane is not null. It's ready for use.");
        } else {
            // AnchorPane is null, handle the situation accordingly
            System.out.println("AnchorPane is null. Something went wrong during initialization.");
        }
        
        if (courseList != null && index < courseList.size()) {
            Courses courseDetails = courseList.get(index);
            String text = "";
            if (courseDetails.courseName != null) {
                text += courseDetails.courseName.toString() + "\n";
            }
            if (courseDetails.instructorName != null) {
                text += courseDetails.instructorName.toString() + "\n";
            }
            if (courseDetails.classRoom != null) {
                text += courseDetails.classRoom.toString();
            }
            label.setText(text);
        } else {
            label.setText("");
        }
    }

}
