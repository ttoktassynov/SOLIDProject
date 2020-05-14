package interface_segregation.bad;

public  class FryerStation implements ICook{

    @Override
    public Meal grillMeal() {
        return null;
    }

    @Override
    public Meal fryMeal() {
        return new Meal("stake");
    }
}
