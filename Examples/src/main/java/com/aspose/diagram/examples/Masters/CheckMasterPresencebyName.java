package com.aspose.diagram.examples.Masters;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.examples.Utils;

public class CheckMasterPresencebyName {

	public static void main(String[] args) throws Exception {
		// ExStart:CheckMasterPresencebyName
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CheckMasterPresencebyName.class) + "Masters/";
		// Call the diagram constructor to load diagram from a VDX file
		Diagram diagram = new Diagram(dataDir + "Basic Shapes.vss");

		// Set master name
		String masterName = "VNXe3100 Storage Processor Rear";
		// check master object by name
		boolean isPresent = diagram.getMasters().isExist(masterName);

		System.out.println("Master Presence : " + isPresent);
		// ExEnd:CheckMasterPresencebyName
	}

}
