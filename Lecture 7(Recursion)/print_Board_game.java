import java.io.*;

import java.util.*;


public class Main {

   
    public static void main(String[] args) throws IOException {
       Scanner scn = new Scanner(System.in);
        int tar = scn.nextInt();
        phb(0,"",tar);
    }
    public static void phb(int src,String asf,int tar){
        if(src == tar){
            System.out.println(asf);
            return;
        }
        
        if(src > tar){
            return;
        }
        for(int dice = 1;dice <= 6;dice++){
            int inter = src + dice;
            phb(inter,asf+dice,tar);
        }
    }
    
}
