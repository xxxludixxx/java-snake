package ludwa.snake;

public class Food {

    private Point foodPosition;

    public void randomFoodPosition(int maxX, int maxY) {
        this.foodPosition = new Point();
        this.foodPosition.random(maxX, maxY);
    }

    public Point getFoodPosition() {
        return foodPosition;
    }
}
