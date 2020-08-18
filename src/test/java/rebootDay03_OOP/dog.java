package rebootDay03_OOP;

public class dog extends animal {
    // dog is an animal
    // dog has a name

    public dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Dog's name is: " + name;
    }
        @Override
        int getNum () {
            return 20;

        }
        public static void main (String[]args){
            dog dog = new dog("jack");
            System.out.println(dog.getName());
            animal a = new animal("joe");
            System.out.println(a.getName());

            System.out.println(dog.getNum());
        }

    }
