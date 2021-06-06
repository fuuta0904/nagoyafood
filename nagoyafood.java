import java.util.*;
public class rina1J19F181{
  public static void main(String[] args){
  System.out.println("いらっしゃいませ！名古屋飯料理店へようこそ！");
   String [] [] M = {
        {"ご注文は何にいたしますか？","1:味噌カツ","2:台湾ラーメン","3:ひつまぶし","4:あんかけスパゲッティ"},
        {"お飲み物はどうなさいますか？","1:いらない","2:紅茶","3:コーヒー","4:ビール"},
        {"お持ち帰りですか？","1:いいえ","2:はい(自宅まで30分圏内)","3:はい(自宅まで30分~1時間圏内)","4:はい(自宅まで1時間以上)"}
   };

   Scanner scanner = new java.util.Scanner(System.in);

   for(int i=0;i<M.length; i++){
     System.out.println(M[i][0]);
     System.out.println(M[i][1]);
     System.out.println(M[i][2]);
     System.out.println(M[i][3]);
     System.out.println(M[i][4]);
     int num = new java.util.Scanner(System.in).nextInt();

     System.out.println("あなたは"+ M[i][num] +"を選択しました");
     if(i==0){
        hyozi0(i,num);
     }else if(i==1){
        hyozi1(i,num);
     }else{
        hyozi2(i,num);
     }
       }

    System.out.println("受け取り口は隣のカウンターとなっております。ありがとうございました！");
   }

     public static String hyozi0(int a,int b){

       String[] [] gohan = {
         {"味噌ダレの量はどうなさいますか？","1:多め","2:少なめ","3:普通"},
         {"台湾ラーメンの辛さはどうなさいますか？","1:鬼激辛","2:激辛","3:辛"},
         {"ひつまぶしの薬味は何になさいますか？","1:ねぎ","2:刻み海苔","3:どちらも"},
         {"麺の硬さはどうなさいますか？","1:固め","2:柔らかめ","3:アルデンテ"}
       };
       String details = "正しい数字を入力してください";
       if(b==1){
         for(int i=0;i<4; i++){
           System.out.println(gohan[0][i]);
           }
           int amount = new java.util.Scanner(System.in).nextInt();
           details = "味噌だれの量は"+ gohan[0][amount] +"を選択しました";
       }else if(b==2){
          for(int i=0;i<4; i++){
           System.out.println(gohan[1][i]);
           }
           int spicy = new java.util.Scanner(System.in).nextInt();
           details = "辛さは"+ gohan[1][spicy] +"を選択しました";
       }else if(b==3){
         for(int i=0;i<4; i++){
          System.out.println(gohan[2][i]);
          }
          int yakumi = new java.util.Scanner(System.in).nextInt();
          details = "薬味は"+ gohan[2][yakumi] +"を選択しました";
       }else if(b==4){
         for(int i=0;i<4; i++){
          System.out.println(gohan[3][i]);
          }
          int hardness = new java.util.Scanner(System.in).nextInt();
          details = "麺の硬さは"+ gohan[3][hardness] +"を選択しました";
       }else{
          details = "正しい数字を入力してください";
       }
       System.out.println(details);
       return details;
     }

     public static String hyozi1(int c,int d){
       String[] [] drink = {
         {"紅茶には何をお入れしますか？","1:無し","2:ミルク","3:レモン"},
         {"コーヒーには何をお入れしますか？","1:無し","2:ミルク","3:生姜"},
         {"ビールのサイズはどうなさいますか？","1:小生","2:中生","3:大生"},
       };
       String details2 = "正しい数字を入力してください";
       if(d==1){
          details2 = "承知いたしました";
       }else if(d==2){
          for(int i=0;i<4; i++){
           System.out.println(drink[0][i]);
           }
           int tea = new java.util.Scanner(System.in).nextInt();
           details2 = "紅茶には"+ drink[0][tea] +"をお入れします";
       }else if(d==3){
         for(int i=0;i<4; i++){
          System.out.println(drink[1][i]);
          }
          int coffee = new java.util.Scanner(System.in).nextInt();
          details2 = "コーヒーには"+ drink[1][coffee] +"をお入れします";
       }else if(d==4){
         for(int i=0;i<4; i++){
          System.out.println(drink[2][i]);
          }
          int beer = new java.util.Scanner(System.in).nextInt();
          details2 = "ビールのサイズは"+ drink[2][beer] +"を選択しました";
       }else{
          details2 = "正しい数字を入力してください";
       }
       System.out.println(details2);
       return details2;
     }

     public static String hyozi2(int e,int f){

       String details3 = "正しい数字を入力してください";
       if(f==1){
          details3 = "承知いたしました。";
       }else if(f==2){
          details3 = "承知いたしました。冷めない内にお召し上がりください。";
       }else if(f==3){
         details3 = "承知いたしました。お召し上がりの際には電子レンジで温めると、より美味しくいただけます。";
       }else if(f==4){
         details3 = "承知いたしました。お召し上がりの際には必ず電子レンジで温めてからお召し上がりください";
       }else{
          details3 = "正しい数字を入力してください";
       }
       System.out.println(details3);
       return details3;
     }
  }
