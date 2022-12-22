package com.journaldev.spring.dao;

import com.journaldev.model.Menu;

import java.util.List;

public interface MenuDAO {
    Menu getDishById(Integer id);

    List<Menu> getWholeMenu();

    boolean createDish(Menu menu);

    boolean deleteCustomer(Menu menu);

    boolean updateCustomer(Menu menu);
}
