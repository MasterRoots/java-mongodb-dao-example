package pl.xsolve.tools;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.DB;
import com.mongodb.Mongo;
import org.springframework.util.StringUtils;
import pl.xsolve.model.Address;
import pl.xsolve.model.Employee;

import java.net.UnknownHostException;

/**
 * Date: 2010-09-08
 *
 * @author Konrad Malawski
 */
public class MorphiaFactory {

    private String host;
    private int    port;

    /**
     * Note: The Mongo  object instance actually represents a pool of connections to the database; you will only need one object of class Mongo even with multiple threads.  See the concurrency doc page for more information.
     *
     * @return
     * @throws UnknownHostException if the host was not found
     */
    public Mongo getMongoInstance(/*, String user, char[] pass*/) throws UnknownHostException {
        Mongo mongo = new Mongo(host, port);

//        if (StringUtils.hasText(user) && StringUtils.hasText(pass)) {
//            DB bla = mongo.getDB("bla");
//            bla.authenticate(user, pass);
//        }

        return mongo;
    }

    public Morphia getMorphiaInstance() {
        Morphia morphia = new Morphia();

        // map all persistent classes in here!
        morphia
                .map(Employee.class)
                .map(Address.class);

        return morphia;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(String port) {
        this.port = Integer.parseInt(port);
    }
}
