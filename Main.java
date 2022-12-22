package com.journaldev;

import com.journaldev.model.Menu;
import com.journaldev.spring.config.AppConfig;
import com.journaldev.spring.dao.MenuDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MenuDAO menuDAO = ctx.getBean(MenuDAO.class);

        System.out.println("Whole menu: ");

        for(Menu p: menuDAO.getWholeMenu()){
            System.out.println(p);
        }

        System.out.println("\nGet dish with ID 2:");

        Menu menuById = menuDAO.getDishById(2);
        System.out.println(menuById);


        System.out.println("\nCreating new dish: ");
        Menu menu = new Menu(11,"chesee balls", 200);
        System.out.println(menu);
        menuDAO.createDish(menu);
        System.out.println("Whole menu:");

        for (Menu p : menuDAO.getWholeMenu()) {
            System.out.println(p);
        }
        System.out.println("done");
    }
}
