<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
use com\aspose\diagram\ConnectorsTypeValue as ConnectorsTypeValue;
class SetShapeAppearance{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram =new Diagram($dataDir."Drawing.vsd");

        # Access a particular page
        $page=$diagram->getPages()->getPage("Flow 1");

        # get a particular connector shape
        $shape=$page->getShapes()->getShape(1);

        # set dynamic connector appearance
        $connectorsTypeValue=new ConnectorsTypeValue();
        $shape->setConnectorsType($connectorsTypeValue->STRAIGHT_LINES);

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."SetShapeAppearance.vdx",$saveFileFormat->VDX);
        print "Set appearnce of the connector type shape.".PHP_EOL;
    }
}