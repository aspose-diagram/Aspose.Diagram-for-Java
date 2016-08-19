package com.aspose.diagram.examples.LoadSaveConvert.VisioSaveOptions;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SWFSaveOptions;
import com.aspose.diagram.examples.Utils;

public class UseSWFSaveOptions {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:UseSWFSaveOptions
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(UseSWFSaveOptions.class);    
        // call the diagram constructor to load diagram from a VSD file
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        SWFSaveOptions options = new SWFSaveOptions();

        // Summary:
        // value or the font is not installed locally, they may appear as a block,
        // set the DefaultFont such as MingLiu or MS Gothic to show these
        // characters.
        options.setDefaultFont("MS Gothic");

        // sets the number of pages to render in SWF.
        options.setPageCount(2);

        // sets the 0-based index of the first page to render. Default is 0.
        options.setPageIndex(0);
        // discard saving background pages of the Visio diagram
        options.setSaveForegroundPagesOnly(true);
        // specify whether the generated SWF document should include the integrated document viewer or not.
        options.setViewerIncluded(true);
        // save diagram
        diagram.save(dataDir + "UseSWFSaveOptions_Out.swf", options);
        //ExEnd:UseSWFSaveOptions
	}

}
