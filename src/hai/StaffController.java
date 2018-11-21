package hai;

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
}