package model.menu;

import util.MenuAdapter;

import java.util.ArrayList;
import java.util.List;

public class MenuManager implements MenuAdapter.DataSource {

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
            items.add(new Sushi("s001", "Tamako", "", 50));
            items.add(new Appitizer("a001", "Apppp", "", 50));
            items.add(new Sweet("w001", "swwwww`", "", 50));
        }
        return items;
    }

    public List<MenuItem> all(){
        return readAllItems();
    }

    @Override
    public MenuAdapter.Item getItem(int index) {
        return readAllItems().get(index);
    }

    @Override
    public int getCount() {
        return readAllItems().size();
    }

}
