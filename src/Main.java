public class Main {

    public static void main(String[] args) {
        //Exercitiu Primitive Types

        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongValue2 = (long) (50000 + 10 * (myByteValue + myShortValue + myIntValue));
        System.out.println(myLongValue2);

        //sau cum s-a facut in curs
        byte myByteValue1 = 10;
        short myShortValue1 = 20;
        int myIntValue1 = 50;
        long myLongValue3 = (50000L + 10L * (myByteValue + myShortValue + myIntValue));
        System.out.println(myLongValue3);

    }
}
