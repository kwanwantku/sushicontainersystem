package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CustomerHome extends Application {
    @Override
	public void start(Stage stage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/customer-home.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.sizeToScene();
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
