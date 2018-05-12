package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.util.Callback;
import model.menu.MenuItem;
import model.menu.MenuManager;
import util.ImageFactory;
import util.ImageHelper;
import viewfx.TestCell;

public class CustomerHomeController {

    @FXML
    private ListView<MenuItem> itemListView;

    @FXML
    private ImageView itemImg;

    public void initialize(){
        ObservableList<MenuItem> itemList = FXCollections.observableArrayList();
        itemList.addAll(MenuManager.getInstance().all());
        itemListView.setCellFactory((ListView<MenuItem> l) -> new TestCell());
        itemListView.setItems(itemList);
        
        //System.out.println(getClass().getResourceAsStream("/Users/pranger54/Documents/workspace2/SushiContainerSystems/assets/img.jpg"));
        ImageHelper.bind(itemImg, "assets/img.jpg");
    }
}
