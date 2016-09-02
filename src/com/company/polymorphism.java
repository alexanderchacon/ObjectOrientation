package com.company;

public class polymorphism {

    public static void main(String args[]) {

        animal a = new dog();
        animal b = new cat();

        a.makeSound();
        b.makeSound();

    }

    public static class animal {
        public void makeSound() {
            System.out.println("Grrrr");
        }
    }

    public static class dog extends animal {
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    public static class cat extends animal {
        public void makeSound() {
            System.out.println("Grrrr");
        }
    }

}
