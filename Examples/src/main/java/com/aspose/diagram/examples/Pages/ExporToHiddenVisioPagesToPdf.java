
package com.aspose.diagram.examples.Pages;

import com.aspose.diagram.BOOL;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.PdfSaveOptions;
import com.aspose.diagram.examples.Utils;

public class ExporToHiddenVisioPagesToPdf {

	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ExporToHiddenVisioPagesToPdf.class) + "Pages/";

		// load an existing Visio
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get a particular page
		Page page = diagram.getPages().getPage("Flow 2");
		// set Visio page visiblity
		page.getPageSheet().getPageProps().getUIVisibility().setValue(BOOL.TRUE);

		// initialize PDF save options
		PdfSaveOptions options = new PdfSaveOptions();
		// set export option of hidden Visio pages
		options.setExportHiddenPage(false);

		// Save the Visio diagram
		diagram.save(dataDir + "ExportOfHiddenVisioPagesToPDF_Out.pdf", options);

	}
}
