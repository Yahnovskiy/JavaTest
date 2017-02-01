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


}
