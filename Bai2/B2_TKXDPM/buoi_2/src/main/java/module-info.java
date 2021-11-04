module com.example.buoi_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buoi_2 to javafx.fxml;
    exports com.example.buoi_2;
}