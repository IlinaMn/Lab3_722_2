package Methods;

import Produkt.Product;

import java.util.*;

public class Methods {

    public double sumAfterDisc(List<Product> list){

        double sum = 0;

        for(Product e : list){
            e.apply();
            e.round();

            sum += e.getPrice();
        }

        return sum;
    }

    public List<Product> oneHundredAfterDisc(List<Product> list){

        List<Product> listNew = new ArrayList<>();

        for(Product e : list){
            e.apply();
            e.round();
            if(e.getPrice() > 100)
                listNew.add(e);
        }

        return listNew;
    }

    public List<Product> sortedAfterDisc(List<Product> list){
        List<Product> listNew = new ArrayList<>();

        for(Product e : list){
            e.apply();
            e.round();
            listNew.add(e);
        }
        listNew.sort((a1, a2) -> (int) (a1.getPrice() - a2.getPrice()));

        return listNew;
    }

    public List<Product> extremes(List<Product> list) throws Exception {
        List<Product> listNew = new ArrayList<>();

        double maxPrice = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;
        Product maxProduct = null;
        Product minProduct = null;

        for(Product e : list){
            e.apply();
            e.round();
            listNew.add(e);
        }
        for(Product e : listNew){
            if(e.getPrice() > maxPrice)
                maxProduct = e;
            if(e.getPrice() < minPrice)
                minProduct = e;

        }

        if(listNew.isEmpty()) throw new Exception("Empty list");

        List<Product> listNew1 = new ArrayList<>();

        listNew1.add(maxProduct);
        listNew1.add(minProduct);

        return listNew1;
    }
}
