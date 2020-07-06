public class Main {

    public static void main(String[] args) {
        Amin_Q5_Book bookOne = new Amin_Q5_Book("Everything Store","Brad Stone",
                "non-fiction","Little",384,2013, true);

        Amin_Q5_Book bookTwo = new Amin_Q5_Book("Shoe Dog","Phil Knight",
                "memoir","Simon & Schuster",386,2016, true);

        Amin_Q5_Book bookThree = new Amin_Q5_Book("Elon Musk","Ashlee Vance",
                "biography","Barns",384,2015, false);

        Amin_Q5_Book bookFour = new Amin_Q5_Book("The Subtle Art of Not Giving a F*ck",
                "Mark Manson", "self-help",
                "HarperOne",224,2013, true);

        Amin_Q5_Book bookFive = new Amin_Q5_Book("The Hitchhiker's Guide to the Galaxy",
                "Douglas Adams", "novel","PubPub",
                120,1980, false);


        System.out.println("\n------Part 1 - print book information------\n");
        bookFive.getBookInfo();

        System.out.println("\n------Part 2 - check if the book is available------\n");
        bookFour.isBookAvailable();

        // part 3 - store books in an array
        System.out.println("\n------Part 4 - Store books in an array " +
                "and loop through them.------\n");
        Amin_Q5_Book[] myBooks = {bookOne, bookTwo, bookThree, bookFour, bookFive};

        for(Amin_Q5_Book book : myBooks ) {
            book.getBookInfo();
            System.out.println();

        }

        System.out.println("\n=====================================END OF A5========" +
                "=============================\n");

    }


}
