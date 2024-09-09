public class Profile {

    protected String name;
    protected String address;
    protected String contactNumber;
    protected String email;
    protected int ID;


    public Profile(String name, String address, String contactNumber, String email, int ID) {
        this.ID = ID;
        this.address = address;
        this.email = email;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getAddress() {
        return address;
    }


    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    public String getContactNumber() {
        return contactNumber;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getEmail() {
        return email;
    }


    public void setID(int ID) {
        this.ID = ID;
    }


    public int getId() {
        return ID;
    }

    @Override
    public String toString()
    {
        return name + "\t" + address + "\t  " + contactNumber + "\t   " + email + "\t    " + ID + "\t";
    }

    @Override
    public Profile clone()
    {
        Profile C = new Profile(name, address, contactNumber, email, ID);
        return C;
    }

    @Override
    public boolean equals(Object o)
    {
        Customer C = (Customer) o;
        return C.getName().equals(name) && C.getAddress().equals(address) &&
                C.getContactNumber() == contactNumber && C.getEmail().equals(email) && C.getId() == ID;
    }
}