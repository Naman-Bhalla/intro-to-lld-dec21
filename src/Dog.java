public class Dog extends Animal implements Swimmable {

    void bark() {
        System.out.println("Bhow");
    }

    public void swim() {
        System.out.println("Swim DOg");
    }

    @Override
    public void walk() {
//        super.walk();
        System.out.println("Dog walking");
    }

    public void walk(String walkType) {
        if (walkType == "slow") {
            System.out.println("Slowly walking");
        } else {
            System.out.println("Walking fast");
        }
    }
}

// A ->             B ->         C -D
// walk() {                     walk()
//    super.walk()                 do something in C
//    print(do in A)
// }