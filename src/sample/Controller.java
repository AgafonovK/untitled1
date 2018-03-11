package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class Controller {

    @FXML
    private BorderPane borderPane;


    @FXML
    private void ui1(MouseEvent event) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));

        borderPane.setCenter(root);
    }
}
