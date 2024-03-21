package com.myn.weaklyscheduler;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.util.Duration;
import java.util.concurrent.TimeUnit;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.stage.Screen;

/**
 * JavaFX App
 */
public class App extends Application {

    public static Scene scene;
    
    
    public static void main(String[] args) {
        launch();
    }
    
  
     @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SplashScreen.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Weakly Class Scheduler");
        primaryStage.setScene(scene);
        primaryStage.show();
        Image logo = new Image(getClass().getResourceAsStream("Kibur_College_logo.png"));
        primaryStage.getIcons().add(logo);

        // Create a timeline for the delay
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            try {
                // Load the main screen after the delay
                Parent mainScreenRoot = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
                Scene mainScreenScene = new Scene(mainScreenRoot);
                primaryStage.setScene(mainScreenScene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        timeline.play();
    }

    private String Url() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}