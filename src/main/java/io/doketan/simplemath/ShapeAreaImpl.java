package io.doketan.simplemath;

public class ShapeAreaImpl implements ShapeArea{
    @Override
    public Double squareArea(Double length) {
        return length*length;
    }

    @Override
    public Double rectangleArea(Double length, Double height) {
        return length*height;
    }

    @Override
    public Double triangleArea(Double a, Double b, Double c) {
        Double semiPerimeter = (a+b+c)/2;
        Double sa = semiPerimeter-a;
        Double sb = semiPerimeter-b;
        Double sc = semiPerimeter-c;
        return Math.sqrt(semiPerimeter*sa*sb*sc);
    }

    @Override
    public Double circleArea(Double radius) {
        return Math.PI*radius*radius;
    }
}
