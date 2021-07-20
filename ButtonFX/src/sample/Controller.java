package sample;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Button clickMeButton;
    public void initialize(){
        clickMeButton.setOnAction(event -> System.out.println("You clicked me!"));
    }

}
