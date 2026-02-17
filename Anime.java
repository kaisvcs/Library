public class Anime {
    private String title;
    private String studio;
    private String japTitle;
    private int ID;
    private int release;
    private double rating;

    public Anime (String title){
        this.title = title;
        this.rating = 0;
    }
    public Anime (String title, String japTitle, double rating){
        this.title = title;
        this.japTitle = japTitle;
        this.rating = 0;
    }   
    public Anime (String title, String japTitle, double rating, String studio, int ID, int release){
        this.title = title;
        this.japTitle = japTitle;
        this.rating = 0;
        this.studio = studio;
        this.ID = ID;
        this.release = release;
    }   

    public String getTitle() {
        return title;
    }

    public String getjapName() {
        return japTitle;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 1 && rating <= 10) {
            this.rating = rating;
            System.out.println(this.title + " Rated: " + this.rating);
        } else {
            System.out.println("1-10 Only.");
        }
    }

    @Override
    public String toString() {
        return "'" + title + "' or '" + japTitle + "' Rated: " + (rating == 0 ? "Not Rated" : rating); 
    }
}