package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1AspectJ {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book", Book.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);

        universityLibrary.getBook(book);
        universityLibrary.returnBook();
        universityLibrary.returnMagazine();
        universityLibrary.addBook("Даниил", book);
        universityLibrary.getMagazine();

        context.close();
    }
}
