import java.util.*;
import Exception.ExtraPlayersException;

public class Game {
    static int random() {
        int ran = 1;
        while (true) {
            int temp = (int) (Math.random() * 10);
            if (temp < 7 && temp > 0) {
                ran = temp;
                break;
            }
        }
        return ran;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of player (2,3,4) : ");
            int playersCnt = sc.nextInt();
            if (playersCnt > 4) {
                throw new ExtraPlayersException();
            }
            Player[] players = new Player[playersCnt];
            for (int i = 0; i < players.length; i++) {
                players[i] = new Player();
            }

            while (true) {
                for (int i = 0; i < players.length;) {
                    int random = 0;
                    int p = i;
                    System.out.println("Player " + (p + 1) + " current position is " + players[i].getCount());
                    System.out.println("Move dice for player " + (p + 1));
                    System.out.print("Enter " + (p + 1) + " to rotate dice for player " + (p + 1) + " ");
                    int n = sc.nextInt();

                    if (n > 0) {
                        random = random();
                        System.out.println("You got " + random);
                    }

                    if (players[i].getCount() + random > 100) {
                        System.out.println("Opps cannot move forward for " + (p + 1));
                        System.out.println("======================");
                        if (i == players.length - 1) {
                            break;
                        } else {
                            i++;
                            continue;
                        }
                    } else {
                        players[i].increamentCount(random);
                        
                        //These are the ladders

                        switch (players[i].getCount()) {
                            case 1:
                                System.out.println("Yey you got yourself a ladder at " + players[i].getCount());
                                players[i].increamentCount(38 - 1);
                                break;
                            case 4:
                                System.out.println("Yey you got yourself a ladder at " + players[i].getCount());
                                players[i].increamentCount(14 - 4);
                                break;
                            case 9:
                                System.out.println("Yey you got yourself a ladder at " + players[i].getCount());
                                players[i].increamentCount(31 - 9);
                                break;
                            case 21:
                                System.out.println("Yey you got yourself a ladder at " + players[i].getCount());
                                players[i].increamentCount(42 - 21);
                                break;
                            case 28:
                                System.out.println("Yey you got yourself a ladder at " + players[i].getCount());
                                players[i].increamentCount(84 - 28);
                                break;
                            case 36:
                                System.out.println("Yey you got yourself a ladder at " + players[i].getCount());
                                players[i].increamentCount(44 - 36);
                                break;
                            case 51:
                                System.out.println("Yey you got yourself a ladder at " + players[i].getCount());
                                players[i].increamentCount(67 - 51);
                                break;
                            case 71:
                                System.out.println("Yey you got yourself a ladder at " + players[i].getCount());
                                players[i].increamentCount(91 - 71);
                                break;
                            case 80:
                                System.out.println("Yey you got yourself a ladder at " + players[i].getCount());
                                players[i].increamentCount(100 - 80);
                                break;
                            default:
                                break;
                        }
                        
                        //These are the Snake

                        switch (players[i].getCount()) {
                            case 16:
                                System.out.println("Ohhhhh Mannn a Snake got you at " + players[i].getCount());
                                players[i].decreamentCount(16 - 6);
                                break;
                            case 49:
                                System.out.println("Ohhhhh Mannn a Snake got you at " + players[i].getCount());
                                players[i].decreamentCount(49 - 11);
                                break;
                            case 47:
                                System.out.println("Ohhhhh Mannn a Snake got you at " + players[i].getCount());
                                players[i].decreamentCount(47 - 26);
                                break;
                            case 56:
                                System.out.println("Ohhhhh Mannn a Snake got you at " + players[i].getCount());
                                players[i].decreamentCount(56 - 53);
                                break;
                            case 64:
                                System.out.println("Ohhhhh Mannn a Snake got you at " + players[i].getCount());
                                players[i].decreamentCount(64 - 60);
                                break;
                            case 62:
                                System.out.println("Ohhhhh Mannn a Snake got you at " + players[i].getCount());
                                players[i].decreamentCount(62 - 19);
                                break;
                            case 87:
                                System.out.println("Ohhhhh Mannn a Snake got you at " + players[i].getCount());
                                players[i].decreamentCount(87 - 24);
                                break;
                            case 95:
                                System.out.println("Ohhhhh Mannn a Snake got you at " + players[i].getCount());
                                players[i].decreamentCount(95 - 75);
                                break;
                            case 93:
                                System.out.println("Ohhhhh Mannn a Snake got you at " + players[i].getCount());
                                players[i].decreamentCount(93 - 73);
                                break;
                            case 98:
                                System.out.println("Ohhhhh Mannn a Snake got you at " + players[i].getCount());
                                players[i].decreamentCount(98 - 61);
                                break;
                            default:
                                break;
                        }

                        System.out.println("Player " + (p + 1) + " after moving position is " + players[i].getCount());
                    }

                    if (players[i].getCount() == 100) {
                        // flag = 1;
                        System.out.println("Player " + (p + 1) + " Wins");
                        return;
                    }

                    if (random != 6) {
                        if (players[i].getCount() > 100)
                            return;
                        i++;
                    } else {
                        System.out.println("Luck One more turn");
                    }

                    if (random != 6) {
                        System.out.println("======================");
                    }
                }
            }

        } catch (ExtraPlayersException e) {
            System.out.println(e);
        }
    }
}
