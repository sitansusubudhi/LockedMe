package com.lockedme;

class WelcomeScreen {
	
	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("*****************************************************\n"
											+ "** Welcome to %s.com. \n"
											+ "** This application was developed by %s.\n"
											+ "*****************************************************\n", appName, developerName);
		String appFunction = "You can use this application to :-\n"
							+ "• Retrieve all file names in the \"main\" folder\n"
							+ "• Search, add, or delete files.\n"
							+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
		System.out.println(companyDetails);
		
		System.out.println(appFunction);
	}

}
