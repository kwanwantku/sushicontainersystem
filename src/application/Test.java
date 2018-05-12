package application;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.query.In;
import com.j256.ormlite.support.ConnectionSource;
import database.DatabaseConnector;
import database.dao.MenuItemDAO;
import model.menu.MenuItem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        try {

            DatabaseConnector db = DatabaseConnector.getInstance();
            MenuItemDAO menuitemdao = new MenuItemDAO(db.getConnection(), MenuItem.class);
            //create all list and print it
            List<MenuItem> menus = menuitemdao.all();

            System.out.println(menus);
            System.out.println(menuitemdao.get(10));

            //create a new menu
            MenuItem newMenu = new MenuItem(7,"test", "i", 123);
//            Dao<MenuItem, Integer> dao = DaoManager.createDao(db.getConnection(), MenuItem.class);
//            dao.create(newMenu);

            menuitemdao.createOrUpdate(newMenu);
            System.out.println(newMenu.getProductId());

            menuitemdao.delete(newMenu);
            //read csv
            Scanner scan = new Scanner(new FileReader("test.csv"));
            List<MenuItem> list = new ArrayList<>();
            while(scan.hasNextLine()){
                String[] fields = scan.nextLine().split(",");
                MenuItem menu = new MenuItem(Integer.parseInt(fields[0]),fields[1],fields[2],Double.parseDouble(fields[3]));
                list.add(menu);
                menuitemdao.createOrUpdate(menu);
            }
            scan.close();
            System.out.println(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}