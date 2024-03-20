
import java.io.*;
import java.util.Random;
import java.util.Scanner;



public class Main
{
 static Random r=new Random();
 static int stage,amount,life,aud=0,phn=0,expt=0,ddip=0,correct,in,c;
 static String s1,opt;
 static int a[]={0,5000,10000,20000,40000,80000,160000,320000,640000,1250000,2500000,5000000,10000000,70000000};/*storage of
 amount into array*/
 static String s[]={"1 : Audience poll","2 : 50-50","3 : Skip the Question"};
 static boolean flag=true;
 public static void main(String args[])throws Exception
 {
    int i;
    System.out.print("\nWelcome to Kaun Banega Crorepati ");
   // Thread.sleep(1500);
    System.out.print("\nYou'll have to answer 13 questions to win 7 crore ruppees\n");
   // Thread.sleep(1500);
    System.out.println("\nMoney Tree looks like this:");
   // Thread.sleep(1500);
    for(i=1;i<=13;i++)
    {
        System.out.print("\n"+i+" <> Rs. "+a[i-1]);
      //  Thread.sleep(1000);
    }
    System.out.println();
    //Thread.sleep(3000);
    System.out.print("\nIn addition to this, you'll have 4 lifelines to assist you\n\n");
    System.out.print(s[0]+" : Will help you to take audience's opinion\n");
    System.out.print(s[1]+" : Will delete the two incorrect option\n");
    System.out.print(s[2]+" : Can skip a particular question once but the amount for that question will not be added\n");
    //Thread.sleep(3000); 
    System.out.print("\n\nEnter choices as A B C D");
    System.out.print("\nEnter 'L' to choose a life-line");
    stageset();
    Display D=new Display();
    Ques q=new Ques();
    D.display(q);
        
    }
    public static void stageset()throws IOException
    {
        String c;
        System.out.print("\n\nAre you sure to continue(Y/N) : ");
        Scanner s= new Scanner(System.in);
        c=s.next();
        if(!(c.equalsIgnoreCase("Y"))){
         if((c.equalsIgnoreCase("N"))){
            Ques q=new Ques();
            q.quit(13);
        }
        stageset();
    }
   }
    
}
class Display {
    
    void display(Database D) throws Exception{
        D.q1();
        D.q2();
        D.q3();
        D.q4();
        D.q5();
        D.q6();
        D.q7();
        D.q8();
        D.q9();
        D.q10();
        D.q11();
        D.q12();
        D.q13();
       
    }
    
}

abstract class Database{
 static int a[]={0,5000,10000,20000,40000,80000,160000,320000,640000,1250000,2500000,5000000,10000000,70000000};/*storage of
 amount into array*/
    static String s1="";
        static int correct=0,c;
        static int cont=1,i=1;
        abstract void q1() throws IOException,InterruptedException,Exception;
        abstract void q2() throws IOException,InterruptedException,Exception;
        abstract void q3() throws IOException,InterruptedException,Exception;
        abstract void q4() throws IOException,InterruptedException,Exception;
        abstract void q5() throws IOException,InterruptedException,Exception;
        abstract void q6() throws IOException,InterruptedException,Exception;
        abstract void q7() throws IOException,InterruptedException,Exception;
        abstract void q8() throws IOException,InterruptedException,Exception;
        abstract void q9() throws IOException,InterruptedException,Exception;
        abstract void q10() throws IOException,InterruptedException,Exception;
        abstract void q11() throws IOException,InterruptedException,Exception;
        abstract void q12() throws IOException,InterruptedException,Exception;
        abstract void q13() throws IOException,InterruptedException,Exception; 
        
    

