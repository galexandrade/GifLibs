package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Category;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
        new Gif("android-explosion", 1, LocalDate.of(2017, 06, 20), "Alex Andrade", false),
        new Gif("ben-and-mike", 2, LocalDate.of(2017, 06, 20), "Alex Andrade", true),
        new Gif("book-dominos", 3, LocalDate.of(2017, 06, 20), "Alex Andrade", true),
        new Gif("compiler-bot", 2, LocalDate.of(2017, 06, 20), "Alex Andrade", true),
        new Gif("cowboy-coder", 1, LocalDate.of(2017, 06, 20), "Alex Andrade", true),
        new Gif("infinite-andrew", 1, LocalDate.of(2017, 06, 20), "Alex Andrade", true),
        new Gif("robot", 2, LocalDate.of(2017, 06, 20), "Alex Andrade", true)
    );

    public Gif findByName(String name){
        for (Gif gif : ALL_GIFS){
            if (gif.getName().equals(name))
                return gif;
        }

        return null;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }

    public List<Gif> findByCategory(Category category) {
        List<Gif> gifList = new ArrayList<>();

        for (Gif gif : ALL_GIFS){
            if (gif.getCategoryId() == category.getId())
                gifList.add(gif);
        }

        return gifList;
    }
}
