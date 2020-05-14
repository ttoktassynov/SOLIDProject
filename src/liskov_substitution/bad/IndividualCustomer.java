package liskov_substitution.bad;

public class IndividualCustomer extends Customer{

    public IndividualCustomer(String name, String customerType) {
        super(name);
        this.customerType = customerType;
    }

    @Override
    public void addToDatabase() {
        System.out.println("Individual customer " + this.name + " added to database");

    }

    @Override
    public void receiveCashback() {
        System.out.println("Individual customer " + this.name + " received cashback");
    }
}
