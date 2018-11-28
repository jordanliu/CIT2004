package hai;

import com.google.gson.Gson;
import hai.Questions;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class takeTestController implements Initializable {
    @FXML
    private Label question1;
    @FXML
    private Label question2;
    @FXML
    private Label question3;
    @FXML
    private Label question4;
    @FXML
    private Label question5;
    @FXML
    private TextField answer1;
    @FXML
    private TextField answer2;
    @FXML
    private TextField answer3;
    @FXML
    private TextField answer4;
    @FXML
    private TextField answer5;

    int score = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

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

            question1.setText(randomQuestions[0].getQuestion());
            question2.setText(randomQuestions[1].getQuestion());
            question3.setText(randomQuestions[2].getQuestion());
            question4.setText(randomQuestions[3].getQuestion());
            question5.setText(randomQuestions[4].getQuestion());



        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void check(javafx.event.ActionEvent event) throws Exception{
        try {
            Gson gson = new Gson();
            Questions[] randomQuestions = gson.fromJson(new FileReader("default-default-default-default.json"), Questions[].class);
            if (answer1.getText().equals(randomQuestions[0].getAnswer())){
                score++;
            }

            if (answer2.getText().equals(randomQuestions[1].getAnswer())){
                score++;
            }

            if (answer3.getText().equals(randomQuestions[2].getAnswer())){
                score++;
            }

            if (answer4.getText().equals(randomQuestions[3].getAnswer())){
                score++;
            }

            if (answer5.getText().equals(randomQuestions[4].getAnswer())){
                score++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }


        System.out.println(score);
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "You scored: " + score +"/5", ButtonType.OK);
        alert.setTitle("HAIOnline");
        alert.setHeaderText("Score");
        alert.showAndWait();

        if (alert.getResult() == ButtonType.OK) {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            primaryStage.getIcons().add(new Image("hai/file/icon.png"));
            Parent root = FXMLLoader.load(getClass().getResource("fxml/student.fxml"));
            primaryStage.setTitle("HAIOnline");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.setResizable(false);
            primaryStage.show();
        }
    }
}
