module com.example.mult2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mult2 to javafx.fxml;
    exports com.example.mult2;
}