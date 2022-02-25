package partc;

public class Customer {
    private Integer id;
    private String firstName;
    private String lastname;
    private Double balance;

    public Customer(Integer id, String firstName, String lastname, Double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer { " +
                "id = " + id +
                ", firstName = '" + firstName + '\'' +
                ", lastname = '" + lastname + '\'' +
                ", balance = " + balance +
                " } ";
    }
}
