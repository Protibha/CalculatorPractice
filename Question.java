import java.util.Random;

public class Question {
    private int operand1;
    private int operand2;
    private char operator;
    private int correctAnswer;

    public Question(){

//This is a method inside the class Question
        //1. Non-static Methods
        //The methods in the Random class (like nextInt() or nextDouble()) are not static, which means:
        //
        //You can't call them using the class name directly. You need an object.
        Random rand =new Random();
        this.operand1=rand.nextInt(100)+1;
        this.operand2=rand.nextInt(100)+1;
        char [] operators={'+','-','*','/'};
        this.operator=operators[rand.nextInt(4)];
        calculateAnswer();
    }

    public void calculateAnswer(){
        switch(operator){
            case '+':
                correctAnswer=operand1+operand2;
                break;

            case '-':
                correctAnswer=operand1-operand2;
                break;

            case '*':
                correctAnswer=operand1*operand2;
                break;

            case '/':
                correctAnswer=operand1/operand2;
                break;

        }
    }

    public void generateQuestion(){
        System.out.println("What is "+operand1+" "+operator+" " +operand2+ " ?");
    }

    public boolean checkAnswer(double userAnswer){
        return Math.abs(userAnswer-correctAnswer)<0.001;
    }
}
