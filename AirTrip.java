import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
public class AirTrip {
    private String NamePerson;
    private  int NumAir;  //برای مثال ما فقط دو تا شماره پرواز داریم  شماره پرواز 102 و شماره پرواز 101
    private static LocalDateTime DateAir_101;
    private static LocalDateTime DateAir_102;
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
        }else{
            System.out.println("این شماره پرواز موجود نیست");
        }
    }

    public static void  TimeAir(int NumAir){

        if (NumAir==101){
            DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            DateAir_101 = LocalDateTime.from(date.parse("2024-07-10 23:00:00"));
            System.out.println("ساعت پرواز شماره 101" +"\n"+ DateAir_101.toString().replace("T"," "));
        }else if (NumAir==102) {
            DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            DateAir_102 = LocalDateTime.from(date.parse("2024-07-10 22:45:00"));
            System.out.println("ساعت پرواز شماره 102" +"\n"+ DateAir_102.toString().replace("T"," "));
        }else{
            System.out.println("این شماره پرواز موجود نیست");
        }
    }
}
