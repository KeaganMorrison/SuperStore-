
import java.util.ArrayList;
import java.util.Scanner;

public class SuperStore {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);

    Player Carti = new Player(3000, 5000);
    Item EP = new Item(10000,-5000,"Release an EP", "Action");
    Item Flicks = new Item(2000,0,"Post some pictures to IG", "Action");
    Item Stunt = new Item(2000,-1000,"Do some silly things with the squad", "Action");
    Item Bling = new Item(2,-10000,"Get some new jewlry", "Item");
    Item FashionDemon = new Item(2,-20000,"Become the fashion demon", "Item");
    Item WLR = new Item(10000,-5000,"Go on tour for whole lotta red", "Action");
    Item DropAlbum = new Item(0,-100000,"This is it, what the vamps have always been waiting for; 𝔑𝔞𝔯𝔠𝔦𝔰𝔰𝔦𝔰𝔱", "WinGame");

    ArrayList<Item> Wares = new ArrayList<Item>();
    

    int week = 0;

    Wares.add(EP);
    Wares.add(Flicks);
    Wares.add(Stunt);
    Wares.add(Bling);
    Wares.add(FashionDemon);
    Wares.add(WLR);
    Wares.add(DropAlbum);

    
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Welcome to Playboi Carti Simulator. You, Jordan Terrell Carter, need to drop your coveted 𝔑𝔞𝔯𝔠𝔦𝔰𝔰𝔦𝔰𝔱 album. HOWEVER, you're losing fans by the day! Grind for bread to release the Album!");

    
    displayStore(Wares, 0, Carti, sc, week);

    }
    
    public static void displayStore(ArrayList<Item> Wares, int i, Player Carti, Scanner sc, int week) {
      System.out.println("Week " + week);
        System.out.println(" "); 
        System.out.println("Current Vampcoin: " + Carti.vampcoin + ", Current Vamps: " + Carti.vamps);
        System.out.println(" ");


      for(i = 0 ; i < Wares.size(); i++ ) {      
        System.out.println( "[" + i + "]" + (Wares.get(i).Cost + -2 * Wares.get(i).Cost) + " vampcoin:" + " {" + Wares.get(i).title + "}" + " (" + Wares.get(i).Category + ")");
        }

      purchaseItem(Wares, i, Carti, sc, week);
      }

    public static void purchaseItem(ArrayList<Item> Wares, int i, Player Carti, Scanner sc, int week) {
      if(Carti.vampcoin<=0 || Carti.vamps<=0) {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("You silly billy, you lost either all of your friends or your money. Game over");
        System.exit(0);
      }
      if(sc.hasNextInt()==false) {
        while(sc.hasNextInt()==false){
            System.out.println("This is not an option, please input one!");
            sc.next();
        }
    }
        int input = sc.nextInt();
      
        

        for(i = 0 ; i < Wares.size(); i++ ) {
          
          if( input == i ) {
            Carti.vampcoin += Wares.get(i).Cost;
            Carti.vamps += Wares.get(i).Adder;
            
            System.out.println("You purchased the something!" );
              Carti.vamps+=-500;
              Carti.vampcoin+=-500;
              System.out.println("Weekly vamp & bread losses: -500");
          
          
            System.out.println("Your vampcoin is now " + Carti.vampcoin + " and your vamps now number at " + Carti.vamps);
            week+=1;
            displayStore(Wares, input, Carti, sc, week);

          }
        }
    }
    
    }