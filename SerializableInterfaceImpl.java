package com.model.src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableInterfaceImpl implements Serializable{

	int i;
	String s;
	
	public SerializableInterfaceImpl(int i, String s) {
		this.i = i;
		this.s = s;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializableInterfaceImpl si = new SerializableInterfaceImpl(9, "John");
		
		// Serializing si
		FileOutputStream fs = new FileOutputStream("xyz.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fs);
		oo.writeObject(si);
		
		// Deserializing si
		 // De-serializing 'a' 
        FileInputStream fis = new FileInputStream("xyz.txt"); 
        ObjectInputStream oi = new ObjectInputStream(fis); 
        SerializableInterfaceImpl b = (SerializableInterfaceImpl)oi.readObject();//down-casting object 
  
        System.out.println(b.i+" "+b.s); 
  
        // closing streams 
        oo.close(); 
        oi.close(); 
		

	}

}
