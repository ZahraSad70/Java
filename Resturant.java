public class Resturant {

    private String[] NameFood=new String[100];
    private double[] PriceFood=new double[100];
    private int[] ScoreFood=new int[100];
    private static int countItem=0;
    private int dup=0;
    public void insertFood(String name,double price,int score){
       for (int i=0;i<NameFood.length;i++){
           if(NameFood[i]==name){
               dup=1;
           }
       }
       if(dup==0){
           this.NameFood[countItem]=name;
           this.PriceFood[countItem]=price;
           this.ScoreFood[countItem]=score;
           countItem++;
       }else if(dup==1){
           System.out.println("این غذا تکراری است");
       }

    }

    public void delFood(String name){
        int index=0;
        for (int i=0;i<NameFood.length;i++){
            if(NameFood[i]==name){
                index=i;
            }
        }
        for (int i=index;i<countItem;i++){
            this.NameFood[i]=this.NameFood[i+1];
            this.PriceFood[i]=this.PriceFood[i+1];
            this.ScoreFood[i]=this.ScoreFood[i+1];

        }
        countItem=countItem-1;
        System.out.println("این عذا از منو حذف شد");
        System.out.println(countItem);
    }


}
