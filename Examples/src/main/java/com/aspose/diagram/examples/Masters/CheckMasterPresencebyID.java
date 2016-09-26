package com.aspose.diagram.examples.Masters;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.examples.Utils;

public class CheckMasterPresencebyID {

	public static void main(String[] args) throws Exception {
		// ExStart:CheckMasterPresencebyID
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CheckMasterPresencebyID.class) + "Masters/";
		// Call the diagram constructor to load diagram from a VDX file
		Diagram diagram = new Diagram(dataDir + "Basic Shapes.vss");

		// set master id
		int masterid = 2;
		// check master by id
		boolean isPresent = diagram.getMasters().isExist(2);

		System.out.println("Master Presence : " + isPresent);
		// ExEnd:CheckMasterPresencebyID
	}

}
