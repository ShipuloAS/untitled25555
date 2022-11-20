public class Main {
    public static void main(String[] args) {
    int j=8;
    Counter chet = new Counter("chet",0)    ;
    Counter nechet = new Counter("nechet",0);
    for(int i = 1; i<=200;i++){
     if (i%2==0)  { chet.cPlus(1);}
     else {nechet.cPlus(1);}



        }




        System.out.println("ЧЁтных - "+chet.GetVal()+"   Нечетных - "+ nechet.GetVal());
    }
}