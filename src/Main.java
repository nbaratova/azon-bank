import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;

//  Azonbank version 2.0 written with functional programming paradigm

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Date now = new Date();
        NumberFormat formatToCurrency = NumberFormat.getCurrencyInstance();
        HashMap<String, String> users = new HashMap<>();
        //String result=formatToCurrency.format(12300.44);  // $12,300.44
        String bankName = "AZONBANK";
        String username = "";
        String password = "";
        int benefit=20;
        int select = 0;
        int numberOfUppercase = 0;
        int numberOfDigit = 0;
        double balance = 2000000.00;
        double usd = 11340.00;
        double rub = 180.00;
        double eur = 12550.00;
        double gbp = 14250.00;
        double kzt = 30.00;


        while (true) {
            System.out.println(bankName);
            System.out.println("Menu");
            System.out.println("1.SignUp");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            System.out.println("Select: ");
            select = scanner.nextInt();

            if (select == 1) {
                System.out.println("Username: ");
                username = scanner.next();
                if (!(username.length() >= 6)) {
                    System.out.println("Username is invalid");
                    System.out.println("Press any key to continue...");
                    System.in.read();  // wait for user to press a key
                    break;
                }

                System.out.println("Password: ");
                password = scanner.next();
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isUpperCase(password.charAt(i))) {
                        numberOfUppercase++;
                    }
                    if (Character.isDigit(password.charAt(i))) {
                        numberOfDigit++;
                    }
                }
                if (numberOfDigit > 0 && numberOfUppercase > 0 && password.length() == 8) {
                    System.out.println("Password is valid");
                    users.put(username, password);
                    System.out.println("Press any key to continue...");
                    System.in.read();  // wait for user to press a key
                } else {
                    System.out.println("Password is invalid");
                    System.out.println("Password must contain 8 characters");
                    System.out.println("Password must have at least one digit ('0'-'9')");
                    System.out.println("Password must have at least one uppercase ('A'-'Z')");
                    System.out.println("Press any key to continue...");
                    System.in.read();  // wait for user to press a key
                }
            }

            if (select == 2) {
                System.out.println("Username: ");
                username = scanner.next();
                System.out.println("Password: ");
                password = scanner.next();
                if (users.containsKey(username)) {
                    String pwd = users.get(username);
                    if (pwd.equals(password)) {
                        System.out.println("Success!!!");
                        System.out.println("Press any key to continue...");
                        System.in.read();  // wait for user to press a key

                        while (true) {
                            System.out.println("Menu:");
                            System.out.println("1.Information");
                            System.out.println("2.Check balance");
                            System.out.println("3.Add money to balance");
                            System.out.println("4.Get money from balance");
                            System.out.println("5.Calculate yearly benefit %");
                            System.out.println("6.Exit");
                            System.out.println("Select:");
                            select = scanner.nextInt();
                            if (select == 1) {
                                System.out.println("Information");
                                System.out.println("1.Get Information");
                                System.out.println("2.Exchange Rate");
                                System.out.println("3.Exchange Calculator");
                                System.out.println("Select:");
                                select = scanner.nextInt();

                                if (select == 1) {
                                    System.out.println("Get Information");
                                    System.out.println("Today: " + now);

                                    System.out.println("USD-" + usd);
                                    System.out.println("RUB-" + rub);
                                    System.out.println("EUR-" + eur);
                                    System.out.println("GBP-" + gbp);
                                    System.out.println("KZT-" + kzt);

                                    System.out.println("1.Back");
                                    System.out.println("2.Exit");
                                    System.out.println("Select:");
                                    select = scanner.nextInt();
                                    if (select == 1) {
                                        System.out.println("Back");
                                    } else if (select == 2) {
                                        System.exit(0);
                                    }
                                } else if (select == 2) {
                                    System.out.println("Exchange Rate");
                                    System.out.println("Today: " + now);

                                    System.out.println("BUY:");
                                    System.out.println("USD-11284.00");
                                    System.out.println("RUB-130.00");
                                    System.out.println("EUR-11350.00");
                                    System.out.println("GBP-13050.00");
                                    System.out.println("KZT-15.00");
                                    System.out.println();
                                    System.out.println("SELL:");
                                    System.out.println("USD-" + usd);
                                    System.out.println("RUB-" + rub);
                                    System.out.println("EUR-" + eur);
                                    System.out.println("GBP-" + gbp);
                                    System.out.println("KZT-" + kzt);
                                    System.out.println();
                                    System.out.println("1.Back");
                                    System.out.println("2.Exit");
                                    System.out.println("Select:");
                                    select = scanner.nextInt();
                                    if (select == 1) {
                                        System.out.println("Back");
                                    } else if (select == 2) {
                                        System.exit(0);
                                    }
                                } else if (select == 3) {
                                    System.out.println("Exchange Calculator");
                                    double money = 0;
                                    double result = 1;
                                    System.out.println("1.USD to UZS");
                                    System.out.println("2.RUB to UZS");
                                    System.out.println("3.EUR to UZS");
                                    System.out.println("4.GBP to UZS");
                                    System.out.println("5.KZT to UZS");
                                    System.out.println("6.UZS to USD");
                                    System.out.println("7.UZS to RUB");
                                    System.out.println("8.UZS to EUR");
                                    System.out.println("9.UZS to GBP");
                                    System.out.println("10.UZS to KZT");

                                    System.out.println("Select:");
                                    select = scanner.nextInt();
                                    if (select == 1) {
                                        System.out.println("USD to UZS");
                                        money = scanner.nextInt();
                                        result = money * usd;
                                    } else if (select == 2) {
                                        System.out.println("RUB to UZS");
                                        money = scanner.nextInt();
                                        result = money * rub;
                                    } else if (select == 3) {
                                        System.out.println("EUR to UZS");
                                        money = scanner.nextInt();
                                        result = money * eur;
                                    } else if (select == 4) {
                                        System.out.println("GBP to UZS");
                                        money = scanner.nextInt();
                                        result = money * gbp;
                                    } else if (select == 5) {
                                        System.out.println("KZT to UZS");
                                        money = scanner.nextInt();
                                        result = money * kzt;
                                    } else if (select == 6) {
                                        System.out.println("UZS to USD");
                                        money = scanner.nextInt();
                                        result = money / usd;
                                    } else if (select == 7) {
                                        System.out.println("UZS to RUB");
                                        money = scanner.nextInt();
                                        result = money / rub;
                                    } else if (select == 8) {
                                        System.out.println("UZS to EUR");
                                        money = scanner.nextInt();
                                        result = money / eur;
                                    } else if (select == 9) {
                                        System.out.println("UZS to GBP");
                                        money = scanner.nextInt();
                                        result = money / gbp;
                                    } else if (select == 10) {
                                        System.out.println("UZS to KZT");
                                        money = scanner.nextInt();
                                        result = money / kzt;
                                    }
                                    System.out.println("Result: " + result);
                                }
                            } else if (select == 2) {
                                System.out.println("Check balance");
                                System.out.println("Your balance: " + balance + " sum");
                                System.out.println("1.Back");
                                System.out.println("2.Exit");
                                System.out.println("Select:");
                                select = scanner.nextInt();
                                if (select == 1) {
                                    System.out.println("Back");
                                } else if (select == 2) {
                                    System.exit(0);
                                }
                            } else if (select == 3) {
                                double addMoney;
                                System.out.println("Add money to balance");
                                System.out.println("How much money do you want to add?");
                                addMoney = scanner.nextDouble();
                                System.out.println("0.UZS");
                                System.out.println("1.USD");
                                System.out.println("2.RUB");
                                System.out.println("3.EUR");
                                System.out.println("4.GBP");
                                System.out.println("5.KZT");
                                System.out.println("Select:");
                                select = scanner.nextInt();
                                if (select == 0) {
                                    balance += addMoney;
                                } else if (select == 1) {
                                    balance += (addMoney * usd);
                                } else if (select == 2) {
                                    balance += (addMoney * rub);
                                } else if (select == 3) {
                                    balance += (addMoney * eur);
                                } else if (select == 4) {
                                    balance += (addMoney * gbp);
                                } else if (select == 5) {
                                    balance += (addMoney * kzt);
                                }
                                System.out.println("Your balance: " + balance + " sum");
                                System.out.println("1.Back");
                                System.out.println("2.Exit");
                                System.out.println("Select:");
                                select = scanner.nextInt();
                                if (select == 1) {
                                    System.out.println("Back");
                                } else if (select == 2) {
                                    System.exit(0);
                                }
                            } else if (select == 4) {
                                double getMoney;
                                System.out.println("Get money from balance");
                                System.out.println("Your balance: " + balance + " sum");
                                System.out.println("How much money do you want to get?");
                                getMoney = scanner.nextDouble();
                                System.out.println("0.UZS");
                                System.out.println("1.USD");
                                System.out.println("2.RUB");
                                System.out.println("3.EUR");
                                System.out.println("4.GBP");
                                System.out.println("5.KZT");
                                System.out.println("Select:");
                                select = scanner.nextInt();
                                if (select == 0) {
                                    if (balance >= getMoney) {
                                        balance -= getMoney;
                                    } else {
                                        System.out.println("You do not have enough money");
                                    }
                                } else if (select == 1) {
                                    if (balance >= getMoney * usd) {
                                        balance -= (getMoney * usd);
                                    } else {
                                        System.out.println("You do not have enough money");
                                    }
                                } else if (select == 2) {
                                    if (balance >= getMoney * rub) {
                                        balance -= (getMoney * rub);
                                    } else {
                                        System.out.println("You do not have enough money");
                                    }
                                } else if (select == 3) {
                                    if (balance >= getMoney * eur) {
                                        balance -= (getMoney * eur);
                                    } else {
                                        System.out.println("You do not have enough money");
                                    }
                                } else if (select == 4) {
                                    if (balance >= getMoney * gbp) {
                                        balance -= (getMoney * gbp);
                                    } else {
                                        System.out.println("You do not have enough money");
                                    }
                                } else if (select == 5) {
                                    if (balance >= getMoney * kzt) {
                                        balance -= (getMoney * kzt);
                                    } else {
                                        System.out.println("You do not have enough money");
                                    }
                                }
                                System.out.println("Your balance: " + balance + " sum");
                                System.out.println("1.Back");
                                System.out.println("2.Exit");
                                System.out.println("Select:");
                                select = scanner.nextInt();
                                if (select == 1) {
                                    System.out.println("Back");
                                } else if (select == 2) {
                                    System.exit(0);
                                }
                            } else if (select==5) {
                                System.out.println("Calculate yearly benefit %");
                                System.out.println("Please enter number of years:");
                                int years;
                                years=scanner.nextInt();
                                double yearlyBenefit=0;
                                for (int i=0;i<years;i++){
                                    if (i==0) {
                                        yearlyBenefit = (balance * benefit / 100) + balance;
                                    }else if (i>0){
                                        yearlyBenefit = (yearlyBenefit * benefit / 100) + yearlyBenefit;
                                    }
                                }
                                System.out.println("Your yearly benefit: ");
                                System.out.println(yearlyBenefit);
                            } else if (select == 6) {
                                System.exit(0);
                            }
                        }


                    } else {
                        System.out.println("Invalid password.");
                        System.out.println("Press any key to continue...");
                        System.in.read();  // wait for user to press a key
                    }
                } else {
                    System.out.println("User with provided username does not exist.");
                    System.out.println("Press any key to continue...");
                    System.in.read();  // wait for user to press a key
                }
            }

            if (select == 3) {
                System.exit(0);
            }
        }
    }
}