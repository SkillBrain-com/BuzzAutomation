package homework.GabrielaDumitru.Selenium.java.Tema4Selenium.java.com.skillbrain.ticket_types_new;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}