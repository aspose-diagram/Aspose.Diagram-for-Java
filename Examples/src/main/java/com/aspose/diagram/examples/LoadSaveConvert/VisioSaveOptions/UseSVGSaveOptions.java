package com.aspose.diagram.examples.LoadSaveConvert.VisioSaveOptions;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.PageSize;
import com.aspose.diagram.PaperSizeFormat;
import com.aspose.diagram.SVGSaveOptions;
import com.aspose.diagram.examples.Utils;

public class UseSVGSaveOptions {

	public static void main(String[] args) throws Exception {
		// ExStart:UseSVGSaveOptions
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(UseSVGSaveOptions.class) + "VisioSaveOptions/";
		// call the diagram constructor to load diagram from a VSD file
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

		SVGSaveOptions options = new SVGSaveOptions();

		// Summary:
		// value or the font is not installed locally, they may appear as a
		// block,
		// set the DefaultFont such as MingLiu or MS Gothic to show these
		// characters.
		options.setDefaultFont("MS Gothic");
		// sets the 0-based index of the first page to render. Default is 0.
		options.setPageIndex(0);
		
		//set custom image path
    options.setSavingImageSeparately(true);
    options.setCustomImagePath("d:/output/");
    
		// set page size
		PageSize pgSize = new PageSize(PaperSizeFormat.A_1);
		options.setPageSize(pgSize);

		diagram.save(dataDir + "UseSVGSaveOptions_Out.svg", options);
		// ExEnd:UseSVGSaveOptions
	}

}
