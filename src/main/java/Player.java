import java.util.Objects;

public class Player {
    private String name;
    private int age;
    private String county;
    private int trophies;


    Player(String name, String county, int age,int trophies){
        this.name = name;
        this.age= age;
        this.county= county;
        this.trophies=trophies;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return age == player.age && trophies == player.trophies && name.equals(player.name) && county.equals(player.county);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, county, trophies);
    }
}
