import java.util.Scanner;

class RPS{
    final int ROCK = 1;
    final int PAPER = 2;
    final int SCISSORS = 3;
    Scanner input = new Scanner(System.in);

    public void RPS(){
        int win = 0;
        int tie = 0;
        int loss = 0;
        System.out.println("RPS 1.0");
        System.out.println("*********************************************************");
        System.out.println("Good luck, human ...");
        boolean play = true;
        while(play == true){
            System.out.println("");
            System.out.print("What do you throw? [1] Rock, [2] Paper, [3] Scissors? ");
            int human = input.nextInt();
            int computer = (int)(Math.random()*3+1);
            if(human!=ROCK&& human!=PAPER && human!= SCISSORS){
                System.out.println("Invalid response. To err is human.");
            }else{
                if(human == PAPER && computer == PAPER){
                    System.out.println("You threw paper! I threw paper!");
                    System.out.println("A draw ... pretty good, human! I demand a rematch ...");
                    tie = tie + 1;
                }else if(human == PAPER && computer == ROCK){
                    System.out.println("You threw paper! I threw rock!");
                    System.out.println("Whaaa?? ... You beat me? RAGE!");
                    win = win + 1;
                }else if(human == PAPER && computer == SCISSORS){
                    System.out.println("You threw paper! I threw scissors!");
                    System.out.println("I win! You are not a challenge for me ...");
                    loss = loss + 1;
                }else if(human == ROCK && computer == ROCK){
                    System.out.println("You threw rock! I threw rock!");
                    System.out.println("A draw ... pretty good, human! I demand a rematch ...");
                    tie = tie + 1;
                }else if(human == ROCK && computer == PAPER){
                    System.out.println("You threw rock! I threw paper!");
                    System.out.println("I win! You are not a challenge for me ...");
                    loss = loss + 1;
                }else if(human == ROCK && computer == SCISSORS){
                    System.out.println("You threw rock! I threw scissors!");
                    System.out.println("Whaaa?? ... You beat me? RAGE!");
                    win = win + 1;
                }else if(human == SCISSORS && computer == ROCK){
                    System.out.println("You threw scissors! I threw rock!");
                    System.out.println("I win! You are not a challenge for me ...");
                    loss = loss + 1;
                }else if(human == SCISSORS && computer == PAPER){
                    System.out.println("You threw scissors! I threw paper!");
                    System.out.println("Whaaa?? ... You beat me? RAGE!");
                    win = win + 1;
                }else if(human == SCISSORS && computer == SCISSORS){
                    System.out.println("You threw scissors! I threw scissors!");
                    System.out.println("A draw ... pretty good, human! I demand a rematch ...");
                    tie = tie + 1;
                }

            }
            System.out.println("");
            System.out.print("Play again? [Y or N]");
            String ans = input.next();
            if(ans.equals("Y")||ans.equals("y")){
                play = true;
            }else {
                play = false;
                System.out.println("");
                System.out.println("Good Game! Thanks for playing.");
                System.out.println("*********************************************************");
                System.out.println("Wins: "+win);
                System.out.println("Losses: "+loss);
                System.out.println("Ties: "+tie);
            }

        }
    }

}

