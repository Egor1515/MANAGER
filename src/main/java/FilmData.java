import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class FilmData {
    private int id;
    private int filmId;
    private String filmName;
    private String genre;

}
