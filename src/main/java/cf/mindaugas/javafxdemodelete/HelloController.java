package cf.mindaugas.javafxdemodelete;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.hibernate.SessionFactory;

public class HelloController {
    private final SessionFactory session;
    @FXML private TextField inputText;
    @FXML public Button displayButton;

    public HelloController(SessionFactory session) {
        this.session = session;
    }

    public void initialize() {
        this.displayButton.setOnAction(actionEvent -> {
            var ses = session.openSession();
            var tx = ses.beginTransaction();

            ses.persist(new Text(inputText.getText()));

            tx.commit();
            ses.close();
        });
    }
}