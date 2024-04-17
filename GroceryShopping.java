package Lesson15;

public class GroceryShopping {
  Product[] shoppinglist;
    public  GroceryShopping{
        shoppinglist=new Product[];
    }


    public void  addProduct(Product product){
        return shoppingList[shoppinglist.length++] = product;

    }
    public void calculateTotalCost(){
    totalCost += shoppingList[shoppinglist.length].getCost();}
    public void printRecipt(){
        System.out.println(shoppingList[shoppinglist.length])
        System.out.println("Hesabınız:" + calculateTotalCost());
    }
        };





