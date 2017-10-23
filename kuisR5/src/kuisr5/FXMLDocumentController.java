/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisr5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Syifaa
 */
public class FXMLDocumentController implements Initializable {
      @FXML
    private Label label;

    @FXML
    private Button proses;

    @FXML
    private Button reset;

    @FXML
    private TextField ideal;

    @FXML
    private TextArea hasil;
    
    @FXML
    private TextArea saran;

    @FXML
    private JFXRadioButton lk;

    @FXML
    private JFXRadioButton pr;

    @FXML
    private JFXTextField nm;

    @FXML
    private JFXTextField tg;

    @FXML
    private JFXTextField bb;

    @FXML
    void bb(ActionEvent event) {

    }

    @FXML
    void ideal(ActionEvent event) {

    }

    @FXML
    void lk(ActionEvent event) {

    }

    @FXML
    void nm(ActionEvent event) {

    }

    @FXML
    void pr(ActionEvent event) {

    }

    @FXML
    void proses(ActionEvent event) {
        int Ideal = 0;
        String Saran = "";
        String analisa = "";
        String nama = nm.getText();
        int tinggi = Integer.parseInt(tg.getText());
        int berat = Integer.parseInt(bb.getText());
        
        if(lk.isSelected()){
            Ideal = tinggi - 105;
            if(Ideal == berat){
                analisa = "ideal";
                Saran = "saran :\n beratmu bagusss";
            }else if(Ideal > berat){
                analisa = "Underweight";
                Saran = "saran :\n makan yang banyak \nrajin minum susu";
        }else if(Ideal < berat){
                analisa = "Overweight";
                Saran = "saran :\n makan teratur \nbanyak minum air";
        }
        }
        if(pr.isSelected()){
            Ideal = tinggi - 110;
            if(Ideal == berat){
                analisa = "ideal";
                Saran = "saran :\n pertahankan yaaa";
            }else if(Ideal > berat){
                analisa = "Underweight";
                Saran = "saran :\nmakan yang banyak \nrajin minum susu";
            }else if(Ideal < berat){
                analisa = "Overweight";
                Saran = "\nmakan teratur \nbanyak minum air";
            }
        }
        
       ideal.setText(""+Ideal);
       hasil.setText("Nama : "+nm.getText()+"\nAnda"+analisa);
       saran.setText(""+Saran);
    }

    @FXML
    void reset(ActionEvent event) {
        hasil.setText("");
        nm.setText("");
        tg.setText("");
        bb.setText("");
        lk.setSelected(false);
        pr.setSelected(false);
        saran.setText("");
        ideal.setText("");
    }

    @FXML
    void tg(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
