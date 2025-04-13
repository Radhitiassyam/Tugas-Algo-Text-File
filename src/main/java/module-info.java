module com.radhitias {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.radhitias to javafx.fxml;
    exports com.radhitias;
}
