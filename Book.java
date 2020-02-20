package JAVA2;

public interface Book {
    String bookName(String bn);
    String authorName(String an);

}


class person implements Book {
    String Name;



    @Override
    public String bookName(String bn) {
        return bn;
    }

    @Override
    public String authorName(String an) {
        return an;
    }
}



class Library extends person {

    public static void main(String[] args) {
        person p1=new person();

        p1.Name="Kandy";

        System.out.println("Name "+p1.Name+"\nBook Name "+p1.bookName("Vampire Diaries")+"\nAuthor Name "+p1.authorName("L.J.Smith"));
    }


}
