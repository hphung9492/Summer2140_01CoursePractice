package Selections;
public class AdditionQuiz {
    public static void main(String[] args){
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis()*7 %10);
        java.util.Scanner consolInput = new java.util.Scanner(System.in);

        System.out.println(number1 + " + " + number2 + "= ? ");
       int answer = consolInput.nextInt();
       int correctAnswer = number1+number2;
       if (answer == correctAnswer){
           System.out.println("Your answer is correct!");
       }
       else {
           System.out.println("Your answer is not correct :(");
       }

    }
}
