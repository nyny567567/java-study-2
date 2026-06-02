package final1.ex;

public class MemeberMain {
    static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("lee");
        member.print();
    }
}
