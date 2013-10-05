package spring.tx.demo.programmatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.tx.demo.BookShop;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("app-ctx-programmatic.xml");
        BookShop bookShop = (BookShop) context.getBean("bookShop");
        bookShop.purchase("1", "Manoj");
    }
}