package br.com.cdp.consumomarinetrafficapi.controllers;

import br.com.cdp.consumomarinetrafficapi.models.db.DB;
import br.com.cdp.consumomarinetrafficapi.models.entities.Vessel;
import br.com.cdp.consumomarinetrafficapi.utils.CurrentStage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.controlsfx.tools.Utils;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private Button btnAdicionarEmbarcacao;

    @FXML
    private Button btnPesquisarEmbarcacao;

    @FXML
    private TextField txtPesquisarEmbarcacao;

    @FXML
    private TableView<Vessel> tableViewEmbarcacao;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void onBtAdicionarEmbarcacoesAction(ActionEvent event){
        createDialogVesselImport(CurrentStage.currentStage(event));
        DB.getConnection();
    }

    private void createDialogVesselImport(Stage parentStage){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/com/cdp/consumomarinetrafficapi/VesselImport.fxml"));
            Pane pane = loader.load();

            Scene scene = new Scene(pane);
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            Stage dialogStage =  new Stage();
            dialogStage.setTitle("Importação De Embarcações");
            dialogStage.setResizable(false);
            dialogStage.setScene(scene);
            dialogStage.initOwner(parentStage);
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.showAndWait();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
