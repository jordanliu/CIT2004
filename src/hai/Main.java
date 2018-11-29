package hai;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.getIcons().add(new Image("hai/file/icon.png"));
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        primaryStage.setTitle("HAIOnline");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        //Creating user objects
        User info = new Staff(1, "jordan", "1234", "Jordan", "Liu", "FENC", "SCIT", "11/12/2018");
        User info1 = new Student(15067007, "rojay", "1234", "Rojay", "White", "FENC", "SCIT", "11/12/2018", false);

        /*Uncomment store(obj, obj) if this is your first time launching without the files (staff.txt, student.txt)*/
        //store(info, info1);
        retrieve(info, info1);
        launch(args);
    }

    public static void store(User obj, User obj1){
        obj.store();
        obj1.store();
    }

    public static void retrieve(User obj, User obj1){
        obj.retrieve();
        obj1.retrieve();
    }
}
