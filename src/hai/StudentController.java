package hai;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class StudentController implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        readJSON();
    }

    public void takeTest(ActionEvent event) throws Exception{
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Stage primaryStage = new Stage();
        primaryStage.getIcons().add(new Image("hai/file/icon.png"));
        Parent root = FXMLLoader.load(getClass().getResource("fxml/takeTest.fxml"));
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

    public void readJSON(){
      try{
          Gson gson = new Gson();
          Questions[] randomQuestions = gson.fromJson(new FileReader("default-default-default-default.json"), Questions[].class);
          System.out.println(gson.toJson(randomQuestions));

          ArrayList<Questions> allItems = new ArrayList<>();
          allItems.add(new Questions(randomQuestions[0].getQuestion(), randomQuestions[0].getAnswer()));
          allItems.add(new Questions(randomQuestions[1].getQuestion(), randomQuestions[1].getAnswer()));
          allItems.add(new Questions(randomQuestions[2].getQuestion(), randomQuestions[2].getAnswer()));
          allItems.add(new Questions(randomQuestions[3].getQuestion(), randomQuestions[3].getAnswer()));
          allItems.add(new Questions(randomQuestions[4].getQuestion(), randomQuestions[4].getAnswer()));

          for (Questions q : allItems) {
              System.out.println(q);
          }

      } catch (Exception e){
          e.printStackTrace();
      }
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