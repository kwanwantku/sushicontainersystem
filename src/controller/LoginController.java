package controller;

import application.CustomerHome;
import application.Login;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import util.ChangeSceneController;

public class LoginController {
	
	@FXML
	private TextField username;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private Button loginadmin;
	
	@FXML
	private Button cancel;
	
	private Alert alert;
	
	public void administratorManagerHandler(ActionEvent event) {
		if(username.getText().equals("") ) {
			alert = new Alert(AlertType.ERROR, "Please fill username.", ButtonType.OK);
			alert.setHeaderText("You not put username");
			alert.show();
		}
		else if(password.getText().equals("")) {
			alert = new Alert(AlertType.ERROR, "Please fill password.", ButtonType.OK);
			alert.setHeaderText("You not put password");
			alert.show();
			
		}
		else if(username.getText().equals("") && password.getText().equals("")) {
			alert = new Alert(AlertType.ERROR, "Please fill password.", ButtonType.OK);
			alert.setHeaderText("You not put username and password");
			alert.show();
			
		}
		else {
			
		}
//		ChangeSceneController.switchPages((Stage) customer.getScene().getWindow(), new CustomerHome());
	}
	
	public void cancelHandler(ActionEvent event) {
		ChangeSceneController.switchPages((Stage) cancel.getScene().getWindow(), new Main());
	}
	
	

}
