package hai;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SetTestController{
    @FXML
    private TextField idNumber;
    @FXML
    private TextField courseName;
    @FXML
    private TextField courseCode;
    @FXML
    private TextField testDate;

    public void setTest(ActionEvent event){
        String fileName = idNumber.getText() + "-" + courseName.getText() + "-" + courseCode.getText() + "-" + testDate.getText() +".json";
        System.out.println(fileName);
        RandomJSON(fileName);
    }


    public static void RandomJSON(String filename) {
        Gson gson = new Gson();

        try{
            Questions[] arrayOne = new Questions[5];
            Questions[] randomQuestions = gson.fromJson(new FileReader("questions.json"), Questions[].class);
            System.out.println(gson.toJson(randomQuestions));

            int[] numbers = new int[5];
            for(int i = 0; i < numbers.length; i++) {
                numbers[i] = (int)(Math.random()*11 + 0);
                System.out.println(randomQuestions[numbers[i]].getQuestion() +" "+ randomQuestions[numbers[i]].getAnswer());
            }
            System.out.println("Random numbers generated:  " + Arrays.toString(numbers));


            ArrayList<Questions> allItems = new ArrayList<>();
            allItems.add(new Questions(randomQuestions[numbers[0]].getQuestion(), randomQuestions[numbers[0]].getAnswer()));
            allItems.add(new Questions(randomQuestions[numbers[1]].getQuestion(), randomQuestions[numbers[1]].getAnswer()));
            allItems.add(new Questions(randomQuestions[numbers[2]].getQuestion(), randomQuestions[numbers[2]].getAnswer()));
            allItems.add(new Questions(randomQuestions[numbers[3]].getQuestion(), randomQuestions[numbers[3]].getAnswer()));
            allItems.add(new Questions(randomQuestions[numbers[4]].getQuestion(), randomQuestions[numbers[4]].getAnswer()));

            for (Questions q : allItems) {
                System.out.println(q);
            }

                Gson gson1 = new Gson();
                String jsonString = gson1.toJson(allItems);
                FileWriter fileWriter = new FileWriter(filename);
                fileWriter.write(jsonString);
                fileWriter.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void cancel(ActionEvent event) throws Exception{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you would like to exit?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            primaryStage.getIcons().add(new Image("hai/file/icon.png"));
            Parent root = FXMLLoader.load(getClass().getResource("fxml/staff.fxml"));
            primaryStage.setTitle("HAIOnline");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.setResizable(false);
            primaryStage.show();
        }
    }
}


