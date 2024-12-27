public class Club extends FootballClub{

    Club (String name, int RM, int W, int R, int P, int BZ, int BS, int RB, int PKT){
        this.name = name;
        this.RM = RM;
        this.W = W;
        this.R = R;
        this.P = P;
        this.BZ = BZ;
        this.BS = BS;
        this.RB = RB;
        this.PKT = PKT;
    }


    @Override
    public void showAll() {
        if (this.name.length()>=14){
            System.out.println("Club: " + this.name + "\t\t\t\t\tGP: " + this.RM + "\tWins: " + this.W + "\tDraws: " + this.R +
                    "\tLoses: " + this.P + "\tGoals: " + this.BZ + "\tGoals conceded: " + this.BS + "\tGD: " + this.RB +
                    "\tPoints: " + this.PKT);
        }
        else if (this.name.length()>=11){
            System.out.println("Club: " + this.name + "\t\t\t\t\t\tGP: " + this.RM + "\tWins: " + this.W + "\tDraws: " + this.R +
                    "\tLoses: " + this.P + "\tGoals: " + this.BZ + "\tGoals conceded: " + this.BS + "\tGD: " + this.RB +
                    "\tPoints: " + this.PKT);
        }
        else if (this.name.length()>=9){
            System.out.println("Club: " + this.name + "\t\t\t\t\t\t\tGP: " + this.RM + "\tWins: " + this.W + "\tDraws: " + this.R +
                    "\tLoses: " + this.P + "\tGoals: " + this.BZ + "\tGoals conceded: " + this.BS + "\tGD: " + this.RB +
                    "\tPoints: " + this.PKT);
        }
        else if (!this.name.isEmpty()){
            System.out.println("Club: " + this.name + "\t\t\t\t\t\t\tGP: " + this.RM + "\tWins: " + this.W + "\tDraws: " + this.R +
                    "\tLoses: " + this.P + "\tGoals: " + this.BZ + "\tGoals conceded: " + this.BS + "\tGD: " + this.RB +
                    "\tPoints: " + this.PKT);
        }

        }

    @Override
    public String showClub() {
        return "Club: " + this.name + "\t\tGP: " + this.RM + " Wins: " + this.W + " Draws: " + this.R +
                " Loses: " + this.P + " Goals: " + this.BZ + " Goals conceded: " + this.BS + " GD: " + this.RB +
                " Points: " + this.PKT;
    }


}

