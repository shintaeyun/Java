interface Dinosaur { public abstract void cry(); }

class T_Rex implements Dinosaur {
    public void cry() {
        System.out.println("꾸어어엉");
    }
    public void walk() {
        System.out.println("걷기");
    }
}

class Ptera implements Dinosaur {
    public void cry() {
        System.out.println("끼에에엑");
    }
    public void fly() {
        System.out.println("날기");
    }
}

public class Dino {
    public static void main(String[] args) {
        T_Rex rex = new T_Rex();
        Ptera tera = new Ptera();

        rex.cry();
        rex.walk();
        tera.cry();
        tera.fly();
        
        Dinosaur[] d = {new T_Rex(), new Ptera()};
        
        d[0].cry();
        ((T_Rex)(d[0])).walk();
        d[1].cry();
        ((Ptera)(d[1])).fly();
    }
}
