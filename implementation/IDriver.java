public abstract class IDriver {
    private String name, phone, ID;

    public IDriver(String name, String phone, String iD) {
        this.name = name;
        this.phone = phone;
        ID = iD;
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
        return 
        (   this.name==iDriver.getName()&&
            this.phone==iDriver.getPhone()&&
            this.ID==iDriver.ID
        );
    }
}
