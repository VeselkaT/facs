import java.util.Scanner;

public class MathQuiz{
    
    public static void main(String[] args){
    {
        
        Scanner input = new Scanner(System.in);
        
        // ask user for name
        
        
        // create a Player object using that name
        Player player = 
        
        // ask user for number of questions
        
        
        // create an array of Questions with that many elements
        Question[] questions = 
        
        // loop through the array of questions
        for(int i = 0; i < questions.length; i++){
            // this loop is EACH question being asked
            
            // create a new Question object, stored in the next array index
            questions[i] = new Question();
            
            // ask the user the question
            
            // get the user's answer
            
            // check the user's answer by using the checkAnswer(int) method
            
            // add to the Player's score if it was correct
            
        }|
        
        // display the user's score
        player.getScoreText(questions.length);
        
        // loop through the array of questions AGAIN to show incorrect ones
        for(int i = 0; i < questions.length; i++){
            // if the question answer was WRONG
            
            // display the question, the user answer, and the correct answer
        }
    }
}
