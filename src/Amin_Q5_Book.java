public class Amin_Q5_Book {

        // possible fields
        String name;
        String authorName;
        String genre;
        String publisher;
        int page;
        int year;

        // constructor
        public Amin_Q5_Book(String name, String authorName, String genre,
                    String publisher, int page, int year  ) {
            this.name = name;
            this.authorName = authorName;
            this.genre = genre;
            this.publisher = publisher;
            this.page = page;
            this.year = year;

        }


        // method - "getter". Should be "public"
        public void numberOfPages () {
            System.out.printf("The book, %s, has %d pages.", this.name,this.page);
        }



    }


