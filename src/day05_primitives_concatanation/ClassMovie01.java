package day05_primitives_concatanation;

public class ClassMovie01 {
    public static void main(String[] args){
        String movieName = "Training day";
        String genre = "Drama";
        String duration = "90 minutes";
        String releaseDate = "October 5 2001";
        String rated = "R";
        boolean sequal = false;
        double rottenTamatoeRating = 3.5;
        boolean dvdRelease  = true;

        System.out.println("Tonight we are streaming " + movieName +", which was released on " + releaseDate + ". This " + genre + " movie has gotten a " + rottenTamatoeRating + " rating on Rotten Tamatoes. The movie is " + duration + " long.");


    }
}
