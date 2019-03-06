package com.planetway.assignment;

import com.planetway.assignment.model.Employee;
import com.planetway.assignment.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CommandLineAppStartupRunner.class);

    private final EmployeeService employeeService;

    public CommandLineAppStartupRunner(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void run(String... args) {

        logger.info("starting employee table has been initialization..");

        // creating supervisors first to avoid FK constraint violation
        Employee supervisor = new Employee();
        supervisor.setFirstName("Margus");
        supervisor.setLastName("Räim");

        supervisor = employeeService.createEmployee(supervisor);

        Employee employee = new Employee();
        employee.setFirstName("Mustafa Ogün");
        employee.setLastName("Öztürk");
        employee.setSupervisor(supervisor);

        employeeService.createEmployee(employee);

        logger.info("employee table has been initialized..");
    }
}
