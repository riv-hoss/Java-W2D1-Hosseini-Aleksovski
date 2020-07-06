public class Amin_Q5_Book {

        // possible fields
        String name;
        String authorName;
        String genre;
        String publisher;
        int page;
        int year;
        boolean isAvailable;

        // constructor
        public Amin_Q5_Book(String name, String authorName, String genre,
                    String publisher, int page, int year, boolean isAvaialble  ) {
            this.name = name;
            this.authorName = authorName;
            this.genre = genre;
            this.publisher = publisher;
            this.page = page;
            this.year = year;
            this.isAvailable = isAvaialble;

        }


        // method number of pages- "getter". Should be "public"
        public void getBookInfo () {
            System.out.printf("%s is a %s book written by %s which was published" +
                    " by %s in %d.\n", name, genre, authorName, publisher, year);
        }



        // method book availability.
        public void isBookAvailable () {
            if (this.isAvailable == true) {
                System.out.printf("The book, %s, is available.\n", name);
            } else {
                System.out.printf("The book, %s, is currently unavailable!\n", name);

            }

        }

    }


