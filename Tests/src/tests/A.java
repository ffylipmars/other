/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author faker2
 */
public abstract class A {
    public int a;
    public final int A1 = 1;
    public static int a2;
    public static final int A3 = 1;
    
    private int b = 1;
    
    public void setB(int n)
    {
        b = n;
    }
    
    abstract void method1();
    
    public void method3(){}
        
    public static void method4(){}
    
    public static final void method5(){}
    
    private void method6(){}
    
}
