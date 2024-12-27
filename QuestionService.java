import java.util.Scanner;

public class QuestionService  {
    private Question[] questions = new Question[5];
    String selections [] = new String[5];
    String options [] = new String[]{"1","2","4","8"};

    public QuestionService() {
        questions[0] = new Question(1, "What is the length of int ?", options, "2");
        questions[1] = new Question(2, "What is the length of char ?", options, "1");
        questions[2] = new Question(3, "What is the length of Float ?", options, "8");
        questions[3] = new Question(4, "What is the length of Double ?", options, "4");
        questions[4] = new Question(5, "What is the length of Long ?", options, "8");

    }

    public void playQuiz(){
        int i=0;
        for(Question q : questions){
            System.out.println(q.getId()+": "+q.getQue());
            System.out.print("A. "+q.getOpt()[0]);
            System.out.println("\t\tB. "+q.getOpt()[1]);
            System.out.print("C. "+q.getOpt()[2]);
            System.out.println("\t\tD. "+q.getOpt()[3]);
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the ans: ");
            selections[i++]=in.nextLine();

            System.out.println();
        }

    }

    public void calculateScore(){
        int score =0;
        for(int i=0;i<questions.length;i++)
        {
            if( (questions[i].getAns()).equals(selections[i])  )
                score++;
        }
        System.out.println("Your Calculated Score is : "+score);
    }
}
