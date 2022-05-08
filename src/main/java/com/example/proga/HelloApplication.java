package com.example.proga;

import java.io.IOException;
import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1000);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public static class InputText {
        private int index;
        private String str;

        public InputText(String str, int index) {
            this.index = index;
            this.str = str;
        }

        public int getIndex() {
            return index;
        }
        public void setIndex(int index) {
            this.index = index;
        }
        public String getStr() {
            return str;
        }
        public void setStr(String str) {
            this.str = str;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}