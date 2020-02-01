package LoginFXML;

import javafx.event.ActionEvent;
import javafx.scene.text.Text;

public class JavaFXDemoFXMLController  {

    public Text actionTarget;

    public void handleSubmit(ActionEvent actionEvent) {
    actionTarget.setText("Signed in pressed");
    }
}
