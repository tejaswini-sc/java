import java.util.*;

class Restaurant {
    private int id;
    private String name;
    private String email;
    private long phone;
    private String address;

    public Restaurant() {}

    public Restaurant(int id, String name, String email, long phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {   // ✅ fixed name
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Resturants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Restaurant r = new Restaurant();

        System.out.println("Enter details (id,name,email,phone,address):");
        String s = sc.nextLine();

        String arr[] = s.split(",");   

        int id = Integer.parseInt(arr[0]);
        String name = arr[1];
        String email = arr[2];
        long phone = Long.parseLong(arr[3]);
        String add = arr[4];

        r.setId(id);
        r.setName(name);
        r.setEmail(email);
        r.setPhone(phone);
        r.setAddress(add);

        
        System.out.println(r.getId());
        System.out.println(r.getName());
        System.out.println(r.getEmail());
        System.out.println(r.getPhone());
        System.out.println(r.getAddress());

        sc.close();
    }
}