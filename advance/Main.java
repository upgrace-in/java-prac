interface Animal{
    public void run();
}

class Cow implements Animal{
    public void run() {
        System.out.println("COW IS RUNNING !!!");
    }
}

class Main{
    public static void main(String[] args){
        Cow m = new Cow();
        m.run();
    }
}