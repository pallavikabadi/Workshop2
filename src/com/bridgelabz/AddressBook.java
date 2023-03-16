package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Contact> addressBook1=new ArrayList<>();

        public Contact PersonContact(){
            Contact person=new Contact();
            System.out.println("Enter Name:");
            person.setName(scanner.next());
            System.out.println("Enter Age:");
            person.setName(scanner.next());
            System.out.println("Enter PhoneNo:");
            person.setName(scanner.next());
            System.out.println("Enter City:");
            person.setName(scanner.next());
            System.out.println("Enter State:");
            person.setName(scanner.next());
            return person;
        }

}
