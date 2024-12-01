module com.asubank.asubank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.asubank.asubank to javafx.fxml;
    exports com.asubank.asubank;
    exports com.asubank.asubank.Controllers;
    opens com.asubank.asubank.Controllers to javafx.fxml;
}