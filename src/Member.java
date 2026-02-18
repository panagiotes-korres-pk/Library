public class Member {
     int memberId;
     String name;
    String phone;

    public Member(int memberId, String name, String phone) {
        this.memberId = memberId;
        this.name = name;
        this.phone = phone;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
