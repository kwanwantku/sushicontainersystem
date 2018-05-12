package util;

import javafx.application.Application;
import javafx.stage.Stage;

public interface ChangeSceneController {
	
	public static void switchPages(Stage window, Application app) {
		try {
			app.start(window);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
