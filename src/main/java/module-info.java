module com.example.proga {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proga to javafx.fxml;
    exports com.example.proga;
}