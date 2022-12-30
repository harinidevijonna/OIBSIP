import java.util.*;
public class binarysearch {
            public static void guessingNumberGame() {
                System.out.println("********Please read the given instructions of the game********");
                System.out.println();
                System.out.println("****In first attempt you guess the number you got 900 points otherwise for each attempt reduce 100 points****");
                System.out.println();
                System.out.println("****maximum 2 attempts for day****");
                int t = 2;
                while (t > 0) {
                    Scanner sc = new Scanner(System.in);
                    int number = 1 + (int) (100 * Math.random());
                    int K = 9;
                    int i, guess;
                    System.out.println(
                            "Please chosen a number"
                                    + " between 1 to 100."
                                    + "Guess the number"
                                    + " within 9 trials.");
                    for (i = 0; i < K; i++) {
                        System.out.println("Guess the number:");
                        guess = sc.nextInt();
                        if (number == guess) {
                            if (i == 1) {
                                System.out.println("**Congratulations!**" + " You guessed the number.");
                                System.out.println("you won the 900 points");
                                System.out.println("if you want to play again press 1 or press 0");
                                int press = sc.nextInt();
                                if (press == 1) {
                                    t--;
                                } else {
                                    if (press == 0) {
                                        t = 0;
                                        System.out.println("****Thankyou****");
                                        return;
                                    }
                                }
                            } else if (i == 2) {
                                System.out.println("**Congratulations!**" + " You guessed the number.");
                                System.out.println("you won the 800 points");
                                System.out.println("if you want to play again press 1 or press 0");
                                int press = sc.nextInt();
                                if (press == 1) {
                                    t--;
                                } else {
                                    if (press == 0) {
                                        t = 0;
                                        System.out.println("****Thankyou****");
                                        return;
                                    }
                                }
                            } else if (i == 3) {
                                System.out.println("**Congratulations!**" + " You guessed the number.");
                                System.out.println("you won the 700 points");
                                System.out.println("if you want to play again press 1 or press 0");
                                int press = sc.nextInt();
                                if (press == 1) {
                                    t--;
                                } else {
                                    if (press == 0) {
                                        t = 0;
                                        System.out.println("****Thankyou****");
                                        return;
                                    }
                                }
                            } else if (i == 4) {
                                System.out.println("**Congratulations!**" + " You guessed the number.");
                                System.out.println("you won the 600 points");
                                System.out.println("if you want to play again press 1 or press 0");
                                int press = sc.nextInt();
                                if (press == 1) {
                                    t--;
                                } else {
                                    if (press == 0) {
                                        t = 0;
                                        System.out.println("****Thankyou****");
                                        return;
                                    }
                                }
                            } else if (i == 5) {
                                System.out.println("**Congratulations!**" + " You guessed the number.");
                                System.out.println("you won the 500 points");
                                System.out.println("if you want to play again press 1 or press 0");
                                int press = sc.nextInt();
                                if (press == 1) {
                                    t--;
                                } else {
                                    if (press == 0) {
                                        t = 0;
                                        System.out.println("****Thankyou****");
                                        return;
                                    }
                                }
                            }
                            else if (i == 6) {
                                System.out.println("**Congratulations!**" + " You guessed the number.");
                                System.out.println("you won the 400 points");
                                System.out.println("if you want to play again press 1 or press 0");
                                int press = sc.nextInt();
                                if (press == 1) {
                                    t--;
                                } else {
                                    if (press == 0) {
                                        t = 0;
                                        System.out.println("****Thankyou****");
                                        return;
                                    }
                                }
                            }
                            else if (i == 7) {
                                System.out.println("**Congratulations!**" + " You guessed the number.");
                                System.out.println("you won the 300 points");
                                System.out.println("if you want to play again press 1 or press 0");
                                int press = sc.nextInt();
                                if (press == 1) {
                                    t--;
                                } else {
                                    if (press == 0) {
                                        t = 0;
                                        System.out.println("****Thankyou****");
                                        return;
                                    }
                                }
                            }
                            else if (i == 8) {
                                System.out.println("**Congratulations!**" + " You guessed the number.");
                                System.out.println("you won the 200 points");
                                System.out.println("if you want to play again press 1 or press 0");
                                int press = sc.nextInt();
                                if (press == 1) {
                                    t--;
                                } else {
                                    if (press == 0) {
                                        t = 0;
                                        System.out.println("****Thankyou****");
                                        return;
                                    }
                                }
                            }
                            else if (i == 9) {
                                System.out.println("**Congratulations!**" + " You guessed the number.");
                                System.out.println("you won the 100 points");
                                System.out.println("if you want to play again press 1 or press 0");
                                int press = sc.nextInt();
                                if (press == 1) {
                                    t--;
                                } else {
                                    if (press == 0) {
                                        t = 0;
                                        System.out.println("****Thankyou****");
                                        return;
                                    }
                                }
                            }
                        } else if (number > guess && i != K - 1) {
                            System.out.println("The number is greater than " + guess + "guessing number");
                        } else if (number < guess && i != K - 1) {
                            System.out.println("The number is less than " + guess + "guessing number");
                        }
                    }

                    if (i == K) {
                        System.out.println("you have reach the maximum element");
                        System.out.println("The number was " + number);
                        System.out.println("if you want to play again press 1 or press 0");
                        int press = sc.nextInt();
                        if (press == 1) {
                            t--;
                        } else {
                            if (press == 0) {
                                t = 0;
                                System.out.println("****Thankyou****");
                                return;
                            }
                        }
                    }
                }
            }
            public static void main(String[]args){
                guessingNumberGame();
            }
        }


