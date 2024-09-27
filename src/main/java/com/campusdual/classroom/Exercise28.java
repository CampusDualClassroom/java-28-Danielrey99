package com.campusdual.classroom;

public class Exercise28 {
    public static void main(String[] args) {

        try{
            int division = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Error al dividir: "+e);
        }

        int division = 10/0;

    }
}
