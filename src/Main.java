import Methods.Methods;
import Produkt.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product p1 = new Product();
        p1.setDays(10);
        p1.setPrice(1342.55);

        Product p2 = new Product();
        p2.setDays(20);
        p2.setPrice(23.55);

        List<Product> list = new ArrayList<Product>();

        list.add(p1);
        list.add(p2);

        Methods m = new Methods();

        System.out.println(m.sortedAfterDisc(list).toString());
    }



}