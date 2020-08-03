/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapp;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Olebogeng Letlhoyo
 */
public class FXMLDocumentController implements Initializable {
    
 
    
    @FXML
    private TextField display;

    @FXML
    private JFXButton seven;

    @FXML
    private JFXButton eight;

    @FXML
    private JFXButton nine;

    @FXML
    private JFXButton four;

    @FXML
    private JFXButton Five;

    @FXML
    private JFXButton six;

    @FXML
    private JFXButton one;

    @FXML
    private JFXButton two;

    @FXML
    private JFXButton three;

    @FXML
    private JFXButton Ans;

    @FXML
    private JFXButton zero;

    @FXML
    private JFXButton dot;

    @FXML
    private JFXButton percentage;

    @FXML
    private JFXButton Brackets;

    @FXML
    private JFXButton removeLast;

    @FXML
    private JFXButton divide;

    @FXML
    private JFXButton multiply;

    @FXML
    private JFXButton minus;

    @FXML
    private JFXButton plus;

    @FXML
    private JFXButton equal;

    
    @FXML
    private void ZeroButtonAction(ActionEvent event) {
        display.setText(display.getText()+"0");
    }
    
     @FXML
    public void one(ActionEvent e1){
    display.setText(display.getText()+"1");
    }
    
    @FXML
    public void two(ActionEvent e2){
        display.setText(display.getText()+"2");
    }@FXML
    public void three(ActionEvent e3){
        display.setText(display.getText()+"3");
    }
    @FXML
    public void four(ActionEvent e4){
        display.setText(display.getText()+"4");
    }
    @FXML
    public void five(ActionEvent e5){
        display.setText(display.getText()+"5");
    }
    @FXML
    public void six(ActionEvent e6){
        display.setText(display.getText()+"6");
    }
    @FXML
    public void seven(ActionEvent e7){
        display.setText(display.getText()+"7");
    }
    @FXML
    public void eight(ActionEvent e8){
        display.setText(display.getText()+"8");
    }
    @FXML
    
    public void nine(ActionEvent e9){
        display.setText(display.getText()+"9");
    }
    
    @FXML
    public void percentage(ActionEvent ePes){
        double pes =Double.parseDouble(display.getText())/100;
        
        display.setText(String.valueOf(pes));
    }
    @FXML
    public void bracket(ActionEvent eBracket){
        
    }
    
    
    
    
    
    double data1;
    int signDetect;
    public void plusSign(ActionEvent eplus) throws IOException{
        signDetect =1;
        data1=Double.parseDouble(display.getText());
        
        display.setText("");
    }
    public void minus(ActionEvent eminus) throws IOException{
        signDetect =2;
        data1=Double.parseDouble(display.getText());
        display.setText("");
    }
    public void multi(ActionEvent emulti) throws IOException{
        signDetect =3;
        data1=Double.parseDouble(display.getText());
        display.setText("");
    }
    public void divide(ActionEvent edivide) throws IOException{
        signDetect =4;
        data1=Double.parseDouble(display.getText());
        display.setText("");
    }
    @FXML
    public void equal(ActionEvent equal) throws IOException{
        double data2 =Long.parseLong(display.getText());
        double result;
        switch(signDetect){
            case 1:
                result =(double) (data1+data2);
                display.setText(String.valueOf(result));break;
            case 2:
                result =(double) (data1-data2);
                display.setText(String.valueOf(result));break;
            case 3:
                result =(double) (data1*data2);
                display.setText(String.valueOf(result));break;
            case 4:
                result =(double) (data1/data2);
                display.setText(String.valueOf(result));break;
        }
    }
    
    @FXML
    public void clear(ActionEvent clear) throws IOException{
        display.setText("");
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
