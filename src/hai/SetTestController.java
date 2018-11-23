package hai;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class SetTestController implements Initializable {
    @FXML
    private TextField courseName;

    @FXML
    private TextField courseCode;

    @FXML
    private TextField testDate;



    @FXML
    public ComboBox<String> courseList;

    ObservableList<String> list  = FXCollections.observableArrayList("Math", "English", "Law");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        courseList.setItems(list);
    }

    public void setTest(ActionEvent event){
        String CourseList = courseList.getValue();
        String fileName = CourseList +"-"+ testDate.getText() +".txt";


        QuestionDatabank questionDatabank = new QuestionDatabank();
        questionDatabank.init();
        questionDatabank.create();


    }


    public void cancel(ActionEvent event) throws Exception{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you would like to exit?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            primaryStage.getIcons().add(new Image("hai/file/icon.png"));
            Parent root = FXMLLoader.load(getClass().getResource("fxml/staff.fxml"));
            primaryStage.setTitle("HAIOnline");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.setResizable(false);
            primaryStage.show();
        }
    }
    }


