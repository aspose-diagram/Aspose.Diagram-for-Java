<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class SetShapeXFormData{

    public static function run($dataDir=null){
        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vsd");

        $shapes = $diagram->getPages()->getPage(0)->getShapes();

        $i=0;
        while ($i<(int)(string)$shapes->getCount()){
        $shape = $shapes->get($i);
        if ($shape->getNameU()=="process" && $shape->getID() == 1) {
        $shape->getXForm()->getPinX()->setValue(5);
        $shape->getXForm()->getPinY()->setValue(5);
        }
        $i+= 1;
        }

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."SetShapeXFormData.vdx",$saveFileFormat->VDX);
        print "Set visio shape's XForm data.".PHP_EOL;
    }
}