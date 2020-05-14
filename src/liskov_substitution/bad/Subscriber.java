package liskov_substitution.bad;

public class Subscriber extends Customer{
    public Subscriber(String name){
        super(name);
    }

    @Override
    public void addToDatabase() {
        System.out.println("Subscriber " + this.name + " added to database");
    }

    @Override
    public void receiveCashback() throws Exception{
        throw new Exception("Cannot receive cashback!");
    }
}
