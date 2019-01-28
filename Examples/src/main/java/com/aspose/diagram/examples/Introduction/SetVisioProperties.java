package com.aspose.diagram.examples.Introduction;

import com.aspose.diagram.DateTime;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class SetVisioProperties {

	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SetVisioProperties.class) + "Introduction/";
		// build path of an existing diagram
		String path = dataDir + "Drawing1.vsdx";

		// Call the diagram constructor to load diagram from a VSDX file
		Diagram diagram = new Diagram(path);

		// Set some summary information about the diagram
		diagram.getDocumentProps().setCreator("Farhan");
		diagram.getDocumentProps().setCompany("Aspose");
		diagram.getDocumentProps().setCategory("Drawing 2D");
		diagram.getDocumentProps().setManager("Sergey Polshkov");
		diagram.getDocumentProps().setTitle("Aspose Title");
		diagram.getDocumentProps().setTimeCreated(DateTime.getNow());
		diagram.getDocumentProps().setSubject("Visio Diagram");
		diagram.getDocumentProps().setTemplate("Aspose Template");

		// Write the updated file to the disk in VSDX file format
		diagram.save(dataDir + "SetVisioProperties_Out.vsdx", SaveFileFormat.VSDX);
	}

}
