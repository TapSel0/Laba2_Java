package com.company;

public class Point3d {
    private double xCoord, yCoord, zCoord;
    public Point3d(double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    //Конструктор по умолчанию на 0,0,0
    public Point3d(){
        this(0,0,0);
    }
    //Стандартные геттеры
    double get_xCoord(){
        return xCoord;
    }
    double get_yCoord(){
        return xCoord;
    }
    double get_zCoord(){
        return xCoord;
    }
    //Стандартные сеттеры
    void set_xCoord(double x){
        xCoord = x;
    }
    void set_yCoord(double y){
        yCoord = y;
    }
    void set_zCoord(double z){
        zCoord = z;
    }
    //Функция сравнения точек
    boolean equals(Point3d point) {
        return (((Point3d) point).xCoord == xCoord && ((Point3d) point).yCoord == yCoord && ((Point3d) point).zCoord == zCoord);
    }
    //Функция вычисления дистанции от одной точки до другой
    public double distanceTo(Point3d point){
        return (Math.sqrt((point.xCoord - xCoord)*(point.xCoord - xCoord) + (point.yCoord - yCoord)*(point.yCoord - yCoord) + (point.zCoord - zCoord)*(point.zCoord - zCoord)));
    }
}
