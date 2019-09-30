package com.employee.emplpoyee;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import com.employee.emplpoyee.jpa.JpaRepos;
import com.employee.emplpoyee.pojo.Employee;
import com.employee.emplpoyee.service.EmployeeService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {
	/*@Mock
    private JpaRepos Repository;
	
	//PowerMockRule pRule=new PowerMockRule();

    @InjectMocks
    private EmployeeService empService;
    
    
    
    Employee emp = new Employee(12, "deva", "dea@gmail.com", "blore");
    Employee emp1 = new Employee(1, "dev", "deva@gmail.com", "blore");
    Employee emp3 = new Employee(24, "jagadish", "jaga@gmail.com", "blore");
    Employee emp2 = new Employee(12, null, "dea@gmail.com", "blore");
	/*
	 * @PrepareForTest(EmployeeService.class)
	 * 
	 * @Test public void testStaticMethod() {
	 * PowerMockito.mockStatic(EmployeeService.class);
	 * 
	 * }
	 */
    
    /*
    @Test
    public void testPrivateMethod() {
    	Employee output=ReflectionTestUtils.invokeMethod(empService, "privateMethod", emp);
        assertThat(output).isEqualTo(emp);

    }
  
    
    
    @Test
    public void testCreate() {
    	 List<Employee> list= new ArrayList<Employee>();
         list.add(emp);
         list.add(emp1);
 		//Mockito.when(Repository.findAll()).thenReturn(list);
     	ReflectionTestUtils.setField(empService,"name", "Deva");

         
     	doReturn(list).when(Repository).findAll();
     	
     	doReturn(emp3).when(Repository).save(Mockito.any(Employee.class));
    Employee output1=empService.create(emp3);

        assertThat(output1).isEqualTo(emp3);
    	
        Employee output=empService.create(emp);
        assertThat(output).isNotEqualTo(emp);
    
  
 
        
    }
    @Test
    public void testViewAll() {
        List<Employee> list= new ArrayList<Employee>();
        list.add(emp);
        list.add(emp1);
        
    	
    	doReturn(list).when(Repository).findAll();
    	List<Employee> output=empService.viewAll();
        assertThat(output).isEqualTo(list);
    	
    }

    @Test
    public void testupdate() {
    	ReflectionTestUtils.setField(empService,"name", "Deva");

    	 List<Employee> list= new ArrayList<Employee>();
         list.add(emp);
         list.add(emp1);
         Employee updated = new Employee(12, "dev", "deva@gmail.com", "blore");

     	doReturn(list).when(Repository).findAll();
    	doReturn(updated).when(Repository).save(Mockito.any(Employee.class));
    	Employee output=empService.update(12, emp1);
    	
    	Employee output2=empService.update(24, emp1);

        assertThat(output).isEqualTo(updated);
        assertThat(output2).isNotEqualTo(updated);

    }
    
    
    @Test
    public void testDelete() {
    	List<Employee> list= new ArrayList<Employee>();
        list.add(emp);
        list.add(emp1);
     	doReturn(list).when(Repository).findAll();

       String op=empService.delete(12);
       String op2=empService.delete(24);
	
       assertThat(op).isEqualTo("deleted");
       assertThat(op2).isEqualTo("employee with given id not found");

    }
    
    @Test
    public void testViewById() {
    	
     	doReturn(Optional.of(emp)).when(Repository).findById(Mockito.anyInt());
     	
     	Optional<Employee> op=empService.ViewById(12);
        assertThat(op).isEqualTo(Optional.of(emp));

    }
    */
}
