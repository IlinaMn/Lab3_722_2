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

    public List<Product> onehundredafterdisc(List<Product> list){

        List<Product> listn = new ArrayList<Product>();

        for(Product e : list){
            e.apply();
            e.round();
            if(e.getPrice() > 100)
                listn.add(e);
        }

        return listn;
    }

    public List<Product> sortedAfterDisc(List<Product> list){
        List<Product> listNew = new ArrayList<Product>();

        for(Product e : list){
            e.apply();
            e.round();
            listNew.add(e);
        }
        listNew.sort((a1, a2) -> (int) (a1.getPrice() - a2.getPrice()));

        return listNew;
    }

    public List<Product> extremes(List<Product> list) throws Exception {
        List<Product> listNew = new ArrayList<Product>();

        double maxPrice = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;
        Product pmax = null;
        Product pmin = null;

        for(Product e : list){
            e.apply();
            e.round();
            listNew.add(e);
        }
        for(Product e : listNew){
            if(e.getPrice() > maxPrice)
                pmax = e;
            if(e.getPrice() < minPrice)
                pmin = e;

        }

        if(listNew.isEmpty()) throw new Exception("Empty list");

        List<Product> listNew1 = new ArrayList<Product>();

        listNew1.add(pmax);
        listNew1.add(pmin);

        return listNew1;
    }
}
