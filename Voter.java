
class Voter {
    int voterId;
    String name;
    int age;

    public Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}
