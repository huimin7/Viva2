/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

/**
 *
 * @author Chuimin
 */

import static java.lang.Character.*;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        
        System.out.print("Enter your password: ");
        String password=sc.nextLine();
        
        System.out.println(validPass(password));
        
    }
    
    public static boolean validPass(String password){
        int countDigit=0;
        boolean capital=false;
        boolean lowerCase=false;
        int cntCharacter=0;
        
        if(password.length()<8){
            return false;
        }else{ 
            for(int i=0;i<password.length();i++){
                char x=password.charAt(i);
                if(isUpperCase(x)){
                    capital =true;
                }else if(isLowerCase(x)){
                    lowerCase=true;
                }else if(isDigit(x)){
                    countDigit++;
                }else if(x=='!'||x=='@'||x=='#'||x=='$'||x=='%'||x=='^'||x=='&'||x=='*'||x=='('||x==')'||x=='-'||x=='+'){
                     cntCharacter++;
        
                }
            }
        }
        if(password.length()>=8 && capital && lowerCase && countDigit>=3 && cntCharacter==1){
            return true;
        }else
            return false;
    
    }
    
        
    
    
    
}
