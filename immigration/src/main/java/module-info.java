module com.immigration {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.immigration to javafx.fxml;

    exports com.immigration;
}
