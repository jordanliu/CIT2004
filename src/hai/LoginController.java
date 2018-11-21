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
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;



    //add combobox code
    public void login(ActionEvent event) throws Exception {
        if (usernameField.getText().equals("user") && passwordField.getText().equals("pass")) {

            ((Node) (event.getSource())).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("fxml/student.fxml"));
            primaryStage.setTitle("HaiOnline");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.setResizable(false);
            primaryStage.show();
            System.out.println(userType.getValue());

        } else {
            System.out.println("Fail");
        }
    }

    @FXML
    public ComboBox<String> userType;

    ObservableList<String> list  = FXCollections.observableArrayList("Student", "Staff");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userType.setItems(list);
    }
}

   /*
    public User getLoggedUser() {
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
 */

   //add string in arguments



