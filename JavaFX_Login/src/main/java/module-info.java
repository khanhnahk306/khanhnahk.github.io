module com.example.javafx_login {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafx_login to javafx.fxml;
    exports com.example.javafx_login;
}