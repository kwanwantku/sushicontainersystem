package util;

import javafx.scene.image.ImageView;

public class ImageHelper {

    public static void bind(ImageView image, String imagePath){
        image.setImage(ImageFactory.getInstance().getImage(imagePath));
    }
}
