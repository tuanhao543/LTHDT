



package com.laptrinhkethua.kethua;

public class Circle {
    private Double radius;
    private String color;
    
    public Circle() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Circle(Double radius, String color) {
        super();
        this.radius = radius;
        this.color = color;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }  

     public Double getArea() {
        return Area;
    }

     public String toString() {
        return String;
    } 
}

public class Cylinder extends Circle {
    private Double height;
    
    public Cylinder() {
        // TODO Auto-generated constructor stub
    }

    public Cylinder(Double radius, String color, Double height) {
        super(radius, color);
        // TODO Auto-generated constructor stub
        this.height = height;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }   

package com.laptrinhkethua.kethua;
// chạy chương trinh
public class Main {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();               
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
  
}}