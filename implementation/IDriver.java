public abstract class IDriver {
    private String name, phone, ID;

    public IDriver(String name, String phone, String iD) {
        this.name = name;
        this.phone = phone;
        this.ID = iD;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getID() {
        return ID;
    }

    public boolean match(IDriver iDriver) {
        return (this.name.equals(iDriver.getName()) &&
                this.phone.equals(iDriver.getPhone())&&
                this.ID.equals(iDriver.ID));
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone: "+this.phone);
        System.out.println("National ID : "+this.ID);
    }
}
