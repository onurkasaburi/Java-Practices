package rebootDay03_OOP;

public class animal {
    String name;
    public animal(){
        name ="No name";
    }
    public animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    int getNum(){
        return 10;
    }
}
