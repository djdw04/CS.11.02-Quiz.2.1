public class Main {
    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }
    public static String greeting(String name) {
        return "Bonjour, " + name + "!";
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        int firstResult = add(numOne, numTwo);
        int secondResult = add(numThree, numFour);
        return add(secondResult, firstResult);
    }
    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }
        public static void main(String[] args){
            int resultOne = add(1, 2);
            System.out.println(resultOne);

            String resultTwo = greeting("Dennis");
            System.out.println(resultTwo);

            int resultThree = add(1, 2, 3, 4);
            System.out.println(resultThree);

            String printedMessage = "Hello";
            printMe(printedMessage);
        }
    }
