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
            System.out.println("The game is now frozen!");
        }

        Queen.unfreeze();

        if(Queen.frozen == false){
            System.out.println("The game is now unfrozen for you!");
        }

        System.out.println("Your current position is " + Queen.positionX + " " + Queen.positionY);

        Queen.move(5,8);

        System.out.println("Now your current position is " + Queen.positionX + " " + Queen.positionY);

        Queen.freeze();

        Queen.move(13,15);

        System.out.println("Now your new current position is " + Queen.positionX + " " + Queen.positionY);



    }
}
