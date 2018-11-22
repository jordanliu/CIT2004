package hai;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.*;

import java.awt.*;

public class StaffController {

    @FXML
    private Button setButton;

    @FXML
    private Button viewButton;


    public void setTest(){
        System.out.println("Set Test");
    }

    public void viewTest(){
        System.out.println("View Test");
    }

    public void exit(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you would like to exit?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            System.out.println("Exit");
        }
    }
}