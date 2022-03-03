module br.com.cdp.consumomarinetrafficapi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires org.json;
    requires com.opencsv;
    requires validatorfx;

    opens br.com.cdp.consumomarinetrafficapi to javafx.fxml;
    opens br.com.cdp.consumomarinetrafficapi.applications to javafx.graphics;
    opens br.com.cdp.consumomarinetrafficapi.controllers to javafx.fxml;
}