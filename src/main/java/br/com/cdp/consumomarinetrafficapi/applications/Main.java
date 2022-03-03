package br.com.cdp.consumomarinetrafficapi.applications;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

public class Main extends Application {

    Scene homeScene;
    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        Parent fxmlHome = FXMLLoader.load(Main.class.getResource("/br/com/cdp/consumomarinetrafficapi/Home.fxml"));
        homeScene = new Scene(fxmlHome,725,350);
        homeScene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        primaryStage.setScene(homeScene);
        primaryStage.setTitle("Vessel consuming");
        primaryStage.show();
    }
}
