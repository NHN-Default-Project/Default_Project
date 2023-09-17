module com.example.exercise06 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.exercise06 to javafx.fxml;
    exports com.example.exercise06;
}