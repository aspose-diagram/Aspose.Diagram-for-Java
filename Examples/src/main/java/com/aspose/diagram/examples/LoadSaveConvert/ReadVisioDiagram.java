package com.aspose.diagram.examples.LoadSaveConvert;

import java.io.FileInputStream;
import java.io.InputStream;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.LoadFileFormat;
import com.aspose.diagram.LoadOptions;
import com.aspose.diagram.examples.Utils;

public class ReadVisioDiagram {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:ReadVisioDiagram
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadVisioDiagram.class);   
        // Open the stream. Read only access is enough for Aspose.Diagram to load a diagram.
        InputStream stream = new FileInputStream(dataDir + "Drawing1.vsdx");

        //Call the diagram constructor to load diagram from a VSDX stream
        Diagram vsdDiagram = new Diagram(stream);
        stream.close();

        //Call the diagram constructor to load diagram from a VDX file
        Diagram vdxDiagram = new Diagram(dataDir + "Drawing1.vdx");

        /*
         * Call diagram constructor to load diagram from a VSS file
         * providing load file format
        */
        Diagram vssDiagram = new Diagram(dataDir + "Basic.vss", LoadFileFormat.VSS);

        /*
         * Call diagram constructor to load diagram from a VSX file
         * providing load options
        */
        LoadOptions loadOptions = new LoadOptions(LoadFileFormat.VSX);
        Diagram vsxDiagram = new Diagram(dataDir + "Drawing1.vsx", loadOptions);
        //ExEnd:ReadVisioDiagram
	}

}
