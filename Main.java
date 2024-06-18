import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num=0;
        int ret=0;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Number:");
        num=reader.nextInt();
        ret=fact(num);
        System.out.println("Answer is : " + ret);
    }

    public static int fact(int num){
        if(num==1){
            return num;
        }else{
            return  num * fact(num-1);
        }
    }
}
