package util;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileNotFoundException;

public class ImageFactory {
	private static ImageFactory instance;
	private ImageFactory() {

	}

	public static ImageFactory getInstance() {
		if(instance == null) {
			instance = new ImageFactory();
		}
		return instance;
	}

	public Image getImage(String filename) {
	    //System.out.println(new File(filename).toURI().toString());
            File f = new File(filename);
            if(!f.exists()){
                f = new File("assets/defaultThumbnail");
            }
            return new Image(f.toURI().toString());
	}

	public ImageView getImageView(String filename) {
		return new ImageView(getImage(filename));
	}
}
//ImageView iv = ImageFactory.getInstance().getImage("prang.png");