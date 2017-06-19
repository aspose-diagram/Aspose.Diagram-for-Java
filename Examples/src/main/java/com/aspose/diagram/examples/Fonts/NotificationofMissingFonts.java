package com.aspose.diagram.examples.Fonts;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.IWarningCallback;
import com.aspose.diagram.WarningInfo;
import com.aspose.diagram.WarningType;
import com.aspose.diagram.examples.Utils;

public class NotificationofMissingFonts 
{
	public static void main(String[] args) throws Exception
	{
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(NotificationofMissingFonts.class) + "Fonts/";

		// load the document to render.
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		 
		 
		// initialize PdfSaveOptions object
		com.aspose.diagram.PdfSaveOptions saveOp = new com.aspose.diagram.PdfSaveOptions();
		// create a new class implementing IWarningCallback which collect any warnings produced during drawing save.
		HandleDocumentWarnings callback = new HandleDocumentWarnings();
		saveOp.setWarningCallback(callback);
		 
		// pass the save options along with the save path to the save method.
		diagram.save(dataDir + "NotificationofMissingFonts_Out.pdf", saveOp);
	}

}
