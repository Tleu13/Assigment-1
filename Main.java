package com.company;

public class Main {

    public static void main(String[] args) {

        int n = 4;

	    Matrix m1 = new Matrix(n);
        Matrix m2 = new Matrix(n);
	    m1.showMatrx();
        m2.showMatrx();
        m1.myltiplayMatrx(m1,m2);


    }
}
