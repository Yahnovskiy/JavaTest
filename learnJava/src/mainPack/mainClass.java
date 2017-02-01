package mainPack;

/**
 * Created by Bigbubble on 30-Jan-17.
 */
public class mainClass {
    public static void main(String[] args) {
        System.out.println("Hello!");
//        int var1 = 3, var2 = 5;
//        int rez_1;
        LibsClass libsClass = new LibsClass();
        libsClass.sum(3, 5);
//        rez_1 = var1 + var2;
//        System.out.println("Result = " + rez_1);
        int var5 = 9;
        libsClass.sum(3,9);
//        int rez_12 = var1 + var5;
//        System.out.println("Result rez 12 = " + rez_12);

        //3+(2*5)

        libsClass.multiplication(2,5);


    }




}
