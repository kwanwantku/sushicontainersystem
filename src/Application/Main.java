package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) { 
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/startup.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.sizeToScene();
            stage.show();

//            FileChooser c = new FileChooser();
//            c.setTitle("Test B File");
//            File f = c.showOpenDialog(stage);
//            System.out.println(f.getAbsolutePath());

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}