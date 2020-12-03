package frogaed;

import java.util.*;

/***Hau da kalkulagailuaren klasea*/

public class Calculadora{
    public static void main(String[] args)
    {
        System.out.println("Kaixo, zure kalkulagailua naiz");
    }
    public static int suma(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int resta(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int multiplicacion(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }

}


