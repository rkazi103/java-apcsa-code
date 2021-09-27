package exercises.chapterthree;

public class Exercise_3_24 {
    public static void main(String[] args) {
        int cardNumber = (int) (Math.random() * 13) + 1;
        int suitNumber = (int) (Math.random() * 4) + 1;

        String suitChoice;
        String cardChoice;

        switch (suitNumber) {
            case 1:
                suitChoice = "Hearts";
                break;
            case 2:
                suitChoice = "Diamonds";
                break;
            case 3:
                suitChoice = "Clubs";
                break;
            default:
                suitChoice = "Spades";
        }

        switch (cardNumber) {
            case 1:
                cardChoice = "Ace";
                break;
            case 2:
                cardChoice = "2";
                break;
            case 3:
                cardChoice = "3";
                break;
            case 4:
                cardChoice = "4";
                break;
            case 5:
                cardChoice = "5";
                break;
            case 6:
                cardChoice = "6";
                break;
            case 7:
                cardChoice = "7";
                break;
            case 8:
                cardChoice = "8";
                break;
            case 9:
                cardChoice = "9";
                break;
            case 10:
                cardChoice = "10";
                break;
            case 11:
                cardChoice = "Jack";
                break;
            case 12:
                cardChoice = "Queen";
                break;
            case 13:
            default:
                cardChoice = "King";
        }

        System.out.println("You got: " + cardChoice + " of " + suitChoice);
    }
}