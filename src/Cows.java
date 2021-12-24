public class Cows extends Animal implements Singer, Swimmable {
    @Override
    public void sing() {
        System.out.println("Cow is singing");
    }

    @Override
    public void swim() {
        System.out.println("Cow swim");
    }
}


// OOP classes - behaviour and methods
// Diamond Problem