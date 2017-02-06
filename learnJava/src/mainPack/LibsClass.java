package mainPack;

/**
 * Created by Bigbubble on 30-Jan-17.
 */
public class LibsClass {
    /**
     * Method sum and out result
     *
     * @param varSum1
     * @param varSum2
     * @
     */
    public void sum(int varSum1, int varSum2) {
        int tempResult = varSum1 + varSum2;
        System.out.println("Sum = " + tempResult);
    }

    /**
     * Method
     *
     * @param varMult1
     * @param varMult2
     * @return
     */
    public int multiplication(int varMult1, int varMult2) {
        ;
        int tempResult;
        tempResult = varMult1 * varMult2;
        System.out.println("Result multiplication : " + varMult1 + " * " + varMult2 + " = " + tempResult);
        return tempResult;
    }

    /**
     * Method sum
     *
     * @param varString (only like '3334)
     * @param varInt
     * @return
     */
    public int sum(String varString, int varInt) {
        int tempResult = 99999;
        try {


            tempResult = Integer.parseInt(varString) + varInt;
            System.out.println("Result: " + varString + " + " + varInt + " = " + tempResult);

        } catch (NumberFormatException e) {
            System.out.println("Error, can't parse: " + varString + e);
        } catch (Exception e) {
            System.out.println("Unknown exception");
            tempResult = 77777;
        }
        return tempResult;
    }

    /**
     * Split strings
     *
     * @param varStr1
     * @param varStr2
     * @param varStr3
     * @return
     */

    public int Split(String varStr1, String varStr2, String varStr3) {

        int Splitstring = 0;
        //Splitstring = varStr1 + varStr2;
        System.out.println("Result string split : " + varStr1 + " " + varStr2 + " " + varStr3);
        return Splitstring;
    }

    /**
     * Method div (if div 0 then result 99999)
     *
     * @param varrrr1
     * @param varrrr2
     * @return
     */
    public static double div(int varrrr1, int varrrr2) {
        try {
            double result;
            result =  varrrr1 / varrrr2;
            System.out.println("Result div: " + varrrr1 + " / " + varrrr2 + " = " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Error " + e.getMessage());
            return 99999;
        }
    }
}


