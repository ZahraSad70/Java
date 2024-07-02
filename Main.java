import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num;
        String txt;
        txt="Hello I like this Company!";
        String[] Arraytxt=txt.split(" ");
        int lenWord = len(Arraytxt);
        System.out.printf("your sentence was :Hello I like this Company! .that the last word lenght is \n"+ lenWord +"\n");
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Number for Prime and Mirror :");
        num=reader.nextInt();
        Prime(num);
        Mirror(num);

}
    public  static  void Prime(int n){
        int flag;
        flag=0;
        for (int i=2;i<n;i++){
            if(n%i==0){
                System.out.println(n +"عدد اول نیست");
                flag=0;
                break;
            }
            else{
                flag=1;
            }
        }
        if (flag==1){
            System.out.printf(n + " عدد اول است");
        }
    }

    public static void Mirror(int num){
        int  y =0;
        int x = 0, num2;
        num2 = num;
        while (num > 0) {
            x = num % 10;
            y = y * 10 + x;
            num = num / 10;
        }
        if (num2 == y)
            System.out.println("عدد متفارن است");
        else
            System.out.println("عدد متقارت نیست");
    }

    public static int len(String [] txt){
//        Iterator<String> text= Arrays.stream(txt).iterator();
//
//        while (text.hasNext()){
//            text.next();
//            i=i+1;
//        }
        int i=txt.length;
        return txt[i-1].length();
    }
}
