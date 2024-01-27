package franxx.code.record.data;

public record Customer(String id, String name, String email) {

    public Customer(String id, String name, String email) {
        System.out.println("Create Customer");
        this.id = id.toLowerCase();
        this.name = name.toUpperCase();
        this.email = email != null ? email.toLowerCase() : null;
    }

    public Customer(String id, String name) {
        this(id, name, null);
    }

    public Customer(String id) {
        this(id, null, null);
    }

    public String hello(String name) {
        return "Good Morning: " + name + ", my name is: " + this.name;
    }
}
