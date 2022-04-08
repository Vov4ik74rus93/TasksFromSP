package Task01Int;

/*
Задание 1. Int.
     Напишите класс, реализующий «правильные с объектно-ориентированной точки зрения целые числа”, В классе должны быть определены

     	методы  increment() и decrement(), соответственно увеличивающие и уменьшающие число на 1;
     	методы add(Int n) и substract(Int n), увеличивающие и уменьшающие число на n;
     	метод 	toString()

     Примечание 1: в методах add и substract передаются значения типа Int (с большой буквы), а не int.
     Примечание 2: для сдачи основного задания нельзя придумывать свои методы и конструкторы, нужно использовать указанные выше.
     Примечание 3: применить инкрементирование 1000 раз - плохой вариант.
     Примечание 4: в доп. задании можно создать конструктор Int(int value).

     При создании нового объекта должно создаваться число, равное 0.

     Напишите наиболее короткую программу, которая используя только класс Int, выводит на экран число 1000. Программа должна быть чисто объектно-ориентированной. В частности, в ней нельзя использовать оператор присваивания.
*/

public class Int {

    private int number;

    public void increment() {
        this.number++;
    }

    public void decrement() {
        this.number--;
    }

    public void add(Int n) {
        this.number += n.number;
    }

    public void substract(Int n) {
        this.number -= n.number;
    }

    @Override
    public String toString() {
        return "" + this.number;
    }

}
