package com.aspose.diagram.examples.Pages;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.ImageSaveOptions;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.BOOL;
import com.aspose.diagram.SaveFileFormat;

public class ExportOfHiddenVisioPagesToImage {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ExportOfHiddenVisioPagesToImage.class) + "Pages/";

		// load an existing Visio
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get a particular page
		Page page = diagram.getPages().getPage("Flow 2");
		// set Visio page visiblity
		page.getPageSheet().getPageProps().getUIVisibility().setValue(BOOL.TRUE);
		// initialize PDF save options
		ImageSaveOptions options = new ImageSaveOptions(SaveFileFormat.JPEG);
		// set export option of hidden Visio pages
		options.setExportHiddenPage(false);
		// set export option of comments
		options.setExportComments(false);


		// Save the Visio diagram
		diagram.save(dataDir + "ExportOfHiddenVisioPagesToImage_Out.jpeg", options);

	}
}
