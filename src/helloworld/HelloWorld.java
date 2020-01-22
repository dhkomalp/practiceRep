/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author Komalpreet
 */
public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("hello world..");
        //System.out.append("hello world..");
        //System.out.println("x\u00b2 =25");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String word=sc.next();
        
        char[] arrayWord=new char[word.length()];
       
       
        for(int i=0;i<arrayWord.length;i++){
        arrayWord[i]=word.charAt(i);}
        for(int k=0;k<arrayWord.length;k++)
        {
            System.out.println(arrayWord[k]);
        }
       
        //System.out.println(arrayWord[0]);
        
        
                
    }
            
}
