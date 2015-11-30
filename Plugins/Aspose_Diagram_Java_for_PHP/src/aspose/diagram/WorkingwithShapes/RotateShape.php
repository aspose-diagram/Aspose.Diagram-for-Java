<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class RotateShape{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram=new Diagram($dataDir."Drawing.vsd");

        # Add a shape and set the angle
        $diagram->getPages()->getPage(0)->getShapes()->getShape(1)->setAngle(190);

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."RotateShape.vdx",$saveFileFormat->VDX);
        print "Rotated shape.".PHP_EOL;
    }
}