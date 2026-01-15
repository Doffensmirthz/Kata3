package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Movie;

import java.util.List;

public class TsvMovieParser implements MovieParser{
    @Override
    public String[] parse(String s) {
        return s.split("\\t");
    }

    private Movie toMovie(String line) {
        String[] splits = parse(line);
        // 1,5,7
        return new Movie(
                splits[1],
                toInt(splits[5]),
                toInt(splits[7])
        );
    }

    private int toInt(String split) {
        if(split.equals("\\N")) return -1;
        return Integer.parseInt(split);
    }
}