    public static void continue1() throws IOException{
        System.out.print("\n\n\nAre you sure to continue(Y/N) :");
        Scanner scan = new Scanner(System.in);
        String s1=scan.next();
    }  
    
    
}
class Ques extends Database{
    Scanner s =new Scanner(System.in);
   static boolean flag=true;
   String ns[]={"char","  8"," "};
    public static void play(int correct,int i) throws IOException{
        int c=0;
        String opt;
        System.out.print("\n\nEnter your choice : ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        opt=br.readLine();
        //Thread.sleep(3000);
        if(opt.substring(0,1).equalsIgnoreCase("A")){
        c=1;check(c,correct,i);}
        if(opt.substring(0,1).equalsIgnoreCase("B"))
    {    c=2;check(c,correct,i);}
        if(opt.substring(0,1).equalsIgnoreCase("C"))
      {  c=3;check(c,correct,i);}
        if(opt.substring(0,1).equalsIgnoreCase("D"))
       { c=4;check(c,correct,i);}
        if(opt.substring(0,1).equalsIgnoreCase("L"))
        {
            Life l=new Life();
            l.life(correct,cont,i);
            if(flag==true){
            play(correct,i);
            }
            flag=false;

        }
        if(!(opt.equalsIgnoreCase("A")||opt.equalsIgnoreCase("B")||opt.equalsIgnoreCase("C")||opt.equalsIgnoreCase("D")||opt.equalsIgnoreCase("L")))
        play(correct, i);
    }
        public static void check(int c,int correct,int i){
        if(correct==c)
        {
            
            System.out.print("\nWell done. Correct answer.");
            
            System.out.print("\n\nCongratulations, you have won "+a[i]);
            
        }
        else
        { 
            
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is C: Kolkata");
            quit(i);
        }
        
    } 

    public static void quit(int i)
    {   
        System.out.print("\n\nYou have won Rs. "+a[i]);
        System.out.print("\n\nThank you for participating in KBC ");
        System.out.print("\n\nWish you all the best\nTake care\nSee you again.");
        System.exit(0);
    }
    @Override
    public void q1() throws InterruptedException, IOException {
        int i=1;
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print("1. Which data type is used to store a single character is Java?");
        System.out.print("\n\nA: String\t\tB: char\nC: letter\t\tD: integer");
        correct=2;
        play(correct,i); 
        System.out.print("\n\nEnter any key to continue : ");
        Scanner s= new Scanner(System.in);
        s1=s.next();
        cont++;
        i++;
    }

    @Override
    public void q2() throws InterruptedException ,IOException{
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print("Number of primitive data types in Java are");
        System.out.print("\n\nA: 6\t\tB: 9\nC: 8\t\tD: 7");
        correct=3;
        play(correct,i);
       
        
        System.out.print("\n\nEnter any key to continue : ");
        Scanner scan= new Scanner(System.in);
        s1=scan.next();
        cont++;
        i++;
    }

    @Override
    void q3() throws InterruptedException ,IOException{
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print("Who invented Java Programming?");
        System.out.print("\n\nA: Guido van Rossum\t\tB:Dennis Ritchie \nC: Bjarne Stroustrup  \t\tD: James Gosling");
        correct=4;
        play(correct,i);
        
        System.out.print("\n\nEnter any key to continue : ");
        s1=s.next();
        cont++;
        i++;
    }

    @Override
    void q4() throws InterruptedException ,IOException{
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print("Which statement is true about Java? ");
        System.out.print("\n\nA: a) Java is a sequence-dependent programming language\t\tB: Java is a platform-independent programming languag\nC:a) Java is a code dependent programming language\t\t D.c) Java is a platform-dependent programming language");
        correct=2;
        play(correct,i);
        
        System.out.print("\n\nEnter any key to continue : ");
        s1=s.next();
        cont++;
        i++;
    }

    @Override
    void q5() throws InterruptedException ,IOException{
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print(" Which one of the following is not a Java feature?");
        System.out.print("\n\na) Use of pointers\t\tb) Object-oriented\nc) Portable\t\td) Dynamic and Extensible");
        correct=1;
        play(correct,i);
        
        System.out.print("\n\nEnter any key to continue : ");
        s1=s.next();
        cont++;
        i++;
    }

    @Override
    void q6() throws IOException, InterruptedException {
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print("Who owns the fast food joints KFC and Pizza Hut ? : ");
        System.out.print("\n\nA: McFood\t\tB: Yum! Restaurants\nC: DesPlaines Illinois\t\tD: Richard and Maurice");
        correct=2;
        play(correct,i);
       
        continue1();
        if(!(s1.equalsIgnoreCase("Y"))){
            if((s1.equalsIgnoreCase("N"))){
               quit(6);
           }
           continue1();
        }
        cont++;
        i++;
    }

    @Override
    void q7() throws IOException, InterruptedException {
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print("Which one of the following is not a Java feature?: ");
        System.out.print("\n\na) Object-oriented\t\tB: b) Use of pointers\nC: c) Portable\t\td) Dynamic and Extensible");
        correct=2;
        play(correct,i);
        
        continue1();
        if(!(s1.equalsIgnoreCase("Y"))){
            if((s1.equalsIgnoreCase("N"))){
               quit(7);
           }
           continue1();
        }
        cont++;
        i++;
    }

    @Override
    void q8() throws IOException, InterruptedException {
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print("Which of the following is a type of polymorphism in Java Programming? : ");
        System.out.print("\n\nA:  Multiple polymorphism\t\tB: Compile time polymorphism\nC:Multilevel polymorphism \t\tD:Execution time polymorphism");
        correct=2;
        play(correct,i);
        
        continue1();
        if(!(s1.equalsIgnoreCase("Y"))){
            if((s1.equalsIgnoreCase("N"))){
               quit(i);
           }
           continue1();
        }
        cont++;
        i++;
    }

    @Override
    void q9() throws IOException, InterruptedException {
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print("What is Truncation in Java? : ");
        System.out.print("\na) Floating-point value assigned to a Floating type\t\tb) Floating-point value assigned to an integer type\nc) Integer value assigned to floating type \t\td) Integer value assigned to floating type");
        correct=2;
        play(correct,i);
        
        continue1();
        if(!(s1.equalsIgnoreCase("Y"))){
            if((s1.equalsIgnoreCase("N"))){
               quit(i);
           }
           continue1();
        }
        cont++;
        i++;
    }

    @Override
    void q10() throws IOException, InterruptedException {
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print(" Which exception is thrown when java is out of memory?: ");
        System.out.print("\na) MemoryError\t\tb) OutOfMemoryError\nc) MemoryOutOfBoundsException\t\td) MemoryFullException");
        correct=2;
        play(correct,i);
        
        continue1();
        if(!(s1.equalsIgnoreCase("Y"))){
            if((s1.equalsIgnoreCase("N"))){
               quit(i);
           }
           continue1();
        }
        cont++;
        i++;
    }

    @Override
    void q11() throws IOException, InterruptedException {
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print(" Which of these are selection statements in Java?: ");
        System.out.print("\na) break\t\tb) continue\nc) for()\t\td) if()");
        correct=4;
        play(correct,i);
        
        continue1();
        if(!(s1.equalsIgnoreCase("Y"))){
            if((s1.equalsIgnoreCase("N"))){
               quit(i);
           }
           continue1();
        }
        cont++;
        i++;
    }

    @Override
    void q12() throws IOException, InterruptedException {
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print("Which of the following is a popular form of Buddhism in Japan? : ");
        System.out.print("\n\nA: Zen\t\tB: Pikachu\nC: Totoro\t\tD: Matsushita");
        correct=1;
        play(correct,i);
       
        continue1();
        if(!(s1.equalsIgnoreCase("Y"))){
            if((s1.equalsIgnoreCase("N"))){
               quit(i);
           }
           continue1();
        }
        cont++;
        i++;
    }

    @Override
    void q13() throws InterruptedException ,IOException{
        System.out.print("Stage : "+cont+" <> "+a[i]+"\n\n");
        System.out.print("How many alphabets are there in Kannada Language: ");
        System.out.print("\n\nA: 52\t\tB: 48\nC: 49\t\tD: 50");
        correct=3;
        play(correct,i);
        quit(i);
    } 
}

