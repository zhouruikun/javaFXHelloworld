import LoginCode.JavaFXDemo;
import LoginFXML.JavaFXDemoFXML;
import YouTubeDownloader.YoutubeDownloader;
import animate.ColorfulCircles;
import org.opencv.core.Core;

import static javafx.application.Application.launch;

public class Main {
//    static {
//        System.loadLibrary("libs/" + Core.NATIVE_LIBRARY_NAME);
//    }
    public static void main(String[] args) {
        launch(YoutubeDownloader.class);
        // launch(JavaFXDemo.class);
        // launch(JavaFXDemoFXML.class);
        // launch(ColorfulCircles.class);

    }
}
