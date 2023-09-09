module cf.mindaugas.javafxdemodelete {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires java.naming;

    opens cf.mindaugas.javafxdemodelete to javafx.fxml, org.hibernate.orm.core;
    exports cf.mindaugas.javafxdemodelete;
    exports cf.mindaugas.javafxdemodelete.controllers;
    opens cf.mindaugas.javafxdemodelete.controllers to javafx.fxml, org.hibernate.orm.core;
    exports cf.mindaugas.javafxdemodelete.data;
    opens cf.mindaugas.javafxdemodelete.data to javafx.fxml, org.hibernate.orm.core;
}