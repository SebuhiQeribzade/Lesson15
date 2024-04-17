package Lesson15;

class  Dairy implements Product  {
    private String name;
    private double unitprice;
    private double amount;
    public Dairy(String name, double unitprice, double amount){
        this.name=name;
        this.unitprice=unitprice;
        this.amount=amount;
    }
    @Override
    public double getUnitPrice() {
      return unitprice;
    }

    @Override
    public double getAmount() {
      return amount;
    }

    @Override
    public double getCost() {
        return unitprice*amount;
    }

    @Override
    public String toString() {
        return "Dairy{" +
                "name='" + name + '\'' +
                ", unitprice=" + unitprice +
                ", amount=" + amount +
                '}';
    }
}
