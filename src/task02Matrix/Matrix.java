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

    private Element[][] array = new Element[][];

    public Matrix(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {

                }
            }
        }
    }

    public Matrix sum(Matrix matrix) {

        return null;
    }

    public Matrix product(Matrix matrix) {
        return null;
    }



    public class Element {
        private int row;
        private int column;
        private int value;

        public Element(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public Element(int row, int column, int value) {
            this(row, column);
            this.value = value;
        }

        public void setElement(int row, int column, int value) {
            this.row = row;
            this.column = column;
            this.value = value;
        }

        public int getElement(int row, int column) {
            return array[row][column].value;
        }
    }

}
