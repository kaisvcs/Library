import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Anime> animes;

    public Library() {
        this.animes = new ArrayList<>();
    }

    public void addAnime(Anime anime) {
        this.animes.add(anime);
        System.out.println("Added: " + anime.getTitle());
    }

    public Anime findBookByTitle(String title) {
        for (Anime anime : animes) {
            if (anime.getTitle().equalsIgnoreCase(title)) {
                return anime;
            }
        }
        return null;
    }

    public void displayAnime() {
        System.out.println("\n--- Anime ---");
        for (Anime anime : animes) {
            System.out.println(anime.toString());
        }
        System.out.println("----------------");
    }
}