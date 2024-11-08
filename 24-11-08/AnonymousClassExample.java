interface SayHello {
    public void hello();
}

class Greeting {
    static void greet(SayHello s){
        s.hello();
    }
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        Greeting.greet(new SayHello() {
            public void hello() {
                System.out.println("こんにちは");
            }
        });
    }
}
