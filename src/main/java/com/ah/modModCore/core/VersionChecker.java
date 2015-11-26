package com.ah.modModCore.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.IOUtils;


public class VersionChecker implements Runnable 
{
	
	private static boolean isLatestVersion = false;
	private static String latestVersion = "";
	
	@Override
	public void run() 
	{
		System.out.println("Beginning ModMod Version Check...");
		
		InputStream in = null;
		try 
		{
			in = new URL("https://raw.githubusercontent.com/alpha-hydra/modmod-1.7/master/versionfile.txt").openStream();	
		}
		
		catch (MalformedURLException event) 
		{
			event.printStackTrace();
		}
		
		catch (IOException event) 
		{
			event.printStackTrace();
		}
		
		try 
		{
			latestVersion = IOUtils.readLines(in).get(0);
		}
		
		catch (IOException event) 
		{
			event.printStackTrace();	
		}
		
		finally 
		{
			IOUtils.closeQuietly(in);
		}
		
		isLatestVersion = modModCore.version.equals(latestVersion);
		System.out.println("ModMod Version Check Complete");
		if (!isLatestVersion) 
		{
			System.out.println("ModMod is out of date");
		}
		
		else 
		{
			System.out.println("ModMod is up to date");
		}
	}
	
	public boolean isLatestVersion() 
	{
		return isLatestVersion;
	}
	
	public String getLatestVersion() 
	{
		return latestVersion;
	}
}
