package com.poisonspear.screwmatrix;

public abstract class Direction {
    protected Ant ant;

    public Direction(Ant ant) {
        this.ant = ant;
    }

    public abstract void turn();

    public abstract boolean canMove();

    public abstract void move();
}

class Right extends Direction {

    public Right(Ant ant) {
        super(ant);
    }

    @Override
    public void turn() {
        ant.turnDown();
    }

    @Override
    public boolean canMove() {
        return ant.canMoveRight();
    }

    @Override
    public void move() {
        if (canMove())
            ant.moveRight();
    }
}

class Down extends Direction {

    public Down(Ant ant) {
        super(ant);
    }

    @Override
    public void turn() {
        ant.turnLeft();
    }

    @Override
    public boolean canMove() {
        return ant.canMoveDown();
    }

    @Override
    public void move() {
        if (canMove())
            ant.moveDown();
    }
}

class Left extends Direction {

    public Left(Ant ant) {
        super(ant);
    }

    @Override
    public void turn() {
        ant.turnUp();
    }

    @Override
    public boolean canMove() {
        return ant.canMoveLeft();
    }

    @Override
    public void move() {
        if (canMove())
            ant.moveLeft();
    }
}

class Up extends Direction {

    public Up(Ant ant) {
        super(ant);
    }

    @Override
    public void turn() {
        ant.turnRight();
    }

    @Override
    public boolean canMove() {
        return ant.canMoveUp();
    }

    @Override
    public void move() {
        if (canMove())
            ant.moveUp();
    }
}