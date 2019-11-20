package classes;

public class BookStore {
    public static void main(String[] args) {

        Book book1 = new Book("java","cybertek",200);
        Book book2 = new Book("automation","cybertek",100);
        Book book3 = new Book("backend","cybertek",300);
        Book [] myBooks = new Book[3];
        myBooks[0] = book1;
        myBooks[1] = book2;
        myBooks[2] = book3;

        myBooks[0].pages = 50;

        for (Book eachBook: myBooks) {
                eachBook.info();
          //  System.out.println(eachBook.title +  " has " +eachBook.pages + " pages");
        }

        for(int i=0, j = 50; i < myBooks.length;i++, j += 100) {
            myBooks[i].pages = j;
        }

        for (Book eachBook: myBooks) {
            eachBook.info();
            //  System.out.println(eachBook.title +  " has " +eachBook.pages + " pages");
        }







    }
}
