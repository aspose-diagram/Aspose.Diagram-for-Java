package com.aspose.diagram.examples.Protection;

import com.aspose.diagram.BOOL;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class VisioDiagramProtection {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:VisioDiagramProtection
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(VisioDiagramProtection.class);
        //Load diagram
        Diagram diagram = new Diagram(dataDir + "ProtectAndUnprotect.vsd");

        diagram.getDocumentSettings().setProtectBkgnds(BOOL.TRUE);
        diagram.getDocumentSettings().setProtectMasters(BOOL.TRUE);
        diagram.getDocumentSettings().setProtectShapes(BOOL.TRUE);
        diagram.getDocumentSettings().setProtectStyles(BOOL.TRUE);
        // save diagram
        diagram.save(dataDir + "VisioDiagramProtection_Out.vdx", SaveFileFormat.VDX);
        //ExEnd:VisioDiagramProtection
	}

}
