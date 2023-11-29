import java.util.*;

class ATM {
    int cur_bal = 100000;

    void withdraw(Scanner sc) {
        System.out.println("Withdraw money");
        System.out.print("Enter amount to withdraw: ");
        int withdraw = sc.nextInt();
        cur_bal = cur_bal - withdraw;
        System.out.println("Your account is successfully debited with "+withdraw+" rupees");
        System.out.println("Your current balance: "+cur_bal);
    }

    void deposit(Scanner sc) {
        System.out.println("Deposit money");
        System.out.print("Enter amount to deposit: ");
        int deposit = sc.nextInt();
        cur_bal = cur_bal + deposit;
        System.out.println("Your account is successfully credited with "+deposit+" rupees");
        System.out.println("Your current balance: "+cur_bal);
    }

    void balancecheck() {
        System.out.println("Balance check");
        System.out.println(cur_bal);
    }

    void changepin(Scanner sc) {
        System.out.println("Change pin");
        System.out.print("Enter new PIN: ");
        int pin = sc.nextInt();
    }
}

class sbi extends ATM {
    void performOperation(Scanner sc) {
        System.out.println("Welcome to sbi banking...");
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.print("Enter option (1: Withdraw, 2: Deposit, 3: Balance Check, 4: Change Pin): ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                withdraw(sc);
                break;
            case 2:
                deposit(sc);
                break;
            case 3:
                balancecheck();
                break;
            case 4:
                changepin(sc);
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}

class kotak extends ATM {
     void performOperation(Scanner sc) {
        System.out.println("Welcome to kotak- banking...");
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.print("Enter option (1: Withdraw, 2: Deposit, 3: Balance Check, 4: Change Pin): ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                withdraw(sc);
                break;
            case 2:
                deposit(sc);
                break;
            case 3:
                balancecheck();
                break;
            case 4:
                changepin(sc);
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
class union extends ATM {
     void performOperation(Scanner sc) {
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("Welcome to union banking...");
        System.out.print("Enter option (1: Withdraw, 2: Deposit, 3: Balance Check, 4: Change Pin): ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                withdraw(sc);
                break;
            case 2:
                deposit(sc);
                break;
            case 3:
                balancecheck();
                break;
            case 4:
                changepin(sc);
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
public class bankingprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM p = new ATM();
        sbi s = new sbi();
        kotak k = new kotak();
        union u = new union();
        
        s.performOperation(sc); // Call this method to perform operations
        // s.balancecheck(); 2// Call balancecheck separately if needed
    }
}

