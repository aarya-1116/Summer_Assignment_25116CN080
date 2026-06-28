import java.util.Scanner;
public class quizApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the General Knowledge Quiz!");
        int scores=0;
        String[] questions = {
    "Question-1: What is the capital of India?\n1. Mumbai\n2. New Delhi\n3. Kolkata\n4. Chennai",

    "Question-2: Which planet is known as the Red Planet?\n1. Venus\n2. Jupiter\n3. Mars\n4. Saturn",

    "Question-3: How many continents are there on Earth?\n1. 5\n2. 6\n3. 7\n4. 8",

    "Question-4: Who wrote the Indian National Anthem?\n1. Mahatma Gandhi\n2. Rabindranath Tagore\n3. Jawaharlal Nehru\n4. Subhas Chandra Bose",

    "Question-5: Which is the largest ocean in the world?\n1. Atlantic Ocean\n2. Indian Ocean\n3. Arctic Ocean\n4. Pacific Ocean",

    "Question-6: What is the chemical symbol of water?\n1. O2\n2. H2\n3. H2O\n4. CO2",

    "Question-7: Which is the national animal of India?\n1. Lion\n2. Elephant\n3. Bengal Tiger\n4. Peacock",

    "Question-8: Who is known as the Father of the Nation in India?\n1. Bhagat Singh\n2. Sardar Patel\n3. Mahatma Gandhi\n4. Jawaharlal Nehru",

    "Question-9: Which gas do plants absorb from the atmosphere?\n1. Oxygen\n2. Nitrogen\n3. Hydrogen\n4. Carbon Dioxide",

    "Question-10: Which is the largest planet in our Solar System?\n1. Earth\n2. Jupiter\n3. Saturn\n4. Neptune"
};
int[] answers = { 2, 3, 3, 2, 4, 3, 3, 3, 4, 2};
for(int i=0;i<questions.length;i++){
    System.out.println(questions[i]);
    int userAns=sc.nextInt();
    if(userAns==answers[i])
        scores++;
}
System.out.println("You scored "+scores+".");
System.out.println("Thanks for playing!");
sc.close();
    }
}