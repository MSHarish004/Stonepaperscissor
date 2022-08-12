import java.lang.String; 
import java.util.*;
public class Stonepaperscissor { 
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Scanner ob=new Scanner(System.in);
Random rand=new Random();
System.out.println("WELCOME TO STONE PAPER SCISSOR GAME");
int n,com=0,man=0;
String user="";
String bot=""; 
int ch; 
ob.close();
sc.close();

do{ System.out.println("ENTER 1)continue  OR 0)Exit");
    ch=sc.nextInt();
    switch(ch){
case 1:
    System.out.println("Enter S)tone P)aper C)issor");
    user=ob.nextLine();
    n=rand.nextInt(3);


if(n==0){
    bot="S";
}
if(n==1){
    bot="P";
}if(n==2){
    bot="C";
}
System.out.println("User chose "+user);
System.out.println("Bot chose "+bot);
if(bot.equals("S")&&user.equals("P")){
    System.out.println("User Won"); 
    man++;
}
if(bot.equals("P")&&user.equals("C")){
    System.out.println("User Won");
    man++;
}
if(bot.equals("C")&&user.equals("S")){
    System.out.println("User Won");
    man++;
}
if(bot.equals("S")&&user.equals("C")){
    System.out.println("BOT Won");
    com++;
}
if(bot.equals("P")&&user.equals("S")){
    System.out.println("BOT Won");
    com++;
}
if(bot.equals("C")&&user.equals("P")){
    System.out.println("BOT Won");
    com++;
}
if(bot.equals(user)){
    System.out.println("TIE");
} 
break; 
    }
}while(ch!=0);
if(man>com){
    System.out.println("**USER WON THE GAME**");
}
if(man<com){
    System.out.println("//BOT WON THE GAME//");
}
if(man==com){
    System.out.println("|GAME TIED|");
}
 

}
}