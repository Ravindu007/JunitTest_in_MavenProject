import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class specMovies {

    @Test
    public void moviesEmptyOrNot(){
        //Arrange (set up data)
        Movies movies = new Movies();

        //Act (call the methods)
        List<String> list = movies.getMovies();

        //Assert (evaluation of condition)
        assertTrue(list.isEmpty());
    }
}
