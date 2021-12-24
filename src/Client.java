import java.util.List;

public class Client {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.age = 10;

        Dog d = new Dog();
        d.age = 20;
        d.bark();

        Animal c = d;
//        c.bark();
        Animal e = new Cat();
        Animal f = new Cows();
        Husky h = new Husky();

        List<Animal> l = List.of(e, f, c, h); // Animal a{a, f, c, h}

        for (Animal z: l) {  // for (Animal Z: L) for (int i = 0; i < l.size(); ++i)
            z.walk();
        }

        Cat ca = new Cat();
        Swimmable s1 = ca;
        Swimmable s2 = new Dog();
//        Swimmable s3 = new Animal();
        Swimmable s = new Husky();
        List<Swimmable> s12 = List.of(
                s1, s2, s
        );
        s.swim();

        Dog d1 = new Dog();

        d1.walk();
        d1.walk("Something");


        // factory design pattern
//        Animal a = AnimalFacotry.getCoolAnimal();
    }


}


// takeAnimalToDoctor(Animal a) {}

// main() {
//   Dog d = new Dog();
//   takeAnimalToDoctor(d);

//   Animal a = d;
//
// }


// Implemeneting Chess
// Pieces - move()
// Pawn - Pieces
// Elephant - Pieces
// Camel - Pieces
// King - Pieces
// SlowMovement, FastMovement, ZigZagMoveemt