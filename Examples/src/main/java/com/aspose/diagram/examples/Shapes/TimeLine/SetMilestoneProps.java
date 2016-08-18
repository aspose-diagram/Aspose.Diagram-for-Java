package com.aspose.diagram.examples.Shapes.TimeLine;

import com.aspose.diagram.DateTime;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.MilestoneHelper;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class SetMilestoneProps {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:SetMilestoneProps
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetMilestoneProps.class);  
        // Load diagram
        Diagram diagram = new Diagram(dataDir + "DrawingTimeLine.vsdx");
        int shapeid = 22;
        // Get timeline shape
        Shape milestone = diagram.getPages().getPage("Page-1").getShapes().getShape(shapeid);

        // Initialize MilestoneHelper object
        MilestoneHelper milestoneHelper = new MilestoneHelper(milestone);

        // Set milestone date
        milestoneHelper.setMilestoneDate(new DateTime(2014, 10, 21));
        // Set date format
        milestoneHelper.setDateFormat(21);
        // Set auto update flag
        milestoneHelper.setAutoUpdate(true);
        // Set milestone type
        milestoneHelper.setType(6);

        // Save to VDX format
        diagram.save(dataDir + "SetMilestoneProps_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:SetMilestoneProps
	}

}
