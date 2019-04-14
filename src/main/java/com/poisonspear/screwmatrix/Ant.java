package com.poisonspear.screwmatrix;

public class Ant {
    private int
            i,
            j;

    private Field field;

    private Direction
            right = new Right(this),
            down = new Down(this),
            left = new Left(this),
            up = new Up(this),
            direction = right;

    public Ant(Field field, int i, int j) {
        this.field = field;
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void move() {
        direction.move();
    }

    public boolean canMove() {
        return direction.canMove();
    }

    public void turn() {
        direction.turn();
    }

    public void moveRight() {
        if (j < field.getM() - 1)
            j++;
    }

    public void moveLeft() {
        if (j > 0)
            j--;
    }

    public void moveUp() {
        if (i > 0)
            i--;
    }

    public void moveDown() {
        if (i < field.getN() - 1)
            i++;
    }

    public void turnRight() {
        direction = right;
    }

    public void turnLeft() {
        direction = left;
    }

    public void turnDown() {
        direction = down;
    }

    public void turnUp() {
        direction = up;
    }

    public boolean canMoveRight() {
        return field.getM() - 1 > j && field.getValue(i, j + 1) == -1;
    }

    public boolean canMoveDown() {
        return field.getN() - 1 > i && field.getValue(i + 1, j) == -1;
    }

    public boolean canMoveLeft() {
        return 0 < j && field.getValue(i, j - 1) == -1;
    }

    public boolean canMoveUp() {
        return 0 < i && field.getValue(i - 1, j) == -1;
    }
}
