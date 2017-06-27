<?php

/**
 * Created by PhpStorm.
 * User: jludwa
 * Date: 27.06.17
 * Time: 12:45
 */
class Board
{
    protected $width;
    protected $height;

    protected $pixelSize;
    protected $totalPixels;

    protected $inGame;

    protected $timer; // ?? Client ??
    protected $speed; // ?? Client ??

    protected $snake;
    protected $food;

    function __construct($width = 1024, $height = 768, $pixelSize = 4)
    {
        $this->width = $width;
        $this->height = $height;
        $this->pixelSize = $pixelSize;
        $this->totalPixels = ($width * $height) / ($pixelSize * $pixelSize);


        $this->snake = new Snake();
        $this->food = new Food();

    }

    public function initializeGame()
    {

        $this->snake->setLength();

        for($i = 0; $i < $this->snake->getLength(); $i++ ) {

            $this->snake->setSnakeX($this->width/2);
            $this->snake->setSnakeX($this->height/2);

        }

        $this->snake->setMovingRight(true);

        $this->food->createFood();

    }

    public function checkFoodCollision()
    {



    }

    public function checkCollision()
    {



    }

    public function endGame()
    {



    }


}