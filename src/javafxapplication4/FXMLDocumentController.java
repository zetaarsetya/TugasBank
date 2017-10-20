/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Zeta Arsetya
 */
public class FXMLDocumentController implements Initializable {
    
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private Label label;
    @FXML
    private PasswordField editpin;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button buttonc;
    @FXML
    private Button button0;
    @FXML
    private Button buttonok;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void satu(ActionEvent event) {
        pin += "1";
        editpin.setText(pin);
    }

    @FXML
    private void dua(ActionEvent event) {
        pin += "2";
        editpin.setText(pin);
    }

    @FXML
    private void tiga(ActionEvent event) {
        pin += "3";
        editpin.setText(pin);
    }

    @FXML
    private void empat(ActionEvent event) {
        pin += "4";
        editpin.setText(pin);
    }

    @FXML
    private void lima(ActionEvent event) {
        pin += "5";
        editpin.setText(pin);
    }

    @FXML
    private void enam(ActionEvent event) {
        pin += "6";
        editpin.setText(pin);
    }

    @FXML
    private void tujuh(ActionEvent event) {
        pin += "7";
        editpin.setText(pin);
    }

    @FXML
    private void delapan(ActionEvent event) {
        pin += "8";
        editpin.setText(pin);
    }

    @FXML
    private void sembilan(ActionEvent event) {
        pin += "9";
        editpin.setText(pin);
    }
    
    @FXML
    private void nol(ActionEvent event) {
        pin += "0";
        editpin.setText(pin);
    }

    @FXML
    private void ok(ActionEvent event) {
        if (pin.equals(PIN)){
            try{
               ((Node)(event.getSource())).getScene().getWindow().hide();
               FXMLLoader fxmlLoader = new FXMLLoader();
               fxmlLoader.setLocation (getClass().getResource("FXMLMenuBaru.fxml"));
               Scene scene = new Scene(fxmlLoader.load(),830, 450);
               
               Stage stage = new Stage();
               stage.setScene(scene);
               stage.setTitle("MenuBaru");
               stage.show();
            }catch (IOException e) {
                System.out.println("Failed to create new Window." + e);
            }
        }else {
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN salah \nTersisa " + kesempatan
                + "kesempatan lagi!");
            editpin.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }
    }
     @FXML
    private void c(ActionEvent event) {
        
        editpin.setText("");
    }

    
}
