package Collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class MyClassIterator {
    public static void main(String[] args) {
        List<Movie> movieList=new ArrayList<>();
        movieList.add(new Movie("功夫熊猫",9.6,"不知道"));
        movieList.add(new Movie("功夫熊猫2",9.0,"不知道"));
        movieList.add(new Movie("功夫",9.9,"周星驰"));
        movieList.forEach(s->System.out.println( "电影名字为："+s.getName()) );
    }
}
class Movie
{
    String name;
    Double score;
    String actor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Movie() {
    }

    public Movie(String name, Double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }
}
