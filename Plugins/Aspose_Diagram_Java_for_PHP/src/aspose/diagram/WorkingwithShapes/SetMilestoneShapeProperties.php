<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\MilestoneHelper as MilestoneHelper;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class SetMilestoneShapeProperties{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vsd");

        $shape_id=1;

        # Get timeline shape
        $milestone=$diagram->getPages()->getPage("Flow 1")->getShapes()->getShape($shape_id);

        # Initialize MilestoneHelper object
        $milestone_helper = new MilestoneHelper($milestone);

        # Set date format
        $milestone_helper->setDateFormat(21);

        # Set auto update flag
        $milestone_helper->setAutoUpdate(true);

        # Set milestone type
        $milestone_helper->setType(6);

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."SetMilestoneShapeProperties.vdx", $saveFileFormat->VDX);
        print "Set milestone shape properties.".PHP_EOL;
    }
}