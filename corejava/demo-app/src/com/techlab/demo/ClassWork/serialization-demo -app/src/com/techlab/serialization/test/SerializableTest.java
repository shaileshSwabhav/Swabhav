package com.techlab.serialization.test;

import java.io.*;
import java.io.ObjectOutputStream;

import com.techlab.serialization.SerializableDemo;

public class SerializableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SerializableDemo s1 = new SerializableDemo(10, "xyz");
		SerializableDemo s2= new SerializableDemo(11, "abc");

		String fname = "file.txt";
		
		try {
			FileOutputStream file = new FileOutputStream(fname);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(s1);
			out.writeObject(s2);
            
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		// Deserialization	
		SerializableDemo s3 = null; 
		  
        try
        {    
            FileInputStream file = new FileInputStream(fname); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            s3 = (SerializableDemo)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("a = " + s1.a); 
            System.out.println("b = " + s1.b); 
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
		
	}

}
