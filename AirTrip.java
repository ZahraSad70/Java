import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
public class AirTrip {
    private String NamePerson;
    private  int NumAir;  //برای مثال ما فقط دو تا شماره پرواز داریم  شماره پرواز 102 و شماره پرواز 101
    private static Date DateAir_101=new Date();
    private static Date DateAir_102=new Date();
    private static int statusAir_101=1;  //سه تا مقدار داریم برای این متغیر 1/2/3 به ترتیب از چپ در حال مسافرگیری ، تکمیل شده ، تاخیر
    private static int statusAir_102=1;

    public AirTrip(String NamePerson,int NumAir){
        if (NumAir==101){
            this.NamePerson=NamePerson;
            this.NumAir=NumAir;
        }else if (NumAir==102) {
            this.NamePerson=NamePerson;
            this.NumAir=NumAir;
        }else{
            System.out.println("این شماره پرواز موجود نیست");
        }

    }
    public static void changeStatus(int NumAir , int status){
        if (NumAir==101){
           statusAir_101=status;
        }else if (NumAir==102) {
            statusAir_102=status;
        }
    }
    public static void StaticStatusAir(int NumAir){

        if (NumAir==101){
            if (statusAir_101==1){
                System.out.println("در حال مسافرگیری");
            }else if(statusAir_101==2){
                System.out.println("تکمیل شده آماده پرواز");
            }else if(statusAir_101==3){
                System.out.println("پرواز تاخیر دارد");
            }
        }else if (NumAir==102) {
            if (statusAir_102==1){
                System.out.println("در حال مسافرگیری");
            }else if(statusAir_102==2){
                System.out.println("تکمیل شده آماده پرواز");
            }else if(statusAir_102==3){
                System.out.println("پرواز تاخیر دارد");
            }
        }
    }

    public static void  TimeAir(int NumAir){
        if (NumAir==101){
            SimpleDateFormat Time =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String TimeTrip = Time.format(DateAir_101);
            System.out.println(TimeTrip);
        }else if (NumAir==102) {
            SimpleDateFormat Time =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String TimeTrip = Time.format(DateAir_102);
            System.out.println(TimeTrip);
        }else{
            System.out.println("این شماره پرواز موجود نیست");
        }
    }
}
