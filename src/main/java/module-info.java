module com.myn.weaklyscheduler {
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.swing;
    

    opens com.myn.weaklyscheduler to javafx.fxml;
    exports com.myn.weaklyscheduler;
    requires itextpdf;
}
