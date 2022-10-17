public class EvenNumber {
    public EvenNumber() {
    }
    public boolean isEvenNumber(int number) {
        int numberEntered = number;
        boolean isEvenNumber = false;
        while (true) {
            number = number - 2;
            if (number == 0) {
                isEvenNumber = true;
                System.out.println("Number " + numberEntered + " is not even. It is odd.");
                break;
            } else if (number == -1) {
                System.out.println("Number " + numberEntered + " is even");
                break;
            }
        }
        return isEvenNumber;
    }
}
