package com.aspose.diagram.examples.License;

import com.aspose.diagram.License;

public class ApplyLicenseByPath {

	public static void main(String[] args) throws Exception 
	{
		//ExStart:ApplyLicenseByPath
        // set path of the license file, i.e. c:\temp\
        String dataDir = "c:\\temp\\";

        License license = new License();
        license.setLicense(dataDir + "Aspose.Diagram.lic");
        //ExEnd:ApplyLicenseByPath
	}

}
