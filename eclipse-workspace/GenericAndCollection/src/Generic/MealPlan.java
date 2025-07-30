package Generic;

interface MealPlan {
    String getType();
}

class VegetarianMeal implements MealPlan {
    public String getType() { return "Vegetarian"; }
}

class VeganMeal implements MealPlan {
    public String getType() { return "Vegan"; }
}

class KetoMeal implements MealPlan {
    public String getType() { return "Keto"; }
}

class Meal<T extends MealPlan> {
    private T mealPlan;
    public Meal(T mealPlan) { this.mealPlan = mealPlan; }
    public T getMealPlan() { return mealPlan; }
    public static <T extends MealPlan> Meal<T> generatePlan(T mealPlan) {
        // Validation logic can be added here
        System.out.println("Generated meal plan: " + mealPlan.getType());
        return new Meal<>(mealPlan);
    }
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        Meal<VegetarianMeal> meal = generatePlan(veg);
    }
}