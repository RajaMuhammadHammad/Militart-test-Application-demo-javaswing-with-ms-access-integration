/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_application;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class IntelligenceQuestion  {
    
     
      private static final int PASSING_GRADE = 13;
    private String userName;
    private String nicNo;
    private ArrayList<Integer> userResponses;

   
   
    
      public int getQuestionIndex() {
    return userResponses.size();
}
    
    

    public IntelligenceQuestion(String name, String nic) {
        userName = name;
        nicNo = nic;
        userResponses = new ArrayList<Integer>();
    }
public String getUserName() {
        return userName;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setUserName(String name) {
        userName = name;
    }

    public void setNicNo(String NIC) {
        nicNo = NIC;
    }

    public int getQuestionCount() {
        return 10;
    }

    public String getQuestion(int index) {
        switch (index) {
            case 0:
                return "Which number comes next in the sequence: 1, 3, 5, 7, ___?";
            case 1:
                return "If you rearrange the letters 'LNGEDNA' you have the name of :";
            case 2:
                return "Which one of the five designs is least like the other four?";
            case 3:
                  return "What comes next in the series 3_53, 53, 53, 40, 40, ______, _______";
            case 4:
                return "Which one of the five makes the best comparison? PEACH is to HCAEP as 46251 is to:";
            case 5:
                return "Mary, who is sixteen years old, is four times as old as her brother. How old will Mary be when she is twice as old as her brother?";
            case 6:
                return "Which one of the numbers does not belong in the following series:  2, 4, 7, 12, 16?";
            case 7:
                return "John likes 400 but not 300; he likes 100 but not 99; he likes 3600 but not 3700. Which does he like?";
            case 8:
                return "Which one of the following things is the least like the others?";
            case 9:
                return "Choose the number that is 1/4 of 1/2 of 1/5 of 200:";
                case 10:
                return "Adil is 5 years, and his sister is 3 times of his ages what will be the age of his sister when adil will be 15 years old:";
                case 11:
                return "10 men dig a well in 5 days, how many days will taken if men are 5?";
                case 12:
                return "1 dozens pencil are of 60 Rs so amount of 5 pencil";
                case 13:
                return "Choose the number that is 60% of 9:";
                case 14:
                return "If 28th day of a month is Sunday then the 2nd day will be:";
                case 15:
                return "There are 30 passengers in a bus.2/3 of them are men then the percentage of women is: ";
                case 16:
                return "Bat cannot sea and Snake cannot _____________:";
                case 17:
                return "How many 31 days months in a year:";   
                case 18:
                return "How many weeks in a year?";
                case 19:
                return "Quarter of 120 is ";
                case 20:
                return "Complete the series"+"\n 115 55 170 65 235 ?";
                
                case 21:
                return "Rupee is to Pakistn as Yen is to _________";
                
                case 22:
                return "Steel is to karachi as Hosiery is to _________";
                case 23:
                return "What is Odd man out in CAB, FDE, LIK, UTS";
                case 24:
                return "If 10 men cover 10 Km distance in 3 days then how much distance will by 3 Men in 3 Days?";
                case 25:
                return "What is Odd man out in Bull, Mare, Cow, Hen,___________";
                
                
            default:
                return null;
        }
    }

public String[] getOptions(int index) {
        switch (index) {
            case 0:
                return new String[]{"8", "9", "10", "11", "12"};
            case 1:
                return new String[]{"Country", "State", "City", "Animal", "Ocean"};
            case 2:
                return new String[]{"A", "B", "C", "D", "E"};
            case 3:
                return new String[]{"2,3", "30,30", "27,27", "29,29", "10,10"};
            case 4:
                return new String[]{"65241", "15264", "56412", "51246", "46125"};
            case 5:
                return new String[]{"20", "8", "12", "16", "4"};
            case 6:
                return new String[]{"1", "2", "4", "7", "11"};
            case 7:
                return new String[]{"3100", "1600", "3300", "3400", "3500"};
            case 8:
                return new String[]{"Car", "Train", "Bus", "Bicycle", "Motorcycle"};
            case 9:
                return new String[]{"2", "5", "10", "25", "50"};
              case 10:
                return new String[]{"22", "15", "10", "25", "10"};
             case 11:
                return new String[]{"20", "15", "10", "25", "5"};
              case 12:
                return new String[]{"6", "5", "2", "26", "25"};   
                 case 13:
                return new String[]{"6.5", "5.4", "2", "2.6", "7.5"};               
                 case 14:
                return new String[]{"Monday", "Tuesday", "Wednesday", "Friday", "Thursday"};
                 case 15:
                return new String[]{"40%", "30%", "33.33%", "35.6%", "25.5%"};   
                 case 16:
                return new String[]{"Talk", "Hear", "Walk", "Jump", "Bite"};
                 case 17:
                return new String[]{"8", "7", "2", "9", "5"};
                 case 18:
                return new String[]{"58", "54", "52", "65", "53"};
                 case 19:
                return new String[]{"50", "30", "20", "24", "40"};
                 case 20:
                return new String[]{"60.5", "50", "80", "66", "75"};
                
                 case 21:
                return new String[]{"Iran", "France", "Japan", "China", "Korea"};
                 case 22:
                return new String[]{"Lahore", "Faisalabad", "Hyderabad", "Quetta", "Gujranwala"};
                
                
                 case 23:
                return new String[]{"UTS", "CAB", " FDE", "LIK", "OMN"};
                 case 24:
                return new String[]{"3", "10", "2", "6", "5"};
                 case 25:
                return new String[]{"Bull", "Mare", "Hen", "Goat", "Cow"};
                
            default:
                return null;
        }
    }

public int getAnswer(int index) {
    switch (index) {
        case 0:
            return 1;
        case 1:
            return 0; 
        case 2:
            return 2; 
        case 3:
            return 2;
        case 4:
            return 1; 
        case 5:
            return 1; 
        case 6:
            return 3;
        case 7:
            return 1; 
        case 8:
            return 1; 
        case 9:
            return 1;
          case 10:
            return 3;  
            case 11:
            return 0;
              case 12:
            return 4;
             case 13:
            return 1;
             case 14:
            return 1;
             case 15:
            return 2;
             case 16:
            return 1;
            
             case 17:
            return 1;
             case 18:
            return 2;
             case 19:
            return 1;
             case 20:
            return 4;
            
             case 21:
            return 1;
             case 22:
            return 1;
            
             case 23:
            return 0;
             case 24:
            return 0;
             case 25:
            return 0;
            
            
            
            
            
        default:
            return -1; 
    }
}

public void hideQuestions() {
        // Iterate through the questions and hide them
       for (int i = 0; i < getQuestionCount(); i++) {
        String question = getQuestion(i);
        String[] options = getOptions(i);
        
        // Hide the question by setting it to null
        setQuestion(i, null);
        
        // Hide the options by setting them to null
        setOptions(i, null);
    }
       
       
    }
    public void setUserResponse(int index, int response) {
        userResponses.add(index, response);
    }

 public boolean showResult() {
    int numCorrect = 0;
    for (int i = 0; i < userResponses.size(); i++) {
        if (userResponses.get(i) == getAnswer(i)) {
            numCorrect++;
        }
    }

    return numCorrect >= PASSING_GRADE;
}

    private void setQuestion(int i, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void setOptions(int i, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


    
}
