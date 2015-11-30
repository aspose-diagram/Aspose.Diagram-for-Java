<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class SetShapeLineData{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vsd");

        $shapes = $diagram->getPages()->getPage(0)->getShapes();

        $i=0;
        while ($i<(int)(string)$shapes->getCount()) {
        $shape = $shapes->get($i);
        if ($shape->getNameU() == "rectangle" && (int)(string)$shape->getID() == 1) {
        $shape->getLine()->getLineColor()->setValue($diagram->getPages()->getPage(0)->getShapes()->getShape(1)->getFill()->getFillForegnd()->getValue());
        $shape->getLine()->getLineWeight()->setValue(0.07041666666666667);
        $shape->getLine()->getRounding()->setValue(0.1);
        }
        $i += 1;
        }

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."SetShapeLineData.vdx", $saveFileFormat->VDX);
        print "Set visio shape's line data.".PHP_EOL;
    }

}