/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        CountThread c1 = new CountThread(0,99);
        CountThread c2 = new CountThread(99,199);
        CountThread c3 = new CountThread(200,299);
        c1.run();
        c2.run();
        c3.run();
        //c1.start();
        //c2.start();
        //c3.start();
    }
    
}
