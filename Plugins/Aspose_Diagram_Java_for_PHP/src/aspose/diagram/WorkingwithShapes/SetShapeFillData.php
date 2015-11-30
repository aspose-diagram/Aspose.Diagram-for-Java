<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class SetShapeFillData{

    public static function run($dataDir=null){

    # Create instance of Diagram
    $diagram = new Diagram($dataDir."Drawing.vsd");

    $shapes=$diagram->getPages()->getPage(0)->getShapes();

    $i = 0;
    while ($i<sizeof($shapes->getCount())) {
        $shape = $shapes->get($i);
        if ($shape->getNameU() == "rectangle" && $shape->getID() == 1) {
        $shape->getFill()->getFillBkgnd()->setValue($diagram->getPages()->getPage(0)->getShapes()->getShape(0)->getFill()->getFillBkgnd()->getValue());
        $shape->getFill()->getFillForegnd()->setValue("#ebf8df");
        }
        $i += 1;
    }

    # Save diagram
    $saveFileFormat=new SaveFileFormat();
    $diagram->save($dataDir."SetShapeFillData.vdx",$saveFileFormat->VDX);
    print "Set visio shape's fill data.".PHP_EOL;
    }
}