package com.aspose.diagram.examples.Window;

import com.aspose.diagram.BOOL;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Window;
import com.aspose.diagram.examples.Utils;

public class AddSupportOfVisualAids {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:AddSupportOfVisualAids
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddSupportOfVisualAids.class);
        // load source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // get window object by index
        Window window = diagram.getWindows().get(0);
        // check dynamic grid option
        window.setDynamicGridEnabled(BOOL.TRUE);
        // check connection points option
        window.setShowConnectionPoints(BOOL.TRUE);
        
        // save visio drawing
        diagram.save(dataDir + "AddSupportOfVisualAids_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:AddSupportOfVisualAids
	}

}
