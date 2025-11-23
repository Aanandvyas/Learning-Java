
package QuizApp;

import java.util.Scanner;

public class QuestionService {
    Qusetions[] questions = new Qusetions[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Qusetions(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[1] = new Qusetions(2, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", "Mars");
        questions[2] = new Qusetions(3, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald", "Harper Lee");
        questions[3] = new Qusetions(4, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");
        questions[4] = new Qusetions(5, "What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Pb", "Au");
    }

    public void playQuiz(){
        int i =0;
        Scanner sc = new Scanner(System.in);
        for(Qusetions q : questions){
            System.out.println("Q"+q.getId()+": "+q.getQuestion());
            System.out.println("1. "+q.getOpt1());
            System.out.println("2. "+q.getOpt2());
            System.out.println("3. "+q.getOpt3());
            System.out.println("4. "+q.getOpt4());
            selection[i++] = sc.nextLine();
        }
        sc.close();
    }

    public void showResult(){
        int score = 0;
        System.out.println("----- Quiz Results -----");
        for(int i=0;i<questions.length;i++){
            Qusetions q = questions[i];
            System.out.println("Q"+q.getId()+": "+q.getQuestion());
            System.out.println("Your answer: "+selection[i]);
            System.out.println("Correct answer: "+q.getAnswer());
            if(selection[i].equalsIgnoreCase(q.getAnswer())){
                score++;
            }
            System.out.println();
        }
        System.out.println("Your total score: "+score+"/"+questions.length);
    }
}
