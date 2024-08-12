module com.github.cloudsec.akskwhoamigui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.github.cloudsec.akskwhoamigui to javafx.fxml;
    exports com.github.cloudsec.akskwhoamigui;
}