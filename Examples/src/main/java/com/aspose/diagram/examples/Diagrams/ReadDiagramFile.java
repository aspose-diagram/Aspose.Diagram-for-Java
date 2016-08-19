package com.aspose.diagram.examples.Diagrams;

import java.io.FileInputStream;
import java.io.InputStream;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.examples.Utils;

public class ReadDiagramFile {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:ReadDiagramFile
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadDiagramFile.class);
        // Open the stream. Read only access is enough for Aspose.Diagram to load a diagram.
        InputStream stream = new FileInputStream(dataDir + "ReadDiagramFile.vsdx");
        
        // load diagram
        Diagram vsdDiagram = new Diagram(stream);
        // get pages count
        System.out.println("Total Pages:" + vsdDiagram.getPages().getCount());

        stream.close();
        //ExEnd:ReadDiagramFile
	}

}
