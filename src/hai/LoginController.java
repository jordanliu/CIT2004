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
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorMessage;


    public void login(ActionEvent event) throws Exception {
        String UserType = userType.getValue();
        String $username;
        String $password;
        Staff staffLogin = new Staff();
        Student studentLogin = new Student();
        boolean result = false;

        if (UserType == "Staff"){
            $username = usernameField.getText();
            $password = passwordField.getText();

            result = staffLogin.validate($username, $password);
            //System.out.println($username);
            //System.out.println($password);
            //System.out.println(result);
        } else if (UserType == "Student"){
            $username = usernameField.getText();
            $password = passwordField.getText();

            result = studentLogin.validate($username, $password);
            //System.out.println($username);
            //System.out.println($password);
            //System.out.println(result);
        }
           if (result) {
               ((Node) (event.getSource())).getScene().getWindow().hide();
               Stage primaryStage = new Stage();


               if (UserType == null){
                   Alert alert = new Alert(Alert.AlertType.ERROR, "You need to select an account type (student/staff) from the drop down box.", ButtonType.OK);
                   alert.showAndWait();

                   if (alert.getResult() == ButtonType.OK) {
                       Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
                       primaryStage.setScene(new Scene(root, 600, 400));
                   }
               }

               if (UserType == "Staff"){
                   Parent root = FXMLLoader.load(getClass().getResource("fxml/staff.fxml"));
                   primaryStage.setScene(new Scene(root, 600, 400));
               } else if (UserType == "Student"){
                   Parent root = FXMLLoader.load(getClass().getResource("fxml/student.fxml"));
                   primaryStage.setScene(new Scene(root, 600, 400));
               }
               primaryStage.getIcons().add(new Image("hai/file/icon.png"));
               primaryStage.setTitle("HaiOnline");
               primaryStage.setResizable(false);
               primaryStage.show();

           } else {
               errorMessage.setVisible(true);
               errorMessage.setManaged(true);
           }
       }

    @FXML
    public ComboBox<String> userType;

    ObservableList<String> list  = FXCollections.observableArrayList("Student", "Staff");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userType.setItems(list);
        errorMessage.setVisible(false);
        errorMessage.setManaged(false);
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




