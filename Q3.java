/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;


import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        String str=sc.nextLine();
        String strValue="";
        
        for(int i=1;i<str.length()-1;i++){
            strValue += ""+str.charAt(i);
        }
       // System.out.println(strValue);
        String [] numValue=strValue.split(",");
        
        
        boolean [] validity =validity(numValue);
        
        System.out.print("{");
        for(int i=0;i<6;i++){
            if(validity[i]){
                System.out.printf("True");
                if(i==5){
                    break;
                }
                System.out.print(", ");
            }else{
                System.out.print("False");
                if(i==5){
                    break;   
                }
                System.out.print(", ");
            }
        }
        System.out.print("}");
        
    
              
    }    
        
    
    
     public static boolean [] validity(String [] arr){
        boolean [] valid=new boolean[6];
        for(int i=0;i<6;i++){
            String a="";
            for(int j=1;j<arr[i].length()-1;j++){
                a += "" + arr[i].charAt(j);
            }
           // System.out.print(a);
            if(isNumber(a)){
               valid[i]=true; 
            }
            
        }
        return valid;
    }
    
    
    public static boolean isNumber(String element){
        
        try{
            Double.parseDouble(element);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
}
