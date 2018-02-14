package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private loginModel model = new loginModel();
    //import object from scence builder
    @FXML
    private Label dbStatus;
    @FXML
    private Label loginStatus;
    @FXML
    private TextField name;
    @FXML
    private PasswordField pass;
    @FXML
    private Button btnlogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (this.model.isDatabaseConnection()){
            this.dbStatus.setText("Connected to DB");
        }else {
            this.dbStatus.setText("Not Connect to DB");
        }
    }//initialize
    @FXML
    public void Login(ActionEvent event){
        System.out.println(name.getText());
        System.out.println(pass.getText());
        try {
            if (model.islogin(name.getText(),pass.getText())){
                Stage stage = (Stage) this.btnlogin.getScene().getWindow();
                //Stage.close();
                loginStatus.setText("Welcome to our System");
            }else {
                loginStatus.setText("Your user or password is invalid.");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }//login

    private void




}//class
