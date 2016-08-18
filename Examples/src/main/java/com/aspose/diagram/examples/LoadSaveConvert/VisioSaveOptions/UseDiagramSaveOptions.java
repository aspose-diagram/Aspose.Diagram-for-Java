package com.aspose.diagram.examples.LoadSaveConvert.VisioSaveOptions;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.DiagramSaveOptions;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class UseDiagramSaveOptions {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:UseDiagramSaveOptions
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(UseDiagramSaveOptions.class);
        // call the diagram constructor to load diagram from a VSD file
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // Options when saving a diagram into Visio format
        DiagramSaveOptions options = new DiagramSaveOptions(SaveFileFormat.VSDX);

        // Summary:
        /*When characters in the diagram are unicode and not be set with correct font
        value or the font is not installed locally, they may appear as block in pdf,
        image or XPS.  Set the DefaultFont such as MingLiu or MS Gothic to show these
        characters.*/
        options.setDefaultFont("MS Gothic");

        // Summary:
        //   Defines whether need enlarge page to fit drawing content or not.
        //   Remarks:
        //   Default value is false.
        options.setAutoFitPageToDrawingContent(true);
        // save diagram
        diagram.save(dataDir + "UseDiagramSaveOptions_Out.vsdx", options);
        //ExEnd:UseDiagramSaveOptions
	}

}
