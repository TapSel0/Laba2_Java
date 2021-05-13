package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Класс сканнер для считывания данных введнных пользователем
	    Scanner in = new Scanner(System.in);
	    System.out.print("Введите координаты первой точки (x, y, z): ");
	    double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Point3d pointA = new Point3d(x, y, z);
        System.out.print("Введите координаты второй точки (x, y, z): ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d pointB = new Point3d(x, y, z);
        System.out.print("Введите координаты третьей точки (x, y, z): ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d pointC = new Point3d(x, y, z);
        if (pointA.equals(pointB) || pointB.equals(pointC) || pointC.equals(pointA)){
            System.out.println("Введены одинаковые точки! Расчёт не имеет значения.");
        }else System.out.println("Площадь треугольника построенного по данным точкам равна - " + computeArea(pointA, pointB, pointC));
    }
    //Площадь треугольника
    public static double computeArea(Point3d pointA, Point3d pointB, Point3d pointC){
        //Полупириметр
        double p = (pointA.distanceTo(pointB)+ pointB.distanceTo(pointC)+ pointC.distanceTo(pointA))/2;
        return (Math.sqrt(p*(p - pointA.distanceTo(pointB))*(p - pointB.distanceTo(pointC))*(p - pointC.distanceTo(pointA))));
    }
}
