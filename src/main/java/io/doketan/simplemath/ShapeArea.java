package io.doketan.simplemath;

public interface ShapeArea {

    /**
     * Return area of square
     * @param length
     * @return
     */
    Double squareArea(Double length);

    /**
     * Returns area of rectangle
     * @param length
     * @param height
     * @return
     */
    Double rectangleArea(Double length,Double height);

    /**
     * Returns area of triangle
     * @param a
     * @param b
     * @param c
     * @return
     */
    Double triangleArea(Double a,Double b,Double c);

    /**
     * Return area of circle
     * @param radius
     * @return
     */
    Double circleArea(Double radius);

}
