module com.planaton {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.planaton to javafx.fxml;
    exports com.planaton;
}
