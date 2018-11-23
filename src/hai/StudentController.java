package hai;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class StudentController {

    public void takeTest(ActionEvent event) throws Exception{
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Stage primaryStage = new Stage();
        primaryStage.getIcons().add(new Image("hai/file/icon.png"));
        Parent root = FXMLLoader.load(getClass().getResource("fxml/studentTest.fxml"));
        primaryStage.setTitle("HAIOnline");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void viewGrade(ActionEvent event) throws Exception{
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Stage primaryStage = new Stage();
        primaryStage.getIcons().add(new Image("hai/file/icon.png"));
        Parent root = FXMLLoader.load(getClass().getResource("fxml/viewGradeStudent.fxml"));
        primaryStage.setTitle("HAIOnline");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public void exit(ActionEvent event) throws Exception{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you would like to exit?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            primaryStage.getIcons().add(new Image("hai/file/icon.png"));
            Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
            primaryStage.setTitle("HAIOnline");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.setResizable(false);
            primaryStage.show();
        }
    }
}