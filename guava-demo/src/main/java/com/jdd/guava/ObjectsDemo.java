package com.jdd.guava;

import com.google.common.base.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @author: keller.ji
 * @since: 2019/8/23 11:20
 */
public class ObjectsDemo {

    class Student {
        private String firstName;
        private String lastName;
        private int rollNo;
        private String className;

        public Student(String firstName, String lastName, int rollNo, String className){
            this.firstName = firstName;
            this.lastName = lastName;
            this.rollNo = rollNo;
            this.className = className;
        }

        @Override
        public boolean equals(Object object){
            if(!(object instanceof Student) || object == null){
                return false;
            }

            Student student = (Student)object;
            return Objects.equal(firstName, student.firstName)
                    && Objects.equal(lastName, student.lastName)
                    && Objects.equal(rollNo, student.rollNo)
                    && Objects.equal(className, student.className);
        }

        @Override
        public int hashCode(){
            return Objects.hashCode(className,rollNo);
        }

        public String getFirstName(){
            return firstName;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public int getRollNo(){
            return rollNo;
        }

        public void setRollNo(int rollNo){
            this.rollNo = rollNo;
        }

        public String getClassName(){
            return className;
        }

        public void setClassName(){
            this.className = className;
        }
    }


    public static void main(String[] args){
        Student s1 = new ObjectsDemo().new Student("Mahesh", "parasher", 1, "VI");
        Student s2 = new ObjectsDemo().new Student ("Suresh", null , 3, null);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());

    }
}
