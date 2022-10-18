package Produkt;

import java.io.FileOutputStream;
import java.util.Formatter;

public class Product {

    public double price;
    public int days;

    public void apply() {
        if (this.days > 10 && this.days < 20) {
            this.price = this.price - this.price / 10;
        }
        if (this.days > 20) {
            this.price = this.price - this.price / 20;
        }
    }

    public void round(){
        double price = 0.00;

        while(price < this.price){
            price += 0.05;
        }
        this.price = price;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + String.format( "%.2f",price) +
                ", days=" + days +
                '}';
    }
}
