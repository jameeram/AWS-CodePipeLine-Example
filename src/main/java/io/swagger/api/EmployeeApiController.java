package io.swagger.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Employee;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-22T00:05:58.806Z[GMT]")
@Controller
public class EmployeeApiController implements EmployeeApi {

    private static final Logger log = LoggerFactory.getLogger(EmployeeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EmployeeApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addEmployee(@ApiParam(value = "Employee record to add"  )  @Valid @RequestBody Employee body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Employee>> searchEmployee(@NotNull @ApiParam(value = "pass an optional search string for looking up Employee system", required = true) @Valid @RequestParam(value = "searchString", required = true) String searchString,@Min(0)@ApiParam(value = "number of records to skip for pagination", allowableValues = "") @Valid @RequestParam(value = "skip", required = false) Integer skip,@Min(0) @Max(50) @ApiParam(value = "maximum number of records to return", allowableValues = "") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee emp = new Employee();
	        emp.setId(UUID.randomUUID());
	        emp.setDepartment("IT");
	        emp.setName("Jayaram Jami");
	        emp.setSalary(100000);
        employeeList.add(emp);
        
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
        
        //return new ResponseEntity<List<Employee>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
