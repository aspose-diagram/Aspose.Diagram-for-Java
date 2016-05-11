package com.aspose.diagram.examples.Diagrams;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class RemoveMacrosFromVisio {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:RemoveMacrosFromVisio
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RemoveMacrosFromVisio.class);  
        // load a Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // remove all macros
        diagram.setVbProjectData(null);

        // Save diagram
        diagram.save(dataDir + "RemoveMacrosFromVisio_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:RemoveMacrosFromVisio
	}

}
