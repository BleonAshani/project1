/**
 *This class in taking inputs from The CalculatorGUI class and calculating depending on what the user decided to pick
 *
 * @author Bleon Ashani
 *
 */
public class FractionCalculator {

    /**
     * @param num1 First integer is the numerator of the first fraction
     * @param num2 Second integer is the denominator of the first fraction
     * @param num3 Third integer is the numerator of the second fraction
     * @param num4 Fourth integer is the denominator of the second fraction
     *
     * @return A String to display the result of the added fractions
     *
     * This method adds the fractions
     *
     */
    public String fAdd(int num1, int num2, int num3, int num4){

       // double top =  (num1*num4) + (num3+num2); for some reason this kept giving me 23
        int t1 = num1 * num4;
        int t2 = num3 * num2;
        int top = t1 + t2;
        int comD = num2*num4;

        return top + "/" + comD;
    }


    /**
     * @param num1 First integer is the numerator of the first fraction
     * @param num2 Second integer is the denominator of the first fraction
     * @param num3 Third integer is the numerator of the second fraction
     * @param num4 Fourth integer is the denominator of the second fraction
     * @return A String to display the result of  the subtracted fraction
     *
     *  This method subtracts fractions
     *
     */
    public String fSub(int num1, int num2, int num3, int num4){

        int t1 = num1 * num4;
        int t2 = num3 * num2;
        int top = t1 - t2;
        int comD = num2*num4;

        return top + "/" + comD;
    }

    /**
     * @param num1 First integer is the numerator of the first fraction
     * @param num2 Second integer is the denominator of the first fraction
     * @param num3 Third integer is the numerator of the second fraction
     * @param num4 Fourth integer is the denominator of the second fraction
     * @return A String to display the result of multiplied fraction
     *
     * This method multiples fractions
     *
     */
    public String fMul(int num1, int num2, int num3, int num4){

        int top = num1 * num3;
        int bottom = num2 * num4;

        return top + "/" + bottom;
    }

    /**
     * @param num1 First integer is the numerator of the first fraction
     * @param num2 Second integer is the denominator of the first fraction
     * @param num3 Third integer is the numerator of the second fraction
     * @param num4 Fourth integer is the denominator of the second fraction
     * @return A String to display the result of a divided fraction
     *
     * This method divides fractions
     *
     */
    public String fDiv(int num1, int num2, int num3, int num4){

        int top = num1 * num4;
        int bottom = num2 * num3;

        return top + "/" + bottom;
    }

    /**
     * @param num1 A whole number
     * @return A String to display decimals into fractions
     *
     * This method turns decimals into fractions
     *
     */
    public String dFra(int num1){
        return num1 + "/1";
    }
}
