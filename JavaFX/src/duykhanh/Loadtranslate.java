package duykhanh;

import java.io.File;
        import java.net.MalformedURLException;
        import java.net.URL;

        import javafx.application.Application;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Insets;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.layout.VBox;
        import javafx.scene.web.WebEngine;
        import javafx.scene.web.WebView;
        import javafx.stage.Stage;

public class Loadtranslate extends Application {

    @Override
    public void start(final Stage stage) {

        Button buttonURL = new Button("Load Page https://eclipse.org");

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

           buttonURL.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String url = "https://eclipse.org";
                // Load a page from remote url.
                webEngine.load(url);
            }
        });

    }}