package com.aspose.diagram.examples.Masters;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Master;
import com.aspose.diagram.examples.Utils;

public class GetMasterbyID {

	public static void main(String[] args) throws Exception {
		// ExStart:GetMasterbyID
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(GetMasterbyID.class) + "Masters/";
		// Call the diagram constructor to load diagram from a VDX file
		Diagram diagram = new Diagram(dataDir + "RetrieveMasterInfo.vdx");

		// Set master id
		int masterid = 2;
		// Get master object by id
		Master master = diagram.getMasters().getMaster(masterid);

		System.out.println("Master ID : " + master.getID());
		System.out.println("Master Name : " + master.getName());
		System.out.println("Master Name : " + master.getUniqueID());
		// ExEnd:GetMasterbyID
	}

}
