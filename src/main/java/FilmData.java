

public class FilmData {
    private int id;
    private int filmId;
    private String filmName;
    private String genre;

    public FilmData() {
    }

    public FilmData(int id, int filmId, String filmName, String genre) {
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
