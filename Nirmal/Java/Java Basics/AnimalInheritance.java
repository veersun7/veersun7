public class AnimalInheritance {
    
        public static void main(String[] args) {
           
            Herbivore herbivore = new Herbivore();
            herbivore.foodHabits();
    
            Carnivore carnivore = new Carnivore();
            carnivore.foodHabits();
        }
    }
    
    class Animal {
    
        public void foodHabits() {
            System.out.println("I am an Animal and I eat everything");
        }
    }
    
    // method overriding
    class Herbivore extends Animal {
    
    
        // @Override annotation is optional
        @Override
        public void foodHabits() {
            System.out.println("I am a herbivore and I eat plants");
        }
    }
    
    
    class Carnivore extends Animal {
    
        @Override
        public void foodHabits() {
            System.out.println("I am a carnivore and I eat meat");
        }
        
    }