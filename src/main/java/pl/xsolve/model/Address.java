package pl.xsolve.model;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import org.bson.types.ObjectId;

/**
 * Date: 2010-09-08
 *
 * @author Konrad Malawski
 */
@Entity("adresses")
public class Address {

    @Id
    private ObjectId id;

    String street;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
