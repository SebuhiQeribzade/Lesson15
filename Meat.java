package Lesson15;

 class Meat implements Product {
     private String name;
     private double unitprice;
     private double amount;
     public Meat(String name, double unitprice, double amount){
         this.name=name;
         this.unitprice=unitprice;
         this.amount=amount;
     }

     @Override
     public double getAmount() {
         return amount;
     }

     @Override
     public double getUnitPrice() {
         return unitprice;
     }
     @Override
     public double getCost() {
         return amount*unitprice;
     }
 }
