<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ChangeShapePosition{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vsd");

        $shapes=$diagram->getPages()->getPage(0)->getShapes();
        $i = 0;
        while ($i<(int)(string)$shapes->getCount()) {
        $shape = $shapes->get($i);
        if ($shape->getNameU() == "Process" && (int)(string)$shape->getID() == 2) {
        $shape->move(1, 1);
        }
        $i += 1;
        }

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."ChangeShapePosition.vdx",$saveFileFormat->VDX);
        print"Changed postion of a shape.".PHP_EOL;
    }
}