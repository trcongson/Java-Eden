package Eden;

public class Main {
    public static void main(String[] args) {
        Human adam = new Human("Adam", true, 1);
        Human eva = new Human("Eva", false, 1);
        Apple apple = new Apple(5);
        int countApple = apple.getWeight();
        Snake snake = new Snake();

        God.Say("Không được ăn táo,bitch");
        snake.Say("Ăn đi nào, hứa là ngon vkl");

        adam.eat(apple);
        eva.eat(apple);
        adam.eat(apple);
        eva.eat(apple);

        adam.sleep();
        eva.sleep();

        if (countApple != apple.getWeight()){
            God.Say("Eva, cô phải vâng lời chồng và đau đớn khi sinh con");
            God.Say("Adam, ngươi phải cuốc đất trồng cây mà ăn");
        }
    }
}
