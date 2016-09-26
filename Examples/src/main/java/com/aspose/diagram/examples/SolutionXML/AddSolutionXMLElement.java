package com.aspose.diagram.examples.SolutionXML;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.SolutionXML;
import com.aspose.diagram.examples.Utils;

public class AddSolutionXMLElement {

	public static void main(String[] args) throws Exception {
		// ExStart:AddSolutionXMLElement
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AddSolutionXMLElement.class) + "SolutionXML/";
		// load source Visio diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

		// initialize SolutionXML object
		SolutionXML solXML = new SolutionXML();
		// set name
		solXML.setName("Solution XML");
		// set xml value
		solXML.setXmlValue("XML Value");
		// add SolutionXML element
		diagram.getSolutionXMLs().add(solXML);

		// save Visio diagram
		diagram.save(dataDir + "AddSolutionXMLElement_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:AddSolutionXMLElement
	}

}
