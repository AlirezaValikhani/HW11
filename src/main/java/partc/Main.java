package partc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1,"Shoes",60.0,new Category(1,"Clothing",null));
        Product p2 = new Product(2,"T-Shirt",40.0,new Category(1,"Clothing",null));
        Product p3 = new Product(3,"LapTop",90.0,new Category(2,"Electronic",null));
        Product p4 = new Product(4,"Smart Phone",70.0,new Category(2,"Electronic",null));
        Product p5 = new Product(5,"Rice",30.0,new Category(3,"FoodStuff",null));
        Product p6 = new Product(6,"Spaghetti",20.0,new Category(3,"FoodStuff",null));
        Product p7 = new Product(7,"Tooth Brush",15.0,new Category(4,"Healthy",null));
        Product p8 = new Product(8,"After Shave",40.0,new Category(4,"Healthy",null));

        List<Product> products = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);

        //قسمت پ (1)
        products
                .stream()
                .filter(product -> product.getCategory().getName().equals("Healthy"))
                .forEach(System.out::println);


        Order o1 = new Order(1,new java.sql.Date(2021-3-28),Arrays.asList(p1,p4), Arrays.asList(1,2),200.0,
                new Customer(1,"Alireza","Valikhani",250.0));
        Order o2 = new Order(2,new java.sql.Date(2021-4-2),Arrays.asList(p2,p6), Arrays.asList(1,1),60.0,
                new Customer(2,"Hamid","Nori",100.0));
        Order o3 = new Order(3,new java.sql.Date(2021-6-22),Arrays.asList(p5,p3), Arrays.asList(3,1),180.0,
                new Customer(3,"Majid","Delbandam",200.0));
        Order o4 = new Order(4,new java.sql.Date(2021-3-5),Arrays.asList(p7,p2), Arrays.asList(1,1),55.0,
                new Customer(4,"John","Sina",100.0));
        Order o5 = new Order(5,new java.sql.Date(2021-6-22),Arrays.asList(p3,p8), Arrays.asList(2,2),260.0,
                new Customer(5,"Sina","mohammadi",350.0));

        List<Order> orders = new ArrayList<>();


        orders.addAll(Arrays.asList(o1, o2, o3, o4, o5));

        //قسمت پ (2)
        orders
                .stream()
                .filter(order -> order.getOrderDate().after(new java.sql.Date(2021-2-1)) &&
                        order.getOrderDate().before(new java.sql.Date(2021-4-1)))
                        .forEach(order -> System.out.println(order.getProducts()));

        //قسمت پ (3)
        System.out.println(products
                .stream()
                .filter(product -> product.getCategory().getName().equals("Electronic"))
                .min(Comparator.comparing(Product::getPrice)));

        //قسمت پ (4)
        orders
                .stream()
                .filter(order -> order.getOrderDate().equals(new java.sql.Date(2021-6-22)))
                .mapToDouble(Order::getTotalPrice)
                .average()
                .ifPresent(avg -> System.out.println("Average price of this date is " + avg));

    }
}
