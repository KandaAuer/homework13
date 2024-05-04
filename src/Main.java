public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Анджей", " Сапковский");
        Author author2 = new Author("Агата", " Кристи");

        Book book1 = new Book("Ведьмак. Час Презрения", author1, 1995);
        Book book2 = new Book("Убийство в 'Восточном экспрессе'", author2, 1934);

        book1.setPublicationYear(1997);

        System.out.println(book1);
        System.out.println(book2);
    }
}
