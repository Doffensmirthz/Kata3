package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Movie;

import java.util.List;

public interface MovieLoader {
    public List<Movie> loadAll();
}

