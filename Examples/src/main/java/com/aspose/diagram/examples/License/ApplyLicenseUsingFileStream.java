package com.aspose.diagram.examples.License;

import java.io.FileInputStream;
import java.io.InputStream;

import com.aspose.diagram.License;

public class ApplyLicenseUsingFileStream {

	public static void main(String[] args) throws Exception
	{
        //ExStart:ApplyLicenseUsingFileStream
        // set path of the license file, i.e. c:\temp\
        String dataDir = "c:\\temp\\";
        // load an existing Visio file in the stream
        InputStream licStream = new FileInputStream(dataDir + "Aspose.Diagram.lic");
        
        License license = new License();
        // apply license
        license.setLicense(licStream);
        //ExEnd:ApplyLicenseUsingFileStream
	}

}
