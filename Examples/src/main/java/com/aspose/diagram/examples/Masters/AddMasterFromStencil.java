package com.aspose.diagram.examples.Masters;

import java.io.FileInputStream;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.examples.Utils;

public class AddMasterFromStencil {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:AddMasterFromStencil
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddMasterFromStencil.class);    
        // Load diagram
        Diagram diagram = new Diagram();

        // Load stencil to a stream
        String templateFileName = dataDir + "NetApp-FAS-series.vss";

        // Add master with stencil file path and master id
        String masterName = "FAS80xx rear empty";
        diagram.addMaster(templateFileName, 2);

        // Add master with stencil file path and master name
        diagram.addMaster(templateFileName, masterName);

        // adds master to diagram from source diagram
        Diagram src = new Diagram(templateFileName);
        diagram.addMaster(src, masterName);

        // Adds shape with defined PinX and PinY.
        diagram.addShape(2.0, 2.0, masterName, 0);
        diagram.addShape(6.0, 6.0, masterName, 0);

        // Adds shape with defined PinX,PinY,Width and Height.
        diagram.addShape(7.0, 3.0, 1.5, 1.5, masterName, 0);
        //ExEnd:AddMasterFromStencil
	}

}
