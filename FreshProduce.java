package Lesson15;

class FreshProduce implements  Product {
    private String name;
    private double unitprice;
    private double amount;
    public FreshProduce(String name, double unitprice, double amount){
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
