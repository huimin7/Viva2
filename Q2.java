/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

/**
 *
 * @author Chuimin
 */
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Array1(comma-seperated) = ");
        String ar1 =sc.nextLine();
        double [] array1 =convertDoubleArr(ar1);
        
        
        System.out.print("Array2(comma-separated) = ");
        String ar2=sc.nextLine();
        double [] array2 =convertDoubleArr(ar2);
*/        

        System.out.print("Array1 = ");
        String ar1= sc.nextLine();
        
        System.out.print("Array2 = ");
        String ar2= sc.nextLine();
        
        String a="";
        for(int i=1;i<ar1.length()-1;i++){
            a += "" +ar1.charAt(i);
        }
        double [] array1=convertDoubleArr(a);
        
        String b="";
        for(int i=1;i<ar2.length()-1;i++){
            b += "" +ar2.charAt(i);
        }
        double [] array2=convertDoubleArr(b);
        
        
        double median=calcMedian(array1, array2);
        System.out.printf("%.3f",median);
        System.out.println();
       
        
    }
    
    public static double[]convertDoubleArr(String arrayStatement){
        String [] ar =arrayStatement.split(",");
        int length=ar.length;
        double [] arr1= new double[length];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = Double.parseDouble(ar[i]);
            
        }
        return arr1;
    }
    
    public static double calcMedian(double[] array1, double[]array2){
        int length =array1.length + array2.length;
        double [] combineArr =new double[length];
        for(int i=0;i<length;i++){
            for(int j=0;j<array1.length;i++,j++){
                combineArr[i]=array1[j];
            }
            for(int j=0;j<array2.length;i++,j++){
                combineArr[i] = array2[j];
            }
        }
        //sort array
        for(int pass=1;pass<length;pass++){
            for(int i=0;i<length-1;i++){
                if(combineArr[i]>combineArr[i+1]){
                    double hold = combineArr[i];
                    combineArr[i]=combineArr[i+1];
                    combineArr[i+1]=hold;
                }
            }
        }
        int index;
        
        if(length%2==0){
            index=length/2;
            
            
            return (combineArr[index]+combineArr[index-1])/2;
        }else
            index = (length/2);
            return combineArr[index];  
            
                 
    }
    
    
}
