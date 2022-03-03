package br.com.cdp.consumomarinetrafficapi.controllers;

import br.com.cdp.consumomarinetrafficapi.models.entities.Vessel;
import br.com.cdp.consumomarinetrafficapi.services.VesselServices;
import br.com.cdp.consumomarinetrafficapi.utils.CurrentStage;
import br.com.cdp.consumomarinetrafficapi.utils.jsonToObject;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import net.synedra.validatorfx.Validator;
import org.controlsfx.tools.Utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class VesselImportController implements Initializable {

    @FXML
    Button btnSelectedImportManual;

    @FXML
    Button btnSelectedImportCsv;

    @FXML
    TextField txtChaveAcesso;

    @FXML
    TextField txtImo;

    @FXML
    Button btnUploadFile;

    @FXML
    Button btnImportManual;

    @FXML
    Button btnImportCsv;

    @FXML
    Label lblNomeArquivo;

    @FXML
    GridPane gridPaneManualImports;

    @FXML
    GridPane gridPaneCsvImports;

    Validator validator = new Validator();

    File selectedFile;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        validateCampos();
    }

    private void validateCampos(){
        validator.createCheck()
                .dependsOn("chave", txtChaveAcesso.textProperty())
                .withMethod(c -> {
                    String chave = c.get("chave");
                    if (chave.isEmpty()) {
                        c.error("Campo Não Pode Ficar em Branco");
                    }
                })
                .decorates(txtChaveAcesso)
                .immediate();
        if(!gridPaneManualImports.isDisabled()){
            validator.createCheck()
                    .dependsOn("imo", txtImo.textProperty())
                    .withMethod(c -> {
                        String imo = c.get("imo");
                        if (imo.isEmpty() && !gridPaneManualImports.isDisabled()) {
                            c.error("Campo Não Pode Ficar em Branco");
                        }
                    })
                    .decorates(txtImo)
                    .immediate();
        }
    }

    @FXML
    private void onBtActionImportVesselManual(){
        Vessel vessel = jsonToObject.transformJsonToObject(txtChaveAcesso.getText(), txtImo.getText());
        VesselServices services = new VesselServices();
        services.save(vessel);
    }

    @FXML
    private void onBtSelectImportationManualAction(){
        gridPaneManualImports.setDisable(false);
        gridPaneCsvImports.setDisable(true);
    }

    @FXML
    private void onBtSelectImportationCsvAction(){
        gridPaneManualImports.setDisable(true);
        gridPaneCsvImports.setDisable(false);
    }

    @FXML
    public void onBtActionBtnFile(ActionEvent event) {
        try {
            FileChooser fileChooser = new FileChooser();
            selectedFile = fileChooser.showOpenDialog(CurrentStage.currentStage(event));

            if (selectedFile != null) {
                FileReader fileReader = new FileReader(selectedFile);
                CSVReader csvReader = new CSVReader(fileReader);

                List<String[]> imos = csvReader.readAll();

                for (String[] row : imos) {
                    for (String cell : row) {
                        System.out.println(cell + "\t");
                    }
                }
                lblNomeArquivo.setText(selectedFile.getName());
            }
        }catch (IOException | CsvException e){
            e.printStackTrace();
        }

    }
}
