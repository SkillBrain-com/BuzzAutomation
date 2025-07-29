package homework.GabrielaDumitru.Selenium.java.Tema3Selenium.java.com.skillbrain.curatestframework;

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