import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {

        // To be implemented.
        digitList = new ArrayList<Integer>();

        if(num == 0){
            digitList.add(0);
            return;
        }
        if(num < 0){
            throw new IllegalArgumentException("The number passed to the constructor (" + num +") cannot be negative!");
        }
        while(num > 0){
            int last = num%10;
            num/=10;
            digitList.add(0,last);
        }

    }


    public boolean isStrictlyIncreasing()
    {

        // To be implemented.
        for(int i=1;i<digitList.size();i++){
            if(digitList.get(i) <= digitList.get(i-1)) return false;
        }
        return true;
    }

    public ArrayList<Integer> getDigitList(){
        return digitList;
    }
}
