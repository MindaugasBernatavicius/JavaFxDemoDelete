package cf.mindaugas.javafxdemodelete;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        var resource = App.class.getResource("hello-view.fxml");
        var fxmlLoader = new FXMLLoader(resource);
        var scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello SDA JEE27 class!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}