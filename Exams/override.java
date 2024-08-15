class Animal {
    int main(int x){    
        return x+2;
    }
}

class DOG extends Animal {
    @Override
    int main(int x){
        return x+3;
    }
}

public class override {
    public static void main(String[] args){
        DOG d = new DOG();
        System.out.println(d.main(3));
    }
}
