package hai;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class QuestionDatabank extends Questions {
    Questions questions = new Questions();

   public void init(){
       try {
           Questions q1 = new Questions("Whats a file?","storage space for info.");
           Questions q2 = new Questions("What is the role of a lawyer?","To defend his of=r her client.");
           Questions q3 = new Questions("Who is the function of the prosecutor","to investigate crimes.");
           Questions q4 = new Questions("What is the role of the Judiciary","to apply legislation.");
           Questions q5 = new Questions("Who is a judge","Someone who judges over a trial in the court." + " of law");
           Questions q6 = new Questions("What is the separation of powers doctrine?","the arms of " + "government must not act ultra vires");
           Questions q7 = new Questions("What is a noun?."," a person , place or thing.");
           Questions q8 = new Questions("What is a verb?.","an action or doing word.");
           Questions q9 = new Questions("What is an adjective?","a descriptive word.");
           Questions q10 = new Questions("is patois a language?.","yes.");
           Questions q11 = new Questions("What is a synonym for guilty?.","liable.");
           Questions q12 = new Questions("From which country did the english language originate?.","England.");
           Questions q13 = new Questions("Give an example of a oxymoron.","wet rain");
           Questions q14 = new Questions("What is the Area of a Square."," Area squared.");
           Questions q15 = new Questions("what is the square root of 49.","7");
           Questions q16 = new Questions("What is a dependent variable.","a variable who's outcome is dependent on another's.");
           Questions q17 = new Questions("what is a independent variable.","a variable who's outcome isn't dependent on another's.");
           Questions q18 = new Questions("What is an experiment.","any process of measurement or observation.");
           Questions q19 = new Questions("Define sample space.","set of possible outcomes in an experiment.");
           Questions q20 = new Questions("define event in terms of Statistics.","subset of the sample space.");

           FileOutputStream os = new FileOutputStream("databank.ser");
           ObjectOutputStream oos = new ObjectOutputStream(os);

           oos.writeObject(q1);
           oos.writeObject(q2);
           oos.writeObject(q3);
           oos.writeObject(q4);
           oos.writeObject(q5);
           oos.writeObject(q6);
           oos.writeObject(q7);
           oos.writeObject(q8);
           oos.writeObject(q9);
           oos.writeObject(q10);
           oos.writeObject(q11);
           oos.writeObject(q12);
           oos.writeObject(q13);
           oos.writeObject(q14);
           oos.writeObject(q15);
           oos.writeObject(q16);
           oos.writeObject(q17);
           oos.writeObject(q18);
           oos.writeObject(q19);
           oos.writeObject(q20);
           oos.close();
       }
       catch (Exception e){
           System.err.println("I/O Error");
           e.printStackTrace();
       }
   }

    public void create(String fileName){
       Random rand = new Random();

       int n = rand.nextInt(5) + 1;

     try{
         FileInputStream is = new FileInputStream("databank.ser");
         FileOutputStream iis = new FileOutputStream(new File(fileName));
         ObjectInputStream ois = new ObjectInputStream(is);
         ObjectOutputStream oos = new ObjectOutputStream(iis);

         Questions[] questionArray = new Questions[5];
         for(Questions x: questionArray){
             x = (Questions) ois.readObject();
             oos.writeObject(x);
             System.out.println("\nQuestion: "+x.getQuestion() + " \nAnswer: " + x.getAnswer());
         }
         ois.close();

     } catch (Exception e){
        e.printStackTrace();
     }

   }

}
