public class encap {
    private int id;
    private String name;

    public encap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        encap en = new encap(1, "Ritesh");

        System.out.println("ID: " + en.getId());
        System.out.println("Name: " + en.getName());
    }
}
