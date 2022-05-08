package com.example.proga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import com.example.proga.HelloApplication.InputText;

import javafx.scene.control.cell.PropertyValueFactory;



public class HelloController {
    private ObservableList<InputText> InputData = FXCollections.observableArrayList();
    @FXML
    private TableView<InputText> table;
    @FXML
    private TextField text;
    @FXML
    private TableColumn<InputText, Integer> number;
    @FXML
    private TableColumn<InputText, String> rowtext;

    public HelloController() {
        this.table = new TableView(this.InputData);
    }
    @FXML
    public void readRows()
    {
        this.readFile();
        this.number.setCellValueFactory(new PropertyValueFactory("index"));
        this.rowtext.setCellValueFactory(new PropertyValueFactory("str"));
        this.table.setItems(this.InputData);
        this.text.clear();
    }

    public void readFile()
    {
        String path = this.text.getText()+ ".txt";
        try
        {
            int number = 1;
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            this.InputData.add(new InputText(line, number));
            while (line != null)
            {
                System.out.print(number);
                System.out.println(line);
                ++number;
                line = reader.readLine();
                this.InputData.add(new InputText(line, number));
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
