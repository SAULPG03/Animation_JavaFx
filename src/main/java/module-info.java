module com.example.animation_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animation_javafx to javafx.fxml;
    exports com.example.animation_javafx;
}