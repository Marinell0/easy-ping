module com.marinello {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.marinello to javafx.fxml;
    exports com.marinello;
}
