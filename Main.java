import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        int ret;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Number :");
        num=reader.nextInt();
        ret=fact(num);
        System.out.println("Answer is : " + ret);
        int[] factorial={0,1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<factorial.length;i++){
            System.out.println(factorial[i]);
        }
        System.out.println("avg is "+avg(factorial));

        String txt="hello i am awsome";
        System.out.println("the len is "+len(txt));

    }

    public static int fact(int num){
        if(num==1){
            return num;
        }else{
            return  num * fact(num-1);
        }
    }


    public static int avg(int[] num){
        int average=0;
        for (int i=0;i<num.length;i++) {
            average = num[i] + average;

        }
        average=average/ (num.length-1);
        return average;
    }

    public static int len(String text){
        String[] txt=null;
        txt=text.split(" ");
        String t1=txt[txt.length-1];
        int sum =t1.length();
        return sum;
    }
}
