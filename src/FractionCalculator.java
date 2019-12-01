public class FractionCalculator {


    public String fAdd(int num1, int num2, int num3, int num4){

       // double top =  (num1*num4) + (num3+num2); for some reason this kept giving me 23
        int t1 = num1 * num4;
        int t2 = num3 * num2;
        int top = t1 + t2;
        int comD = num2*num4;

        return top + "/" + comD;
    }

    public String fSub(int num1, int num2, int num3, int num4){

        int t1 = num1 * num4;
        int t2 = num3 * num2;
        int top = t1 - t2;
        int comD = num2*num4;

        return top + "/" + comD;
    }

    public String fMul(int num1, int num2, int num3, int num4){

        int top = num1 * num3;
        int bottom = num2 * num4;

        return top + "/" + bottom;
    }
    public String fDiv(int num1, int num2, int num3, int num4){

        int top = num1 * num4;
        int bottom = num2 * num3;

        return top + "/" + bottom;
    }
    public String dFra(int num1){
        return num1 + "/1";
    }
}
