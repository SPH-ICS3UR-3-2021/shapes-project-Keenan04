/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author keena
 */
class Triangle {

   private double SideA;
    private double SideB;
    private double SideC;
    private double Height;
    private double perimeter;
    private double area;

    public Triangle() {
        this.SideA = 1;
        this.SideB = 1;
        this.SideC = 1;
        this.Height = 1;
    }

    public Triangle(double side) {
        this.setSideA(side);
        this.setSideB(side);
        this.setSideC(side);
        this.setHeight(side);
    }

    public Triangle(double SideA, double SideB, double SideC, double Height) {
        this.setSideA(SideA);
        this.setSideB(SideB);
        this.setSideC(SideC);
        this.setHeight(Height);
    }

    public double getSideA() {
        return SideA;
    }

    public void setSideA(double SideA) {
        this.SideA = SideA;
        this.setArea();
        this.setPerimeter();
    }

    public double getSideB() {
        return SideB;
    }

    public void setSideB(double SideB) {
        this.SideB = SideB;
        this.setArea();
        this.setPerimeter();
    }

    public double getSideC() {
        return SideC;
    }

    public void setSideC(double SideC) {
        this.SideC = SideC;
        this.setArea();
        this.setPerimeter();
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
        this.setArea();
        this.setPerimeter();
    }

    private void setArea() {
        this.area = this.SideB * this.Height / 2;
    }

    private void setPerimeter() {
        this.perimeter = this.SideA + this.SideB + SideC;

    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
