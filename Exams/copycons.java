class Base {
    String name;

    public Base(String h) {
        this.name = h;
    }

    public Base(Base b) {
        this.name = b.name;
    }
}

public class copycons {
    public static void main(String[] args) {
        Base b1 = new Base("Hari");
        Base b2 = new Base(b1);

        System.out.println(b1.name + " " + b2.name);
    }
}
