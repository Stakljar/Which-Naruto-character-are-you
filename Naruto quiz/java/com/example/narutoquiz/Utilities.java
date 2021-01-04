package com.example.narutoquiz;

import java.util.Random;

public class Utilities {
    public static class QuizUtilities { //20 40 60 each question, 100-149->Obito, 150-199->Sasuke, 200-249->Kakashi, 250-300->Naruto
        public static String GetQuestion1(){
            return "Do you like ramen noodles?";
        }
        public static String GetQuestion2(){
            return "Do you prefer being alone?";
        }
        public static String GetQuestion3(){
            return "Would you like to have sharingan?";
        }
        public static String GetQuestion4(){
            return "Do you desire peace?";
        }
        public static String GetQuestion5(){
            return "Do you wish to change reality?";
        }
        public static String GetTextButton1(){
            return "Yes";
        }
        public static String GetTextButton2(){
            return "Maybe";
        }
        public static String GetTextButton3(){
            return "No";
        }
        public static int GetRandomNumber(){
            Random random = new Random();
            int number = random.nextInt(5);
            return number;
        }
    }
}
