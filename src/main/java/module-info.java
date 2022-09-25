module com.example.parameterizedbuild {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.parameterizedbuild to javafx.fxml;
    exports com.example.parameterizedbuild;
}