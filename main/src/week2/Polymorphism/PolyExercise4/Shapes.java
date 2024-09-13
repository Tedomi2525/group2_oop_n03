package PolyExercise4;
public class Shapes {
    private static final  RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];

        for(int i = 0;i <s.length; i++){
            s[i] = gen.next();
        }

        for (Shape shp : s)
            shp.newMethod();
    }
}
