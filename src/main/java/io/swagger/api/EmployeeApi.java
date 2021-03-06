/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Employee;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-22T00:05:58.806Z[GMT]")
@Api(value = "employee", description = "the employee API")
public interface EmployeeApi {

    @ApiOperation(value = "adds an Employee record", nickname = "addEmployee", notes = "Adds an employee to the system", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Employee created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing employee already exists") })
    @RequestMapping(value = "/employee",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addEmployee(@ApiParam(value = "Employee record to add"  )  @Valid @RequestBody Employee body);


    @ApiOperation(value = "searches Employee", nickname = "searchEmployee", notes = "By passing in the appropriate options, you can search for available Employee in the system ", response = Employee.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Employee.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "bad input parameter") })
    @RequestMapping(value = "/employee",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Employee>> searchEmployee(@NotNull @ApiParam(value = "pass an optional search string for looking up Employee system", required = true) @Valid @RequestParam(value = "searchString", required = true) String searchString,@Min(0)@ApiParam(value = "number of records to skip for pagination", allowableValues = "") @Valid @RequestParam(value = "skip", required = false) Integer skip,@Min(0) @Max(50) @ApiParam(value = "maximum number of records to return", allowableValues = "") @Valid @RequestParam(value = "limit", required = false) Integer limit);

}
