public class adres {
    public static void main(String[] args) {
        TestSet obj_1 = new TestSet();
        obj_1.setName("Vlatko");
        obj_1.setAddress("18ti noemvri");
        obj_1.setPobox("1000");
        
        System.out.println(obj_1.getName());
        System.out.println(obj_1.getAddress());
        System.out.println(obj_1.getPobox());
    }
}

class TestSet {
    private String name;
    private String address;
    private String pobox;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPobox() {
        return pobox;
    }
    
    public void setPobox(String pobox) {
        this.pobox = pobox;
    }
}
