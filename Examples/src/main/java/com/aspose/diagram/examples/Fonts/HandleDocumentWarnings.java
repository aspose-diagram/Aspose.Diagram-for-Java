package com.aspose.diagram.examples.Fonts;

import com.aspose.diagram.IWarningCallback;
import com.aspose.diagram.WarningInfo;
import com.aspose.diagram.WarningType;

public class HandleDocumentWarnings implements IWarningCallback 
{
	 /**
    * Our callback only needs to implement the "Warning" method. This method is
    * called whenever there is a potential issue during document processing.
    * The callback can be set to listen for warnings generated during document
    * load and/or document save.
    */
    public void warning(WarningInfo info) {
        // We are only interested in fonts being substituted.
        if (info.getWarningType() == WarningType.FONT_SUBSTITUTION) {
        System.out.println("Font substitution: " + info.getDescription());
        }
    }
}
