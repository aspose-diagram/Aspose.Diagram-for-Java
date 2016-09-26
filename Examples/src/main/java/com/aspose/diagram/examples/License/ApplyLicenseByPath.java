package com.aspose.diagram.examples.License;

import com.aspose.diagram.License;
import com.aspose.diagram.examples.Utils;

public class ApplyLicenseByPath {

	public static void main(String[] args) throws Exception {
		// set path of the license file, i.e. c:\temp\
		String dataDir = Utils.getSharedDataDir(ApplyLicenseByPath.class) + "License/";

		License license = new License();
		license.setLicense(dataDir + "Aspose.Diagram.lic");
	}

}
