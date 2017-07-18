package com.lionssharewebdev;

class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String color;
    String size;

    public GamePiece() {
       this.positionX = 0;
       this.positionY = 0;
       this.frozen = false;
       this.color = "gold";
       this.size = "large";
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void move(int x, int y) {
        if (frozen != true) {
            this.positionX = x;
            this.positionY = y;
        }
    }

    public void freeze(){
        this.frozen = true;
    }

    public void unfreeze(){
        this.frozen = false;
    }
}


public class Main {

    public static void main(String[] args) {
        GamePiece Queen = new GamePiece();

        Queen.freeze();

        if(Queen.frozen == true){
            System.out.println("Now freezing your game for you...");
            System.out.println("The game is has now been successfully frozen!");
        }else{
            System.out.println("Something went wrong the game was not frozen!");
        }



        Queen.unfreeze();


        if(Queen.frozen == false){
            System.out.println("Now unfreezing your game for you....");
            System.out.println("The game has now been successfully unfrozen for you!");
        }else {
            System.out.println("Something went wrong the game is still frozen!");
        }

        System.out.println("Your starting position is " + Queen.positionX + " " + Queen.positionY + " ,now attempting to move piece.");

        Queen.move(5,8);

        if(Queen.positionX == 0 && Queen.positionY == 0){
          System.out.println("Error - your piece has not moved at all!");
          System.out.println("Your position is still " + Queen.positionX + " " + Queen.positionY);
        }else {
            System.out.println("Your Queen has moved to the following position " + Queen.positionX + " " + Queen.positionY);
        }

        System.out.println("Now your current position is " + Queen.positionX + " " + Queen.positionY);

        Queen.freeze();



        if(Queen.frozen == true) {
            System.out.println("Now freezing your game for you...");
            System.out.println("Your Queen has been frozen your position is still " + Queen.positionX + " " + Queen.positionY);
        }else{

            Queen.move(0,0);
            System.out.println("Your Queen was not frozen and was moved to the default of " + Queen.positionX + " " + Queen.positionY);

        }


    }
}
