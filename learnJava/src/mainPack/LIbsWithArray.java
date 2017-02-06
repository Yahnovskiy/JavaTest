package mainPack;


public class LIbsWithArray extends LibsClass {

    public void printArray(int[] arrayIntTemp) {
        for (int i = 0; i < arrayIntTemp.length; i++) {
            //i++ eto i = i + 1
            if arrayIntTemp[i] < 10 {
                System.out.println(arrayIntTemp[i] + "Less than 10");
            }else if (arrayIntTemp[i] == 10) {
                System.out.println(arrayIntTemp[0] + "== 10");
            } else if (arrayIntTemp[i] > 10) {
                System.out.println(arrayIntTemp[i] + "more than 10");
            } else
                System.out.println("This will newer happened");
        }
    }
}

