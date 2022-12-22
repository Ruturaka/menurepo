package com.journaldev.spring.dao;

import com.journaldev.model.Menu;
import com.journaldev.model.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class MenuDAOImpl implements MenuDAO{
    JdbcTemplate jdbcTemplate;

    @Autowired
    public MenuDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Menu getDishById(Integer id) {
        return jdbcTemplate.queryForObject("select * from menu where id = ?", new Object[]{id}, new MenuMapper());

    }

    @Override
    public List<Menu> getWholeMenu() {
        return jdbcTemplate.query("select * from menu", new MenuMapper());

    }

    @Override
    public boolean createDish(Menu menu) {
        return jdbcTemplate.update("insert into menu(id, dish, price) values(?,?,?)", menu.getId(), menu.getDish(), menu.getPrice())>0;
    }

    @Override
    public boolean deleteCustomer(Menu menu) {
        return jdbcTemplate.update("dekete from menu where id=?", menu.getId())>0;
    }

    @Override
    public boolean updateCustomer(Menu menu) {
        return jdbcTemplate.update("update menu set dish=?, price=? where id=?", menu.getDish(), menu.getPrice(), menu.getId())>0;
    }


}
