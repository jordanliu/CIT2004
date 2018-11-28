package hai;

import com.google.gson.Gson;
import hai.Questions;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    private Label question6;
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
}
