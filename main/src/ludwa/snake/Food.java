package ludwa.snake;

public class Food {

    private Point foodPosition;

    public void randomFoodPosition(int maxX, int maxY)
    {
        this.foodPosition = new Point(maxX, maxY);
    }

    public Point getFoodPosition()
    {
        return foodPosition;
    }

    public void initializePosition(int maxX, int maxY)
    {
        randomFoodPosition(maxX, maxY);
    }
}