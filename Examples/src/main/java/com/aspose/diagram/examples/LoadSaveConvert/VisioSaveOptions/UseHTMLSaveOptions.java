package com.aspose.diagram.examples.LoadSaveConvert.VisioSaveOptions;

import java.io.ByteArrayOutputStream;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.HTMLSaveOptions;
import com.aspose.diagram.PageSize;
import com.aspose.diagram.PaperSizeFormat;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class UseHTMLSaveOptions {

	public static void main(String[] args) throws Exception {
		// ExStart:UseHTMLSaveOptions
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(UseHTMLSaveOptions.class) + "VisioSaveOptions/";
		// call the diagram constructor to load diagram from a VSDX file
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

		// Options when saving a diagram into the HTML format
		HTMLSaveOptions options = new HTMLSaveOptions();

		// Summary:
		// value or the font is not installed locally, they may appear as a
		// block,
		// set the DefaultFont such as MingLiu or MS Gothic to show these
		// characters.
		options.setDefaultFont("MS Gothic");
		// sets the number of pages to render in HTML.
		options.setPageCount(2);
		// sets the 0-based index of the first page to render. Default is 0.
		options.setPageIndex(0);

		// set page size
		PageSize pgSize = new PageSize(PaperSizeFormat.A_1);
		options.setPageSize(pgSize);
		// discard saving background pages of the Visio diagram
		options.setSaveForegroundPagesOnly(true);

		// specify whether to include the toolbar or not. Default value is true.
		options.setSaveToolBar(false);
		// set title of the HTML document
		options.setTitle("Title goes here");

		// save in any supported file format
		diagram.save(dataDir + "UseHTMLSaveOptions_Out.html", options);

		// save resultant HTML directly to a stream
		ByteArrayOutputStream dstStream = new ByteArrayOutputStream();
		diagram.save(dstStream, SaveFileFormat.HTML);
		// ExEnd:UseHTMLSaveOptions
	}

}
