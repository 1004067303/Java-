package com.Jha.Obj.Movies;

public class MovieOper {
    private Movies[] movies;

    public MovieOper(Movies[] movies) {
        this.movies = movies;
    }

    public MovieOper() {
    }

    public Movies[] getMovies() {
        return movies;
    }

    public void setMovies(Movies[] movies) {
        this.movies = movies;
    }

    public void printMovies()
    {
        for (Movies movie:movies) {
            System.out.println("电影名为："+movie.getName()+" 价格为："+movie.getPrice());
        }

    }
    public void printFindById(int id)
    {
        boolean flag=false;
        for (Movies movie:movies) {
            if(movie.getID()==id)
            {
                System.out.println("已为你找到ID为"+id+"的电影");
                System.out.println("电影名为："+movie.getName()+" 价格为："+movie.getPrice());
                flag=true;
                return;
            }
        }


            System.out.println("未找到ID为"+id+"的电影");

    }
}
