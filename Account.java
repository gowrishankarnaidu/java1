public class Account {
    int accountnumber;
    void  showAccount(){
         System.out.println("Account Number: " + accountnumber);
    }

    }
    class SavingsAccount extends Account{

        double interestrate;
        void showSavingsDetails(){
            System.out.println("Interest Rate: " + interestrate + "%");

        }
    }
    class FixedDepositAccount extends SavingsAccount {
        int lockInyear;
        void showFDDetails(){
               System.out.println("Lock-in Years: " + lockInyear);

        }

    
    public static void main(String[] args) {
        FixedDepositAccount fd=new FixedDepositAccount();
        fd.accountnumber=123456789;
        fd.interestrate =10;
        fd.lockInyear=2025;
        fd.showAccount();
        fd.showSavingsDetails();
        fd.showFDDetails();
    }
}

