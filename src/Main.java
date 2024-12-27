import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("***PREMIER LEAGUE TABLE***");

        Scanner scanner = new Scanner(System.in);

        ArrayList<Club> footballclub = new ArrayList<>();
        Club club1 = new Club("Liverpool", 17, 13, 3, 1, 40, 17, 23, 42);
        Club club2 = new Club("Chelsea", 18, 10, 5, 3 , 38, 21, 17, 35);
        Club club3 = new Club("Nottingham Forest", 18, 10, 4, 4, 24, 19, 5, 34);
        Club club4 = new Club("Arsenal", 17, 9, 6, 2 , 34, 16, 18, 33);
        Club club5 = new Club("Newcastle", 18, 8, 5, 5, 30, 21, 9, 29);
        Club club6 = new Club("Bournemouth", 18, 8, 5, 5, 27, 21, 6, 29);
        Club club7 = new Club("Man City", 18, 8, 4, 6, 30, 26, 4, 28);
        Club club8 = new Club("Fulham", 18, 7, 7, 4, 26, 23, 3, 28);
        Club club9 = new Club("Aston Villa", 18, 8, 4, 6, 26, 29, -3, 28);
        Club club10 = new Club("Brighton" , 17, 6, 7, 4, 27, 26, 1, 25);
        Club club11 = new Club("Tottenham" , 18, 7, 2, 9, 39, 26, 13, 23);
        Club club12 = new Club("Brentford", 17, 7, 2, 8, 32, 32, 0, 23);
        Club club13 = new Club("West Ham", 18, 6, 5, 7, 23, 30, -7, 23);
        Club club14 = new Club("Man Utd", 18, 6, 4, 8, 21, 24, -3, 22);
        Club club15 = new Club("Everton", 17, 3, 8, 6, 15, 22, -7, 17);
        Club club16 = new Club("Crystal Palace", 18, 3, 8, 7, 18, 26, -8, 17);
        Club club17 = new Club("Wolverhampton" , 18, 4, 3, 11, 29, 40, -11, 15);
        Club club18 = new Club("Leicester", 18, 3, 5, 10, 22, 40, -18, 14);
        Club club19 = new Club("Ipswich Town", 17, 2, 6, 9, 16, 32, -16, 12);
        Club club20 = new Club("Soutchampton", 18, 1, 3, 14, 11, 37, -26, 6);

        //FOOTBALL club add

        footballclub.add(club1);
        footballclub.add(club2);
        footballclub.add(club3);
        footballclub.add(club4);
        footballclub.add(club5);
        footballclub.add(club6);
        footballclub.add(club7);
        footballclub.add(club8);
        footballclub.add(club9);
        footballclub.add(club10);
        footballclub.add(club11);
        footballclub.add(club12);
        footballclub.add(club13);
        footballclub.add(club14);
        footballclub.add(club15);
        footballclub.add(club16);
        footballclub.add(club17);
        footballclub.add(club18);
        footballclub.add(club19);
        footballclub.add(club20);

        while(true){
            System.out.println("Table/Games Played/Wins/Draws/Loses/Goals/Goals conceded/Goal difference/Points/Search club/Quit");
            String decision = scanner.nextLine();

            if(decision.equalsIgnoreCase("Quit")){
                break;
            }

            if (decision.equalsIgnoreCase("Table")){
                for (Club club : footballclub){
                    club.showAll();
                }
            }

            else if (decision.equalsIgnoreCase("Games Played")){
                //Sortowanie według games played

                Collections.sort(footballclub, new Comparator<Club>() {
                    @Override
                    public int compare(Club o1, Club o2) {
                        return Integer.compare(o2.RM,o1.RM);
                    }
                });

                for (Club club : footballclub){
                    club.showAll();
                }
            }

            else if (decision.equalsIgnoreCase("Wins")){
                Collections.sort(footballclub, new Comparator<Club>() {
                    @Override
                    public int compare(Club o1, Club o2) {
                        return Integer.compare(o2.W, o1.W);
                    }
                });
                for (Club club : footballclub){
                    club.showAll();
                }
            }

            else if (decision.equalsIgnoreCase("Draws")){
                Collections.sort(footballclub, new Comparator<Club>() {
                    @Override
                    public int compare(Club o1, Club o2) {
                        return Integer.compare(o2.R,o1.R);
                    }
                });

                for (Club club : footballclub){
                    club.showAll();
                }
            }

            else if (decision.equalsIgnoreCase("Loses")){
                Collections.sort(footballclub, new Comparator<Club>() {
                    @Override
                    public int compare(Club o1, Club o2) {
                        return Integer.compare(o2.P,o1.P);
                    }
                });

                for (Club club : footballclub){
                    club.showAll();
                }
            }

            else if (decision.equalsIgnoreCase("Goals")){
                Collections.sort(footballclub, new Comparator<Club>() {
                    @Override
                    public int compare(Club o1, Club o2) {
                        return Integer.compare(o2.BZ,o1.BZ);
                    }
                });

                for (Club club : footballclub){
                    club.showAll();
                }
            }

            else if (decision.equalsIgnoreCase("Goals conceded")){
                Collections.sort(footballclub, new Comparator<Club>() {
                    @Override
                    public int compare(Club o1, Club o2) {
                        return Integer.compare(o2.BS,o1.BS);
                    }
                });

                for (Club club : footballclub){
                    club.showAll();
                }
            }

            else if (decision.equalsIgnoreCase("Goal difference")){
                Collections.sort(footballclub, new Comparator<Club>() {
                    @Override
                    public int compare(Club o1, Club o2) {
                        return Integer.compare(o2.RB, o1.RB);
                    }
                });

                for (Club club : footballclub){
                    club.showAll();
                }
            }

            else if (decision.equalsIgnoreCase("Points")){
                Collections.sort(footballclub, new Comparator<Club>() {
                    @Override
                    public int compare(Club o1, Club o2) {
                        return Integer.compare(o2.PKT, o1.PKT);
                    }
                });

                for (Club club : footballclub){
                    club.showAll();
                }

            }

            else if (decision.equalsIgnoreCase("Search club")){
                System.out.print("Type club: ");
                String searchclub = scanner.nextLine();
                boolean find = false;
                for (Club club : footballclub){
                    if (searchclub.equalsIgnoreCase(club.name)){
                        System.out.println(club.showClub());
                        find = true;
                        break;
                    }
                }
                if (!find){
                    System.out.println("Wrong club! Try again.");
                }
            }

            else {
                System.out.println("Wrong choice. Please try again!");
            }
        }

    }
}