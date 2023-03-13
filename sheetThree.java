import java.util.*;

public class sheetThree {
  public static void main(String[] args) {
    // EXERCISE 3 - 5
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the test number:");
    int testNumber = input.nextInt();
    System.out.println("Enter the score:");
    int score = input.nextInt();
    double weightedScore;
    boolean valid = true;

    switch(testNumber) {
      case 1:
        weightedScore = score * 0.1;
        break;
      
      case 2:
        weightedScore = score * 0.2;
        break;
      
      case 3:
        weightedScore = score * 0.2;
        break;

      case 4:
        weightedScore = score * 0.15;
        break;
      
      case 5:
        weightedScore = score * 0.15;
        break;
      
      case 6:
        weightedScore = score * 0.2;
        break;
        
      default:
        weightedScore = 0.0;
        valid = false;
    }

    System.out.println(valid ? "Weighted score for test "+ testNumber +" is "+ Math.round(weightedScore) +" after calculation." : "Weighted score cannot be calculated.");

    
    // EXERCISE 3 - 6
    System.out.println("Enter the first word:");
    String firstWord = input.nextLine();
    System.out.println("Enter the second word:");
    String secondWord = input.nextLine();

    int charactersRemaining = 30 - (firstWord.length() + secondWord.length());
    String dots = "";

    for (int i = 0; i < charactersRemaining; i++) {
      dots += "."; 
    }

    System.out.println(firstWord + dots + secondWord);


    // EXERCISE 3 - 7
    int count = 0;
    int number = 0;
    int sum = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    System.out.println("Enter a sequence of non-negative integers:");
    while (number >= 0 && count < 10) {
      number = input.nextInt();
      if (number >= 0) {
        count++;
        sum += number;
        min = Math.min(min, number);
        max = Math.max(max, number);
      }
    }

    double average = (count > 0) ? ((double) sum / count) : 0;
    System.out.println("Minimum: "+ min +"\n" + "Maximum: "+ max +"\n" + "Average: "+ average);

    input.close();
  }
}