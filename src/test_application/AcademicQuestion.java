
package test_application;

import java.util.ArrayList;


public class AcademicQuestion extends IntelligenceQuestion {

    
    
    
    public int getQuestionIndex() {
    return userResponses.size();
}
    
    public int getQuestionCount() {
    return academicQuestions.size();
}


    private static final int PASSING_GRADE = 14;
    private ArrayList<String> academicQuestions;
    private ArrayList<String[]> options;
    private ArrayList<Integer> answers;
    private ArrayList<Integer> userResponses;

    public AcademicQuestion(String name, String nic) {
        super(name, nic);

        // Initialize the academic questions, options, and answers
        academicQuestions = new ArrayList<>();
        options = new ArrayList<>();
        answers = new ArrayList<>();
        userResponses = new ArrayList<>();

        // Add the academic questions
        academicQuestions.add("What is the capital of Pakistan?");
        academicQuestions.add("Who is the founder of Pakistan?");
        academicQuestions.add("Which city is known as the 'City of Gardens' in Pakistan?");
        academicQuestions.add("What is the national animal of Pakistan?");
        academicQuestions.add("Which Pakistani city is famous for its historical fort?");
        academicQuestions.add("What is the national flower of Pakistan?");
        academicQuestions.add("Who is the current Prime Minister of Pakistan?");
        academicQuestions.add("Which mountain range is located in Pakistan?");
        academicQuestions.add("Which Pakistani cricketer has the most international centuries?");
        academicQuestions.add("What is the national language of Pakistan?");
        academicQuestions.add("What is the SI unit of electric current?");
        academicQuestions.add("Which law of motion states that for every action, there is an equal and opposite reaction?");
        academicQuestions.add("Which type of electromagnetic radiation has the shortest wavelength?");
        academicQuestions.add("What is the phenomenon that causes a pencil to appear broken when placed in a glass of water?");
        academicQuestions.add("According to the law of conservation of energy, energy cannot be created or destroyed, only __________.");
        academicQuestions.add("What is a synonym for 'happy'?");
        academicQuestions.add("What is an antonym for 'brave'?");
        academicQuestions.add("Which word is a synonym for 'beautiful'?");
        academicQuestions.add("What is the antonym of 'expand'?");
        academicQuestions.add("Which word is a synonym for 'fear'?");
        academicQuestions.add("What is an antonym for 'victory'?");
        academicQuestions.add("Which word is a synonym for 'begin'?");
        academicQuestions.add("What is an antonym for 'generous'?");
        academicQuestions.add("Which word is a synonym for 'difficult'?");
        academicQuestions.add("What is an antonym for 'ignore'?");
        academicQuestions.add("Choose the correct preposition to complete the sentence: 'He is interested ____ art.'");
        academicQuestions.add("Choose the correct article to complete the sentence: 'She has ___ MBA degree.'");
        academicQuestions.add("Choose the correct preposition to complete the sentence: 'I am tired ____ working all day.'");
        academicQuestions.add("Choose the correct article to complete the sentence: 'He is ___ European citizen.'");
        academicQuestions.add("Choose the correct preposition to complete the sentence: 'She arrived ____ the party late.'");






        // Add the options for each question
        options.add(new String[]{"Islamabad", "Karachi", "Lahore", "Rawalpindi"});
        options.add(new String[]{"Muhammad Ali Jinnah", "Allama Iqbal", "Sir Syed Ahmed Khan", "Liaquat Ali Khan"});
        options.add(new String[]{"Lahore", "Karachi", "Islamabad", "Multan"});
        options.add(new String[]{"Markhor", "Lion", "Snow Leopard", "Horse"});
        options.add(new String[]{"Lahore Fort", "Rohtas Fort", "Derawar Fort", "Red Fort"});
        options.add(new String[]{"Jasmine", "Rose", "Tulip", "Sunflower"});
        options.add(new String[]{"Imran Khan", "Nawaz Sharif", "Bilawal Bhutto Zardari", "Shahbaz Sharif "});
        options.add(new String[]{"Himalayas", "Karakoram", "Hindu Kush", "Sulaiman Range"});
        options.add(new String[]{"Babar Azam", "Virat Kohli", "Inzamam-ul-Haq", "Shoaib Malik"});
        options.add(new String[]{"Urdu", "Punjabi", "Sindhi", "Balochi"});
        options.add(new String[]{"Ampere", "Volt", "Watt", "Ohm"});
        options.add(new String[]{"Newton's First Law", "Newton's Second Law", "Newton's Third Law", "Law of Conservation of Energy"});
        options.add(new String[]{"Radio waves", "Microwaves", "X-rays", "Gamma rays"});
        options.add(new String[]{"Reflection", "Refraction", "Diffraction", "Dispersion"});
        options.add(new String[]{"Transferred", "Converted", "Absorbed", "Dissipated"});
        options.add(new String[]{"Joyful", "Sad", "Excited", "Angry"});
        options.add(new String[]{"Cowardly", "Smart", "Honest", "Calm"});
        options.add(new String[]{"Pretty", "Ugly", "Big", "Fast"});
        options.add(new String[]{"Contract", "Reduce", "Contract", "Increase"});
        options.add(new String[]{"Dread", "Love", "Happy", "Sleep"});
        options.add(new String[]{"Loss", "Defeat", "Win", "Achievement"});
        options.add(new String[]{"Commence", "End", "Stop", "Finish"});
        options.add(new String[]{"Selfish", "Rude", "Friendly", "Thoughtful"});
        options.add(new String[]{"Challenging", "Easy", "Simple", "Complicated"});
        options.add(new String[]{"Notice", "Praise", "Avoid", "Listen"});
        options.add(new String[]{"in", "on", "to", "with"});
       options.add(new String[]{"a", "an", "the", "no article needed"});
       options.add(new String[]{"from", "of", "by", "after"});
       options.add(new String[]{"a", "an", "the", "no article needed"});
       options.add(new String[]{"to", "at", "in", "for"});

        // Add the correct answers for each question (index of the correct option)
        answers.add(0); // Islamabad
        answers.add(0); // Muhammad Ali Jinnah
        answers.add(2); // Lahore
        answers.add(0); // Markhor
        answers.add(1); // Rohtas Fort
        answers.add(0); // Jasmine
        answers.add(4); // Imran Khan
        answers.add(1); // Karakoram
        answers.add(0); // Virat Kohli
        answers.add(0); // Urdu
        answers.add(0); // Ampere
        answers.add(2); // Newton's Third Law
        answers.add(3); // Gamma rays
        answers.add(1); // Refraction
        answers.add(3); // Dissipated
        answers.add(0); // Joyful
        answers.add(0); // Cowardly
        answers.add(0); // Pretty
        answers.add(1); // Reduce
        answers.add(0); // Dread
        answers.add(1); // Defeat
        answers.add(0); // Commence
        answers.add(0); // Selfish
        answers.add(1); // Easy
        answers.add(2); // Avoid
        answers.add(0); // in
        answers.add(2); // the
        answers.add(1); // of
        answers.add(3); // no article needed
        answers.add(1); // at

    }

    public String getAcademicQuestion(int index) {
        return academicQuestions.get(index);
    }

    public String[] getOptions(int index) {
        return options.get(index);
    }

    public void setUserResponse(int index, int response) {
        userResponses.add(index, response);
    }

    public int getAnswer(int index) {
        return answers.get(index);
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
}