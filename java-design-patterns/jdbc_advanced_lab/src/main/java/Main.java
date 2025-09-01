import data.dao.AuthorDao;
import data.entity.Author;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AuthorDao authorDao = new AuthorDao();
//        List<Author> authors = authorDao.getAll();
//        authors.forEach(System.out::println);

        Author newAuthor = new Author();
        newAuthor.setLastName("Kafka" + " " + System.currentTimeMillis());
        newAuthor.setFirstName("Franz");
        newAuthor.setCountry("Czech Republic");
        System.out.println(newAuthor + "\n");
        newAuthor = authorDao.create(newAuthor);

        System.out.println("**** CREATE METHOD TEST ****\n" + newAuthor);
    }
}