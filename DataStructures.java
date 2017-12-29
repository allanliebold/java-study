import java.util.*;

public class DataStructures {

  public static void main(String[] args) {
    ArrayList<String> arcadeGames = new ArrayList<String>();
    arcadeGames.add("Pac-Man");
    arcadeGames.add("Galaga");
    arcadeGames.add("Centipede");
    arcadeGames.add("Dig Dug");

    System.out.println(arcadeGames.size() + " games in the archive.");

    for (String game: arcadeGames) {
      System.out.println(game);
    }
  }

}
