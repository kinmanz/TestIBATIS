/**
 * Created by Sergey.Luchko on 22.07.2016.
 */

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import Entities.*;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

      /* This would insert one record in Employee table. */
//        System.out.println("Going to insert record.....");
//        Employee em = new Employee("Zara", "Ali", 5000);
//
//        System.out.println("new record id = " + smc.insert("Employee.insert", em));
//        System.out.println("Record Inserted Successfully ");

         /* This would update one record in Employee table. */
//        System.out.println("Going to update record.....");
//        Employee rec = new Employee();
//        rec.setId(8);
//        rec.setFirstName("Serega");
//        System.out.println("updated = " + smc.update("Employee.update", rec ));
//        System.out.println("Record updated Successfully ");

        /* This would delete one record in Employee table. */
//        System.out.println("Going to delete record.....");
//        int id = 7;
//        smc.delete("Employee.delete", id );
//        System.out.println("Record deleted Successfully ");


        /* This would read all records from the Employee table. */
        System.out.println("Going to read records.....");
        Employee employee = new Employee();
        employee.setId(5);
        List <Employee> ems = (List<Employee>) smc.queryForList("Employee.getById", employee);

        for (Employee e : ems) {
            System.out.print("  " + e.getId());
            System.out.print("  " + e.getFirstName());
            System.out.print("  " + e.getLastName());
            System.out.print("  " + e.getSalary());
            System.out.println("");
        }
//
//        System.out.println("Records Read Successfully ");

//        int id = 5;
//        System.out.println("Going to read record.....");
//        Employee e = (Employee)smc.queryForObject ("Employee.useResultMap", id);
//
//        System.out.println("ID:  " + e.getId());
//        System.out.println("First Name:  " + e.getFirstName());
//        System.out.println("Last Name:  " + e.getLastName());
//        System.out.println("Salary:  " + e.getSalary());
//        System.out.println("Record read Successfully ");


//        DBService dbService = new DBService();
//        dbService.printConnectInfo();
//
//        Connection connection = dbService.getConnection();
//        ExecutorSQL executorSQL = new ExecutorSQL(connection);

//        executorSQL.execUpdate("CREATE TABLE EMPLOYEE (\n" +
//                "   id INT NOT NULL auto_increment,\n" +
//                "   first_name VARCHAR(20) default NULL,\n" +
//                "   last_name  VARCHAR(20) default NULL,\n" +
//                "   salary     INT  default NULL,\n" +
//                "   PRIMARY KEY (id)\n" +
//                ");");

    }
}
