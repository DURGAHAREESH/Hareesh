package com.launch;

import java.io.IOException;

public class TC_001 extends BaseTest 
{

	public static void main(String[] args) throws IOException
	{
		
	init();
	
		launch("chromebrowser");

		navigateurl("amazonurl");
	}

	

}