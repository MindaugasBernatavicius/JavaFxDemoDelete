module cf.mindaugas.javafxdemodelete {
    requires javafx.controls;
    requires javafx.fxml;

    opens cf.mindaugas.javafxdemodelete to javafx.fxml;
    exports cf.mindaugas.javafxdemodelete;
}