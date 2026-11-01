module com.mycompany.horasextras {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.horasextras to javafx.fxml;
    exports com.mycompany.horasextras;
}
