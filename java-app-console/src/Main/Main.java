/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import test.X;

/**
 *
 * @author Bugs
 */

public class Main {
    int i;
    public void print(){
        System.out.println(i);
    }
    public static void main(String[] args){
        
        SoNguyen a = new SoNguyen(1);
        SoNguyen b = new SoNguyen(13);
        int c = 100;
        a.swap(b);
        a.swap(c);
        System.out.println(a.n);
        System.out.println(c);
//       
        String s1 = "abc";
        String s2 = "xyz";
        String s3 = s1;
        System.out.println(s1==s3);
        
//        String s4 = "ABC";
//        s3 = "jqk";
//        System.out.println(s1==s3);
//        String s5 = new String("AbC");
//        String s6 = new String("AbCd");
//        System.out.println(s5 == s6);
//        System.out.println(s5.equals(s6));
//        String s7 = s5;
//        System.out.println(s7 == s5);
//        s7.toLowerCase();
//        System.out.println(s7 == s5);
//        System.out.println(s7);
//        
//        StringBuffer s8 = new StringBuffer("hi");
//        StringBuffer s9 = s8;
//        System.out.println(s8 == s9);
//        s9.append("gh");
//        System.out.println(s8);
//        System.out.println(s9);
//        System.out.println(s8 == s9);
//

//           SoNguyen a = new SoNguyen(1);
//           SoNguyen b = new SoNguyen(1);
//           System.out.println(a==b);
//           System.out.println(a.equals(b));
    }
    
    
    
}
