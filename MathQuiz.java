import java.util.*;
public class MathQuiz {
    private int score;

    public MathQuiz(){
        this.score=0;
    }

    public  void startQuiz(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Welcome to Quiz Competition");
        for(int i=0;i<5;i++){
            askQuestion(scanner);
        }
        System.out.println("Your final score is: "+score+"/5");
        scanner.close();
    }

    //why private
    private void askQuestion(Scanner scanner){
        Question question = new Question();
        question.generateQuestion();
        System.out.println("Your Answer");
        double userAnswer= scanner.nextDouble();
        if(question.checkAnswer(userAnswer)){
            System.out.println("Correct!");
            score++;
        }
        else{
            System.out.println("Incorrect!");
        }

    }

}
