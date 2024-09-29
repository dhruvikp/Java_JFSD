package com.simplilearn.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 
 * New methods added to Files class, 
 * 	writeString(), readString(), isSameFile()
 *
 */
public class FilesExample {

	public static void main(String[] args) throws IOException {
		Path filPath = Path.of("example.txt");
		
		Files.writeString(filPath, "Hello, Java 11!");
		
		String contentString = Files.readString(filPath);
		
		System.out.println(contentString);
	}
}
