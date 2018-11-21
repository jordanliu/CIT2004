package hai;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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

    //add combobox code
    public void login(ActionEvent event) throws Exception{
        if (usernameField.getText().equals("user") && passwordField.getText().equals("pass")) {
            System.out.println("Login");

            ((Node) (event.getSource())).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("fxml/student.fxml"));
            primaryStage.setTitle("HaiOnline");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.setResizable(false);
            primaryStage.show();
        } else {
            System.out.println("Fail");
            }
        }


   /* public User getLoggedUser() {
        return loggedUser;
    }

    public boolean userLogging(String userId, String password){
        if (usernameField.getText().equals("user") && passwordField.getText().equals("pass")) {
            loggedUser = User.of(userId);
            gotoProfile();
            return true;
        } else {
            return false;
        }
    }

    public void userLogout(){
        loggedUser = null;
        gotoLogin();
    }

    private void gotoProfile() {
        try {
            replaceSceneContent("staff.fxml");
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        //add string in arguments
    /**/
    }


