package String;

class Mobile {
    String brand;
    int price;
    String name;

    public void show() {
        System.out.println("Mobile Brand is" + brand + " " + "and price :" + price + "name Is:" + name);
    }
}


public class static_keyword {
    public static void main(String[] args) {
        Mobile mob = new Mobile();
        mob.brand = "Iphone";
        mob.name = "!6 pro max";
        mob.price = 35000;


        Mobile mob1 = new Mobile();
        mob1.brand = "MOTO";
        mob1.name = " pro max";
        mob1.price = 45000;


        mob.show();
        mob1.show();
    }
}
