package Taskk;

class Institute {
    private String name;
    private String location;
    private String mobno;
    private Owner own;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setMobNo(String mobno) {
        this.mobno = mobno;
    }

    public String getMobNo() {
        return mobno;
    }

    public void setOwner(Owner own) {
        this.own = own;
    }

    public Owner getOwner() {
        return own;
    }
}