package interface_segregation.bad;

public class GrillStation implements ICook{

    @Override
    public Meal grillMeal() {
        return new Meal("barbeque");
    }

    @Override
    public Meal fryMeal() {
        return null;
    }
}
