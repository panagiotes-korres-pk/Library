public class Loan {
    int id;
    int memberId;
    int days;
    boolean active;

    public Loan(int id, int memberId, int days, boolean active) {
        this.id = id;
        this.memberId = memberId;
        this.days = days;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
