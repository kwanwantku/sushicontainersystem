package util;

import model.menu.MenuItem;

import java.util.List;

public class MenuAdapter {

    private DataSource dataSource;

    public MenuAdapter(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public interface DataSource{
        public Item getItem(int index);
        public int getCount();
    }

    public interface Item {
        public String getProductId();

        public String getName();

        public String getImage();

        public double getPrice();
    }
}
