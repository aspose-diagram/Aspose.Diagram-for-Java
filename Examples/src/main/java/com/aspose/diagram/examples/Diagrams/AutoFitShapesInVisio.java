package com.aspose.diagram.examples.Diagrams;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.DiagramSaveOptions;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.examples.Comments.AddPageLevelCommentInVisio;
import com.aspose.diagram.examples.Comments.EditPageLevelCommentInVisio;

public class AutoFitShapesInVisio {

	public static void main(String[] args) throws Exception
    {
		//ExStart:AutoFitShapesInVisio
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AutoFitShapesInVisio.class);
        // load a Visio diagram
        Diagram diagram = new Diagram(dataDir + "BFlowcht.vsdx");

        // use saving options
        DiagramSaveOptions options = new DiagramSaveOptions(SaveFileFormat.VSDX);
        // set Auto fit page property
        options.setAutoFitPageToDrawingContent(true);

        // save Visio diagram
        diagram.save(dataDir + "AutoFitShapesInVisio_Out.vsdx", options);
		//ExEnd:AutoFitShapesInVisio
	}

}
