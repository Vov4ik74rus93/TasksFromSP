package task02Matrix;

// Задание 2. Матрица.
// Напишите класс Matrix, реализующий квадратные матрицы. В нем должны быть определены
//
// 	конструктор с целочисленным параметром - размером матрицы, создающий единичную матрицу;
// 	методы Matrix sum(Matrix) и Matrix product(Matrix), вычисляющие сумму и произведение матриц
// 	матрицы setElement(int row, int column, int value) и getElement(int row, int column), для 	обращения к 	элементам матрицы;
// 	метод 	toString() (Примечание: необходимо использовать StringArray или StringBuilder).
//
// Во всех методах предполагается, что передаваемые параметры всегда корректны.
// Напишите программу, выводящую первые 10 степеней матрицы:
// [1 1]
// [1 0]

import java.util.Arrays;

public class Matrix {

    private int[][] array;

    public Matrix(int row, int column) {
        this.array = new int[row][column];
    }

    public Matrix(int size) {
        array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i == j) ? 1 : 0;
            }
        }
    }

    public Matrix sum(Matrix addend) {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                this.array[i][j] += addend.array[i][j];
            }
        }
        return this;
    }

    public  Matrix product(Matrix multiplier) {
        Matrix result = new Matrix(this.array.length, multiplier.array[0].length);
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                for (int k = 0; k < multiplier.array.length; k++) {
                    result.array[i][j] += this.array[i][k] * multiplier.array[k][j];
                }
            }
        }
        return result;
    }

    public void setElement(int row, int column, int value) {
        this.array[row][column] = value;
    }

    public int getElement(int row, int column) {
        return this.array[row][column];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.array.length; i++) {
            stringBuilder.append(Arrays.toString(array[i])).append("\n");
        }
        return stringBuilder.toString().replaceAll(",", "");
    }
}
