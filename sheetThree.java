import java.util.*;

public class sheetThree {
  public static void main(String[] args) {
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

    input.close();
  }
}