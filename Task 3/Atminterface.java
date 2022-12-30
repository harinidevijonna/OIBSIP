import java.util.*;
public class AtmInterface {
    public static int solve(int limit) {
        int input = 0;
        boolean flag = false;

        while ( !flag ) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                flag = true;

                if ( flag && input > limit || input < 1 ) {
                    System.out.println("Choose the number between 1 to " + limit);
                    flag = false;
                }
            }
            catch ( Exception e ) {
                System.out.println("Enter only integer value");
                flag = false;
            }
        };
        return input;
    }
    public static void main(String[] args) {
        System.out.println("\n**********WELCOME TO SBI ATM SYSTEM**********\n");
        System.out.println("1.Register \n2.Exit");
        System.out.print("Enter Your Choice:");
        int choice = solve(2);

        if ( choice == 1 ) {
            Atm b = new Atm();
            b.register();
            while(true) {
                System.out.println("\n1.Login \n2.Exit");
                System.out.print("Enter Your Choice : ");
                int ch = solve(2);
                if ( ch == 1 ) {
                    if (b.login()) {
                        System.out.println("\n\n**********WELCOME BACK " + b.name + " **********\n");
                        boolean isFinished = false;
                        while (!isFinished) {
                            System.out.println("\n1.Withdraw \n2.Deposit \n3.Transfer \n4.Check Balance \n5.Transaction History \n6.Exit");
                            System.out.println("Enter Your Choice :");
                            int c = solve(6);
                            switch(c) {
                                case 1:
                                    b.withdraw();
                                    break;
                                case 2:
                                    b.deposit();
                                    break;
                                case 3:
                                    b.transfer();
                                    break;
                                case 4:
                                    b.checkBalance();
                                    break;
                                case 5:
                                    b.transHistory();
                                    break;
                                case 6:
                                    isFinished = true;
                                    break;
                            }
                        }
                    }
                }
                else {
                    System.exit(0);
                }
            }
        }
        else {
            System.exit(0);
        }
    }
}
class Atm{

    String name;
    String userName;
    String password;
    String acco_no;
    float balance = 100000f;
    int transactions = 0;
    String history = "";
    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Name:");
        this.name = sc.nextLine();
        System.out.print(" Enter the Username:");
        this.userName = sc.nextLine();
        System.out.print(" Enter the Password:");
        this.password = sc.nextLine();
        System.out.print(" Enter the Account Number:");
        this.acco_no = sc.nextLine();
        System.out.println("Congratulations!!! your registration completed successfully...");
        System.out.println("Kindly login");
    }

    public boolean login() {
        boolean isLogin = false;
        Scanner sc = new Scanner(System.in);
        while ( !isLogin ) {
            System.out.print(" Please Enter your Username :");
            String Username = sc.nextLine();
            if ( Username.equals(userName) ) {
                while ( !isLogin ) {
                    System.out.print("Please Enter your username's Password : ");
                    String Password = sc.nextLine();
                    if ( Password.equals(password) ) {
                        System.out.print("CONGO...Login successful!!");
                        isLogin = true;
                    }
                    else {
                        System.out.println("######## Incorrect Password ########");
                    }
                }
            }
            else {
                System.out.println(" OOPS the username is not found ");
            }
        }
        return isLogin;
    }

    public void deposit() {

        System.out.print("Enter the amount you want to deposit");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if ( amount <= 100000f ) {
            transactions++;
            balance =balance + amount;
            System.out.println("Your Amount Deposited Successfully!!!....");
            String str = amount + " Rs deposited\n";
            history = history.concat(str);
        }
        else {
            System.out.println(">>>>>>> SORRY YOU HAVE EXCEEDED THE LIMIT AMOUNT THAT IS 100000 <<<<<<<<<<<<<<");
            System.out.println(">>>>>>> Please Deposit the correct Amount <<<<<<<<");
        }
    }

    public void withdraw() {

        System.out.print(" Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if ( balance >= amount ) {
            transactions++;
            balance = balance-amount;
            System.out.println("Amount Withdrawn Successfully!!!!");
            String str = amount + " Rs Withdrawed\n";
            history = history.concat(str);

        }
        else {
            System.out.println("********Insufficient Balance***********");
        }
    }
    public void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Receipent's Name :");
        String receipent = sc.nextLine();
        System.out.print("Enter amount to transfer :");
        float amount = sc.nextFloat();
        if ( balance >= amount ) {
            if ( amount <= 50000f ) {
                transactions++;
                balance = balance-amount;
                System.out.println("Successfully Transfered to " + receipent);
                String str = amount + " Rs transfered to " + receipent + "\n";
                history = history.concat(str);
            }
            else {
                System.out.println(" Sorry...Limit is 50000");
            }
        }
        else {
            System.out.println("*******Insufficient Balance*******");
        }
    }

    public void checkBalance() {
        System.out.println("\n" + balance + " Rs");
    }

    public void transHistory() {
        if ( transactions == 0 ) {
            System.out.println("Empty");
        }
        else {
            System.out.println("\n" + history);
        }
    }
}

