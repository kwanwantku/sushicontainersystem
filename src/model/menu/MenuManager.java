package model.menu;

import java.util.ArrayList;
import java.util.List;

public class MenuManager {

    private static MenuManager instance = null;

    public static MenuManager getInstance() {
        if (instance == null) {
            instance = new MenuManager();
        }
        return instance;
    }

    private MenuManager() {
    }

    private List<MenuItem> items;


    private List<MenuItem> readAllItems() {
        if (items == null) {
            //DB
            items = new ArrayList<>();
            items.add(new Sushi(3, "Tamako", "", 50));
            items.add(new Appitizer(4, "Apppp", "", 50));
            items.add(new Sweet(5, "swwwww`", "", 50));
        }
        return items;
    }

    public List<MenuItem> all(){
        return readAllItems();
    }

}
