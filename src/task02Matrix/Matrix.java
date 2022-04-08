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

public class Matrix {

    private int row;
    private int column;
    private int value;

    public Matrix(int size) {
        this.row = size;
        this.column = size;
        for (int i = 0; i < size; i++) {

        }
    }

    public Matrix sum(Matrix matrix) {

        return null;
    }

    public Matrix product(Matrix matrix) {
        return null;
    }

    public void setElement(int row, int column, int value) {

    }

    public Matrix getElement(int row, int column) {
        return null;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "row=" + row +
                ", column=" + column +
                ", value=" + value +
                '}';
    }
}
