package br.pro.hashi.ensino.desagil.desafio.model;
import java.util.Random;
public class Target extends Element {
    private final Board board;
    Random rand = new Random();


    public Target(int row, int col, Board board){
        super(row, col);
        this.board = board;


    }
    public void move(){
        int n = rand.nextInt(4);


        if (n==0){
            this.moveUp();
        }

        if (n==1){
            this.moveLeft();
        }
        if (n==2){
            this.moveRight();
        }
        if (n==3){
            this.moveDown();
        }



    }

    public void moveUp() {
        if (row>0 && !board.isWall(row - 1, col)) {
            row-=1;
        }
    }

    public void moveRight() {
        if (col   <   board.getNumCols() - 1 && !board.isWall(row, col + 1)) {
            col+=1;
        }
    }

    public void moveDown() {
        if (row <      board.getNumRows() - 1 && !board.isWall(row + 1, col)) {
            row+=1;
        }
    }

    public void moveLeft() {
        if (col  >0 && !board.isWall(row,col - 1)) {
            col-=1;
        }


}}
