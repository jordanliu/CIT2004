package hai;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class StaffTestController {

    public void exit(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you would like to exit?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            System.out.println("Exit");
        }
    }
}