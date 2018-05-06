package viewfx;

import javafx.scene.control.ListCell;
import model.menu.Appitizer;
import model.menu.MenuItem;
import model.menu.Sushi;
import model.menu.Sweet;

public class TestCell extends ListCell<MenuItem> {

    @Override
    protected void updateItem(MenuItem item, boolean empty) {
        super.updateItem(item, empty);
        if(item instanceof Sushi){
            setText("Sushi: " + item.getName());
        }
        else if(item instanceof Appitizer){
            setText("Appitizer: " + item.getName());
        }
        else if(item instanceof Sweet){
            setText("Sweet: " + item.getName());
        }
        else {
            setText("no");
        }
    }
}
