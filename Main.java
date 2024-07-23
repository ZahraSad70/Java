import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        AirTrip person_one=new AirTrip("zahra",101);
//        AirTrip person_two=new AirTrip("zahra",101);
//        AirTrip person_three=new AirTrip("zahra",101);
//        AirTrip person_four=new AirTrip("zahra",101);
//        AirTrip person_five=new AirTrip("zahra",101);
//        AirTrip.changeStatus(101,3);
//        AirTrip.StaticStatusAir(101);
//        AirTrip.TimeAir(102);
        Resturant res= new Resturant();
        res.insertFood("مرغ",152000,4);
        res.insertFood("برنج",160000,3);
        res.insertFood("ماکارونی",170000,7);
        res.insertFood("ماهی",20000,10);
        res.insertFood("سیب زمینی",240000,5);
        res.insertFood("سیب زمینی",240000,5);

        res.delFood("مرغ");


}
}
