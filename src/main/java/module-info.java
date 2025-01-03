module ac.id.telkomuniversity {
    requires javafx.controls;
    requires javafx.fxml;

    opens ac.id.telkomuniversity to javafx.fxml;
    exports ac.id.telkomuniversity;
}
