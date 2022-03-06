import java.util.*;

public class Main {

    ArrayList<Player> players;
    Map<String, Player> playerHashMap;
    Map<String, Player> playerTreeMap;

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    public void start(){
        Player player1 = new Player("Stephen Cluxton","Dublin",28,8);
        Player player2 = new Player("James McCarthy","Dublin",30,4);
        Player player3 = new Player("Bernard Brogan","Dublin",26,6);
        Player player4 = new Player("Colm Basquel", "Dublin",23,5);
        Player player5 = new Player("Cormac Costello","Dublin",20,4);
        Player player6 = new Player("Craig Lynch","Louth",27,1);
        Player player7 = new Player("Kevin Carr","Louth",28,0);
        Player player8 = new Player("Eoin O'Connor","Louth",31,0);
        Player player9 = new Player("Sam Mulroy","Louth",29,1);
        Player player10 = new Player("Decky Byrne","Louth",30,1);
//array list //
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);
//hashmap//
        playerHashMap = new HashMap<>();
        playerHashMap.put("D1", player1);
        playerHashMap.put("D2", player2);
        playerHashMap.put("D3", player3);
        playerHashMap.put("D4", player4);
        playerHashMap.put("D5", player5);
        playerHashMap.put("L1", player6);
        playerHashMap.put("L2", player7);
        playerHashMap.put("L3", player8);
        playerHashMap.put("L4", player9);
        playerHashMap.put("L5", player10);

//treemap//
        playerTreeMap = new TreeMap<>(new ComparatorTreeMapKey());
        playerTreeMap.put("Stephen", player1);
        playerTreeMap.put("James", player2);
        playerTreeMap.put("Bernard ", player3);
        playerTreeMap.put("Colm", player4);
        playerTreeMap.put("Cormac", player5);
        playerTreeMap.put("Craig", player6);
        playerTreeMap.put("Kevin", player7);
        playerTreeMap.put("Eoin", player8);
        playerTreeMap.put("Sam", player9);
        playerTreeMap.put("Decky", player10);


        displayMainMenu();
    }



    public void displayMainMenu() {

        final String MENU_ITEMS = "\n~~~~~~ Main Menu ~~~~~~\n"
                + "1. Display ArrayList\n"
                + "2. Find object by key-HashMap\n"
                + "3. Display TreeMap\n"
                + "4. Exit\n"
                + "Enter Option (1-2-3)\n";

        final int DISPLAY_ARRAYLIST = 1;
        final int OBJECT_HASHMAP = 2;
        final int DISPLAY_TREEMAP = 3;
        final int EXIT = 4;

        Scanner keyboard = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("\n" + MENU_ITEMS);
            try {
                String userInput = keyboard.nextLine();
                option = Integer.parseInt(userInput);

                switch (option) {
                    case DISPLAY_ARRAYLIST:
                        System.out.println("Display Array");
                        displayArray(players);
                        break;
                    case OBJECT_HASHMAP:
                        System.out.println("Display HashMap With Key");
                        objectHashMap(playerHashMap);
                        break;
                    case DISPLAY_TREEMAP:
                        System.out.println("Display Treemap");
                        displayTreeMap(playerTreeMap);
                    case EXIT:
                        System.out.println("Exit menu");
                        break;
                    default:
                        System.out.println("Invalid Option-please enter number within range");
                        break;
                }

            } catch (InputMismatchException | NumberFormatException e) {
                System.out.print("Invalid option-please enter number in range");
            }
        } while (option != EXIT);

        System.out.println("\nExiting Main Menu, goodbye.");
    }



    public void objectHashMap(Map<String, Player> hashMap){
        System.out.println("Enter Initials of County and Number of Player ( Dublin = `D` + Number = 1  = `D1`) :");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine().toUpperCase(Locale.ROOT);
        if (hashMap.get(input) == null){
            System.out.println("Object was not found,Invalid Key");
        }else {
            System.out.println(hashMap.get(input));
        }
        ContinueKey();
    }

    public void displayTreeMap(Map<String, Player> treeMap) {
        for (Map.Entry<String, Player> entry : treeMap.entrySet()) {
            System.out.println("Key: "+entry.getKey()+", Player: "+entry.getValue());
        }
        ContinueKey();
    }
    public void ContinueKey(){
        System.out.println("\nPress \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public void displayArray(ArrayList<Player> players){
        for (Player player : players) {
            System.out.println(player);
        }
        ContinueKey();
    }
}
   