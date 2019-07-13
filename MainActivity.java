function turnRight() {
  turnLeft();
  turnLeft();
  turnLeft();
}
function turnAround(){
  turnLeft();
  turnLeft();
}
function makeCross(){
penDown();
moveForward();
moveForward();
moveForward();
turnAround();
moveForward();
turnLeft();
moveForward();
turnAround();
moveForward();
moveForward();
turnAround();
moveForward();
turnRight();
moveForward();
moveForward();
}
makeCross();
turnLeft();
makeCross();
turnLeft();
makeCross();
turnLeft();
makeCross();
