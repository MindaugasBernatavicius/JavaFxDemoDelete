package cf.mindaugas.javafxdemodelete;

import cf.mindaugas.javafxdemodelete.controllers.HelloController;
import cf.mindaugas.javafxdemodelete.data.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.SessionFactory;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class App extends Application {
    private SessionFactory hibSession;

    @Override
    public void start(Stage stage) throws IOException {
        var props = new Properties();
        props.load(new FileInputStream("target\\classes\\app.properties"));

        hibSession = HibernateUtil.getSessionFactory(props);
        var resource = App.class.getResource("hello-view.fxml");
        var fxmlLoader = new FXMLLoader(resource);

        var helloController = new HelloController(hibSession);
        fxmlLoader.setController(helloController);

        var scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello SDA JEE27 class!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        HibernateUtil.shutdown();
        super.stop();
    }

    public static void main(String[] args) {
        launch();
    }
}