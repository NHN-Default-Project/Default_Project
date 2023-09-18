module com.nhnacademy {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;


//    opens com.example.usingjavafx to javafx.fxml;
    opens com.nhnacademy.Chapter4.yunhwa.Exercise6 to javafx.fxml;
    opens com.nhnacademy.Chapter4.yunhwa.Exercise7 to javafx.fxml;
    opens com.nhnacademy.Chapter3.yunhwa.Exercise8 to javafx.fxml;
    opens com.nhnacademy.Chapter3.yunhwa.Exercise9 to javafx.fxml;
    exports com.nhnacademy.Chapter4.yunhwa.Exercise6;
    exports com.nhnacademy.Chapter4.yunhwa.Exercise7;
    exports com.nhnacademy.Chapter3.yunhwa.Exercise8;
    exports com.nhnacademy.Chapter3.yunhwa.Exercise9;

}