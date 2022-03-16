import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostManagerTest {
    PostManager manager = new PostManager();

    @Test
    void shouldRemove() {

        FilmData first = new FilmData(1, 1, "BloodShot", "action");
        FilmData second = new FilmData(2, 2, "Forward", "cartoon");
        FilmData third = new FilmData(3, 3, "Belgrade Hotel", "comedy");
        FilmData forth = new FilmData(4, 4, "Gentlemen", "action");
        FilmData fifth = new FilmData(5, 5, "Invisible", "horror");
        FilmData sixth = new FilmData(6, 6, "Trolls", "cartoon");
        FilmData seventh = new FilmData(7, 7, "Number one", "comedy");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(forth);

        manager.removeById(4);

        FilmData[] expected = {first, second, third};
        FilmData[] actual = manager.findAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldAdd() {

        FilmData first = new FilmData(1, 1, "BloodShot", "action");
        FilmData second = new FilmData(2, 2, "Forward", "cartoon");
        FilmData third = new FilmData(3, 3, "Belgrade Hotel", "comedy");
        FilmData forth = new FilmData(4, 4, "Gentlemen", "action");

        manager.save(first);
        manager.save(second);
        manager.save(third);

        manager.addNew(forth);


        FilmData[] expected = {first, second, third, forth};
        FilmData[] actual = manager.findAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldReverse() {

        FilmData first = new FilmData(1, 1, "BloodShot", "action");
        FilmData second = new FilmData(2, 2, "Forward", "cartoon");
        FilmData third = new FilmData(3, 3, "Belgrade Hotel", "comedy");
        FilmData forth = new FilmData(4, 4, "Gentlemen", "action");
        FilmData fifth = new FilmData(5, 5, "BloodShot", "action");
        FilmData sixth = new FilmData(6, 6, "Forward", "cartoon");
        FilmData seventh = new FilmData(7, 7, "Belgrade Hotel", "comedy");
        FilmData eighth = new FilmData(8, 8, "Gentlemen", "action");
        FilmData ninth = new FilmData(9, 9, "BloodShot", "action");
        FilmData tenth = new FilmData(10, 10, "Forward", "cartoon");
        FilmData eleventh = new FilmData(11, 11, "Belgrade Hotel", "comedy");
        FilmData twelfth = new FilmData(12, 12, "Belgrade Hotel", "comedy");


        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(forth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);



        FilmData[] expected = {eleventh,tenth,ninth,eighth,seventh,sixth,fifth,forth,third,second};
        FilmData[] actual = manager.findLast();
        assertArrayEquals(expected,actual);
    }
    @Test
    void shouldGetMax(){

        FilmData first = new FilmData(1, 1, "BloodShot", "action");
        FilmData second = new FilmData(2, 2, "Forward", "cartoon");
        FilmData third = new FilmData(3, 3, "Belgrade Hotel", "comedy");
        FilmData fourth = new FilmData(4, 4, "Gentlemen", "action");
        FilmData fifth = new FilmData(5, 5, "BloodShot", "action");
        FilmData sixth = new FilmData(6, 6, "Forward", "cartoon");
        FilmData seventh = new FilmData(7, 7, "Belgrade Hotel", "comedy");
        FilmData eighth = new FilmData(8, 8, "Gentlemen", "action");
        FilmData ninth = new FilmData(9, 9, "Belgrade Hotel", "comedy");
        FilmData tenth = new FilmData(10, 10, "Gentlemen", "action");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);

        manager.removeById(10);

        FilmData[] expected = {ninth,eighth,seventh,sixth,fifth,};
        FilmData[] actual = manager.getMaximum(5);;
        assertArrayEquals(expected,actual);
    }
}
