package com.poisonspear.screwmatrix;

import java.util.Arrays;

public class Field {
    private final int n;
    private final int m;
    private final int[][] array;
    private final Ant ant;

    public Field(int n, int m) {
        this.n = n;
        this.m = m;
        array = new int[n][m];
        this.ant = new Ant(this, 0, 0);
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public int getValue(int i, int j) {
        return array[i][j];
    }

    private void initField() {
        for (int i = 0; i < n; i++)
            Arrays.fill(array[i], -1);
    }

    public void fill(int k) {
        while (true) {
            array[ant.getI()][ant.getJ()] = k++;
            if (ant.canMove())
                ant.move();
            else {
                ant.turn();
                //printArray();
                if (ant.canMove())
                    ant.move();
                else
                    break;
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(String.format("%3d", array[i][j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Field field = new Field(10, 10);
        field.initField();
        field.fill(0);
        field.printArray();
    }
}
