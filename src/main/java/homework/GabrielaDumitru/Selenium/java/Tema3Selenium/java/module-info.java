module com.skillbrain.curatestframework {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.skillbrain.curatestframework to javafx.fxml;
    exports com.skillbrain.curatestframework;
}