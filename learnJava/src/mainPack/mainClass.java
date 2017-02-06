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
        libsClass.sum(3, 9);
//        int rez_12 = var1 + var5;
//        System.out.println("Result rez 12 = " + rez_12);

        //3+(2*6)


        int result2Mult2Mult5 = libsClass.multiplication(2, 5);


        libsClass.sum(3, libsClass.multiplication(2, 6));

        libsClass.sum(result2Mult2Mult5, 33);
// "33" + 3  = 36
        libsClass.sum("33", 3);
// "3a3" + 3 -> error message
        if (libsClass.sum("3a3", 3) == 99999) {
            System.out.println("Logic 1");
        } else {
            System.out.println("Logic 2");
        }




        //LibsClass libsClass = new LibsClass();

        libsClass.Split("Hello", "Roman", "QA");

        //delenie na 0
        libsClass.div(2, 6);


    }

 }


