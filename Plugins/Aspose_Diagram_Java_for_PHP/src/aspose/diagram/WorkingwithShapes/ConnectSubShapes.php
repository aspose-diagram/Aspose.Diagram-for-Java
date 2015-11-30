<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
use com\aspose\diagram\Shape as Shape;
use com\aspose\diagram\ConnectionPointPlace as ConnectionPointPlace;
class ConnectSubShapes{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Access a particular page
        $page = $diagram->getPages()->getPage("Flow 1");

        # Set sub shape ids
        $shape_from_id = 1;
        $shape_to_id = 9;

        # Initialize connector shape
        $shape=new Shape();
        $shape->getLine()->getEndArrow()->setValue(5);
        $shape->getLine()->getLineWeight()->setValue(0.01388);

        # Add shape
        $connecter_id=$diagram->addShape($shape,"Dynamic connector",$page->getID());

        # Connect sub-shapes
        $connection_point_place = new ConnectionPointPlace();
        $page->connectShapesViaConnector($shape_from_id,$connection_point_place->RIGHT,$shape_to_id,$connection_point_place->LEFT,$connecter_id);

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."ConnectSubShapes.vdx",$saveFileFormat->VDX);
        print "Connected sub-shapes of a group.".PHP_EOL;
    }
}