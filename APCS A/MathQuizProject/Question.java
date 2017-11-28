
public class Question
{
    private int num1;
    private int num2;
    private int correctAnswer;
    private int userAnswer;
    private String[] operator = {"+","-","/","*"};
    
    public Question(){
        
        // generate 2 random numbers
        num1 =
        num2 =
        
        // generate a random operator using indices in the operator array
        // and a random number from 0-3
        
        
        // if-statement to determine correct answer
        if( /* operator is plus */ ){
            
            correctAnswer = num1 + num2;
        } else...
        // add the other conditions
        
    }
    
    public String getQuestionText(){
        // return the complete question for the program to display
        
        
    }
    
    public boolean checkAnswer(int u){
        
        // set the user answer
        
        // if the user answer is equal to the correctAnswer, return true, else return false
        
    }
    
    public int getCorrectAnswer(){
        // return the correct answer
    }
    
    public int getUserAnswer(){
        // return the user's answer
    }
}
