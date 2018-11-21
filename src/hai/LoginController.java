package hai;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private ComboBox userType;


    public void login(ActionEvent event) throws Exception{
        if (usernameField.getText().equals("user") && passwordField.getText().equals("pass")) {
            System.out.println("Login");
            changeScene();
        } else {
            System.out.println("Fail");
            }
        }


        //add string in arguments
    public void changeScene() throws Exception{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("staff.fxml"));
        primaryStage.setTitle("HaiOnline");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
     }
    }


