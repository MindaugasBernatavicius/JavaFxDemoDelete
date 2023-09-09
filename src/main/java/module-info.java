module cf.mindaugas.javafxdemodelete {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires java.naming;

    opens cf.mindaugas.javafxdemodelete to javafx.fxml, org.hibernate.orm.core;
    exports cf.mindaugas.javafxdemodelete;
}