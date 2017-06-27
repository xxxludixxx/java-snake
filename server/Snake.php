<?php

/**
 * Created by PhpStorm.
 * User: jludwa
 * Date: 27.06.17
 * Time: 12:45
 */
class Snake
{
        protected $snakeX;
        protected $snakeY;

        protected $length;

        protected $movingUp;
        protected $movingDown;
        protected $movingLeft;
        protected $movingRight;

        function getSnakeX($index) { return $this->snakeX[$index]; }
        function setSnakeX($value) { $this->snakeX[0] = $value; }

        function getSnakeY($index) { return $this->snakeY[$index]; }
        function setSnakeY($value) { $this->snakeY[0] = $value; }

        function isMovingUp() { return $this->movingUp; }
        function setMovingUp($state) { $this->movingUp = $state; }

        function isMovingDown() { return $this->movingDown; }
        function setMovingDown($state) { $this->movingDown = $state; }

        function isMovingLeft() { return $this->movingLeft; }
        function setMovingLeft($state) { $this->movingLeft = $state; }

        function isMovingRight() { return $this->movingRight; }
        function setMovingRight($state) { $this->movingRight = $state; }

        function getLength() { return $this->length; }
        function setLength($length = 3) { $this->length = $length; }

        public function move()
        {
            // TODO
        }
}