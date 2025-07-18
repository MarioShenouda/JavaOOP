package at.fhj.msd;

 class Movie {
     String title;
     int length ;
     int rating ;

     public Movie(String title, int length, int rating) {
        this.title = title;
        this.length = length;
        this.rating = rating;
      }
    public Movie(String title, int length) {
        this(title, length, 16);
    }
}

