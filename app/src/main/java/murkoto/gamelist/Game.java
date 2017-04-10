package murkoto.gamelist;

/**
 * Created by Cesa Satria Anwar on 06/04/2017.
 */

public class Game {

    private String title;
    private String developer;
    private String genre;
    private String year;
    private int score;

    public Game() {
        this("","","","",0);
    }

    public Game(String title, String developer, String genre, String year, int score) {
        this.title = title;
        this.developer = developer;
        this.genre = genre;
        this.year = year;
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
