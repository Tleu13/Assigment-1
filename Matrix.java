package com.company;

public class Matrix {

    private int size;
    private int[][] matrx;


    public Matrix(int size){
        this.size = size;
        matrx = new int [size][size];
        createMatrx();
    }


    public void createMatrx() {
        for (int i=0;i<matrx.length ;i++) {
            for (int j = 0; j < matrx[i].length; j++) {
                matrx[i][j] = (int) (Math.random() * 10);
            }

        }
    }


    public void showMatrx(){

        for (int i=0;i<matrx.length;i++)
        {

            for (int j=0;j<matrx[i].length ;j++)
            {
                System.out.print(matrx[i][j]+"   ");

            }

            System.out.println();
        }



    }

    public void myltiplayMatrx (Matrix m1, Matrix m2){
        int res;
        int result [][] = new int [size][size];
        for (int z =0; z< size; z++) {
            for (int j =0; j<size;j++) {
                res =0;
                for (int i =0; i<size;i++) {
                    res = res + m1.matrx [z][i] * m2.matrx [i][j];
                }
                result[z][j] = res;
            }
        }

        System.out.println();
        System.out.println ("Результат: ");
        for (int j=0;j<size;j++) {
            for (int i =0; i<size;i++) {
                System.out.print (result[j][i] +" ");
            }
            System.out.println();
        }

    }

}
