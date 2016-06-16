package com.aspose.diagram.examples.Pages;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SVGSaveOptions;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.BOOL;

public class ExportOfHiddenVisioPagesToSVG {
    public static void main(String[] args) throws Exception
    {
        // ExStart:ExportOfHiddenVisioPagesToSVG
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExportOfHiddenVisioPagesToSVG.class);

        // load an existing Visio
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // get a particular page
        Page page = diagram.getPages().getPage("Flow 2");
        // set Visio page visiblity
        page.getPageSheet().getPageProps().getUIVisibility().setValue(BOOL.FALSE);

        // initialize PDF save options
        SVGSaveOptions options = new SVGSaveOptions();
        // set export option of hidden Visio pages
        options.setExportHiddenPage(false);

        // save the Visio diagram
        diagram.save(dataDir + "ExportOfHiddenVisioPagesToSVG_Out.svg", options);
        // ExEnd:ExportOfHiddenVisioPagesToSVG
    }
    
}
