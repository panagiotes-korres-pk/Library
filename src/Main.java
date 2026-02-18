//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LibrarySystem lib = new LibrarySystem(10 , 10 , 10);
        Book b = new Book(3, "amlet", "korres", 3, 1);
        lib.addBook(b);
        lib.addBook(b);

        System.out.println(lib.findBook(3));

        Member m = new Member(2 , "panahs" , "6906173399");
        lib.addMember(m);
        lib.addMember(m);
        System.out.println(lib.findMember(2));

    }
}