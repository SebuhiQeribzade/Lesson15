package Lesson15;

public class ShoppingMain {
    public static void main(String[] args) {
        GroceryShopping shopping = new GroceryShopping(7);

        Dairy milk = new Dairy("Süd", 2, 3);
        FreshProduce kartof = new FreshProduce("Kartof", 1, 5);
        Meat qirmiziet = new Meat("Quzu", 14, 2);

        shopping.addProduct(milk);
        shopping.addProduct(kartof);
        shopping.addProduct(qirmiziet);

        shopping.printReceipt();
    }

    }
}