 class Life {
    static int a[]={0,5000,10000,20000,40000,80000,160000,320000,640000,1250000,2500000,5000000,10000000,70000000};
    static boolean flag=false;
    static Random r=new Random();
    static int life=0,aud=0,correct=0;
    static String s[]={"1 : Audience poll","2 : 50-50","3 : Skip the Question"};
    public static void life(int correct,int c,int j) throws IOException
    {
        int k;
        System.out.print("\nYou have the following lifelines left : ");
        for(k=0;k<=2;k++)
        System.out.print(s[k]+"  ");
        System.out.print("4. U dont want to use any lifeline/No lifeline, to go back press 4");
        System.out.print("\n\nWhich one would you like to use (Enter number) : ");
        Scanner s= new Scanner(System.in);
        life=s.nextInt();
        switch(life)
        {
            case 1:
            audience(correct);
            break;
            case 2:
            fifty(correct);
            break;
            case 3:
            skip(flag,c,j);        
            break;
            default:
            Ques q=new Ques();
           q.play(correct,j);
        }
    }
 
    

    public static void audience(int correct)
    {
        aud++;
        int a[]=new int[3];// three numbers are stored in an array
        int s1=0,i,c;
        s[0]="";
        for(i=0;i<=2;i++)
        {
            c=r.nextInt(15);//randomly any three numbers are selected
            a[i]=c;
        }
        s1=100-(a[0]+a[1]+a[2]);//s1 is equal to difference between 100 and the sum of the 3 numbers selected randomly
        System.out.println("\nAwaiting reply ");
        if(correct==1)
        {
            System.out.print("\nA : "+s1+" %");
            System.out.print("\nB : "+a[0]+" %");
            System.out.print("\nC : "+a[1]+" %");
            System.out.print("\nD : "+a[2]+" %");
        }
        if(correct==2)
        {
            System.out.print("\nA : "+a[0]+" %");
            System.out.print("\nB : "+s1+" %");
            System.out.print("\nC : "+a[1]+" %");
            System.out.print("\nD : "+a[2]+" %");
        }
        if(correct==3)
        {
            System.out.print("\nA : "+a[1]+" %");
            System.out.print("\nB : "+a[0]+" %");
            System.out.print("\nC : "+s1+" %");
            System.out.print("\nD : "+a[2]+" %");
        }
        if(correct==4)
        {
            System.out.print("\nA : "+a[2]+" %");
            System.out.print("\nB : "+a[0]+" %");
            System.out.print("\nC : "+a[1]+" %");
            System.out.print("\nD : "+s1+" %");
        }
    }

    public static void skip(boolean flag,int c,int i) {
        if(c<8){
        s[2]="";
        --i;
        flag=true;
        }
        else{
            System.out.println("Skip the question lifeline cannot be used");
            flag=false;
        }
    }

    public static void fifty(int correct) {
        s[1]="";
        flag=false;
        if(correct==1)
        {
            System.out.print("\nA : √ ");
            System.out.print("\nB : X ");
            System.out.print("\nC : √ ");
            System.out.print("\nD : X ");
            System.out.println("\nChoose between option A and C");
        }
        if(correct==2)
        {
            System.out.print("\nA : X ");
            System.out.print("\nB : √ ");
            System.out.print("\nC : √ ");
            System.out.print("\nD : X ");
            System.out.println("\nChoose between option B and C");
        }
        if(correct==3)
        {
            System.out.print("\nA : X ");
            System.out.print("\nB : X ");
            System.out.print("\nC : √ ");
            System.out.print("\nD : √ ");
            System.out.println("\nChoose between option C and D");
        }
        if(correct==4)
        {
            System.out.print("\nA : √ ");
            System.out.print("\nB : X ");
            System.out.print("\nC : X ");
            System.out.print("\nD : √ ");
            System.out.println("\nChoose between option A and D");

        }
    }
}






