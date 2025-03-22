package Week2.Exception;

import java.util.HashMap;
import java.util.Scanner;

public class CustomException {

    static Scanner sc = new Scanner(System.in);
    public static HashMap<Integer,CustomException> map = new HashMap<>();
    private double amount;
    private int accountNumber;

    public CustomException(double amt,int accNum){
        this.amount = amt;
        this.accountNumber = accNum;
    }

    public static void main(String[] args) {
        insertRecord();
        try {
            withdrawAmount(4,5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            fetchAccountInfo();
        }
    }

    public static void insertRecord(){
        double amt = sc.nextDouble();
        int acc = sc.nextInt();
        map.put(acc,new CustomException(amt,acc));
    }

    public static void withdrawAmount(int accNum,double amt) throws Exception {
        if(!map.containsKey(accNum)){
            throw new Exception("User does not Exist");
        }else{
            if(amt > map.get(accNum).amount){
                throw new InsufficientFunds();
            }else {
                CustomException cus = map.get(accNum);
                cus.amount = cus.amount - amt;

            }
        }
    }

    public static void fetchAccountInfo(){
        for(CustomException c: map.values()){
            System.out.println(c.accountNumber+" "+c.amount);
        }
    }
}
