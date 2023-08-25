package Taskk;

class Owner {
    private String name;
    private String mobno;
    private Address addr;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMobNo(String mobno) {
        this.mobno = mobno;
    }

    public String getMobNo() {
        return mobno;
    }

    public void setAddress(Address addr) {
        this.addr = addr;
    }
    public Address getAddress() {
        return addr;
    }
}
