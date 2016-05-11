package com.aspose.diagram.examples.Shapes.TimeLine;

import com.aspose.diagram.DateTime;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.MilestoneHelper;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class RefreshMilestoneWithMilestoneHelper {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:RefreshMilestoneWithMilestoneHelper
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RefreshMilestoneWithMilestoneHelper.class);
        
        String pageName = "Page-1";

        ////////////// Modify time line /////////// 
        DateTime startDate = new DateTime(2015, 8, 1);
        DateTime endDate = new DateTime(2016, 6, 1);
        DateTime fisYear = startDate;

        //Load a diagram 
        Diagram diagram = new Diagram(dataDir + "DrawingTimeLine.vsdx");

        //Get page
        Page page = diagram.getPages().getPage(pageName);

        long timelineId = 1;
        Shape timeline = diagram.getPages().getPage(pageName).getShapes().getShape(timelineId);
        double xpos = timeline.getXForm().getPinX().getValue();
        double ypos = timeline.getXForm().getPinY().getValue();

        // Add milestone 
        String milestoneMasterName = "2 triangle milestone";

        //Add Master
        diagram.addMaster(dataDir + "Timeline.vss", milestoneMasterName);

        //Add Shape in Visio diagram using AddShape method
        long milestoneShapeId = diagram.addShape(xpos, ypos, milestoneMasterName, 0);

        //Get the shape based on ID
        Shape milestone = page.getShapes().getShape(milestoneShapeId);

        //Instantiate MilestoneHelper object
        MilestoneHelper milestoneHelper = new MilestoneHelper(milestone);

        //Set Milestone Date
        milestoneHelper.setMilestoneDate(new DateTime(2015, 8, 1));

        //Set IsAutoUpdate to true
        milestoneHelper.setAutoUpdate(true);

        //RefreshMilesone of timeline shape
        milestoneHelper.refreshMilestone(timeline);

        //Save Visio file
        diagram.save(dataDir + "RefreshMilestone_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:RefreshMilestoneWithMilestoneHelper
	}

}
