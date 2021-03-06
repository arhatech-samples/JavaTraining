package com.techarha.training.java.basics;

/**
 * @question1: Start with a number that has a binary one in the most significant position (hint: Use a hexadecimal constant). Using the signed right-shift operator, right shift it all the way through all of its binary positions, each time displaying the result using Integer.toBinaryString( ).   
 * @explaination1: Complete the required code below.
 *
 * @author ankit.
 */
public class JavaWorld_7 extends Base {
    int x = 7;

    Base[] baseArr = new Base[4];


    public void MyMethod(){




        for (int i = 0; i < baseArr.length; i++) {
            if(i==1||!(i%2==0)){
                baseArr[i] = new JavaWorld_7();

            }
        }
    }

    public void MySampleMethod(){
        System.out.println("This is JavaWorld_7");
    }

    public static void main(String[] args) {
        Base myBase = new JavaWorld_7();
    }

}

class Base{
    private void MyMethod(){
        System.out.println("This is Base Private MyMethod");
    }

    public void MySampleMethod(){
        System.out.println("This is Base class");
    }
}

