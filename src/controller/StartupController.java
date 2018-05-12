package controller;

import application.CustomerHome;
import application.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.stage.Stage;
import util.ChangeSceneController;

public class StartupController {
	
	@FXML
	private Button customer;
	
	@FXML
	private Button administrator;
	
	public void customerModeHandler(ActionEvent event) {
		ChangeSceneController.switchPages((Stage) customer.getScene().getWindow(), new CustomerHome());
	}
	
	public void administratorModeHandler(ActionEvent event) {
		ChangeSceneController.switchPages((Stage) administrator.getScene().getWindow(), new Login());
	}


	

}
