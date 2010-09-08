package pl.xsolve.dao;

import junit.framework.TestCase;
import org.bson.types.ObjectId;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.xsolve.model.Employee;

/**
 * Date: 2010-09-09
 *
 * @author Konrad Malawski
 */
public class EmployeeDaoMorphiaImplTest extends TestCase {

    EmployeeDao employeeDao = new ClassPathXmlApplicationContext("/spring-config.xml").getBean(EmployeeDao.class);

    public void testPersistAndRestore() throws Exception {
        Employee employee = new Employee();
        employee.setFirstName("Konrad");
        employee.setLastName("Malawski");
        employeeDao.save(employee);

        ObjectId id = employee.getId();
        assertNotNull(id);

        Employee reEmployee = employeeDao.get(id);
        assertEquals(employee.getFirstName(), reEmployee.getFirstName());
        assertEquals(employee.getLastName(), reEmployee.getLastName());
    }
}
