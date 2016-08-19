package com.aspose.diagram.examples.Window;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Window;
import com.aspose.diagram.WindowStateValue;
import com.aspose.diagram.WindowTypeValue;
import com.aspose.diagram.examples.Utils;

public class AddWindowElementInVisio {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:AddWindowElementInVisio
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddWindowElementInVisio.class); 
        // load source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // initialize window object
        Window window = new Window();
        // set window state
        window.setWindowState(WindowStateValue.MAXIMIZED);
        // set window height
        window.setWindowHeight(500);
        // set window width
        window.setWindowWidth(500);
        // set window type
        window.setWindowType(WindowTypeValue.STENCIL);
        // add window object
        diagram.getWindows().add(window);

        // save in any supported format
        diagram.save(dataDir + "AddWindowElementInVisio_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:AddWindowElementInVisio
	}

}
