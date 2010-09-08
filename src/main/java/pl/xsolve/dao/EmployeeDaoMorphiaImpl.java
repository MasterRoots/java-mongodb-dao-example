package pl.xsolve.dao;

import com.google.code.morphia.DAO;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import pl.xsolve.model.Employee;

/**
 * Date: 2010-09-08
 *
 * @author Konrad Malawski
 */
@Repository
public class EmployeeDaoMorphiaImpl extends DAO<Employee, ObjectId> implements EmployeeDao {

    public EmployeeDaoMorphiaImpl(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }
}
