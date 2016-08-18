package com.aspose.diagram.examples.LoadSaveConvert;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.ImageSaveOptions;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class ExportPageToImage {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:ExportPageToImage
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExportPageToImage.class);     
        // load diagram
        Diagram diagram = new Diagram(dataDir + "ExportPageToImage.vsd");

        //Save diagram as PNG
        ImageSaveOptions options = new ImageSaveOptions(SaveFileFormat.PNG);

        // Save one page only, by page index
        options.setPageIndex(0);

        //Save resultant Image file
        diagram.save(dataDir + "ExportPageToImage_Out.png", options);
        //ExEnd:ExportPageToImage
	}

}
