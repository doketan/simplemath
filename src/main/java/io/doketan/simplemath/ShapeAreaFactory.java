package io.doketan.simplemath;

/**
 * Factory for creating instances of {@link ShapeArea}.
 */
public final class ShapeAreaFactory {

    private ShapeAreaFactory(){

    }

    public static ShapeArea createShapeArea(){
        return new ShapeAreaImpl();
    }
}
