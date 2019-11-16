package RestaurantExercise;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args){
        Menu menu = new Menu();

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem menuItem1 = new MenuItem(1, "Tomato Soup", "Soup made from Tomatoes", "Soups", 3.99, new Date());
        menuItems.add(menuItem1);

        menu.setMenuItems(menuItems);

        System.out.println(menu);
    }
}
