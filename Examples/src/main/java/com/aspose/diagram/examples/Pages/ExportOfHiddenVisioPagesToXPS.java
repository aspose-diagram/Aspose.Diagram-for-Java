package com.aspose.diagram.examples.Pages;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.XPSSaveOptions;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.BOOL;

public class ExportOfHiddenVisioPagesToXPS {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ExportOfHiddenVisioPagesToXPS.class);
		// load an existing Visio
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get a particular page
		Page page = diagram.getPages().getPage("Flow 2");
		// set Visio page visiblity
		page.getPageSheet().getPageProps().getUIVisibility().setValue(BOOL.TRUE);

		// initialize PDF save options
		XPSSaveOptions options = new XPSSaveOptions();
		// set export option of hidden Visio pages
		options.setExportHiddenPage(false);

		// save the Visio diagram
		diagram.save(dataDir + "ExportOfHiddenVisioPagesToXPS_Out.xps", options);

	}

}
