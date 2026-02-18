public class LibrarySystem {
    Book[] books;
    Member[] members;
    Loan[] loans;

    int bookCount;
    int memberCount;
    int loanCount;

    public LibrarySystem(int maxbooks, int maxmembers, int maxloans) {
        books = new Book [maxbooks];
        members = new Member[maxmembers];
        loans = new Loan[maxloans];

    }

    int findBook(int id){
        for (int i = 0;i <bookCount; i ++){
            if (books[i].id == id){
                return i;
            }
        }
        return  -1;
    }

    boolean addBook(Book b){

            if (bookCount >= books.length){
                return false;
            }
             if (findBook(b.id) != -1){
                    System.out.println("already exists");
                    return false;
                }
             books[bookCount]= b;
             bookCount++;
             System.out.println("Book added");
             return true;
            }
    int findMember(int memberId){
        for (int i = 0;i < memberCount; i++){
            if (members[i].memberId == memberId){
                return i;
            }
        }
        return -1;
    }


    boolean addMember(Member m){
        if (memberCount>= members.length){
            return false;
        }
        if (findMember(m.memberId) != -1){
            System.out.println("member already exists");
            return false;
        }
        members[memberCount] = m;
        memberCount++;
        System.out.println("member added");
        return true;
    }
}