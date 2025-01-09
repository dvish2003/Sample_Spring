package lk.ijse.Sample_Spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Author: vishmee
 * Date: 1/9/25
 * Time: 3:01 PM
 * Description:
 */
@Entity
public class User {
    @Id
    private int id;
    private String name;
    private String address;

    public User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public User() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
