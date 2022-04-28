module com.example.itproger_calc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.itproger_calc to javafx.fxml;
    exports com.example.itproger_calc;
}