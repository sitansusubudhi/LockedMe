package com.lockedme;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileOperations {
	public static List<String> listFilesInDirectory(String path, int indentationCount, List<String> fileListNames) {
		File dir = new File(path);
        File[] files = dir.listFiles();
        List<File> filesList = Arrays.asList(files);
        
        Collections.sort(filesList);
        
        if (files != null && files.length > 0) {
            for (File file : filesList) {
            	
            	System.out.print(" ".repeat(indentationCount*2));
            	
                
            	if (file.isDirectory()) {  
            		System.out.println("`-- " + file.getName());
            		
            		// Recursively indent and display the files
            		fileListNames.add(file.getName());
                	listFilesInDirectory(file.getAbsolutePath(), indentationCount+1, fileListNames);
                }  else {
                	System.out.println("|-- " + file.getName());
                	fileListNames.add(file.getName());
                }
            }
        } else {
        	System.out.print(" ".repeat(indentationCount*2));
        	System.out.println("|-- Empty Directory");
        }
        System.out.println();
        return fileListNames;
	}


}
