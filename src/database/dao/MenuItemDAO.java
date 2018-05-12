package database.dao;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import model.menu.MenuItem;

import java.sql.SQLException;
import java.util.List;

public class MenuItemDAO extends BaseDaoImpl<MenuItem, Integer> {


    public MenuItemDAO(ConnectionSource connectionSource, Class<MenuItem> dataClass) throws SQLException {
        super(connectionSource, dataClass);
    }
    //ดึงหมด
    public List<MenuItem> all() {
        QueryBuilder<MenuItem, Integer> query = queryBuilder();
        try {
            return query.orderBy("productId", false).query();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    //กำหนดหน้าว่าให้โชว์กี่หน้า
    public List<MenuItem> all(int offset, int limit) {
        QueryBuilder<MenuItem, Integer> query = queryBuilder();
        try {
            return query.orderBy("productId", false).offset((long) offset).limit((long) limit).query();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    //ดึงตามid or query อะไรก็ได้
    public MenuItem get(int productId) {
        QueryBuilder<MenuItem, Integer> query = queryBuilder();
        try {
            List<MenuItem> list = query.where().eq("productId", productId).query();
            if (list.size() > 1) {
                throw new SQLException("query id but result has more than 1 row");
            }
            return list.size() == 1 ? list.get(0) : null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
