package org.iesvdm.employee;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test doubles that are "fakes" must be tested
 *
 *
 */
public class EmployeeInMemoryRepositoryTest {

	private EmployeeInMemoryRepository employeeRepository;

	private List<Employee> employees;

	@BeforeEach
	public void setup() {
		employees = new ArrayList<>();
		employeeRepository = new EmployeeInMemoryRepository(employees);
	}

	/**
	 * Descripcion del test:
	 * crea 2 Employee diferentes
	 * aniadelos a la coleccion de employees
	 * comprueba que cuando llamas a employeeRepository.findAll
	 * obtienes los empleados aniadidos en el paso anterior
	 */
	@Test
	public void testEmployeeRepositoryFindAll() {

		Employee m = new Employee("20", 50);
		Employee m2 = new Employee("30", 8);

		employees.add(m);
		employees.add(m2);


		assertThat(employeeRepository.findAll()).hasSize(2);
		assertThat(employeeRepository.findAll()).isNotEmpty();
		assertThat(employeeRepository.findAll().contains(m)).isTrue();
		assertThat(employeeRepository.findAll().contains(m2)).isTrue();

	}

	/**
	 * Descripcion del test:
	 * salva un Employee mediante el metodo
	 * employeeRepository.save y comprueba que la coleccion
	 * employees contiene solo ese Employee
	 */
	@Test
	public void testEmployeeRepositorySaveNewEmployee() {
		Employee m = new Employee("5", 2);
		employeeRepository.save(m);
		assertThat(employeeRepository.findAll().contains(m)).isTrue();
	}

	/**
	 * Descripcion del tets:
	 * crea un par de Employee diferentes
	 * aniadelos a la coleccion de employees.
	 * A continuacion, mediante employeeRepository.save
	 * salva los Employee anteriores (mismo id) con cambios
	 * en el salario y comprueba que la coleccion employees
	 * los contiene actualizados.
	 */
	@Test
	public void testEmployeeRepositorySaveExistingEmployee() {

		Employee m = new Employee("1", 3);
		Employee m2 = new Employee("2", 5);

		employeeRepository.save(m);
		employeeRepository.save(m2);

		assertThat(employees.contains(m)).isTrue();
		assertThat(employees.contains(m2)).isTrue();

	}
}
