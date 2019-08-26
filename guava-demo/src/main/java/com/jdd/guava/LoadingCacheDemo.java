package com.jdd.guava;

import com.google.common.base.MoreObjects;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @Author: keller
 * @Date: Create in 2019/8/26 10:57
 * @Modified By:
 */
public class LoadingCacheDemo {

    static class Employee {
        String name;
        String dept;
        String empID;

        public Employee(String name, String dept, String empID) {
            this.name = name;
            this.dept = dept;
            this.empID = empID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDept() {
            return dept;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        public String getEmpID() {
            return empID;
        }

        public void setEmpID(String empID) {
            this.empID = empID;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(Employee.class).add("Name", name).add("Department", dept).add("Emp Id",
                    empID).toString();
        }

    }

    private static Employee getFromDataBase(String empId) {
        Employee e1 = new Employee("Mahesh", "Finance", "100");
        Employee e2 = new Employee("Rohan", "IT", "103");
        Employee e3 = new Employee("Sohan", "Admin", "110");

        Map<String, Employee> database = new HashMap();
        database.put("100", e1);
        database.put("103", e2);
        database.put("110", e3);

        System.out.println("Database hit for " + empId);

        return database.get(empId);
    }

    public static void main(String[] args) {
        //create a cache for employees based on their employee id
        LoadingCache employeeCache = CacheBuilder.newBuilder()
                //maximum 100 records can be cached
                .maximumSize(100)
                //cache will expire after 30 minutes of access
                .expireAfterAccess(30, TimeUnit.MINUTES)
                //build the cacheloader
                .build(new CacheLoader<String, Employee>() {
                    @Override
                    public Employee load(String empId) throws Exception {
                        //make the expensive call
                        return getFromDataBase(empId);
                    }
                });

        try {
            //on first invocation, cache will be populated with corresponding
            //employee record
            System.out.println("Invocation #1");
            System.out.println(employeeCache.get("100"));
            System.out.println(employeeCache.get("103"));
            System.out.println(employeeCache.get("110"));
            //second invocation, data will be returned from cache
            System.out.println(employeeCache.get("100"));
            System.out.println(employeeCache.get("103"));
            System.out.println(employeeCache.get("110"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}







