package com.aspose.diagram.examples.Masters;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Master;
import com.aspose.diagram.examples.Utils;

public class GetMasterbyName {

	public static void main(String[] args) throws Exception {
		// ExStart:GetMasterbyName
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(GetMasterbyName.class) + "Masters/";
		// Call the diagram constructor to load diagram from a VDX file
		Diagram diagram = new Diagram(dataDir + "Basic Shapes.vss");

		// Set master name
		String masterName = "Circle";
		// Get master object by name
		Master master = diagram.getMasters().getMasterByName(masterName);

		System.out.println("Master ID : " + master.getID());
		System.out.println("Master Name : " + master.getName());
		System.out.println("Master Name : " + master.getUniqueID());
		// ExEnd:GetMasterbyName
	}

}
