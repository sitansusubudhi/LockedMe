package com.lockedme;

import java.io.File;

public class FileOperations {
	public static void listFilesInDirectory(String path, int indentationCount) {
		File dir = new File(path);
        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
            	
            	System.out.print(" ".repeat(indentationCount*2));
            	
                
            	if (file.isDirectory()) {  
            		System.out.println("`-- " + file.getName());
            		
            		// Recursively indent and display the files
                	listFilesInDirectory(file.getAbsolutePath(), indentationCount+1);
                }  else {
                	System.out.println("|-- " + file.getName());
                }
            }
        } else {
        	System.out.print(" ".repeat(indentationCount*2));
        	System.out.println("|-- Empty Directory");
        }
        System.out.println();
	}
}
