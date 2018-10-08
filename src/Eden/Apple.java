package Eden;

public class Apple {
    int weight;

    public Apple(){}

    public Apple(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public boolean isEmpty(){
        if (weight > 0){
            return true;
        }
        return false;
    }
}
