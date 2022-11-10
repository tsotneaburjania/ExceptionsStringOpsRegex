package ge.tbc.testautomation.exceptions;

public class Circle {
    public static int numberOfInstances;
    private double radius;

    public Circle(double radius) throws LimitException{
        /*თუ კონსტრუქტორში ექსეფშენი ვისროლეთ, ეს კონსტრუქტორი
        ვერ დაასრულებს მუშაობას, ამიტომ ზედმეტი ობიექტის შექმნის მცდელობა
        წარუმატებელი იქნება.
        * */
        if (numberOfInstances < 4){
            numberOfInstances++;
        }
        else {
            throw new LimitException("THERE CAN BE NO MORE THAN FIVE CIRCLES HERE.");
        }
        this.radius = radius;
    }
}
