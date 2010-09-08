package pl.xsolve.dao;

import org.bson.types.ObjectId;
import pl.xsolve.model.Employee;

/**
 * Date: 2010-09-08
 *
 * @author Konrad Malawski
 */
public interface EmployeeDao extends MorphiaDao<Employee, ObjectId> {
}
