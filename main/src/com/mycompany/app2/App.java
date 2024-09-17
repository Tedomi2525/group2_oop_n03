package com.mycompany.app2;

public class App {
    public static void main(String[] args) {
        // Call DisruptLecture
        DisruptLecture disruptLecture = new DisruptLecture();
        disruptLecture.disrupt();
        
        // Call TestArithmetic
        TestArithmetic arithmetic = new TestArithmetic();
        System.out.println("Addition: " + arithmetic.add(5, 3));
        System.out.println("Subtraction: " + arithmetic.subtract(5, 3));
        
        // Call GlyphTest
        GlyphTest glyphTest = new GlyphTest();
        glyphTest.draw();
        
        // Call Transmogrify
        Transmogrify transmogrify = new Transmogrify();
        transmogrify.transform();
    }
}
