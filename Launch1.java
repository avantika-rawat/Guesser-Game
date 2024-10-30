


import java.util.Scanner;

class Guesser{
    int guessNum;

    int guessingNumber(){
        System.out.println("Guesser! Kindly guess the number");
        Scanner scan = new Scanner(System.in);
        guessNum = scan.nextInt();
        scan.close();
        return guessNum;
    }
}

class Player{
    int guessNum;
    int guessingNumber(){
        System.out.println("Player! Kindly guess the number");
        Scanner scan = new Scanner(System.in);
        guessNum = scan.nextInt();
        scan.close();
        return guessNum;

    }
}


class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser(){
         Guesser g =new Guesser();
         numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayers(){
Player p1 = new Player();
Player p2 = new Player();
Player p3 = new Player();

numFromPlayer1 = p1.guessingNumber();
numFromPlayer2 =p2.guessingNumber();
numFromPlayer3 = p3.guessingNumber();

    }
    void compare(){
if(numFromGuesser == numFromPlayer1){

    if(numFromGuesser==numFromPlayer2 && numFromGuesser == numFromPlayer3){
        System.out.println("everyone correct");
    }

    else if(numFromGuesser==numFromPlayer2){
        System.out.println("Player 1 and 2 win");
    }

    else if(numFromGuesser==numFromPlayer3){
        System.out.println("Player 1 and 3 won!");
    }

    else System.out.println("Player 1 won the game!!");
}
else if (numFromGuesser == numFromPlayer2){

    if(numFromGuesser==numFromPlayer3){
        System.out.println("Player 2 and 3 won!!");
    }
System.out.println("Player 2 won the game!!");
    }
    else if (numFromGuesser == numFromPlayer3){
        System.out.println("Player 2 won the game!!");
            }
        
        else{
            System.out.println("All players are incorrect");
        }}

}




public class Launch1{
    public static void main(String[] args) {
        System.out.println("Game started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}