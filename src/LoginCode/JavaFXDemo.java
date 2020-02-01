package LoginCode;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class JavaFXDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25 ,25,25,25));

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setId("welcome");
        gridPane.add(sceneTitle,0,0,2,1);
        Label username = new Label("user name");
        gridPane.add(username,0,1);
        TextField usernameField = new TextField();
        gridPane.add(usernameField,1,1);
        Label password = new Label("password");
        gridPane.add(password,0,2);
        PasswordField passwordField = new PasswordField();
        gridPane.add(passwordField,1,2);
        Button button = new Button("Sign in");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(button);
        gridPane.add(hBox,1,4);
        final Text actionTarget = new Text();
        gridPane.add(actionTarget,1,6);
        actionTarget.setId("actionTarget");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actionTarget.setText("Sign in is press");
            }
        });

        Scene scene = new Scene(gridPane,300,275);
        scene.getStylesheets().add(JavaFXDemo.class.getResource("login.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
