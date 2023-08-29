package com.driver;



class Product {
    public Product() {
    }

    public int product(int x, int y) {
        return x*y;

    }
    public int product(int x, int y, int z){
        return x*y*z;
    }
    public double product(double x, double y){
        return x*y;
    }
}

public class Main {
    public static void main(String[] args){
        Product p = new Product();


        p.product(10,15);
        p.product(10,15,20);
        p.product(5.3,2.5);
    }

}