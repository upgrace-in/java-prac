class Animal {
    int main(int x){    
        return x+3;
    }

    int main(int x, int y){    
        return x+y;
    }

    double main(double x){    
        return x+2;
    }
}

public class overloading {
    public static void main(String[] args){
        Animal dog = new Animal();
        System.out.println(dog.main(2));
    }
}

