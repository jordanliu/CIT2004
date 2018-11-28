package hai;

import com.google.gson.Gson;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/*
* TODO: ADD DEFAULT LOGINS FOR STAFF AND STUDENT
 */
import static hai.Staff.serializableJson;


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
        User info;
        info = new Staff(1, "jordan", "1234", "Jordan", "Liu", "FENC", "SCIT", "11/12/2018");
        User info1 = new Student(15067007, "shamari", "1234", "Shamari", "Cooper", "FENC", "SCIT", "11/12/2018");

        /*Uncomment store(obj, obj) if this is your first time launching without the files (staff.txt, student.txt)*/
        //store(info, info1);
        retrieve(info, info1);
        serializableJson();
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
