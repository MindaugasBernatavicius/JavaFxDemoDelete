package cf.mindaugas.javafxdemodelete;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.SessionFactory;

import java.io.IOException;

public class App extends Application {
    private SessionFactory hibSession;

    @Override
    public void start(Stage stage) throws IOException {
        hibSession = HibernateUtil.getSessionFactory();
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