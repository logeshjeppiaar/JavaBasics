package com.logesh.cloneTest;

/**
 * @author Logesh
 *
 */
public class CloneEmployeeTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp1 = new Employee("logesh", 1);

		Employee emp2 = emp1;

		System.out.println("Before chagnes, emp1 :" + emp1);
		System.out.println("Before chagnes, emp2 :" + emp2);

		emp1.setName("mukesh");

		System.out.println("After name chagnes, emp1 :" + emp1);
		System.out.println("After name chagnes, emp2 :" + emp2);

		emp2.setName("Oho");

		System.out.println("After Oho name chagnes, emp1 :" + emp1);
		System.out.println("After Oho name chagnes, emp2 :" + emp2);

	}

//			Before chagnes, emp1 :Employee [name=logesh, id=1]
//			Before chagnes, emp2 :Employee [name=logesh, id=1]
//			After name chagnes, emp1 :Employee [name=mukesh, id=1]
//			After name chagnes, emp2 :Employee [name=mukesh, id=1]
//			After Oho name chagnes, emp1 :Employee [name=Oho, id=1]
//			After Oho name chagnes, emp2 :Employee [name=Oho, id=1]

}
