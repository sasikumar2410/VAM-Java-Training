package com.vm.training.java.AssignmentOnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * This class is used to print the data of list in sorted order by patientId
 * @author sasi chowdary
 *
 */
class sortByPatientId implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		if(o1.getPatient_id()==o2.getPatient_id())
			return 0;
		else if(o1.getPatient_id()>o2.getPatient_id())
			return 1;
		else
			return -1;
	}
	
}
/**
 * This class is used to print the data of list in sorted  order by patient name
 * @author sasi chowdary
 *
 */
class sortByPatientName implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		return o1.getPatient_name().compareTo(o2.getPatient_name());
	}
	
}

public class TestPatient {
	
	
	/**
	 * This method is used to display the data that was present in TreeSet
	 * @param ts
	 */
	static void display(Set<Patient> ts1)
	{
		Iterator<Patient> itr1=ts1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
	/**
	 * This method is used to print the patientNname and patientAge
	 * @param ts1
	 */
	static void getPatientAge(Set<Patient> ts1)
	{
		for (Patient p : ts1) {
			System.out.println(p.getPatient_name()+"="+p.getPatient_age());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Patient> al=new ArrayList<Patient>();
		al.add(new Patient(159,"hdh", 21));
		al.add(new Patient(354,"aaa", 18));
		al.add(new Patient(350,"abc", 20));
		
		System.out.println("=========total list of patients=======");
		System.out.println(al);
		
		System.out.println("=========Sort by patient_id===========");
		Collections.sort(al,new sortByPatientId());
		for (Patient p: al) {
			System.out.println(p);
		}
		
		
		
		System.out.println("=========Sorty by patient_name========");
		Collections.sort(al,new sortByPatientName());
		Iterator<Patient> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		
		System.out.println("========Storing the array list data to set========= ");
		Set<Patient> ts1=new HashSet<Patient>(al);
		display(ts1);
		
		
		System.out.println("========print patientName = patientAge===========");
		getPatientAge(ts1);
		
	}

}
