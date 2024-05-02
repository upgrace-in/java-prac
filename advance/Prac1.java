interface Animal{
    public void run();
}

class Cow implements Animal{
    public void run() {
        System.out.println("COW IS RUNNING !!!");
    }
}

class Prac1{
    public static void main(String[] args){
        Cow m = new Cow();
        m.run();
    }
}