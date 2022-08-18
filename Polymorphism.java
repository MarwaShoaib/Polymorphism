public class Polymorphism {

    public static void main(String[] args) {
       Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();
        print(a);
    }
    public static void print(Animal a) {
        a.makeNoise();
           if(a instanceof Dog d) {
               d.grow();
           }
             
    }
    
}
class Animal{
   public void makeNoise(){
       System.out.println("i'm just an Animal");
   }
}

class Cat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
    
}

class Dog extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Woof woof!");
    }
    
    public void grow() {
        System.out.println("grrrrrrrrrrr!");
    }
}
