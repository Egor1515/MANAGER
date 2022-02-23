public class PostManager {

    public PostManager manager;
    public int managerLimit = 10;


    public FilmData[] films = new FilmData[0];

    public PostManager(int managerLimit) {
        this.managerLimit = managerLimit;
    }

    public PostManager() {
    }

    public void save(FilmData film) {
        int length = films.length + 1;
        FilmData[] tmp = new FilmData[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public void addNew(FilmData film) {
        save(film);
    }


    public FilmData[] findAll() {
        return films;
    }

    public FilmData[] getAll() {
        FilmData[] films = manager.findAll();
        FilmData[] result = new FilmData[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;

    }

    public void removeById(int id) {
        int length = films.length - 1;
        FilmData[] tmp = new FilmData[length];
        int index = 0;
        for (FilmData film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
            films = tmp;

        }
    }

    public FilmData[] findLast() {
        FilmData[] films = findAll();
        FilmData[] result = new FilmData[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;


    }

    public FilmData[] getMaximum() {
        FilmData[] films = findLast();
        FilmData[] result = new FilmData[managerLimit];
        for (int i = 0; i < managerLimit; i++) {

            result[i]= films[i];
        }

        return result;
    }
}
