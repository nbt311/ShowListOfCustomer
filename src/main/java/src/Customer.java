package src;

public class Customer {
    private String Id;
    private String Name;
    private String DateOfBirth;
    private String Address;

    public Customer(String id, String name, String dateOfBirth, String address) {
        Id = id;
        Name = name;
        DateOfBirth = dateOfBirth;
        Address = address;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Tên: " + this.getName() +
                " Ngày sinh: " + this.getDateOfBirth() +
                " Địa chỉ: " + this.getAddress();
    }
}
