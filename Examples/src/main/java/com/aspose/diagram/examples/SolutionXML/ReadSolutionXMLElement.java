package com.aspose.diagram.examples.SolutionXML;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SolutionXML;
import com.aspose.diagram.examples.Utils;

public class ReadSolutionXMLElement {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:ReadSolutionXMLElement
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadSolutionXMLElement.class);   
        // load source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // iterate through SolutionXML elements
        for (SolutionXML solutionXML :(Iterable<SolutionXML>) diagram.getSolutionXMLs())
        {
            // get name property
            System.out.println(solutionXML.getName());
            // get xml value
            System.out.println(solutionXML.getXmlValue());
        }
        //ExEnd:ReadSolutionXMLElement
	}

}
